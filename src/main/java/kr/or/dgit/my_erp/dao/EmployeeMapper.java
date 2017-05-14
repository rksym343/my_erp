package kr.or.dgit.my_erp.dao;

import java.util.List;

import kr.or.dgit.my_erp.dto.Employee;

public interface EmployeeMapper {
	List<Employee> selectByAll();

	Employee selectEmployee(Employee employee);
	
	int selectLastNum();

	int insertEmployee(Employee employee);

	int updateEmployee(Employee employee);

	int deleteEmployee(Employee employee);
}
