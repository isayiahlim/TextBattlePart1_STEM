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
		String[] monsterList = {"Mr. Lesli", "CollegeBoard", "Tonald J. Dump", "Bud Lite Virus"};
		Monster monster = new Monster(monsterList[(int)(Math.random()*4)]);
		
		/*
		Item[] tempInv = {new Item(), new Item()};
		Player player2 = new Player("jake", tempInv);
		System.out.println(player2.getInventory());
		*/
		
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
		System.out.println(player.getName() + " has encounter a " + monster.getType() + "!\n");
		
		//variables
		int roundNum = 1;
		
		//runs until either the player or monster dies
		while(player.getHealth() > 0 && monster.getHealth() > 0)
		{
			System.out.println("********************************** ROUND " + roundNum +
					" **********************************\n");
			System.out.println(player.getInventory());
			//chose between attacking and using an item
			System.out.print("Type an inventory number or 0 to attack: ");
			int response = input.nextInt();
			System.out.println();
			
			//player's move
			if(response == 0)
			{
				System.out.println(player.getName() + " attacks the " + monster.getType() + " for " 
						+ player.attack(monster) + " damage.");
				System.out.println(monster);
				System.out.println();
			}
			
			//uses an item
			else if(response > 0 && response <= 5)
			{
				player.useItem(response);
			}
			
			//invalid response
			else
				System.out.println("Invalid Selection - Missed Turn\n");
			
			//monster fights back
			if(monster.getHealth() > 0)
			{
				System.out.println(monster.getType() + " attacks the " + player.getName() + " for " 
						+ monster.attack(player) + " damage.");
				System.out.println(player);
				System.out.println();
			}
			roundNum ++;
;		}
		
		//end message
		if(monster.getHealth() > 0)
			System.out.println(monster.getType() + " has defeated " + player.getName());
		else
			System.out.println(player.getName() + " has defeated " + monster.getType());
	}

}
