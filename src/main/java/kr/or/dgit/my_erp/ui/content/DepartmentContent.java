package kr.or.dgit.my_erp.ui.content;

import javax.swing.BoxLayout;
import javax.swing.JOptionPane;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.service.DepartmentService;
import kr.or.dgit.my_erp.ui.basic.TextFieldPanel;

public class DepartmentContent extends AbsContent<Department> {

	private TextFieldPanel pDNo;
	private TextFieldPanel pDName;
	private TextFieldPanel pDFloor;

	public DepartmentContent() {
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

		pDNo = new TextFieldPanel();
		pDNo.setTitle("번호");
		pDNo.setTfValue(setNo());
		pDNo.gettF().setEnabled(false);
		add(pDNo);

		pDName = new TextFieldPanel();
		pDName.setTitle("부서명");
		add(pDName);

		pDFloor = new TextFieldPanel();
		pDFloor.setTitle("위치");
		add(pDFloor);

	}

	@Override
	public void setObject(Department t) {
		pDNo.setTfValue(String.format("D%03d", t.getdCode()));
		pDName.setTfValue(t.getdName());
		pDFloor.setTfValue(t.getFloor() + "");
	}

	@Override
	public Department getObject() {
		int dcode = Integer.parseInt(pDNo.getTfValue().substring(1, pDNo.getTfValue().length()));
		String dname = pDName.getTfValue();
		int floor = Integer.parseInt(pDFloor.getTfValue());
		return new Department(dcode, dname, floor);
	}

	@Override
	public void clearAll() {
		pDNo.setTfValue(setNo());
		pDName.setTfValue("");
		pDFloor.setTfValue("");
	}

	@Override
	public boolean checkItem() {
		if (pDName.getTfValue().equals("") || pDFloor.getTfValue().equals("")) {
			JOptionPane.showMessageDialog(null, "빈칸이 존재합니다");
			return false;
		} else
			return true;
	}

	@Override
	public String setNo() {
		return String.format("D%03d", DepartmentService.getInstance().selectLastNum()+1);
	}

}