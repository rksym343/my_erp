package kr.or.dgit.my_erp;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.dto.Employee;
import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.service.EmployeeService;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class EmployeeServiceTest {
	private static EmployeeService EmployeeService;
	
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		EmployeeService = new EmployeeService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		EmployeeService = null;
	}

	@Test
	public void aTestInsertEmployee() {
		Department dept = new Department();
		dept.setdCode(2);
		
		Title title = new Title();
		title.settCode(3);
		Employee item = new Employee(017014, "테스트용도", 1555000, dept, true, "2007-05-13", title);

		int res = EmployeeService.insertEmployee(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void bTestUpdateEmployee() {
		Department dept = new Department();
		dept.setdCode(4);
		
		Title title = new Title();
		title.settCode(4);
		Employee item = new Employee(017014, "수정합니다", 2555000, dept, true, "2007-05-13", title);
		int res = EmployeeService.updateEmployee(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void cTestselectEmployee() {
		Employee item = new Employee();
		item.seteNo(017014);
		Employee newItem = EmployeeService.selectEmployee(item);
		Assert.assertNotNull(newItem);
	}
	
	@Test
	public void dTestDeleteEmployee() {
		Employee item = new Employee();
		item.seteNo(017014);
		int res = EmployeeService.deleteEmployee(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void eTestSelectByAll() {
		List<Employee> items = EmployeeService.selectByAll();
		Assert.assertNotNull(items);
	}

	@Test
	public void fTestselectLastNum() {
		int res = EmployeeService.selectLastNum();
		/*System.out.println("사원 마지막 번호"+res);
		Assert.assertSame(17011, res);*/
	}

}
