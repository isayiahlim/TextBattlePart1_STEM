/**
 * Name: Isayiah Lim
 * Last Updated On: 3/3/2022
 * Mrs. Kankelborg
 * APCS Period 2
 * Text Battle Project Part One
 * 
 * This class represents a Player object. It must contain all of the fields and
 * methods detailed in the project spec. You may add additional fields and methods if you
 * like.
 */
public class Player 
{
	//fields of the player
	private String name;
	private int health;
	private Item[] inventory;
	private int maxHealth;
	private int minDmg;
	private int maxDmg;
	
	//constructor that initializes the player's fields to a default
	public Player(String name)
	{
		//changes the name to the given name
		this.name = name;
		
		//sets default statistics
		health = 100;
		maxHealth = 100;
		minDmg = 1;
		maxDmg = 10;
		
		//declares and fills the inventory
		inventory = new Item[5];
		inventory[0] = new Item("Health Potion");
		inventory[1] = new Item("Health Potion");
		inventory[2] = new Item("Strength Potion");
		inventory[3] = new Item("Strength Potion");
		inventory[4] = new Item();
	}
	
	//constructor that initializes the player's fields to a default
	public Player(String name, int health, int minDmg, int maxDmg)
	{
		//changes the stats to the provided stats
		this.name = name;
		if(health > 0)	
			this.health = health;
		else 
			this.health = 100;
		maxHealth = this.health;
		if(minDmg > 0)
			this.minDmg = minDmg;
		else
			this.minDmg = 1;
		if(maxDmg > this.minDmg)	
			this.maxDmg = maxDmg;
		else
			this.maxDmg = 10 + this.minDmg;
		
		//sets default statistics
		health = 100;
		maxHealth = 100;
		minDmg = 1;
		maxDmg = 10;
		
		//declares and fills the inventory
		inventory = new Item[5];
		inventory[0] = new Item("Health Potion");
		inventory[1] = new Item("Health Potion");
		inventory[2] = new Item("Strength Potion");
		inventory[3] = new Item("Strength Potion");
		inventory[4] = new Item("Gamer Juice");
	}
	
	//constructor that sets inventory
	//constructor that initializes the player's fields to a default
	public Player(String name, Item[] inventory)
	{
		//changes the name to the given name
		this.name = name;
		
		//sets default statistics
		health = 100;
		maxHealth = 100;
		minDmg = 1;
		maxDmg = 10;
		
		//declares and fills the inventory
		this.inventory = new Item[inventory.length];
		for(int i = 0; i < inventory.length i++)
			if(inventory!= null)
				this.inventory[i] = inventory[i];
		else
		{
			inventory[0] = new Item("Health Potion");
			inventory[1] = new Item("Health Potion");
			inventory[2] = new Item("Strength Potion");
			inventory[3] = new Item("Strength Potion");
			inventory[4] = new Item("Gamer Juice");
		}
	}
	
	//prints out the status of the player
	public String toString()
	{
		if(health > 0)
			return name + " has " + health + " health left.";
		return name + " is dead.";
	}
}
