package framework.dao;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;
import org.apache.commons.lang.StringUtils;
import framework.util.ResourceUtils;



public class SQLProperties {

	private static final String RESOURCE = "/resource/sqls";
	private static Properties prop = null;
	private static boolean isInit = false;

	private static SQLProperties sqlProperties = null;

	private SQLProperties() {
	}

	 static {
		sqlProperties = new SQLProperties();			
		try {
			Properties prop = initProperties("classpath:" + RESOURCE);
				sqlProperties.setProp(prop);
				isInit = true;
		} catch (Exception e) {			
			try {
				Properties prop = initProperties(SQLProperties.class.getClass().getResource("/").getPath()+RESOURCE);
				sqlProperties.setProp(prop);
				isInit = true;
			} catch (Exception ex) {
				ex.printStackTrace();
				System.out.println("can't init sql properties");
			}							
		}
	}

	public static Properties initProperties(String classPath) throws Exception {
		Properties prop = new Properties();
		File file = null;
		if (classPath.indexOf("classpath") > -1) {
			file = new File(ResourceUtils.getClassPath()+"/"+ RESOURCE);
		} else {
			file = new File(classPath);
		}
		File[] files = file.listFiles();
		if (files != null) {
			for (File sqlFile : files) {
				if (sqlFile.isFile()) {
					InputStream sqlInputStream = new BufferedInputStream(new FileInputStream(sqlFile));
					prop.loadFromXML(sqlInputStream);
					if (sqlInputStream != null)
						sqlInputStream.close();
				}
			}
		}
		return prop;
	}

	public static String getSql(String name)  {
		if (!isInit) {
			try {
				throw new Exception("can't init sqlProperties");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		String result = prop.getProperty(name);
	
		if (result != null && result.length() > 0) {
			return result;
		}
		try {
			throw new Exception("couldn't found sql");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public static String getExecuteSql(String sqlName,Object object)throws Exception{
		return getExecuteSql(sqlName,framework.util.ReflectionUtils.objectToMap(object));
	}
	
	public static String getExecuteSql(String sqlName,HashMap<String,Object> values){
		String template=getSql(sqlName);
		String resultSql=template;
		if(values==null){
			return resultSql;
		}
		String[] conditions=StringUtils.substringsBetween(template, "{", "}");
		if(conditions==null){return resultSql;}
		for (String condition : conditions) {
			String format=condition;
			String[] vars=StringUtils.substringsBetween(condition, "[", "]");
			if(vars!=null && vars.length>0){
				for (String varName : vars) {
					try {						
						format=format.replace("["+varName+"]", objectToString(values.get(varName)));
						resultSql=resultSql.replace("{"+condition+"}", format);
					} catch (Exception e) {
						resultSql=resultSql.replace("{"+condition+"}", "");
					}			
				}
				
			}else{		
				resultSql=resultSql.replace("{"+condition+"}", "");
			}
		}
		return resultSql;
	}
	
	public static String objectToString(Object type){
		String typeStr=type.getClass().getSimpleName();
		if(typeStr.equalsIgnoreCase("String")){
			return "'"+type+"'";
		}
	 	return type.toString(); 
	}

	public static Properties getProp() {
		return prop;
	}

	public static void setProp(Properties prop) {
		SQLProperties.prop = prop;
	}

}
