package kr.or.dgit.my_erp.dto;

public class Department {
	private int dcode;
	private String dname;
	private int floor;

	public Department() {
	}

	public Department(int dcode, String dname, int floor) {
		this.dcode = dcode;
		this.dname = dname;
		this.floor = floor;
	}

	public int getdcode() {
		return dcode;
	}

	public void setdcode(int dCode) {
		this.dcode = dCode;
	}

	public String getdname() {
		return dname;
	}

	public void setdname(String dName) {
		this.dname = dName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	@Override
	public String toString() {
		return String.format("%s(%s층)", dname, floor);
	}

	public Object[] toArray(){
		return new Object[]{String.format("D%03d", dcode), dname, floor};
	}

	

}
