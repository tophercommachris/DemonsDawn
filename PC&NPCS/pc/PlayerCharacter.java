/*
 * This class holds all the data for the player regarding choice of name, choice of class, and also is the class with methods that allow for leveling up or displaying stats
 * This class also holds information regarding the location of the player, used for navigating through the different rooms in the static Objects ArrayList
 */

package pc;

import java.util.Scanner;
import baseabilities.*;
import demons.Demon;
import edgelord.Hmmph;

import java.util.ArrayList;
import spellblade.SBAbilityBuilder;
import java.util.HashMap;
import java.util.Map;

public class PlayerCharacter {
	
	
	Stats stats;
	int location = 1;
	HashMap<Integer, Ability> abilityMap = new HashMap<>(20);
	ArrayList<Ability> debuffs = new ArrayList<Ability>();
	ArrayList<Ability> buffs = new ArrayList<Ability>();
		
	public void setChoice(String choice) {
		stats.choice = choice;
	}
	
	public void createNameTitle() throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nPlease, enter a name for your champion: ");
		stats.name = scanner.nextLine();
		System.out.print("\nNow, enter a title for your champion: ");
		stats.title = scanner.nextLine();	
		Thread.sleep(1000);
		
	}
	
	
	//Returns a string array to use for grabbing name and title
	public String[] getNameTitle() {
		String[] nameTitle = new String[2];
		nameTitle[0] = stats.name;
		nameTitle[1] = stats.title;
		
		return nameTitle;
	}
	
	
	
	//Displays all the stats made by the stats class
		public void displayStats() throws InterruptedException {
			
			System.out.println("\n\n" + stats.name + ", " + stats.title + ": your stats currently are -");
			System.out.println("Class: " + stats.choice);
			System.out.println("Level: " + getLevel());
			System.out.println("XP: " + getXP() + "/" + getMaxXP());
			System.out.println("Gold: " +  getGold());
			System.out.println("Health: "  +  getCurrentHealth() + "/" +  getMaxHealth());
			System.out.println("Mana: " +  getCurrentMana() + "/" +  getMaxMana());
			System.out.println("Buffess: " +  getBuffness());
			System.out.println("Friskiness: " +  getFriskiness());
			System.out.println("Brainpower: " +  getBrainpower());
			System.out.println("Edginess: " +  getEdginess());
			System.out.println("Luck: " +  getLuck());
			System.out.println("Magic Resistance: " +  getMagicResist());
			System.out.println("Physical Resistance: " +  getPhysicalResist());
			//Thread.sleep(3000);
			
		}
		
		public void combatUpdate() {
			for (int i = 0; i < buffs.size(); i++) {
				if (buffs.get(i).buffActive())
					buffs.remove(i);
				else
				buffs.get(i).deincrementTimer(this);
			}
		}
		
		
	
//All Methods Below are overriden by the subclasses of PlayerCharacter
//__________________________________________________________________________________________________________________________________________________________________________________________
	
	public void levelUp() throws InterruptedException { //This function will need to be called after every battle to check if leveling up is available
			System.out.println("Level Up Not Overriden");
	}
	

	public void addAbilities() { 
			System.out.println("Add Abilities Not Overriden");
		}
	
		
	public void useAbility(int index, PlayerCharacter player, Demon demon) {
		System.out.println("Use Ability Not Overriden");
			
		}
	
	
	
