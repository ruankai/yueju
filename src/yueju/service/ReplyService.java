package yueju.service;

import yueju.domain.Reply;
import yueju.service.page.PagableService;

public interface ReplyService extends PagableService<Reply>{

	void addReply(Reply model);

	

}
