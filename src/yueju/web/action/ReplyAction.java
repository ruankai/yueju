package yueju.web.action;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import yueju.domain.Reply;
import yueju.domain.User;
import yueju.web.action.base.BaseAction;

@Controller
@Scope("prototype")
public class ReplyAction extends BaseAction<Reply> {

	public String add() {
		User user = (User) ServletActionContext.getRequest().getSession()
				.getAttribute("loginUser");
		if (user == null) {
			return "login";
		} else {
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

			} catch (Exception e) {
				e.printStackTrace();
			}
			model.setUser(user);
			replyService.addReply(model);

			return "add";
		}
	}
}
