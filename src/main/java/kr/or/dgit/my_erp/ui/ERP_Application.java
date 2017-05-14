package kr.or.dgit.my_erp.ui;

import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import kr.or.dgit.my_erp.ui.view.DepartmentView;
import kr.or.dgit.my_erp.ui.view.EmployeeView;
import kr.or.dgit.my_erp.ui.view.TitleView;

public class ERP_Application extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnEmployee;
	private JButton btnDepartment;
	private JButton btnTitle;
	private EmployeeView ev;
	private DepartmentView dv;
	private TitleView tv;

	public ERP_Application() {
		setTitle("대구아이티ERP");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 150);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(20, 20, 20, 20));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 20, 0));

		btnEmployee = new JButton("사원관리");
		btnEmployee.addActionListener(this);
		contentPane.add(btnEmployee);

		btnDepartment = new JButton("부서관리");
		btnDepartment.addActionListener(this);
		contentPane.add(btnDepartment);

		btnTitle = new JButton("직책관리");
		btnTitle.addActionListener(this);
		contentPane.add(btnTitle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnTitle) {
			actionPerformedBtnTitle(e);
		}
		if (e.getSource() == btnDepartment) {
			actionPerformedBtnDepartment(e);
		}
		if (e.getSource() == btnEmployee) {
			actionPerformedBtnEmployee(e);
		}
	}

	protected void actionPerformedBtnEmployee(ActionEvent e) {
		if (ev == null) {
			ev = new EmployeeView();
		}
		ev.setVisible(true);
	}

	protected void actionPerformedBtnDepartment(ActionEvent e) {
		if (dv == null) {
			dv = new DepartmentView();
		}
		dv.setVisible(true);
	}

	protected void actionPerformedBtnTitle(ActionEvent e) {
		if (tv == null) {
			tv = new TitleView();
		}

		tv.setVisible(true);
	}
}
