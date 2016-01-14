package yueju.web.action;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.User;
import yueju.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class HeaderAction extends BaseAction<User> {

	public String login(){
		String password = model.getPassword();
		String name = model.getName();
		User user=headerService.login(password,name);
		if(user==null){
			return "login";
		}
		ServletActionContext.getRequest().getSession().setAttribute("loginUser",user);
		return "home1";
	}
	
	public String regist(){
		
		headerService.save(model);
		
		ServletActionContext.getRequest().getSession().setAttribute("loginUser",model);
		return "home1";
	}
	
public String loginout(){
		
	ServletActionContext.getRequest().getSession().removeAttribute("loginUser");
		return "home1";
	}
}
