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
	public String toString()
	{
		if(health > 0)
			return type + " has " + health + " health left.";
		return type + " is dead.";
	}
}
