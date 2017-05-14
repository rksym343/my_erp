package kr.or.dgit.my_erp.ui.view;

import javax.swing.JFrame;

import kr.or.dgit.my_erp.dto.Employee;
import kr.or.dgit.my_erp.service.EmployeeService;
import kr.or.dgit.my_erp.ui.content.AbsContent;
import kr.or.dgit.my_erp.ui.content.EmployeeContent;
import kr.or.dgit.my_erp.ui.table.AbsTable;
import kr.or.dgit.my_erp.ui.table.EmployeeTable;

public class EmployeeView extends AbsView<Employee> {

	
	public EmployeeView() {
		setTitle("사원 관리");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 600, 450);
		
	}

	@Override
	protected AbsTable<Employee> createTable() {
		return new EmployeeTable();
	}

	@Override
	protected AbsContent<Employee> createContent() {
		return new EmployeeContent();
	}

	@Override
	protected void deleteItem(Employee t) {
		EmployeeService.getInstance().deleteEmployee(t);
	}

	@Override
	protected void updateItem(Employee t) {
		EmployeeService.getInstance().updateEmployee(t);
	}

	@Override
	protected void insertItem(Employee t) {
		EmployeeService.getInstance().insertEmployee(t);
	}

}
