package gameSource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

import baseabilities.Ability;
import demons.Demon;
import pc.Edgelord;
import pc.PlayerCharacter;
import pc.SpellBlade;
import pc.Stats;


public class Loop {
	
	static int end = 1;
	static int choice = -1;
	
	static String[] nameHolder = new String[2];
	Logic logic;
	Scanner sc = new Scanner(System.in);
	
	
	//Calls the initialize game method, which creates an instance of the logic class, allowing for the player to create the character, as well as assigning the stats and abilities of said character
	public Loop() throws InterruptedException, IOException {
		initializeGame();
		gameLoop();
	}
	

	public void initializeGame() throws InterruptedException, IOException, FileNotFoundException {
		Objects.createDemons();
		Objects.createRooms();
		logic = new Logic();
	}
	
	
	
	//This is the loop which controls the entirety of the game.  
	
	private void gameLoop() throws InterruptedException{
		int location = logic.player.getLocation();
		ArrayList<Demon> demonHold = new ArrayList<Demon>();
		demonHold = Objects.rooms.get(location).getRoomDemons();
		String[] nameDesc = new String[2];
		int i;
		 //Set to four max because rooms cannot have more than 4 exits total
		
		System.out.println("\n\n\nGame initializing...");
		
		while (end != -1) {
			
			System.out.println("\nWhat would you like to do? 1. Look Around 2. Check Stats 3. Look At Inventory 4. Attack Demons In The Room 5. Talk To The Shopkeep 6. Quit Game \n");
			choice = sc.nextInt();
			
			
			//This if statement pulls descriptions from the 
			if (choice == 1) {
				System.out.println("\nHere's what you see:");
				lookAround();
				Objects.rooms.get(location).checkForDemons();
				Objects.rooms.get(location).describeDemons();
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
				if(Objects.rooms.get(location).checkForDemons()) {
					Objects.rooms.get(location).describeDemons();
					System.out.println("Would you like to attack a Demon, or Take An Exit?");
					
					for (i = 1; i <= demonHold.size(); i++) {
						nameDesc = demonHold.get(i-1).getNameDesc();
						System.out.println((i) + ": " + nameDesc[0]);
					}
					
					System.out.println((i) + ": Don't Attack A Demon");
					choice = sc.nextInt();
					
					if (choice == i) {
						System.out.println("You stay your hand for now");
					}
					
					else {
					startEncounter(logic.player, choice);
					}
				}
			
				if (!Objects.rooms.get(location).checkForDemons()) {
					System.out.println("Nothing to Attack");
				}
				
			} //End Choice 4
			
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
	
	
	//Method to start the encounter when running into a demon.  Index is the choice of demon to attack, using the ArrayList of demons
	public void startEncounter(PlayerCharacter player, int index) throws InterruptedException {
		int location = player.getLocation();
		index -= 1;
		boolean combatFlag = false;
		boolean enemyDead = false;
		ArrayList<Demon> demonHold = Objects.rooms.get(location).getRoomDemons();
		HashMap<Integer, Ability> abilityMap = logic.player.getAbilityMap();
		
		
		for (int roundCounter = 1; !enemyDead; roundCounter++) {
			
			System.out.println("What would you like to do? 1. Attack 2. Use an Item 3. Attempt to flee 4. Check Demon Stats 5. Check Stats");
			choice = sc.nextInt();
			
			
			//Have both the player object and demon object be passed, so the ability knows which health to change, since it is all passed by reference
			if (choice == 1) {
				
				System.out.println("What attack would you like to use?");
				
				for (int i = 0; i < abilityMap.size(); i++) {
					System.out.println((i+1) + ": " + abilityMap.get(i).getAbilityName());
				}
				choice = sc.nextInt() -1;
				player.useAbility(choice, player, demonHold.get(index));
				demonHold.get(index).useAbility(player, demonHold.get(index));
				
				demonHold.get(index).displayStats();
				
				if (demonHold.get(index).getCurrentHealth() <= 0) {
					enemyDead = true;
					player.changeXP(demonHold.get(index).getXP());
					Objects.rooms.get(location).killDemon(index);
					if (player.getMaxXP() >= player.getXP())
						player.levelUp();
				}
				combatFlag = true;
				
			}
			
			else if (choice == 2) {
				
			}
			
			else if (choice == 3) {
				
			}
			
			else if (choice == 4) {
				demonHold.get(index).displayStats();
			}
			
			else if (choice == 5) {
				player.displayStats();
			}
			
			if (combatFlag) {
				player.combatUpdate();
				combatFlag = false;
			}
			
		}// End while Loop
		
		
	} // End Combat Method
	
	public void checkInventory() {
		
	}
	
	
	//This method uses iterators to iterate through the Static Objects Arraylists that hold all the information regarding the map of the game, as well as the different exits each room is connected to
	//The game uses numbers assigned to each room, and the player's location is based on the number for indexing in the array list, hence why logic.player.getLocation returns the proper room
	public void lookAround() {
		int location = logic.player.getLocation();
		Iterator<String> descIterator = Objects.rooms.get(location).getRoomDesc().iterator();
		Iterator<String> exitIterator = Objects.rooms.get(location).getRoomExit().iterator();
		String roomName;
		
		roomName = Objects.rooms.get(location).getRoomName();
		System.out.println(roomName);
		System.out.println("--------------------------------");
		while(descIterator.hasNext()) {
			System.out.println(descIterator.next());
		}
		
		System.out.println("\n\nThere are " + Objects.rooms.get(location).getNumExits() + " exit(s) in this room");
		while (exitIterator.hasNext()) {
			System.out.println(exitIterator.next());
		}
	}
	
	
	//This method uses the unique exitID string for each room to locate which room needs to be pulled from the static Objects class ArrayList.
	//Using the integer that marks the current room number the player is in, the for loop iterates through all the exits in the exit Arraylist in the Objects class
	//It then asks if the player wants to take an exit or stay in the room, if the player takes an exit, it then sets the location of the player to the room based on the roomID
	public void takeExit() {
		int location = logic.player.getLocation();
		int i;
		String[] exitID = new String[4]; //Set to four because a room cannot have more than 4 exits total
		
		for (i = 0; i < Objects.rooms.get(location).getNumExits(); i++) {
			exitID[i] = Objects.rooms.get(location).getExitIDs(i);
			System.out.print(" " + (i+1)  + ". " + Objects.rooms.get(location).getExit(i));
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
