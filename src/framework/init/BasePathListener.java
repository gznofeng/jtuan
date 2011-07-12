package framework.init;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

public class BasePathListener implements ServletRequestListener  {
	
	public static String basePath=null;

	public void requestDestroyed(ServletRequestEvent arg0) {
		
	}

	public void requestInitialized(ServletRequestEvent even) {
		HttpServletRequest request=(HttpServletRequest) even.getServletRequest();
		if(basePath==null){		
			String path =request.getSession().getServletContext().getContextPath();
			basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
		}
		request.setAttribute("basePath",basePath);		
	}

}
