package Modul2_explore;
import java.util.Random;
public class Monster extends Entity implements Behavior {
	Random rand = new Random();
	
	Monster(String name, int health, int attack, int defence) {
		setName(name);
		setHealth(health);
		setAttack(attack);
		setDefence(defence);
	}
	
	public void attack(Alien alien) {
		if (rand.nextInt(10) % 3 == 0) {
			specialSkill(alien);
		} else {
			System.out.println("\nThe Monster " + this.getName() + " Attack " + alien.getName() + " with a normal attack\n");
			System.out.println(this.getName() + " | " + this.getHealth());
			int damage = this.getAttack() - alien.getDefence();
			alien.setHealth(alien.getHealth() - damage);
			System.out.println(alien.getName() + " | " + alien.getHealth());
		}
	}
	
	public void showEntity() {
		System.out.println("Monster: " + getName() + " | Health: " + getHealth()
				  + " | Attack: " + getAttack() + " | Defence: " + getDefence());
	}
	
	public void dead() {
		System.out.println("\nThe Alien Wins!\nThe monster " + getName() + " is dead!");
	}
	
	public void specialSkill() {}
	
	public void specialSkill(Alien alien) {
		System.out.println("\nThe Monster use Special attack\n");
		int heal = this.getHealth() / 2;
		this.setHealth(this.getHealth() + heal);
		System.out.println(this.getName() + " | " + getHealth());
		System.out.println(alien.getName() + " | " + alien.getHealth());
	}
}
