package framework.util;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

public class ActionUtils {
	
	public static void set(String attr,Object value,HttpServletRequest request){
		request.setAttribute(attr,value);
	}

	public static Object get(String param,HttpServletRequest request){
		Object object=null;
		if(object==null){
			object=request.getAttribute(param);
		}	
		if(object==null){
			object=request.getParameter(param);
		}	
		if(object==null){
			object=request.getSession(true).getAttribute(param);
		}
		return object;
	}
	
	public static String getString(String param,HttpServletRequest request){
		return (String)get(param,request);
	}
	
	public static Long getLong(String param,HttpServletRequest request){
		try {
			return Long.valueOf(get(param,request).toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null; 
	}

	
}
