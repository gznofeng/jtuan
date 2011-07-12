package framework.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils extends org.apache.commons.lang.time.DateUtils {
	
	public static String DEFAULT_FORMAT="yyyy-MM-dd HH:mm:ss";
	
	public static Date parseFromObject(Object object){
		if(object!=null){
			return parse(object.toString());
		}
		return null;
	}
	public static Date parseFromObject(Object object,String format){
		if(object!=null){
			return parse(object.toString(),format);
		}
		return null;
	}
	
	public static Date parse(String date){
		return parse(date, DEFAULT_FORMAT);
	}
	
	public static Date parse(String date,String format){
		try {
			if(date !=null){
			SimpleDateFormat dateFormat=new SimpleDateFormat(format);
			 return dateFormat.parse(date);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;		
	}

	public static String format(Date date){
		return format(date,DEFAULT_FORMAT);
	}
	
	public static String format(Date date ,String format){
		if(date==null){
			return "";
		}
		SimpleDateFormat dateFormat=new SimpleDateFormat(format);
		return dateFormat.format(date);
	}
}
