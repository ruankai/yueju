package yueju.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Video;
import yueju.web.action.base.BaseAction;
@Controller
@Scope("prototype")
public class YueJuAction extends BaseAction<Video> {
	
	public String query() throws IOException{
	  List<Video> videos = yueJuService.findVideo();
		
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(new String[]{"photographer","copyright","size","initiateName","keyword"});
	
		JSONArray jsonArray = JSONArray.fromObject(videos,jc);
		
		String json = jsonArray.toString();
		
		
		System.out.print(json);
		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		System.out.println(json);
		ServletActionContext.getResponse().getWriter().print(json);
		
	  return NONE;
	}
	public String play() throws IOException{
		 Video video = yueJuService.findById(model.getVideoId());
			
			JsonConfig jc = new JsonConfig();
			jc.setExcludes(new String[]{"photographer","copyright","size","initiateName","keyword"});
		
			JSONObject jsonObject = JSONObject.fromObject(video,jc);
			
			String json = jsonObject.toString();
			
			
			System.out.print(json);
			ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
			System.out.println(json);
			ServletActionContext.getResponse().getWriter().print(json);
		
		return NONE;
	}
}
