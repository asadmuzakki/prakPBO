package Modul2;

public class Main {
	public static void main(String[] args) {
		Alien zograd = new Alien("Zograd", 80, 20, 10);
		Monster sally = new Monster("Sally", 80, 20, 10);
		
		zograd.showEntity();
		sally.showEntity();
		
		System.out.println("\nBattle Start!\n");
		
		while (zograd.getHealth() >= 0 && sally.getHealth() >= 0) {
			sally.attack(zograd);
			zograd.attack(sally);
			if (sally.getHealth() <= 0) {
				sally.dead();
			} else if (zograd.getHealth() <= 0) {
				zograd.dead();
			}
		}
	}
}
