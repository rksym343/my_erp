package kr.or.dgit.dto;

public class Department {
	private int dCode;
	private String dName;
	private int floor;

	public Department() {
	}

	public Department(int dcode, String dname, int floor) {
		super();
		this.dCode = dcode;
		this.dName = dname;
		this.floor = floor;
	}

	

	@Override
	public String toString() {
		return String.format("%s(%s층)", dName, floor);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dName == null) ? 0 : dName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Department other = (Department) obj;
		if (dName == null) {
			if (other.dName != null)
				return false;
		} else if (!dName.equals(other.dName))
			return false;
		return true;
	}

	public int getdCode() {
		return dCode;
	}

	public void setdCode(int dCode) {
		this.dCode = dCode;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

}