//All the Getter and Setter methods		
//__________________________________________________________________________________________________________________________________________________________________________________________________
		public int getMaxHealth() {
			return stats.maxHealth;
		}
		
		public void changeMaxHealth(int newMax) {
			if (stats.maxHealth + newMax < 1) {
				stats.maxHealth = 1;
				stats.currentHealth = stats.maxHealth;
			}
			else {
				stats.maxHealth += newMax;
				stats.currentHealth += newMax;
			}
		}
		
		public int getCurrentHealth() {
			return stats.currentHealth;
		}
		
	//Methods are overloaded for if its damage, or healing, dealing with negative numbers
	public void changeCurrentHealth(int change) {
			System.out.println("PLAYER HEALTH CHANGE: " + change);
					
				if (stats.currentHealth + change > stats.maxHealth)
					stats.currentHealth = stats.maxHealth;
				else if (stats.currentHealth + change < 0)
					stats.currentHealth = 0;
				else
					stats.currentHealth += change;
			}
		
	public void changeCurrentHealth(int change, boolean magical) {
		System.out.println("PLAYER HEALTH CHANGE: " + change);
		
		if (magical)
		{
			change -= (int)(change * (stats.magicResist/100));
		}
		
		else
			change -= (int)(change * (stats.physicalResist/100));
			
			if (stats.currentHealth + change > stats.maxHealth)
				stats.currentHealth = stats.maxHealth;
			else if (stats.currentHealth + change < 0)
				stats.currentHealth = 0;
			else
				stats.currentHealth += change;
		}
		
		public int getMaxMana() {
			return stats.maxMana;
		}
		
	 	public int getCurrentMana() {
	 		return stats.currentMana;
	 	}
		
		public void changeMaxMana(int newMax) {
		 
			if (stats.maxMana + newMax < 1) {
				stats.maxMana = 1;
				stats.currentMana = stats.maxMana;
			}
			
			else {
				stats.maxMana += newMax;
				stats.currentMana += newMax;
			}
			
		}
		
		public void changeCurrentMana(int change) {
			if (stats.currentMana + change > stats.maxMana)
				stats.currentMana = stats.maxMana;
			else if (stats.currentMana + change < 0)
				stats.currentMana = 0;
			else
				stats.currentMana += change;
		}
		
		
		public int getGold() {
			return stats.goldAmount;
		}
		
		public void addGold(int change) {
			if (stats.goldAmount + change < 0)
				stats.goldAmount = 0;
			
			else
				stats.goldAmount += change;
		}
		
		public int getBuffness() {
			return stats.buffness;
		}
		
		public void changeBuffness(int change) {
			if (stats.buffness + change < 0)
				stats.buffness = 0;
			
			else
				stats.buffness += change;
		}

		public int getFriskiness() {
			return stats.friskiness;
		}
		
		public void changeFriskiness(int change) {
			if (stats.friskiness + change < 0)
				stats.friskiness = 0;
			
			else
				stats.friskiness += change;
		}
		
		public int getBrainpower() {
			return stats.brainpower;
		}
		
		public void changeBrainpower(int change) {
			if (stats.brainpower + change < 0)
				stats.brainpower = 0;
			
			else
				stats.brainpower += change;
		}
		
		public int getEdginess() {
			return stats.edginess;
		}
		
		public void changeEdginess(int change) {
			if (stats.edginess + change < 0)
				stats.brainpower = 0;
				
			else
				stats.edginess += change;
		}
		public int getLuck() {
			return stats.luck;
		}
		
		public void changeLuck(int change) {
			if (stats.luck + change < 0)
				stats.luck = 0;
			
			else
				stats.luck += change;
		}
		public int getMagicResist() {
			return stats.magicResist;
		}
		
		public void changeMagicResist(int change) {
			if (stats.magicResist + change < 0)
				stats.magicResist = 0;
			
			else
				stats.magicResist += change;
		}
		
		public int getPhysicalResist() {
			return stats.physicalResist;
		}
		
		public void changePhysicalResist(int change) {
			
			if(stats.physicalResist + change < 0)
				stats.physicalResist = 0;
			
			else
				stats.physicalResist += change;
			
		}
		
		public int getXP() {
			return stats.xp;
		}
		
		public int getMaxXP() {
			return stats.maxXP;
		}
		
		public void changeXP(int change) {
			stats.xp += change;
			
		}
		
		public void changeMaxXP() {
			stats.maxXP *= 2;
		}
		
		public int getLevel() {
			return stats.level;
		}
		
		public void increaseLevel() {
			stats.level++;
		}
		
	
	public int getLocation() {
		return location;
	}
	
	public void setLocation(int location) {
		this.location = location;
	}
	
	public Stats getStats() {
		return stats;
	}
	
	public HashMap<Integer,Ability> getAbilityMap() {
		return abilityMap;
	}

	public void addBuff(Buff buff) {
		buffs.add(buff);
		
	}
	
	public void addDebuff(Debuff debuff) {
		debuffs.add(debuff);
	}
	

}
