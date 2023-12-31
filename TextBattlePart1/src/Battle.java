/**
 * Name: Isayiah Lim
 * Last Updated On: 3/3/2022
 * Mrs. Kankelborg
 * APCS Period 2
 * Text Battle Project Part One
 * 
 * This class is the application class. Your main method must meet all the requirements in the 
 * specification on turn in but is otherwise for your testing purposes only. My test code will call
 * your startBattle method directly with my own version of the code you will write in main. 
 * 
 */
import java.util.Scanner;
public class Battle {
	
	/**
	 * Use this method for playing your game. I will bypass this in my test code, but I will
	 * be looking at its contents when I grade for internal correctness.
	 */
	public static void main(String[] args) 
	{
		//sets the name for the player
		Scanner input = new Scanner(System.in);
		System.out.print("What is your name? ");
		Player player = new Player(input.nextLine());
		System.out.println();
		
		//chooses the monster from an array of monsters
		String[] monsterList = {"Mr. Lesli", "CollegeBoard", "Tonald J. Dump", "This Project"};
		Monster monster = new Monster(monsterList[(int)(Math.random()*4)]);

		//starts the game
		startBattle(player, monster, input);
	}
	 /**
	  * This is the method that my test cases will call directly.
	  * Do not modify the header of this method.
	  * @param player
	  * @param monster
	  */
	public static void startBattle(Player player, Monster monster, Scanner input) 
	{
		//intro message
		System.out.println(player.getName() + " has encountered a " + monster.getType() + "!");
		
		//variables
		int roundNum = 1;
		
		//runs until either the player or monster dies
		while(player.getHealth() > 0 && monster.getHealth() > 0)
		{
			System.out.println();
			System.out.println("********************************** ROUND " + roundNum +
					" **********************************");
			System.out.println();
			System.out.println("Your inventory holds: " + player.getInventory());
			//chose between attacking and using an item
			System.out.print("Type an inventory slot number or 0 to attack: ");
			int response = input.nextInt();
			System.out.println();
			
			//player's move
			if(response == 0)
			{
				System.out.println(player.getName() + " attacks the " + monster.getType() + " for " 
						+ player.attack(monster) + " damage.");
				System.out.println(monster);
			}
			else
				player.useItem(response-1);
			System.out.println();
			//monster fights back
			if(monster.getHealth() > 0)
			{
				System.out.println("The " + monster.getType() + " attacks " + player.getName() + " for " 
						+ monster.attack(player) + " damage.");
				System.out.println(player);
				System.out.println();
			}
			roundNum ++;
		}
		
		//end message
		if(monster.getHealth() > 0)
			System.out.println("The " + monster.getType() + " has defeated " + player.getName());
		else
			System.out.println(player.getName() + " has defeated the " + monster.getType());
	}

}
