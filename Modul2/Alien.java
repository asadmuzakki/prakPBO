package Modul2;

public class Alien extends Entity implements Behavior {
	public int count = 1;
	Alien(String name, int health, int attack, int defence) {
		setName(name);
		setHealth(health);
		setAttack(attack);
		setDefence(defence);
	}
	
	public void attack(Monster monster) {
		if (count % 4 == 0) {
			specialSkill(monster);
		} else {
			count++;
			System.out.println("\nThe Alien " + this.getName() + " Attack " + monster.getName() + " with a normal attack\n");
			System.out.println(getName() + " | " + getHealth());
			int damage = this.getAttack() - monster.getDefence();
			monster.setHealth(monster.getHealth() - damage);
			System.out.println(monster.getName() + " | " + monster.getHealth());
			
		}
	}
	
	public void showEntity() {
		System.out.println("Alien: " + getName() + " | Health: " + getHealth()
				  + " | Attack: " + getAttack() + " | Defence: " + getDefence());
	}
	
	public void dead() {
		System.out.println("\nThe Monster Wins!\nThe alien " + getName() + " is dead!");
	}
	
	public void specialSkill() {}
	
	public void specialSkill(Monster monster) {
		count++;
		System.out.println("\nThe Alien " + this.getName() + " Attack  " + monster.getName() + " with a Special attack\n");
		System.out.println(this.getName() + " | " + getHealth());
		int damage = this.getAttack() * 2;
		monster.setHealth(monster.getHealth() - damage);
		System.out.println(monster.getName() + " | " + monster.getHealth());
	}
}
