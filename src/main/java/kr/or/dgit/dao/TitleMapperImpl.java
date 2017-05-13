package kr.or.dgit.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.dto.Title;

public class TitleMapperImpl implements TitleMapper {
	private String namespace = "kr.or.dgit.dao.TitleMapper.";
	private static final Log log = LogFactory.getLog(TitleMapper.class);
	private SqlSession sqlSession;
	
	public TitleMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Title> selectByAll() {
		log.debug("selectByAll()");
		return sqlSession.selectList(namespace + "selectByAll");
	}

	@Override
	public Title selectTitle(Title title) {
		log.debug("selectTitle()");
		return sqlSession.selectOne(namespace + "selectTitle", title);
	}

	@Override
	public int insertTitle(Title title) {
		log.debug("insertTitle()");
		return sqlSession.insert(namespace + "insertTitle", title);
	}

	@Override
	public int updateTitle(Title title) {
		log.debug("updateTitle()");
		return sqlSession.insert(namespace + "updateTitle", title);
	}

	@Override
	public int deleteTitle(Title title) {
		log.debug("deleteTitle()");
		return sqlSession.insert(namespace + "deleteTitle", title);
	}

}
