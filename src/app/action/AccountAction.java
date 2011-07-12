package app.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import app.model.User;
import app.model.UserView;
import framework.mvc.action.BaseAaction;

@Controller
public class AccountAction extends BaseAaction{
	
	@RequestMapping()
	public void login(){

	}
	
	@RequestMapping()
	public void signup(){
				
	}
	
	@RequestMapping() 
	public @ResponseBody String dosignup(){
		User user=new User();
		user.setRealname("中文");
		return toJSON(user);
	}
}
