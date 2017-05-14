package kr.or.dgit.my_erp.dao;

import java.util.List;

import kr.or.dgit.my_erp.dto.Department;

public interface DepartmentMapper {
	List<Department> selectByAll();

	Department selectDepartment(Department department);
	
	int selectLastNum();

	int insertDepartment(Department department);

	int updateDepartment(Department department);

	int deleteDepartment(Department department);
}
