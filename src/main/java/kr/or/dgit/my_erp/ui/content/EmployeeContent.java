package kr.or.dgit.my_erp.ui.content;

import java.awt.GridLayout;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;

import kr.or.dgit.my_erp.dto.Department;
import kr.or.dgit.my_erp.dto.Employee;
import kr.or.dgit.my_erp.dto.Title;
import kr.or.dgit.my_erp.service.DepartmentService;
import kr.or.dgit.my_erp.service.TitleService;
import kr.or.dgit.my_erp.ui.basic.ComboPanel;
import kr.or.dgit.my_erp.ui.basic.RadioButtonPanel;
import kr.or.dgit.my_erp.ui.basic.SpinnerPanel;
import kr.or.dgit.my_erp.ui.basic.TextFieldPanel;

public class EmployeeContent extends AbsContent<Employee> {

	public TextFieldPanel pNo;
	public TextFieldPanel pName;
	public ComboPanel<Title> pTitle;
	public SpinnerPanel pSalary;
	public RadioButtonPanel pGender;
	public ComboPanel<Department> pDepartment;
	public TextFieldPanel pJoinDate;

	public EmployeeContent() {
		setLayout(new GridLayout(0, 1, 0, 0));

		pNo = new TextFieldPanel();
		pNo.setTitle("번호");
		pNo.gettF().setEnabled(false);
		pNo.setTfValue("E017005");
		add(pNo);

		pName = new TextFieldPanel();
		pName.setTitle("사원명");
		add(pName);

		pTitle = new ComboPanel();
		pTitle.setTitle("직책");
		List<Title> items = TitleService.getInstance().selectByAll();
		pTitle.setComboDate(items);
		add(pTitle);

		pSalary = new SpinnerPanel();
		pSalary.setTitle("급여");
		pSalary.setValues(1500000, 1000000, 5000000, 100000);
		add(pSalary);

		pGender = new RadioButtonPanel();
		pGender.setTitle("성별");
		pGender.setRadioItems("남", "여");
		pGender.setSelectedItem("남");
		add(pGender);

		pDepartment = new ComboPanel();
		pDepartment.setTitle("부서");
		List<Department> items2 = DepartmentService.getInstance().selectByAll();
		pDepartment.setComboDate(items2);
		add(pDepartment);

		pJoinDate = new TextFieldPanel();
		pJoinDate.setTitle("입사일");

		pJoinDate.setTfValue(nowDate());
		add(pJoinDate);

	}

	public String nowDate() {
		Calendar cal = Calendar.getInstance();
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH) + 1;
		int date = cal.get(cal.DATE);
		return String.format("%d-%02d-%d", year, month, date);
	}

	@Override
	public void setObject(Employee t) {
		pNo.setTfValue("E" + t.geteNo());
		pName.setTfValue(t.geteName());
		pTitle.setSelectItem(t.getTitle());
		pSalary.setValue(t.getSalary());
		pGender.setSelectedItem(t.isGender() ? 0 : 1);
		pDepartment.setSelectItem(t.getDepartment());
		pJoinDate.setTfValue(t.getJoindate());
	}

	@Override
	public Employee getObject() {
		int eNo = Integer.parseInt(pNo.getTfValue().substring(1, pNo.getTfValue().length() - 1));
		String eName = pName.getTfValue();
		int salary = (int) pSalary.getValue();
		Department dno = (Department) pDepartment.getSelectItem();
		boolean gender = pGender.getSelectedItem() == "남자" ? true : false;
		String joindate = pJoinDate.getTfValue();
		Title title = (Title) pTitle.getSelectItem();
		return new Employee(eNo, eName, salary, dno, gender, joindate, title);
	}

	@Override
	public void clearAll() {
		pNo.setTfValue("초기값");
		pName.setTfValue("");
		pTitle.setSelectedIndex(0);
		pSalary.setValue(1500000);
		pGender.setSelectedItem(0);
		pDepartment.setSelectedIndex(0);
		pJoinDate.setTfValue(nowDate());
	}

	@Override
	public boolean checkItem() {
		if (pNo.getTfValue().equals("")) {
			JOptionPane.showMessageDialog(null, "빈칸이 존재합니다");
			return false;
		} else
			return true;
	}

}