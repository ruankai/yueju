package yueju.service.impl;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.PhotoDao;
import yueju.domain.Photo;
import yueju.page.PageBean;
import yueju.service.PhotoService;

@Entity
@Service
@Transactional
public class PhotoServiceImpl implements PhotoService{

	@ManyToOne
	@Autowired
	private PhotoDao photoDao;
	public void pageQuery(PageBean<Photo> pageBean) {
		// TODO Auto-generated method stub
		photoDao.pageQuery(pageBean);
		
	}

}
