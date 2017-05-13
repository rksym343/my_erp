package kr.or.dgit.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.dao.EmployeeMapper;
import kr.or.dgit.dao.EmployeeMapperImpl;
import kr.or.dgit.dto.Employee;
import kr.or.dgit.util.MybatisSqlSessionFactory;

public class EmployeeService {
	private static final EmployeeService instance = new EmployeeService();

	public EmployeeService() {
	}

	public static EmployeeService getInstance() {
		return instance;
	}

	public List<Employee> selectByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			return EmployeeMapper.selectByAll();
		}
	}

	public static Employee selectEmployee(Employee employee) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			return EmployeeMapper.selectEmployee(employee);
		}
	}

	public int insertEmployee(Employee employee) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res = EmployeeMapper.insertEmployee(employee);
			sqlSession.commit();
			return res;
		}
	}

	public int updateEmployee(Employee employee) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res = EmployeeMapper.updateEmployee(employee);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteEmployee(Employee employee) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			EmployeeMapper EmployeeMapper = new EmployeeMapperImpl(sqlSession);
			int res = EmployeeMapper.deleteEmployee(employee);
			sqlSession.commit();
			return res;
		}
	}
}
