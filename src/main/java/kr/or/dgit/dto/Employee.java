package kr.or.dgit.dto;

public class Employee {
	private int eNo;
	private String eName;
	private int salary;
	private Department department;
	private boolean gender;
	private String joindate;
	private Title title;

	public Employee() {
	}

	public Employee(int eNo, String eName, int salary, Department dno, boolean gender, String joindate, Title title) {
		super();
		this.eNo = eNo;
		this.eName = eName;
		this.salary = salary;
		this.department = dno;
		this.gender = gender;
		this.joindate = joindate;
		this.title = title;
	}

	public int geteNo() {
		return eNo;
	}

	public void seteNo(int eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public String getJoindate() {
		return joindate;
	}

	public void setJoindate(String joindate) {
		this.joindate = joindate;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

}
