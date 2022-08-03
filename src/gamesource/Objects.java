/*
 * This class will initialize all the objects, either within this class, or by creating instances
 * of classes that initialize objects in the game.  No object that needs to be initialized before the game
 * begins should be initialized outside of this class, to make it easier to understand where the objects
 * are coming from
 */

package gamesource;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import items.BaseItem;
import playercharacter.*;
import room.BaseRoom;
import room.DemonInitializer;
import room.RoomBuilder;

public class Objects {
	
	protected BasePlayerCharacter player;
	
	ArrayList<BaseRoom> rooms = new ArrayList<BaseRoom>();
	ArrayList<BaseItem> items = new ArrayList<BaseItem>();
	Scanner sc = new Scanner(System.in);
	
	public void initializeGame() throws IOException {
		createRooms();
		createDemons();
		createItems();
		createPlayerCharacter();
	}
	
	private void createRooms() throws IOException{
		RoomBuilder roomBuilder = new RoomBuilder();
		rooms = roomBuilder.construct();
	}
	
	private void createDemons() {
		DemonInitializer demonInit = new DemonInitializer();
		demonInit.fillRooms(rooms);
		
	}
	
	private void createItems() {
		
	}
	
	private void createPlayerCharacter() {
		int choice = -1;
		String [] nameTitle = new String[2];
		
		System.out.println("Class Picking Phase: 1. Spellblade 2. The Fool 3. The Godfather 4. The Edgelord");
		System.out.print("Enter a number: ");
		choice = sc.nextInt();
		
		if (choice == 1) {
			System.out.println("\nYou have chosen SpellBlade, an rogue who's mastered the arcane to assist them in their endeavors");
			player = new ClassSpellblade("spellblade");
			System.out.println("What is your name? ");
			nameTitle[0] = sc.next();
			System.out.println("What is your title? ");
			nameTitle[1] = sc.next();
		}
		
		else if (choice == 2) {
		System.out.println("\nYou have chosen the Fool, an iditiotic adventurer who's luck prevails above all others");
		player = new ClassFool("fool");
		System.out.println("What is your name? ");
		nameTitle[0] = sc.next();
		System.out.println("What is your title? ");
		nameTitle[1] = sc.next();
		
		}
		
		else if (choice == 3) {
			System.out.println("\nYou have chosen the Godfather, a mafia boss who uses his wits and his money to call the boys to do the job");
			player = new ClassGodfather("godfather");
			System.out.println("What is your name? ");
			nameTitle[0] = sc.next();
			System.out.println("What is your title? ");
			nameTitle[1] = sc.next();
		}
		
		else if (choice == 4) {
			System.out.println("\nYou have chosen the Edgelord, an anime protaganist who has been Isekaid into this world by Truck-Kun");
			player = new ClassEdgelord("edgelord");
			System.out.println("What is your name? ");
			nameTitle[0] = sc.next();
			System.out.println("What is your title? ");
			nameTitle[1] = sc.next();
		}
		
		
		player.setNameTitle(nameTitle[0], nameTitle[1]);
		player.addAbilities();
		
	} //End Create Player Character Method

}
