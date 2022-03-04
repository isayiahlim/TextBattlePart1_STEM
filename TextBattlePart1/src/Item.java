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
	
	//this allows an item to be used
	public void use(Player player)
	{
		if (type.equals("Health Potion"))
		{
			int heal = (int)(Math.random()*10 + 1);
			player.healDamage(heal);
			System.out.println(player.getName() + " used a health potion that increased their health"
					+ " by " + heal + ".");
		}
		else if (type.equals("Strength Potion"))
		{
			int strength = (int)(Math.random()*10 + 1);
			player.getStronger(strength);
			System.out.println(player.getName() + " used a strength potion their increased min and"
					+ " max damage by " + strength + "." );
		}
		else
			System.out.println(player.getName() + " used an item with an unclear result.");
	}
}
