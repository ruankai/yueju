package yueju.service;

import java.util.List;

import yueju.domain.Text;
import yueju.service.page.PagableService;

public interface TextService extends PagableService<Text> {

	List findTextByTitle(String title);

	Text findById(long i);



	
}
