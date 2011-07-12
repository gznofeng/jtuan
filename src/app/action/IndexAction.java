package app.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import framework.mvc.action.BaseAaction;

@Controller
public class IndexAction extends BaseAaction{
	
	@RequestMapping()
	public void index(){
		logger.debug("index error");
		System.out.println("12");
	}
	
	@RequestMapping()
	public void project(){
		
	}
}
