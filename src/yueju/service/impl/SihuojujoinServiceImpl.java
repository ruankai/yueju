package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.SihuojujoinDao;
import yueju.domain.Sihuojuinfo;
import yueju.domain.Sihuojujoin;
import yueju.domain.User;
import yueju.page.PageBean;
import yueju.service.SihuojujoinService;

@Entity
@Service
@Transactional
public class SihuojujoinServiceImpl implements SihuojujoinService {

	@ManyToOne
	@Autowired
	private SihuojujoinDao sihuojujoindao;
	
	public void pageQuery(PageBean<Sihuojujoin> pageBean) {
		// TODO Auto-generated method stub
		
	}

	public List<Sihuojujoin> findBySihuojuinfoId(Long id) {
		// TODO Auto-generated method stub
		List<Sihuojujoin> sihuojuinfo = sihuojujoindao.findByNamedQuery("findSihuojujoinBysihuojuId", id);
		return sihuojuinfo;
	}

	
	public void save(Sihuojujoin model) {
		// TODO Auto-generated method stub
		sihuojujoindao.save(model);
	}

	
	public void delBySihuojujoinIdAndUserId(Sihuojujoin model) {
		// TODO Auto-generated method stub
		sihuojujoindao.delete(model);
	}

	public List<Sihuojujoin> findByUser(User user) {
		// TODO Auto-generated method stub
		return sihuojujoindao.findByNamedQuery("findByUserId", user.getId());
	}

}
