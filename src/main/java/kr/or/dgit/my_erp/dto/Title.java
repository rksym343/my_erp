package kr.or.dgit.my_erp.dto;

public class Title {
	private int tCode;
	private String tName;

	public Title() {
	}

	public Title(int tCode, String tName) {
		this.tCode = tCode;
		this.tName = tName;
	}

	public int gettCode() {
		return tCode;
	}

	public void settCode(int tCode) {
		this.tCode = tCode;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}

	@Override
	public String toString() {
		return String.format("%s", tName);
	}

	public Object[] toArray(){
		return new Object[]{String.format("T%03d", tCode), tName};
	}

}
