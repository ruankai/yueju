package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.PhotoDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Photo;

@Entity
@Repository
public class PhotoDaoImpl  extends BaseDaoImpl<Photo> implements PhotoDao{

	

}
