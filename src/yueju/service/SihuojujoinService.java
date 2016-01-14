package yueju.service;

import java.util.List;

import yueju.domain.Sihuojuinfo;
import yueju.domain.Sihuojujoin;
import yueju.domain.User;
import yueju.service.page.PagableService;

public interface SihuojujoinService extends PagableService<Sihuojujoin> {

	List<Sihuojujoin> findBySihuojuinfoId(Long id);

	void save(Sihuojujoin model);



	void delBySihuojujoinIdAndUserId(Sihuojujoin model);

	List<Sihuojujoin> findByUser(User user);

}
