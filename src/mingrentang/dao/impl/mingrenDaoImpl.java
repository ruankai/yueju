package mingrentang.dao.impl;


import javax.persistence.Entity;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import mingrentang.dao.mingrenDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Minreninfo;

@Entity
@Repository

public class mingrenDaoImpl extends BaseDaoImpl<Minreninfo> implements mingrenDao{

}
