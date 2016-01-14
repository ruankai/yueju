package yueju.web.action;

import java.io.IOException;
import java.util.List;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Song;
import yueju.domain.Video;
import yueju.web.action.base.BaseAction;
@Controller
@Scope("prototype")
public class SongAction extends BaseAction<Song> {

	
	public String query() throws IOException{
		  List<Song> songs = songService.findSongs();
			
			JsonConfig jc = new JsonConfig();
			jc.setExcludes(new String[]{"recorder","copyright","size","initiateName",
										"keyword","date","description","singer"});
		
			JSONArray jsonArray = JSONArray.fromObject(songs,jc);
			
			String json = jsonArray.toString();
			
			
			System.out.print(json);
			ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
			System.out.println(json);
			ServletActionContext.getResponse().getWriter().print(json);
			
		  return NONE;
		}   
		public String play() throws IOException{
			 Song song = songService.findById(model.getSongId());
				

				JsonConfig jc = new JsonConfig();
				jc.setExcludes(new String[]{"recorder","copyright","size","initiateName",
											"keyword","date","description","singer"});
			
				JSONObject jsonObject = JSONObject.fromObject(song,jc);
				
				String json = jsonObject.toString();
				
				
				System.out.print(json);
				ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
				System.out.println(json);
				ServletActionContext.getResponse().getWriter().print(json);
			
			return NONE;
		}
	
	
	
	
	
	
}
