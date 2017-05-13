package kr.or.dgit.dto;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((tName == null) ? 0 : tName.hashCode());
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
		Title other = (Title) obj;
		if (tName == null) {
			if (other.tName != null)
				return false;
		} else if (!tName.equals(other.tName))
			return false;
		return true;
	}

}
