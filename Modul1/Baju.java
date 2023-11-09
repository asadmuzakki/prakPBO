package Modul1;

public class Baju extends Barang {
	private String size;
	public Baju(String name, int price, String size){
		super(name, price);
		this.size = size;
	}
	public String getSize(){
		return size;
	}
	public void setStock(int stock){
		super.setStock(stock);
	}
	
	@Override
	public void reduceStock(int amount) {
		super.reduceStock(amount);
	}
}
