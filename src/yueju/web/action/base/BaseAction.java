package yueju.web.action.base;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mingrentang.service.ShowNamesService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;
import org.hibernate.criterion.DetachedCriteria;

import yueju.page.PageBean;
import yueju.service.HeaderService;
import yueju.service.HomeService;
import yueju.service.NewsService;
import yueju.service.PhotoService;
import yueju.service.ReplyService;
import yueju.service.SihuojuinfoService;
import yueju.service.SihuojujoinService;
import yueju.service.SongService;
import yueju.service.TextService;
import yueju.service.TopicService;
import yueju.service.YueJuService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * 閹惰棄褰囩悰銊у箛鐏炲倸鐤勯敓锟� * @author zhaoqx
 *
 */
@Entity
public class BaseAction<T> extends ActionSupport implements ModelDriven<T> {
	//濡�鐎风�纭呰杽
	protected T model;
	public T getModel() {
		return model;
	}
	protected PageBean<T> pageBean = new PageBean<T>();
	DetachedCriteria detachedCriteria = null;
	public void setPage(int page) {
		pageBean.setPage(page);
	}
	public void setRows(int rows) {
		pageBean.setPageSize(rows);
	}
	@ManyToOne
	@Resource
	protected HomeService homeService;
	
	@ManyToOne
	@Resource
	protected YueJuService yueJuService;
	
	@ManyToOne
	@Resource
	protected HeaderService headerService;
	
	@ManyToOne
	@Resource
	protected TextService textService;
	
	@ManyToOne
	@Resource
	protected PhotoService photoService;
	
	@ManyToOne
	@Resource
	protected SongService songService;
	
	@ManyToOne
	@Resource
	protected NewsService newsService;
	
	@ManyToOne
	@Resource
	protected ShowNamesService showNamesService;
	
//	
//	@ManyToOne
//	@Resource
//	protected ShowNamesService showNamesService;
//	
	@ManyToOne
	@Resource
	protected TopicService topicService;
	@ManyToOne
	@Resource
	protected ReplyService replyService;
	@ManyToOne
	@Resource
	protected SihuojuinfoService sihuojuinfoService;
	@ManyToOne
	@Resource
	protected SihuojujoinService sihuojujoinService;
	
	
	//閸︺劍鐎柅鐘虫煙娑擃叀骞忛崣鏍х杽娴ｆ挾琚崹瀣剁礉闁俺绻冮崣宥呯殸閸掓稑缂撳Ο鈥崇�鐎电钖�
	public BaseAction() {
		ParameterizedType genericSuperclass = null;
		Type superclass = this.getClass().getGenericSuperclass();
		if(superclass instanceof ParameterizedType){
			genericSuperclass = (ParameterizedType) this.getClass().getGenericSuperclass();
		}else{
			genericSuperclass = (ParameterizedType) this.getClass().getSuperclass().getGenericSuperclass();
		}
		//閼惧嘲绶遍悥鍓佽閿涘湐aseAction閿涘琚敓锟�		//閼惧嘲绶遍悥鍓佽娑撳﹦娈戝▔娑樼�閺佹壆绮�
		Type[] actualTypeArguments = genericSuperclass.getActualTypeArguments();
		Class<T> domainClass = (Class<T>) actualTypeArguments[0];
		detachedCriteria = DetachedCriteria.forClass(domainClass);
		pageBean.setDetachedCriteria(detachedCriteria);
		try {
			model = domainClass.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
			
		}
	}

	public void writePageBean2Json(String[] excudes,PageBean pageBean){
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(excudes);

		JSONObject jsonObject = JSONObject.fromObject(pageBean, jc);
		String json = jsonObject.toString();

		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeList2Json(String[] excudes,List list){
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(excudes);

		JSONArray jsonObject = JSONArray.fromObject(list, jc);
		String json = jsonObject.toString();

		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void writeObject2Json(String[] excudes,Object object){
		JsonConfig jc = new JsonConfig();
		jc.setExcludes(excudes);

		JSONObject jsonObject = JSONObject.fromObject(object, jc);
		String json = jsonObject.toString();

		ServletActionContext.getResponse().setContentType("text/json;charset=UTF-8");
		try {
			ServletActionContext.getResponse().getWriter().print(json);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
