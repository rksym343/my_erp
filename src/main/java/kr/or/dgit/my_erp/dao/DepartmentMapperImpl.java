package kr.or.dgit.my_erp.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.my_erp.dto.Department;

public class DepartmentMapperImpl implements DepartmentMapper {
	private String namespace = "kr.or.dgit.my_erp.dao.DepartmentMapper.";
	private static final Log log = LogFactory.getLog(DepartmentMapper.class);
	private SqlSession sqlSession;

	public DepartmentMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	@Override
	public List<Department> selectByAll() {
		log.debug("selectByAll()");
		return sqlSession.selectList(namespace + "selectByAll");
	}

	@Override
	public Department selectDepartment(Department department) {
		log.debug("selectDepartment()");
		return sqlSession.selectOne(namespace + "selectDepartment", department);
	}

	@Override
	public int insertDepartment(Department department) {
		log.debug("insertDepartment()");
		return sqlSession.insert(namespace + "insertDepartment", department);
	}

	@Override
	public int updateDepartment(Department department) {
		log.debug("updateDepartment()");
		return sqlSession.insert(namespace + "updateDepartment", department);
	}

	@Override
	public int deleteDepartment(Department department) {
		log.debug("deleteDepartment()");
		return sqlSession.insert(namespace + "deleteDepartment", department);
	}

	@Override
	public int selectLastNum() {
		log.debug("selectLastNum()");
		return sqlSession.selectOne(namespace + "selectLastNum");
	}

}
