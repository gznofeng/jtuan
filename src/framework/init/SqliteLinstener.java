package framework.init;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class SqliteLinstener implements ServletContextListener {

	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void contextInitialized(ServletContextEvent servletContextEvent) {
		ServletContext servletContext=servletContextEvent.getServletContext();
		WebApplicationContext spring=WebApplicationContextUtils.getWebApplicationContext(servletContext);
		BasicDataSource dataSource=(BasicDataSource) spring.getBean("sqliteDataSource");
		String url="jdbc:sqlite:";
		url+=servletContext.getRealPath("/WEB-INF/db/framework.db");
		dataSource.setUrl(url);

	}

}
