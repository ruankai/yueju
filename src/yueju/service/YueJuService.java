package yueju.service;

import java.util.List;

import yueju.domain.Video;
import yueju.service.page.PagableService;

public interface YueJuService extends PagableService<Video> {

	public List<Video> findVideo();

	public Video findById(Long videoId);
}
