package gameSource;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import pc.*;
import items.Item;
import java.io.*;
import rooms.Room;
public class Logic {
	

	protected String[] nameHolder = new String[2];
	protected PlayerCharacter player;
	protected int roundCounter;
	
	public Logic() throws InterruptedException, IOException { //Called from the loop class, which holds main
		
		Objects.createRooms();
		//createItems();
		setPlayerClass();
		nameHolder = player.getNameTitle();
		player.displayStats();
		
		}
	
	//Sets the player class, called from the loop class.  Creates an object of class PlayerCharacter and initializes it with a subclass using its constructor
	
	public void setPlayerClass() throws InterruptedException{
		int choice;
		int check = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Game Logic Initialized....");
		
		while (check != -1) {
			System.out.println("Class Picking Phase: 1. Spellblade 2. The Fool 3. The Godfather 4. The Edgelord");
			System.out.print("Enter a number: ");
			choice = sc.nextInt();
		
		if (choice == 1) {
			
			System.out.println("\nYou have chosen SpellBlade, an rogue who's mastered the arcane to assist them in their endeavors");
			player = new SpellBlade();
			player.setChoice("spellblade");
			player.createNameTitle();
			player.addAbilities();
			
			check = -1;
		}
		
		else if (choice == 2) {
			System.out.println("\nYou have chosen the Fool, an iditiotic adventurer who's luck prevails above all others");
			player = new Fool();
			player.setChoice("fool");
			player.createNameTitle();
			player.addAbilities();
		
			check = -1;
		}
		
		else if (choice == 3) {
			System.out.println("\nYou have chosen the Godfather, a mafia boss who uses his wits and his money to call the boys to do the job");
			player = new Godfather();
			player.setChoice("godfather");
			player.createNameTitle();
			player.addAbilities();
			
			check = -1;
		}
		
		else if (choice == 4) {
			System.out.println("\nYou have chosen the Edgelord, an anime protaganist who has been Isekaid into this world by Truck-Kun");
			player = new Edgelord();
			player.setChoice("edgelord");
			player.createNameTitle();
			player.addAbilities();
			
			check = -1;
		} 
		
		else {
			System.out.println("Input not recognized: Check for spelling error (SpellBlade is the only functional class as of now)");

		}
	} //End while loop
	
}
	
	//Method to start the encounter when running into a demon
	public void startEncounter() {
		roundCounter =1;
		
		
	}
	
	
	
}		 //End Class