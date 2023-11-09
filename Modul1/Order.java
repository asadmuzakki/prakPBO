package Modul1;

public class Order {
	private Barang barang;
	private int amount;
	
	Order(Barang barang, int amount) {
		this.barang = barang;
		this.amount = amount;
	}
	
	int getTotalPrice() {
		return barang.getPrice() * amount;
	}
	
	public Barang getBarang() {
		return barang;
	}
	
	public int getAmount() {
		return amount;
	}
	
	void printNota() {
		System.out.println(barang.getName() +  " x " + getAmount() + " = Rp" + getTotalPrice());
	}
	
	
}
