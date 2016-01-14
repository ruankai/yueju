package mingrentang.web.action;

import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.poi.ss.formula.functions.Count;
import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import mingrentang.service.ShowNamesService;
import mingrentang.service.impl.ShowNamesServiceImpl;
import yueju.domain.Minreninfo;
import yueju.web.action.base.BaseAction;


@Controller
@Scope("prototype")

public class mingrenIndexAction extends BaseAction<Minreninfo>{
	
	private Long id;
	private int count;
	public void setCount(int count) {
		this.count = count;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String printName(){
		
		List<Minreninfo> findmin=showNamesService.findMin();
		ActionContext.getContext().put("list", findmin);
		return "mingrenName";
		
	}
	
	public String pageQuery() throws IOException{
		 String photoPath;
			//按照id进行降序
			//pageBean.getDetachedCriteria().addOrder(Order.desc("id"));

		 	showNamesService.pageQuery(pageBean);
					
			//排除不需要序列化的属性
			JsonConfig jc = new JsonConfig();
			jc.setExcludes(new String[]{"page","pageSize","detachedCriteria"});

			JSONObject jsonObject = JSONObject.fromObject(pageBean,jc);
			
			String json = jsonObject.toString();
			//System.out.println("!!!!!!!!!!!"+json);
			
				
			ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		
			ServletActionContext.getResponse().getWriter().print(json);
			
			JSONArray jsonArray=jsonObject.getJSONArray("rows");
			Pattern pattern = Pattern.compile(".*<img src=\"(.*png).*");
		
			for(int i=0;i<4;i++)
			{
				JSONObject jo=jsonArray.getJSONObject(i);
				String content=jo.getString("content");
				 Matcher matcher = pattern.matcher(content);
				if(matcher.find()){
					  photoPath=matcher.group(1);
					  
					  ActionContext.getContext().put("photoPath", photoPath);
				  }
				
			}
			 
			  return NONE;
	}
	
	public String findById() throws IOException{
		HttpServletRequest request=ServletActionContext.getRequest();
		String str=request.getParameter("id");
		 
		id =Long.parseLong(str);
		
		Minreninfo minreninfo=showNamesService.findById(id);
		
		JsonConfig jc = new JsonConfig();
		
		
		JSONObject jsonObject = JSONObject.fromObject(minreninfo,jc);
		String json = jsonObject.toString();
		
		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");

		ServletActionContext.getResponse().getWriter().print(json);
		
		return NONE;
	
	}

	public String UpdateCount() throws IOException{
		HttpServletRequest request=ServletActionContext.getRequest();
		
		String str=request.getParameter("id");
		 
		id =Long.parseLong(str);
		System.out.println("id="+id);
		Minreninfo minreninfo=showNamesService.findById(id);
		
		
		 str=request.getParameter("count");
		 
		count =Integer.parseInt(str);
		System.out.println("count="+count);
		minreninfo.setCount(count);
		
		showNamesService.update(minreninfo);
		
		return NONE;
	
	}
	
}
