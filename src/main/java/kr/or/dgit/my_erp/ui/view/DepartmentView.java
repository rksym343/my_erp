package kr.or.dgit.my_erp.ui.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.service.DepartmentService;
import kr.or.dgit.my_erp.ui.content.AbsContent;
import kr.or.dgit.my_erp.ui.content.DepartmentContent;
import kr.or.dgit.my_erp.ui.table.AbsTable;
import kr.or.dgit.my_erp.ui.table.DepartmentTable;

public class DepartmentView extends AbsView<Department> {

	public DepartmentView() {
		setTitle("부서 관리");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 450, 300);

	}


	@Override
	protected AbsTable<Department> createTable() {
		return new DepartmentTable();
	}

	@Override
	protected AbsContent<Department> createContent() {
		return new DepartmentContent();
	}

	@Override
	protected void deleteItem(Department t) {
		DepartmentService.getInstance().deleteDepartment(t);		
	}


	@Override
	protected void updateItem(Department t) {
		DepartmentService.getInstance().updateDepartment(t);
	}


	@Override
	protected void insertItem(Department t) {
		DepartmentService.getInstance().insertDepartment(t);
	}

}