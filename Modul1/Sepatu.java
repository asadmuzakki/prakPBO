package Modul1;

public class Sepatu extends Barang {
	private int shoeSize;
	public Sepatu(String name, int price, int shoeSize){
		super(name, price);
		this.shoeSize = shoeSize;
	}
	public int getShoeSize(){
		return shoeSize;
	}
	
	@Override
	public void setStock(int stock) {
		super.setStock(stock);
	}
	
	@Override
	public void reduceStock(int amount) {
		super.reduceStock(amount);
	}
}
