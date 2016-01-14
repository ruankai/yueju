package yueju.service;

import java.util.List;

import yueju.domain.Song;

public interface SongService {

	Song findById(Long songId);

	List<Song> findSongs();



	

}
