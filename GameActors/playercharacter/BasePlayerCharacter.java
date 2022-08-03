/*
 * This superclass will be the subclass of every playable player class.  Each subclass will extend BasePlayerCharacteer, and will override
 * the methods labeled as overridden methods for the purposes of upcasting. This method holds the nessecary setters to change the player stats,
 * as well as the map of the players abilities.  It also holds the current buffs and debuffs on the player character in combat.  When creating a new
 * playable class, the stats must be implemented using the builder method, examples can be found in the differing subclasses.
 * This class also holds the current room that the player is in through the location integer.
 */


package playercharacter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import abilitysource.BaseAbility;
import demonblueprint.BaseDemon;

public abstract class BasePlayerCharacter {
	
	PlayerStats playerStats;
	
	HashMap<Integer, BaseAbility> abilityMap = new HashMap<>(20);
	ArrayList<BaseAbility> debuffs = new ArrayList<BaseAbility>();
	ArrayList<BaseAbility> buffs = new ArrayList<BaseAbility>();
	
	String playerClassChoice = "";
	String name = "";
	String title = "";
	int location = 1;
	
	
	public BasePlayerCharacter(String choice) {
		this.playerClassChoice = choice;
	}
	
	public void combatUpdate() {
		
	}
	
	
	//Overriden Methods_____________________________________________________________________________
	
	public void addAbilities() {
		System.out.println("Add Abilties Method Not Overriden");
	}
	
	public void levelUp() {
		System.out.println("Level Up Not Overriden");
	}
	
	public void useAbility(int index, BasePlayerCharacter player, BaseDemon demon) {
		System.out.println("Use Ability Not Overriden");
	}

	
	//Getters and Setters____________________________________________________________________________-
	
	public void displayStats() throws InterruptedException {
		
		System.out.println("\n\n" + name + ", " + title + ": your playerStats currently are -");
		System.out.println("Class: " + playerClassChoice);
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
		System.out.println("Fire Resistance: " +  getFireResist());
		System.out.println("Lightning Resistance: " + getLightningResist());
		System.out.println("Ice Resistance: " + getIceResist());
		System.out.println("Physical Resistance: " +  getPhysicalResist());
		//Thread.sleep(3000);
		
	}
	
	public void setNameTitle(String name, String title) {
		this.name = name;
		this.title = title;
		
	}
	
	public void setLocation(int location) {
		this.location = location;
	}
	
	public int getLocation() {
		return location;
	}
	public int getMaxHealth() {
		return playerStats.maxHealth;
	}
	
	public void changeMaxHealth(int newMax) {
		if (playerStats.maxHealth + newMax < 1) {
			playerStats.maxHealth = 1;
			playerStats.currentHealth = playerStats.maxHealth;
		}
		else {
			playerStats.maxHealth += newMax;
			playerStats.currentHealth += newMax;
		}
	}
	
	public int getCurrentHealth() {
		return playerStats.currentHealth;
	}
	

public void changeCurrentHealth(int change) {
		System.out.println("PLAYER HEALTH CHANGE: " + change);
				
			if (playerStats.currentHealth + change > playerStats.maxHealth)
				playerStats.currentHealth = playerStats.maxHealth;
			else if (playerStats.currentHealth + change < 0)
				playerStats.currentHealth = 0;
			else
				playerStats.currentHealth += change;
		}
	
public void changeCurrentHealth() {
	
	
	}
	
	public int getMaxMana() {
		return playerStats.maxMana;
	}
	
 	public int getCurrentMana() {
 		return playerStats.currentMana;
 	}
	
	public void changeMaxMana(int newMax) {
	 
		if (playerStats.maxMana + newMax < 1) {
			playerStats.maxMana = 1;
			playerStats.currentMana = playerStats.maxMana;
		}
		
		else {
			playerStats.maxMana += newMax;
			playerStats.currentMana += newMax;
		}
		
	}
	
	public void changeCurrentMana(int change) {
		if (playerStats.currentMana + change > playerStats.maxMana)
			playerStats.currentMana = playerStats.maxMana;
		else if (playerStats.currentMana + change < 0)
			playerStats.currentMana = 0;
		else
			playerStats.currentMana += change;
	}
	
	
	public int getGold() {
		return playerStats.goldAmount;
	}
	
	public void addGold(int change) {
		if (playerStats.goldAmount + change < 0)
			playerStats.goldAmount = 0;
		
		else
			playerStats.goldAmount += change;
	}
	
	public int getBuffness() {
		return playerStats.buffness;
	}
	
	public void changeBuffness(int change) {
		if (playerStats.buffness + change < 0)
			playerStats.buffness = 0;
		
		else
			playerStats.buffness += change;
	}

	public int getFriskiness() {
		return playerStats.friskiness;
	}
	
	public void changeFriskiness(int change) {
		if (playerStats.friskiness + change < 0)
			playerStats.friskiness = 0;
		
		else
			playerStats.friskiness += change;
	}
	
	public int getBrainpower() {
		return playerStats.brainpower;
	}
	
	public void changeBrainpower(int change) {
		if (playerStats.brainpower + change < 0)
			playerStats.brainpower = 0;
		
		else
			playerStats.brainpower += change;
	}
	
	public int getEdginess() {
		return playerStats.edginess;
	}
	
	public void changeEdginess(int change) {
		if (playerStats.edginess + change < 0)
			playerStats.brainpower = 0;
			
		else
			playerStats.edginess += change;
	}
	public int getLuck() {
		return playerStats.luck;
	}
	
	public void changeLuck(int change) {
		if (playerStats.luck + change < 0)
			playerStats.luck = 0;
		
		else
			playerStats.luck += change;
	}
	
	public int getFireResist() {
		return playerStats.fireResist;
	}
	
	public void changeFireResist(int change) {
		if (playerStats.fireResist + change < 0)
			playerStats.fireResist = 0;
		
		else
			playerStats.fireResist += change;
	}
	
	public int getLightningResist() {
		return playerStats.lightningResist;
	}
	
	public void changeLightningResist(int change) {
		if (playerStats.lightningResist + change < 0)
			playerStats.lightningResist = 0;
		
		else
			playerStats.lightningResist += change;
	}
	
	public int getIceResist() {
		return playerStats.iceResist;
	}
	
	public void changeIceResist(int change) {
		if (playerStats.iceResist + change < 0)
			playerStats.iceResist = 0;
		
		else
			playerStats.iceResist += change;
	}
	
	public int getPhysicalResist() {
		return playerStats.physicalResist;
	}
	
	public void changePhysicalResist(int change) {
		
		if(playerStats.physicalResist + change < 0)
			playerStats.physicalResist = 0;
		
		else
			playerStats.physicalResist += change;
		
	}
	
	public int getXP() {
		return playerStats.xp;
	}
	
	public int getMaxXP() {
		return playerStats.maxXP;
	}
	
	public void changeXP(int change) {
		playerStats.xp += change;
		
	}
	
	public void changeMaxXP() {
		playerStats.maxXP *= 2;
	}
	
	public int getLevel() {
		return playerStats.level;
	}
	
	public void increaseLevel() {
		playerStats.level++;
	}
	


public PlayerStats getplayerStats() {
	return playerStats;
}

public HashMap<Integer, BaseAbility> getAbilityMap() {
	return abilityMap;
}

/*
public HashMap<Integer,Ability> getAbilityMap() {
	return abilityMap;
}

public playerStats addBuff(Buff buff) {
	buffs.add(buff);
	
}

public void addDebuff(Debuff debuff) {
	debuffs.add(debuff);
} */

}
