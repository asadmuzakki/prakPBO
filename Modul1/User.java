package Modul1;

import java.util.ArrayList;

public class User {
	private String name;
	private double saldo;
	ArrayList<Order> order = new ArrayList<Order>();
	User(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public void isiSaldo(double jumlah){
		if(jumlah >= 50000){
			saldo += jumlah;
			System.out.println(name + " Saldo berhasil diisi sebesar Rp" + jumlah+"\n");
		}else{
			System.out.println(name + " Pengisian saldo gagal. Jumlah minimal pengisian adalah Rp50,000.\n");
		}
	}
	public void minSaldo(double jumlah){
		saldo -= jumlah;
	}
	public double getSaldo(){
		return saldo;
	}
	void addToOrder(Barang product, int amount){
		Order orderan = new Order(product, amount);
		order.add(orderan);
	}
	void payOrder(Bank bank) {
		// jika bank nya aktif dan saldonya lebih besar dari harga total
		System.out.println("Nota " + getName());
		System.out.println("Bank Di gunakan: " + bank.getName());
		if (bank.isActive()) {
			
			System.out.println("Diskon bank: " + bank.getBankDiscount() + "%");
			
			for (int i = 0; i < order.size(); i++) {
				double dis = order.get(i).getTotalPrice() * bank.getBankDiscount() / 100;
				order.get(i).printNota();
	
				System.out.println("Total belanja sebelum diskon: Rp" + order.get(i).getTotalPrice());
				System.out.println("Total belanja setelah diskon: Rp" + (order.get(i).getTotalPrice() - dis));
				if (getSaldo() >= order.get(i).getTotalPrice() - dis) {
					minSaldo(order.get(i).getTotalPrice() - dis);
					order.get(i).getBarang().reduceStock(order.get(i).getAmount());
				} else {
					System.out.println("Pembayaran gagal, Saldo tidak mencukupi");
				}
			}
		} else {
			System.out.println("Pembayaran tidak dapat diproses karena bank tidak aktif");
		}
		System.out.println();
	}
}
