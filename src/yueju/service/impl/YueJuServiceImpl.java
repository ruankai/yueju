package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.NewsDao;
import yueju.dao.VideoDao;
import yueju.domain.Video;
import yueju.page.PageBean;
import yueju.service.YueJuService;
@Entity
@Service
@Transactional
public class YueJuServiceImpl  implements YueJuService{

	@ManyToOne
	@Autowired
	private VideoDao videoDao;
	public void pageQuery(PageBean<Video> pageBean) {
		// TODO Auto-generated method stub
		
	}

	public List<Video> findVideo() {
		// TODO Auto-generated method stub
		return videoDao.findAll();
	}

	public Video findById(Long videoId) {
		// TODO Auto-generated method stub
		return videoDao.findById(videoId);
	}


	
}
