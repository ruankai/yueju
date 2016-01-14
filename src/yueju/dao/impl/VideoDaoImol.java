package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.VideoDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Video;
@Entity
@Repository
public class VideoDaoImol extends BaseDaoImpl<Video> implements VideoDao {

}
