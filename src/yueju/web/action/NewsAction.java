package yueju.web.action;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.News;
import yueju.domain.Topic;
import yueju.domain.User;
import yueju.web.action.base.BaseAction;

import com.opensymphony.xwork2.ActionContext;

@Controller
@Scope("prototype")
public class NewsAction extends BaseAction<News>{
	public String findAll() {
		// 查询所有
		List<News> allNews = newsService.findAllNews();
		// 将查询数据存放到值栈中，root /context
		// * root , 1 push 压入栈顶， jsp页面 使用关键字 top ; 2 set(key ,value) ,jsp
		// 通过“key” 获得
		ActionContext.getContext().getValueStack().set("allNews", allNews);
		return "findAll";
	}
	public String findById(){
		// 通过ID查询
		News findNews = newsService.findNewsById(model.getId());
		// 将结果存放到值栈中，存放content.put(key,value) ，jsp 通过 “#key” 获得
		ActionContext.getContext().put("findNews", findNews);
		return "findById";
	}

}
