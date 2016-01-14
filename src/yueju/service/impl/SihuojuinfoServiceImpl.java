package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.SihuojuinfoDao;
import yueju.domain.Sihuojuinfo;
import yueju.domain.User;
import yueju.page.PageBean;
import yueju.service.SihuojuinfoService;

@Entity
@Service
@Transactional
public class SihuojuinfoServiceImpl implements SihuojuinfoService {

	@ManyToOne
	@Autowired
	private SihuojuinfoDao sihuojudao;
	public List<Sihuojuinfo> findAllSihuojuinfo() {
		// TODO Auto-generated method stub
		List<Sihuojuinfo> list=sihuojudao.findAll();
		return list;
	}

	public void pageQuery(PageBean<Sihuojuinfo> pageBean) {
		// TODO Auto-generated method stub
		
	}

	public Sihuojuinfo findById(Long id) {
		// TODO Auto-generated method stub
		return sihuojudao.findById(id);
	}

	
	public void update(Sihuojuinfo sihuojuinfo) {
		// TODO Auto-generated method stub
		sihuojudao.update(sihuojuinfo);
	}

	public List<Sihuojuinfo> findByUser(User user) {
		// TODO Auto-generated method stub
		return sihuojudao.findByNamedQuery("findByUser", user);
	}

}
