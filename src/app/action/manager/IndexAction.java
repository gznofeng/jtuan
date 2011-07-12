package app.action.manager;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import framework.mvc.action.BaseAaction;

@Controller("manager_indexAction")
public class IndexAction extends BaseAaction{
	
	@RequestMapping()
	public void index(){
		
	}
	
	@RequestMapping()
	public void project(){
		
	}
}
