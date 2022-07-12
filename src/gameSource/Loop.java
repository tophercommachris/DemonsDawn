package gameSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import pc.OldPLayerCharacter;
import pc.SpellBlade;


public class Loop {
	
	static int end = 1;
	static int choice = -1;
	
	static String[] nameHolder = new String[2];
	static Logic logic;
	Scanner sc = new Scanner(System.in);
	
	
	//Calls the initialize game method, which creates an instance of the logic class, allowing for the player to create the character, as well as assigning the stats and abilities of said character
	public Loop() throws InterruptedException, IOException {
		initializeGame();
		gameLoop();
	}
	
	
	
	//This is the loop which controls the entirety of the game.  
	
	private void gameLoop() throws InterruptedException{
		 //Set to four max because rooms cannot have more than 4 exits total
		
		System.out.println("\n\n\nGame initializing...");
		
		while (end != -1) {
			
			if (logic.player.getLocation() == 1) { //Starting the game, the temple description and everything else
				
				
			}
			
			System.out.println("\nWhat would you like to do? 1. Look Around 2. Check Stats 3. Look At Inventory 4. Attack Demons In The Room 5. Talk To The Shopkeep 6. Quit Game \n");
			choice = sc.nextInt();
			
			
			//This if statement pulls descriptions from the 
			if (choice == 1) {
				System.out.println("\nHere's what you see:");
				lookAround();
				System.out.print("Would you like to take one of the exits?");
				takeExit();
				
				
		} //End If Statement
			
			else if (choice == 2) {
				logic.player.displayStats();
			}
			
			else if (choice == 3) {
				//checkInventory();
			}
			
			else if (choice == 4) {
				//If monstersInRoom
				/* Leveling up system for killing monsters
				logic.player.gainXP(10);
				logic.player.levelUp();
				*/
				
				//Else System.out.println("There aren't any demons in the room!");
				
			}
			
			else if (choice == 5) {
				
				//If npcsInRoom
				
				//Else System.out.println("There aren't any other people in this room!");
				
			}
			
			else if (choice == 6) {
				System.out.println("\nAre you sure you want to quit? Enter 1 to confirm or 2 to go back to the game: ");
				choice = sc.nextInt();
				
				if (choice == 1) {
					System.out.println("\nYou have given in to the demons, and the world is slowly devoured.");
					end = -1;
				}
			}
			
		} //End While Loop
		
	}//End Loop Method
	
	public void initializeGame() throws InterruptedException, IOException, FileNotFoundException {
		logic = new Logic();
	}
	
	public void startCombat() {
		
		
		
	}
	
	public void checkInventory() {
		
	}
	
	
	//This method uses iterators to iterate through the Static Objects Arraylists that hold all the information regarding the map of the game, as well as the different exits each room is connected to
	//The game uses numbers assigned to each room, and the player's location is based on the number for indexing in the array list, hence why logic.player.getLocation returns the proper room
	public void lookAround() {
		Iterator<String> descIterator = Objects.rooms.get(logic.player.getLocation()).getRoomDesc().iterator();
		Iterator<String> exitIterator = Objects.rooms.get(logic.player.getLocation()).getRoomExit().iterator();
		String roomName;
		
		roomName = Objects.rooms.get(logic.player.getLocation()).getRoomName();
		System.out.println(roomName);
		System.out.println("--------------------------------");
		while(descIterator.hasNext()) {
			System.out.println(descIterator.next());
		}
		
		System.out.println("\n\nThere are " + Objects.rooms.get(logic.player.getLocation()).getNumExits() + " exit(s) in this room");
		while (exitIterator.hasNext()) {
			System.out.println(exitIterator.next());
		}
	}
	
	
	//This method uses the unique exitID string for each room to locate which room needs to be pulled from the static Objects class ArrayList.
	//Using the integer that marks the current room number the player is in, the for loop iterates through all the exits in the exit Arraylist in the Objects class
	//It then asks if the player wants to take an exit or stay in the room, if the player takes an exit, it then sets the location of the player to the room based on the roomID
	public void takeExit() {
		int i;
		String[] exitID = new String[4]; //Set to four because a room cannot have more than 4 exits total
		
		for (i = 0; i < Objects.rooms.get(logic.player.getLocation()).getNumExits(); i++) {
			exitID[i] = Objects.rooms.get(logic.player.getLocation()).getExitIDs(i);
			System.out.print(" " + (i+1)  + ". " + Objects.rooms.get(logic.player.getLocation()).getExit(i));
		}
		System.out.println(" " + (i+1) + ". Stay Here");
		choice = sc.nextInt();
		
		
		if (choice-1 < i) {
		for (int j = 0; j < Objects.rooms.size(); j++) {
			if (exitID[choice-1].equals(Objects.rooms.get(j).getRoomID())) {
				logic.player.setLocation(Objects.rooms.get(j).getRoomNumber());
			}
			
		}
	}
		
}//End takeExit Method
	
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		Loop loop = new Loop();
		
		
		
	}
	

}
