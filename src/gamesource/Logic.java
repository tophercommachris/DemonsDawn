package gamesource;

/*
 * This class holds all game logic regarding active situations that occur, such as combat, choosing abilities, taking exits, checking for level ups, equipping items or searching rooms. 
 * This class actively uses the Objects static instance from loop in order to search through the initialized objects in order to find the proper items it looks for.
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import abilitysource.Attack;
import abilitysource.BaseAbility;
import abilitysource.Healing;
import abilitysource.StatusEffect;
import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class Logic {
	
	Scanner sc = new Scanner(System.in);
	int choice;
	int abilityChoice;
	
	public void startCombat(BasePlayerCharacter player, BaseDemon demon) throws InterruptedException {
		int roundCounter = 1;
		boolean enemyDead = false;
		ArrayList<BaseDemon> roomDemons = Loop.objects.rooms.get(player.getLocation()).getRoomDemons();
		
		while (!enemyDead) {
			
			System.out.println("What would you like to do? 1. Use An Ability 2. use an Item 3. Check your Stats  4. Check the Demon's Stats 5. Attempt to flee");
			choice = sc.nextInt();
			
			if (choice == 1) {
				chooseAbility(player, demon);
			}
			
			else if (choice == 3) {
				player.displayStats();
				continue;
			}
			
			else if (choice == 4) {
				demon.displayStats();
			}
			
			
			if (demon.getCurrentHealth() <= 0) {
				enemyDead = true;
				player.changeXP(demon.getXP());
				checkLevelUp(player);
				
			}
			
			else if (player.getCurrentHealth() <= 0) {
				System.out.println("Game Over Man...");
				System.exit(0);
			}
			
			else {
			
			roundCounter++;
			player.checkStatusEffect();
			demonAttack(player, demon);
			checkLevelUp(player);
			}
		}
		//Add a reset for buffs/debuffs when duration ends
		
	}
	
	public void chooseAbility(BasePlayerCharacter player, BaseDemon demon) {
		int choice = 0;
		
		for (int i = 0; i < player.getAbilityMap().size(); i++) {
			System.out.println((i+1) + ". " + player.getAbilityMap().get(i).getAbilityName());
		}
		choice = sc.nextInt();
		
		if ((player.getCurrentMana() + player.getAbilityMap().get(choice-1).getManaCost()) < 0)
			System.out.println("You don't have enough mana for that ability!");
				
		
		else {
		
		if (player.getAbilityMap().get(choice-1) instanceof StatusEffect) {
			player.changeCurrentMana((player.getAbilityMap().get(choice-1).getManaCost()));
			player.addStatusEffect(player.getAbilityMap().get(choice-1));
			player.getAbilityMap().get(choice-1).activateAbility(player);
		}
		
		if (player.getAbilityMap().get(choice-1) instanceof Attack) {
		player.changeCurrentMana((player.getAbilityMap().get(choice-1).getManaCost()));
		player.getAbilityMap().get(choice-1).activateAbility(player, demon);
		}
		
		
		if (player.getAbilityMap().get(choice-1) instanceof Healing) {
			player.changeCurrentMana((player.getAbilityMap().get(choice-1).getManaCost()));
			player.getAbilityMap().get(choice-1).activateAbility(player);
			}
		}
		
	}
	
		
		

	public void demonAttack(BasePlayerCharacter player, BaseDemon demon) {
		
		demon.useAbility(player, demon);
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
	
	public void checkLevelUp(BasePlayerCharacter player) {
		
		if (player.getXP() >= player.getMaxXP())
			player.levelUp();
	}
	
	
	
}
