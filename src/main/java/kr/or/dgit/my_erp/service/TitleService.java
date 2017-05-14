package kr.or.dgit.my_erp.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.my_erp.dao.EmployeeMapper;
import kr.or.dgit.my_erp.dao.EmployeeMapperImpl;
import kr.or.dgit.my_erp.dao.TitleMapper;
import kr.or.dgit.my_erp.dao.TitleMapperImpl;
import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.util.MybatisSqlSessionFactory;

public class TitleService {
	private static final TitleService instance = new TitleService();

	public TitleService() {
	}

	public static TitleService getInstance() {
		return instance;
	}

	public List<Title> selectByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			return TitleMapper.selectByAll();
		}
	}

	public static Title selectTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			return TitleMapper.selectTitle(title);
		}
	}

	public int insertTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			int res = TitleMapper.insertTitle(title);
			sqlSession.commit();
			return res;
		}
	}

	public int updateTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			int res = TitleMapper.updateTitle(title);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteTitle(Title title) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			int res = TitleMapper.deleteTitle(title);
			sqlSession.commit();
			return res;
		}
	}
	
	public int selectLastNum() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			TitleMapper TitleMapper = new TitleMapperImpl(sqlSession);
			return TitleMapper.selectLastNum();
		}
	}
}
