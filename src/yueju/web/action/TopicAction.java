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
		// ��ѯ����
		//List<Topic> allTopic = topicService.findAllTopic();
		// ����ѯ���ݴ�ŵ�ֵջ�У�root /context
		// * root , 1 push ѹ��ջ���� jspҳ�� ʹ�ùؼ��� top ; 2 set(key ,value) ,jsp
		// ͨ����key�� ���
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
			// ���ɷ�����������
			// 1.1 ����ʱ��
			String dateStr = "";
			Date date = new Date();
			// format�ĸ�ʽ��������
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
			// ����
			topicService.addTopic(model);
			return "add";
		}
	}
	public String findById(){
		// ͨ��ID��ѯ
		Topic findTopic = topicService.findTopicById(model.getId());
		// �������ŵ�ֵջ�У����content.put(key,value) ��jsp ͨ�� ��#key�� ���
		ActionContext.getContext().put("findTopic", findTopic);
		return "findById";
	}
}