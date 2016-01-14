package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import yueju.dao.UserDao;
import yueju.domain.User;
import yueju.page.PageBean;
import yueju.service.HeaderService;

@Entity
@Service
@Transactional
public class HeaderServiceImpl implements HeaderService {

	public void pageQuery(PageBean<User> pageBean) {
		// TODO Auto-generated method stub
		
	}

	@Autowired
	private UserDao userDao;
	public User login(String password, String name) {
		List<User> list = userDao.findByNamedQuery("findByUserNameAndPassword",
				name, password);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	public void save(User model) {
		// TODO Auto-generated method stub
		userDao.save(model);
	}

}
