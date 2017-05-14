package kr.or.dgit.my_erp.ui.table;

import java.util.List;

import javax.swing.SwingConstants;

import kr.or.dgit.my_erp.dto.Employee;
import kr.or.dgit.my_erp.service.EmployeeService;

public class EmployeeTable extends AbsTable<Employee> {

	@Override
	protected void cellWith() {
		tableSetWidth(80, 100, 80, 150, 80, 100, 100);
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1, 2, 4, 5, 6);
		tableCellAlignment(SwingConstants.RIGHT, 3);

	}

	@Override
	protected Object[][] getRowData() {
		List<Employee> list = EmployeeService.getInstance().selectByAll();
		Object[][] datas = new Object[list.size()][];
		for(int i =0; i< datas.length; i++){
			datas[i]= list.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new Object[] { "번호", "사원명", "직책", "급여", "성별", "부서", "입사일" };
	}

	@Override
	public Employee getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String sNo = (String) table.getValueAt(selectedIdx, 0);
		int eNo = Integer.parseInt(sNo.substring(1, sNo.length()));
		Employee emp = new Employee();
		emp.seteNo(eNo);
		return EmployeeService.getInstance().selectEmployee(emp);
	}

}
