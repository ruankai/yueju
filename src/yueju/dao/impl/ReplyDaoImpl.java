package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.ReplyDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Reply;

@Entity
@Repository
public class ReplyDaoImpl extends BaseDaoImpl<Reply> implements ReplyDao {

}
