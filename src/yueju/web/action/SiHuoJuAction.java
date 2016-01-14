package yueju.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Sihuojuinfo;
import yueju.domain.Sihuojujoin;
import yueju.domain.User;
import yueju.web.action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;
@Controller
@Scope("prototype")
public class SiHuoJuAction  extends BaseAction<Sihuojuinfo>{

	 public String findAll(){
		
		List<Sihuojuinfo> allSihuojuinfo =sihuojuinfoService.findAllSihuojuinfo();
		ActionContext.getContext().getValueStack().set("allSihuojuinfo", allSihuojuinfo);
		return "findAll";
	 }
	 public String findById(){
		
		 Sihuojuinfo sihuojuinfo=sihuojuinfoService.findById(model.getId());
		 List<Sihuojujoin> sihuojujoin=sihuojujoinService.findBySihuojuinfoId(sihuojuinfo.getId());
		 ActionContext.getContext().put("sihuojuinfo", sihuojuinfo);
		 ActionContext.getContext().put("sihuojujoin", sihuojujoin);
		 return "findById";
	 }
	public String mysihuoju(){
		User user = (User) ServletActionContext.getRequest().getSession()
		.getAttribute("loginUser");
		 if (user == null) {
				return "login";
	}
		 //发起的活动
		 List<Sihuojuinfo>mysihuojuinfos=sihuojuinfoService.findByUser(user);
		 //参与的活动
		 List<Sihuojujoin>mysihuojujoins=sihuojujoinService.findByUser(user);
		 
		 ActionContext.getContext().put("mysihuojuinfos", mysihuojuinfos);
		 ActionContext.getContext().put("mysihuojujoins", mysihuojujoins);
	    
		 return "mysihuoju";
	}
}

