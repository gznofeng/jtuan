package framework.mvc.model;

import net.sf.json.JSONObject;

public class AjaxModel {
	
	private boolean success=false;
	
	private String msg="error";

	private Object data;

	public AjaxModel(boolean success){
		this.success=success;
	}
	
	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String toString() {
		JSONObject object=JSONObject.fromObject(this);
		return object.toString();
	}
}
