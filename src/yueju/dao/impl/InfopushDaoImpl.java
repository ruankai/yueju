package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.InfopushDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Infopush;
@Entity
@Repository
public class InfopushDaoImpl extends BaseDaoImpl<Infopush> implements InfopushDao{

}
