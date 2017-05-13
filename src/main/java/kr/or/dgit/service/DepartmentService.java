package kr.or.dgit.service;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import kr.or.dgit.dao.DepartmentMapper;
import kr.or.dgit.dao.DepartmentMapperImpl;
import kr.or.dgit.dto.Department;
import kr.or.dgit.util.MybatisSqlSessionFactory;

public class DepartmentService {
	private static final DepartmentService instance = new DepartmentService();

	public DepartmentService() {
	}

	public static DepartmentService getInstance() {
		return instance;
	}

	public List<Department> selectByAll() {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = new DepartmentMapperImpl(sqlSession);
			return departmentMapper.selectByAll();
		}
	}

	public static Department selectDepartment(Department department) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = new DepartmentMapperImpl(sqlSession);
			return departmentMapper.selectDepartment(department);
		}
	}

	public int insertDepartment(Department department) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = new DepartmentMapperImpl(sqlSession);
			int res = departmentMapper.insertDepartment(department);
			sqlSession.commit();
			return res;
		}
	}

	public int updateDepartment(Department department) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = new DepartmentMapperImpl(sqlSession);
			int res = departmentMapper.updateDepartment(department);
			sqlSession.commit();
			return res;
		}
	}

	public int deleteDepartment(Department department) {
		try (SqlSession sqlSession = MybatisSqlSessionFactory.openSession()) {
			DepartmentMapper departmentMapper = new DepartmentMapperImpl(sqlSession);
			int res = departmentMapper.deleteDepartment(department);
			sqlSession.commit();
			return res;
		}
	}
}
