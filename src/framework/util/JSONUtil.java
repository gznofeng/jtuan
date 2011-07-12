package framework.util;

import net.sf.json.JSONObject;

public class JSONUtil {

	public static String toJSON(Object value){
		JSONObject object=JSONObject.fromObject(value);
		return object.toString();		
	}
	
	public static Object fromJSON(String json){
		JSONObject object=JSONObject.fromObject(json);
		return object;		
	}
	
	public static <T>T fromJSON(String json,Class<T> clz) throws Exception{
		JSONObject object=JSONObject.fromObject(json);
		return ReflectionUtils.mapToBean(object, clz);		
	}

}
