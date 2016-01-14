package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.TextDao;
import yueju.domain.Text;
import yueju.page.PageBean;
import yueju.service.TextService;

@Entity
@Service
@Transactional
public class TextServiceImpl implements TextService {

	@ManyToOne
	@Autowired
	private TextDao textDao;
	public void pageQuery(PageBean<Text> pageBean) {
		// TODO Auto-generated method stub
		textDao.pageQuery(pageBean);
		
	}
	public List findTextByTitle(String title) {
		// TODO Auto-generated method stub
		List texts=textDao.findByNamedQuery("findTextByTitle","%"+title+"%");
		return texts;
	}
	public Text findById(long textId) {
		Text text = textDao.findById(textId);
		return text;
	}
	

}
