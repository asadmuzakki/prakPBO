package Modul1;

public class Main {
	public static void main(String[] args) {
		Baju tShirt = new Baju("T-Shirt", 15000, "L");
		Sepatu sneaker = new Sepatu("Sneakers", 75000, 42);
		sneaker.setStock(20);
		tShirt.setStock(20);
		
		Bank bankA = new Bank("Mandiri", 1);
		Bank bankB = new Bank("BRI", 1);
		User user = new User("Jhon");
		User user2 = new User("Feri");
		User user3 = new User("Beni");
		
		bankA.setBankDiscount(10);
		bankB.setBankDiscount(30);
		user.isiSaldo(1000000);
		user2.isiSaldo(3000000);
		user3.isiSaldo(4000);
		
		user2.addToOrder(sneaker, 3);
		user.addToOrder(tShirt, 5);
		user.addToOrder(sneaker, 1);
		user3.addToOrder(sneaker, 6);
		
		bankA.deactivate();
		
		user.payOrder(bankA);
		user2.payOrder(bankB);
		user3.payOrder(bankB);
	}
	
}
