package yueju.dao.impl;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

import yueju.dao.SongDao;
import yueju.dao.base.impl.BaseDaoImpl;
import yueju.domain.Song;

@Entity
@Repository
public class SongDaoImpl extends BaseDaoImpl<Song> implements SongDao{

}
