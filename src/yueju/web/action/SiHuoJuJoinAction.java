package yueju.web.action;

import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Sihuojuinfo;
import yueju.domain.Sihuojujoin;
import yueju.domain.User;
import yueju.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class SiHuoJuJoinAction extends BaseAction<Sihuojujoin> {

	public String join(){
		User user = (User) ServletActionContext.getRequest().getSession()
		.getAttribute("loginUser");
    if (user == null) {
	return "login";
	}
    Long sihuojuinfoId = model.getId();
    Sihuojuinfo sihuojuinfo = sihuojuinfoService.findById(sihuojuinfoId);
    model.setSihuojuinfo(sihuojuinfo);
    model.setUser(user);
    model.setType(2);
    model.setId(null);
    sihuojujoinService.save(model);
    Integer i = sihuojuinfo.getCount();
    sihuojuinfo.setCount(i+1);
    sihuojuinfoService.update(sihuojuinfo);
	return "find";
	}
	
	public String del(){
		User user = (User) ServletActionContext.getRequest().getSession()
		.getAttribute("loginUser");
		 if (user == null) {
				return "login";
	}
    Long sihuojuinfoId = model.getId();
    Sihuojuinfo sihuojuinfo = sihuojuinfoService.findById(sihuojuinfoId);
    List<Sihuojujoin> Sihuojujoins = sihuojujoinService.findBySihuojuinfoId(sihuojuinfoId);
    for(int i=0;i<Sihuojujoins.size();i++){
    	if(Sihuojujoins.get(i).getUser().getName().equals(user.getName())){
    		 sihuojujoinService.delBySihuojujoinIdAndUserId(Sihuojujoins.get(i));
    		 Integer a = sihuojuinfo.getCount();
    		    sihuojuinfo.setCount(a-1);
    		    sihuojuinfoService.update(sihuojuinfo);
    	}
    }
	return "findAll";
	}
}
