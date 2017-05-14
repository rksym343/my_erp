package kr.or.dgit.my_erp.ui.table;

import java.util.List;

import javax.swing.SwingConstants;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.service.DepartmentService;
public class DepartmentTable extends AbsTable<Department> {

	@Override
	protected void cellWith() {
		tableSetWidth(80, 150, 80);
	}

	@Override
	protected void CellAlign() {
		tableCellAlignment(SwingConstants.CENTER, 0, 1, 2);
	}

	@Override
	protected Object[][] getRowData() {
		List<Department> list = DepartmentService.getInstance().selectByAll();
		Object[][] datas = new Object[list.size()][];
		for(int i =0; i< datas.length; i++){
			datas[i]= list.get(i).toArray();
		}
		return datas;
	}

	@Override
	protected Object[] getColumn() {
		return new Object[] { "번호", "부서명", "위치" };
	}

	@Override
	public Department getSelectedObject() {
		int selectedIdx = table.getSelectedRow();
		if (selectedIdx == -1) {
			return null;
		}
		String sNo = (String) table.getValueAt(selectedIdx, 0);
		int dCode = Integer.parseInt(sNo.substring(1, sNo.length()));
		Department dept = new Department();
		dept.setdCode(dCode);
		return DepartmentService.getInstance().selectDepartment(dept);
	}

}
