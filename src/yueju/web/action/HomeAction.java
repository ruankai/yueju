package yueju.web.action;

import java.io.IOException;
import java.util.List;



import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.sun.net.httpserver.Authenticator.Success;

import yueju.web.action.base.BaseAction;
import yueju.domain.Infopush;
@Controller
@Scope("prototype")
public class HomeAction extends BaseAction<Infopush>{

	public String home1() {
		// ��ѯ����
		List<Infopush> allTopic = homeService.findinfopush();
		int length=allTopic.size();
		for(int i=0;i<=allTopic.size()-4;i++)
		{
			allTopic.remove(i);
		}
		System.out.println(length);
		ActionContext.getContext().getValueStack().set("allTopic", allTopic);
		return SUCCESS;
	}
}
