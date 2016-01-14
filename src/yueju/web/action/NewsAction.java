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
		// ��ѯ����
		List<News> allNews = newsService.findAllNews();
		// ����ѯ���ݴ�ŵ�ֵջ�У�root /context
		// * root , 1 push ѹ��ջ���� jspҳ�� ʹ�ùؼ��� top ; 2 set(key ,value) ,jsp
		// ͨ����key�� ���
		ActionContext.getContext().getValueStack().set("allNews", allNews);
		return "findAll";
	}
	public String findById(){
		// ͨ��ID��ѯ
		News findNews = newsService.findNewsById(model.getId());
		// �������ŵ�ֵջ�У����content.put(key,value) ��jsp ͨ�� ��#key�� ���
		ActionContext.getContext().put("findNews", findNews);
		return "findById";
	}

}