package yueju.service.impl;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import yueju.dao.SongDao;
import yueju.domain.Song;
import yueju.service.SongService;
@Entity
@Service
@Transactional
public class SongServiceImpl implements SongService{
	@ManyToOne
	@Autowired
	private SongDao songDao;

	public Song findById(Long songId) {
		// TODO Auto-generated method stub
		return songDao.findById(songId);
	}

	public List<Song> findSongs() {
		// TODO Auto-generated method stub
		return songDao.findAll();
	}
	
	
	
}
