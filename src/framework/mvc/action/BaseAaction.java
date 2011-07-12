package framework.mvc.action;
import java.text.SimpleDateFormat;
import java.util.Date;


import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.log4j.Logger;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.DispatcherServlet;
import framework.util.ActionUtils;
import framework.util.JSONUtil;


public abstract class BaseAaction {
	
	protected static final Logger logger=Logger.getLogger(BaseAaction.class);
	
	public static WebApplicationContext spring=null;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd"); 
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	
	public static void set(String attr,Object value){
		ActionUtils.set(attr,value,getRequest());
	}
	
	public static Object get(String param){
		return ActionUtils.get(param, getRequest());
	}
	
	public static String getString(String param){
		return ActionUtils.getString(param, getRequest());
	}
	
	public static Long getLong(String param){
		return ActionUtils.getLong(param, getRequest());
	}
	
	public static String toJSON(Object value){
		return JSONUtil.toJSON(value);
	}
	
	public static HttpServletRequest getRequest(){		
		HttpServletRequest request = ((ServletRequestAttributes)RequestContextHolder.getRequestAttributes()).getRequest();
		return request;
	}
	
	public static HttpSession getSession(){
		return getRequest().getSession(true);
	}
	
	public static ServletContext getServletContext(){
		HttpServletRequest request=getRequest();
		WebApplicationContext webApplicationContext = (WebApplicationContext) request.getAttribute(
				DispatcherServlet.WEB_APPLICATION_CONTEXT_ATTRIBUTE);
		return webApplicationContext.getServletContext();
	}
	
	public static <T>T getBean(String name,Class<T> clz) {
        if (spring == null) {
            spring = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
        }
        for (String beanname : spring.getBeanDefinitionNames()) {
			System.out.println(beanname);
		}
        return (T)spring.getBean(name);
    }
}
