package kr.or.dgit.my_erp;

import static org.junit.Assert.fail;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.service.DepartmentService;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DepartmentServiceTest {
	private static DepartmentService departmentService;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		departmentService = new DepartmentService();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		departmentService = null;
	}

	@Test
	public void aTestInsertDepartment() {
		Department item = new Department(6, "대외협력", 2);

		int res = departmentService.insertDepartment(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void bTestUpdateDepartment() {
		Department item = new Department(6, "홍보", 12);
		int res = departmentService.updateDepartment(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void cTestselectDepartment() {
		Department item = new Department();
		item.setdCode(6);
		Department newItem = departmentService.selectDepartment(item);
		Assert.assertNotNull(newItem);
	}
	
	@Test
	public void dTestDeleteDepartment() {
		Department item = new Department();
		item.setdCode(6);
		int res = departmentService.deleteDepartment(item);
		Assert.assertSame(1, res);
	}
	
	@Test
	public void eTestSelectByAll() {
		List<Department> items = departmentService.selectByAll();
		Assert.assertNotNull(items);
	}
	
	@Test
	public void fTestselectLastNum() {
		int res = departmentService.selectLastNum();
		Assert.assertSame(5, res);
	}
	

}
