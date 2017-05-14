package kr.or.dgit.my_erp.dao;

import java.util.List;

import kr.or.dgit.my_erp.dto.Title;

public interface TitleMapper {
	List<Title> selectByAll();

	Title selectTitle(Title title);
	
	int selectLastNum();

	int insertTitle(Title title);

	int updateTitle(Title title);

	int deleteTitle(Title title);
}
