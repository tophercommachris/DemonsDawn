/*
 * This class holds all the data for the player regarding choice of name, choice of class, and also is the class with methods that allow for leveling up or displaying stats
 * This class also holds information regarding the location of the player, used for navigating through the different rooms in the static Objects ArrayList
 */

package pc;

import java.util.Scanner;

import baseabilities.*;

import java.util.ArrayList;

import spellblade.SBAbilityCreator;

public class PlayerCharacter {
	
	Stats stats;
	String name = "";
	String title = "";
	String choice;
	int location = 1;
	
	
	public void setChoice(String choice) {
		this.choice = choice;
	}
	
	//Called by logic to create a name and title for character after class is chosen
	public void createNameTitle() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nPlease, enter a name for your champion: ");
		name = scanner.nextLine();
		System.out.print("\nNow, enter a title for your champion: ");
		title = scanner.nextLine();	
		this.name=name;
		this.title = title;
		Thread.sleep(1000);
		
	}
	
	
	//Returns a string array to use for grabbing name and title
	public String[] getNameTitle() {
		String[] nameTitle = new String[2];
		nameTitle[0] = this.name;
		nameTitle[1] = this.title;
		
		return nameTitle;
	}
	
	
	
	//Displays all the stats made by the stats class
	public void displayStats() throws InterruptedException {
		
		System.out.println("\n\n" + name + ", " + title + ": your stats currently are -");
		System.out.println("Class: " + choice);
		System.out.println("Level: " + stats.getLevel());
		System.out.println("XP: " + stats.getXP() + "/" + stats.getMaxXP());
		System.out.println("Gold: " + stats.getGold());
		System.out.println("Health: "  + stats.getCurrentHealth() + "/" + stats.getMaxHealth());
		System.out.println("Mana: " + stats.getCurrentMana() + "/" + stats.getMaxMana());
		System.out.println("Buffess: " + stats.getBuffness());
		System.out.println("Friskiness: " + stats.getFriskiness());
		System.out.println("Brainpower: " + stats.getBrainpower());
		System.out.println("Edginess: " + stats.getEdginess());
		System.out.println("Luck: " + stats.getLuck());
		System.out.println("Magic Resistance: " + stats.getMagicResist());
		System.out.println("Physical Resistance: " + stats.getPhysicalResist());
		//Thread.sleep(3000);
		
	}
	
	public void levelUp() throws InterruptedException { //This function will need to be called after every battle to check if leveling up is available
		if (stats.getXP() >= stats.getMaxXP()) {
			
			stats.changeMaxHealth(5);
			stats.changeMaxMana(5);
			stats.changeBuffness(2);
			stats.changeFriskiness(2);
			stats.changeBrainpower(2);
			stats.changeEdginess(2);
			stats.changeLuck(2);
			stats.changeMagicResist(1);
			stats.changePhysicalResist(1);
			stats.increaseLevel();
			
			System.out.println("\nLEVEL UP!");
			stats.changeMaxXP();
			displayStats();
			
			
		}
		
	}
	
	public void gainXP(int change) {
		stats.changeXP(change);
	}
	
	//Creates ability objects based on chosen class
	public void addAbilities() { //Will probably have to turn this into an arraylist or something of that sort
		if (choice.equals("spellblade")) {
			SBAbilityCreator SB_Abilities = new SBAbilityCreator(stats);
			
		}
		
	}
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location = location;
	}
	

}
