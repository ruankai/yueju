package yueju.web.action;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;

import yueju.common.Page;
import yueju.domain.Topic;
import yueju.domain.User;
import yueju.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class TopicAction extends BaseAction<Topic> {

	public String findAll() {
		// 查询所有
		//List<Topic> allTopic = topicService.findAllTopic();
		// 将查询数据存放到值栈中，root /context
		// * root , 1 push 压入栈顶， jsp页面 使用关键字 top ; 2 set(key ,value) ,jsp
		// 通过“key” 获得
		//ActionContext.getContext().getValueStack().set("allTopic", allTopic);
		String num = ServletActionContext.getRequest().getParameter("num");
		Page page=topicService.findTopics(num);
		page.setUrl("/topic_findAll.action");
		ActionContext.getContext().getValueStack().set("page", page);
		return "findAll";
	}

	public String add() {
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute("loginUser");
		if (user == null) {
			return "login";
		} else {
			// 生成服务器端数据
			// 1.1 创建时间
			String dateStr = "";
			Date date = new Date();
			// format的格式可以任意
			DateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			try {
				dateStr = sdf2.format(date);
				System.out.println(dateStr);
			} catch (Exception e) {
				e.printStackTrace();
			}
			Timestamp ts = new Timestamp(System.currentTimeMillis());
			try {
				ts = Timestamp.valueOf(dateStr);
				model.setPostTime(ts);
				model.setLastUpdateTime(ts);
			} catch (Exception e) {
				e.printStackTrace();
			}
			model.setUser(user);
			// 添加
			topicService.addTopic(model);
			return "add";
		}
	}
	public String findById(){
		// 通过ID查询
		Topic findTopic = topicService.findTopicById(model.getId());
		// 将结果存放到值栈中，存放content.put(key,value) ，jsp 通过 “#key” 获得
		ActionContext.getContext().put("findTopic", findTopic);
		return "findById";
	}
}
