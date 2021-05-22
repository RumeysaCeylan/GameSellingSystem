package Entities;

public class Games {
	private String gameName;
	private double price;
	private int id;
	public Games() {
		
	}
	public Games(String gameName, double price, int id) {
	
		this.gameName = gameName;
		this.price = price;
		this.id = id;
	}
	public String getGameName() {
		return gameName;
	}
	public double getPrice() {
		return price;
	}
	public int getId() {
		return id;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setId(int id) {
		this.id = id;
	}
}
