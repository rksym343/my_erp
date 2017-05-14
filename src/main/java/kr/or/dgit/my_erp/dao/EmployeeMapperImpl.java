package kr.or.dgit.my_erp.dao;

import java.util.List;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.my_erp.dto.Employee;

public class EmployeeMapperImpl implements EmployeeMapper {
	private String namespace = "kr.or.dgit.my_erp.dao.EmployeeMapper.";
	private static final Log log = LogFactory.getLog(EmployeeMapper.class);
	private SqlSession sqlSession;

	
	
	public EmployeeMapperImpl(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<Employee> selectByAll() {
		log.debug("selectByAll()");
		return sqlSession.selectList(namespace + "selectByAll");
	}

	@Override
	public Employee selectEmployee(Employee employee) {
		log.debug("selectEmployee()");
		return sqlSession.selectOne(namespace + "selectEmployee", employee);
	}

	@Override
	public int insertEmployee(Employee employee) {
		log.debug("insertEmployee()");
		return sqlSession.insert(namespace + "insertEmployee", employee);
	}

	@Override
	public int updateEmployee(Employee employee) {
		log.debug("updateEmployee()");
		return sqlSession.insert(namespace + "updateEmployee", employee);
	}

	@Override
	public int deleteEmployee(Employee employee) {
		log.debug("deleteEmployee()");
		return sqlSession.insert(namespace + "deleteEmployee", employee);
	}
	
	@Override
	public int selectLastNum() {
		log.debug("selectLastNum()");
		return sqlSession.selectOne(namespace + "selectLastNum");
	}

}
