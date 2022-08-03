package gamesource;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import abilitysource.BaseAbility;
import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class Logic {
	
	Scanner sc = new Scanner(System.in);
	int choice;
	int abilityChoice;
	
	public void startCombat(BasePlayerCharacter player) {
		HashMap<Integer, BaseAbility> playerAbilityMap = player.getAbilityMap();
		int roundCounter = 1;
		boolean enemyDead = false;
		
		while (!enemyDead) {
			
			System.out.println("What would you like to do? 1. Use an Ability 2. use an Item 3. Check your Stats 4. Size up the demon 5. Attempt to flee");
			choice = sc.nextInt();
			
			if (choice == 1) {
				abilityChoice = accessAbilities(playerAbilityMap);
				determineAbilityType(abilityChoice, playerAbilityMap);
			}
			
			
		}
		
	}
	
	
	public void lookAround() {
		int location = Loop.objects.player.getLocation();
		String roomName = Loop.objects.rooms.get(location).getRoomName();
		Iterator<String> descIterator = Loop.objects.rooms.get(location).getRoomDescs().iterator();
		Iterator<String> exitIterator = Loop.objects.rooms.get(location).getRoomExits().iterator();
		ArrayList<BaseDemon> roomDemons = Loop.objects.rooms.get(location).getRoomDemons();

		System.out.println(roomName);
		System.out.println("------------------------------------------");
		
		while(descIterator.hasNext())
			System.out.println(descIterator.next());
				
			
		System.out.println("\n\nThere are " + Loop.objects.rooms.get(location).getNumExits() + " exit(s) in this room");
			
		while (exitIterator.hasNext())
				System.out.println(exitIterator.next());
		
		
		System.out.println("\n\nThere are " + roomDemons.size() + " demons in the room");
		
		for (int i = 0; i < Loop.objects.rooms.get(location).getRoomDemons().size(); i++)
			System.out.println((i+1) + ". " + roomDemons.get(i).getName()+ "- " + roomDemons.get(i).getDesc());
	}
	
	public void takeExit() {
		int location = Loop.objects.player.getLocation();
		int i;
		int choice;
		ArrayList<String> exitIDs = Loop.objects.rooms.get(location).getExitIDs();
			
		for (i = 0; i < exitIDs.size(); i++ ) {
			System.out.println(" " + (i+1) + ". " + Loop.objects.rooms.get(location).getExit(i));
		}
		
		System.out.println(" " + (i+1) + ". Stay Here");
		choice = sc.nextInt();
		
		if (choice <= Loop.objects.rooms.get(location).getNumExits()) {
		for (int j = 1; j <= Loop.objects.rooms.size(); j++) {
			
			if (exitIDs.get(choice-1).contains(Loop.objects.rooms.get(j).getRoomID())) {
				Loop.objects.player.setLocation(Loop.objects.rooms.get(j).getRoomNumber());
				break;
				}
			}

		}
			
	} //End takeExit Method
	
	public int accessAbilities(HashMap<Integer, BaseAbility> abilityMap) {
		
		System.out.println("Which Ability Would You Like To Use?");
		
		for (int i = 0; i < abilityMap.size(); i++) {
			System.out.println((i+1) + ". " + abilityMap.get(i).getAbilityName());
		}
		
		return sc.nextInt();
	}
	
	public String determineAbilityType(int index, HashMap<Integer,BaseAbility> abilityMap) {
		
		return abilityMap.get(index).getAbilityType();
		
	}
	
	public void useAbility(int abilityChoice) {
		
	}
	
}
