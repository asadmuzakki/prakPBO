package Modul1;

public class Bank extends User {
	private int id;
	private boolean active = true;
	private double bankDiscount = 0;
	
	public Bank(String name, int id) {
		super(name);
		this.id = id;
	}
	
	public int getInt() {
		return id;
	}
	
	public void setBankDiscount(int discount) {
		bankDiscount = discount;
	}
	
	public double getBankDiscount() {
		return bankDiscount;
	}
	
	public void activate() {
		active = true;
	}
	
	public void deactivate() {
		active = false;
	}
	
	public boolean isActive() {
		return active;
	}
}
