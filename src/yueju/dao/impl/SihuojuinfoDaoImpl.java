package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.SihuojuinfoDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Sihuojuinfo;

@Entity
@Repository
public class SihuojuinfoDaoImpl extends BaseDaoImpl<Sihuojuinfo> implements SihuojuinfoDao {

}
