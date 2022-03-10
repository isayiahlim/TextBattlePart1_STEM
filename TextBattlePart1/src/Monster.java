/**
 * Name: Isayiah Lim
 * Last Updated On: 3/3/2022
 * Mrs. Kankelborg
 * APCS Period 2
 * Text Battle Project Part One
 * 
 * This class represents a Monster object. It must contain all of the fields and
 * methods detailed in the project spec. You may add additional fields and methods if you
 * like.
 */
public class Monster 
{
	private String type;
	private int health;
	private int minDmg;
	private int maxDmg;
	
	//sets default values + the name to the given one
	public Monster(String type)
	{
		this.type = type;
		health = 100;
		minDmg = 1;
		maxDmg = 10;
	}
	
	//sets the values to everything given
	public Monster(String type, int health, int minDmg, int maxDmg)
	{
		this.type = type;
		//makes sure the given values were high enough 
		if(health <= 0)
			this.health = 100;
		else
			this.health = health;
		
		if(minDmg > 0)
			this.minDmg = minDmg;
		else
			this.minDmg = 1;
		
		if(maxDmg > this.minDmg)	
			this.maxDmg = maxDmg;
		else
			this.maxDmg = 10 + this.minDmg;
	}
	
	//returns the different fields
	public String getType()
	{
		return type;
	}
	public int getHealth()
	{
		return health;
	}
	
	//attacks the player
	public int attack(Player player)
	{
		int damage = (int)(Math.random()*(maxDmg-minDmg+1) + minDmg);
		player.takeDamage(damage);
		return damage;
	}
	
	//reduces health given a damage amount
	public void takeDamage(int damage)
	{
		if(health - damage > 0)
			health -= damage;
		else
			health = 0;
	}
	
	//toString, prints out the status of the monster
	public String toString()
	{
		if(health > 0)
			return type + " has " + health + " health left.";
		return type + " is dead.";
	}
}
