package mingrentang.service;

import java.util.List;

import yueju.domain.Minreninfo;
import yueju.service.page.PagableService;

public interface ShowNamesService extends PagableService<Minreninfo>{

	List<Minreninfo> findMin();
	public Minreninfo findById(Long id);
	public void update(Minreninfo minreninfo);
}