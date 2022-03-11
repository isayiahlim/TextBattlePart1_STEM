/**
 * Name: Isayiah Lim
 * Last Updated On: 3/3/2022
 * Mrs. Kankelborg
 * APCS Period 2
 * Text Battle Project Part One
 * 
 * This class represents an Item object. It must contain all of the fields and
 * methods detailed in the project spec. You may add additional fields and methods if you
 * like.
 */
public class Item 
{
	private String type;
	
	//default constructor
	public Item()
	{
		type = "Unknown Item";
	}
	
	//mutator constructor
	public Item(String type)
	{
		this.type = type;
	}
	
	//prints out the item
	public String toString()
	{
		return type;
	}
	
	//returns item
	public String getType()
	{
		return type;
	}
	
	//this allows an item to be used
	public void use(Player player)
	{
		int amount = (int)(Math.random()*10 + 1);
		if (type.equals("Health Potion"))
		{
			player.healDamage(amount);
			System.out.println(player.getName() + " used a health potion that increased their "
					+ "health by " + amount + ".\n");
		}
		else if (type.equals("Strength Potion"))
		{
			player.getStronger(amount);
			System.out.println(player.getName() + " used a strength potion that increased their "
					+ "min and max damage by " + amount + ".\n" );
		}
		else if (type == null)
		{
			System.out.println("Invalid Selection - Missed Turn");
		}
		else
		{
			System.out.println(player.getName() + " used an item with an unclear result.\n");
		}
	}
}
