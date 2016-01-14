package yueju.web.action;

import java.io.IOException;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.Order;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Photo;
import yueju.web.action.base.BaseAction;
@Controller
@Scope("prototype")
public class PhotoAction extends BaseAction<Photo> {

	
	public String pageQuery() throws IOException{
		//按照id进行降序
		//pageBean.getDetachedCriteria().addOrder(Order.desc("id"));

		photoService.pageQuery(pageBean);
				
				//排除不需要序列化的属性
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"page","pageSize","detachedCriteria"});

		JSONObject jsonObject = JSONObject.fromObject(pageBean,jc);
		
		String json = jsonObject.toString();
			
		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		System.out.println("!!!!!!!!!!!!!!!!!!"+json);
		ServletActionContext.getResponse().getWriter().print(json);
		return NONE;
	}
	
}
