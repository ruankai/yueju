package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.UserDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.User;

@Entity
@Repository
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {

}
