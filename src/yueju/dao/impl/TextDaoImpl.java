package yueju.dao.impl;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;


import yueju.dao.TextDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Text;

@Entity
@Repository
public class TextDaoImpl  extends BaseDaoImpl<Text> implements TextDao{

	

}
