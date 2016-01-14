package yueju.dao.impl;

import java.util.List;

import javax.persistence.Entity;
import org.springframework.stereotype.Repository;

import yueju.dao.NewsDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.News;
@Entity
@Repository
public class NewsDaoImpl  extends BaseDaoImpl<News> implements NewsDao{

	

}
