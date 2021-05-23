package Entities;

public class Gamer {
	private String tcNo;
	private String name;
	private String lName;
	private int date;
	public Gamer() {
		super();
	}
	public Gamer(String tcNo, String name, String lName, int date) {
		
		this.tcNo = tcNo;
		this.name = name;
		this.lName = lName;
		this.date = date;
	}
	public String getTcNo() {
		return tcNo;
	}
	public String getName() {
		return name;
	}
	public String getlName() {
		return lName;
	}
	public int getDate() {
		return date;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public void setDate(int date) {
		this.date = date;
	}
}
