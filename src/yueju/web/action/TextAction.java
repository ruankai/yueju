package yueju.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;


import yueju.domain.Text;
import yueju.web.action.base.BaseAction;
@Controller
@Scope("prototype")
public class TextAction extends BaseAction<Text> {

	public String pageQuery() throws IOException{
					//按照id进行降序
		pageBean.getDetachedCriteria().addOrder(Order.desc("id"));
		textService.pageQuery(pageBean);
							
							//排除不需要序列化的属性
        JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"page","pageSize","detachedCriteria"});
		
		JSONObject jsonObject = JSONObject.fromObject(pageBean,jc);
		String json = jsonObject.toString();
						
		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		ServletActionContext.getResponse().getWriter().print(json);
	     return NONE;
	}
	
	public String findTextByTitle() throws IOException{
		List texts=textService.findTextByTitle(model.getTitle());
		ServletActionContext.getRequest().setAttribute("texts", texts);
		return SUCCESS;
		
	}
	public String findById() throws IOException{
		String id = ServletActionContext.getRequest().getParameter("id");
		long i=Integer.valueOf(id).intValue();
		Text text=textService.findById(i);
		ServletActionContext.getRequest().setAttribute("text", text);
		return SUCCESS;
		
	}
}
