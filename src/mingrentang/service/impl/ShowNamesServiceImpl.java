package mingrentang.service.impl;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mingrentang.dao.mingrenDao;
import mingrentang.dao.impl.mingrenDaoImpl;
import mingrentang.service.ShowNamesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.domain.Minreninfo;
import yueju.page.PageBean;
@Entity
@Service
@Transactional
public class ShowNamesServiceImpl implements ShowNamesService {
	
	@ManyToOne
	@Autowired
	private mingrenDao mingrendao;
	
	public List<Minreninfo> findMin() {
		if(mingrendao==null)
			System.out.println("!!!!!!!!!!!!!!");
		return mingrendao.findAll();
	
	
	}

	public void pageQuery(PageBean<Minreninfo> pageBean) {
		
		mingrendao.pageQuery(pageBean);
	}

	public Minreninfo findById(Long id) {
		 return mingrendao.findById(id);
	}

	public void update(Minreninfo minreninfo) {
		mingrendao.update(minreninfo);
		
	}

	
}
