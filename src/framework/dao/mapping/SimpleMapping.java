package framework.dao.mapping;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.springframework.jdbc.core.RowMapper;

import framework.dao.Dao;
import framework.util.ReflectionUtils;

public class SimpleMapping<T> implements RowMapper<T>{
	
	private Class<T> modelClaz;
	
	public SimpleMapping(Class clz){
		modelClaz=clz;		
	}

	public T mapRow(ResultSet rs, int rowNum) throws SQLException {
		try {
			Object temp=modelClaz.newInstance();
			for(Field field:modelClaz.getDeclaredFields()){
				field.setAccessible(true);
				try {
					Object value=rs.getObject(Dao.toDBName(field.getName()));
					if(field.getType()==Date.class){
						field.set(temp,ReflectionUtils.convertValue(rs.getTimestamp(Dao.toDBName(field.getName())),field.getType()));
					}else{
						field.set(temp,ReflectionUtils.convertValue(value,field.getType()));
					}
				} catch (Exception e) {
					// fix no column
				}
				
			}
			return (T)temp;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	}
	
	
}
