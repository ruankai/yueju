package yueju.service;

import java.util.List;

import yueju.domain.Sihuojuinfo;
import yueju.domain.Sihuojujoin;
import yueju.domain.User;
import yueju.service.page.PagableService;

public interface SihuojuinfoService extends PagableService<Sihuojuinfo> {

	List<Sihuojuinfo> findAllSihuojuinfo();

	Sihuojuinfo findById(Long id);

	void update(Sihuojuinfo sihuojuinfo);

	List<Sihuojuinfo> findByUser(User user);

	

}
