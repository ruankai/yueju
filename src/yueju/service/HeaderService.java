package yueju.service;

import yueju.domain.User;
import yueju.service.page.PagableService;

public interface HeaderService extends PagableService<User> {

	User login(String password, String name);

	void save(User model);

}
