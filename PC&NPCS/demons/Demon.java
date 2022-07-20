package demons;
import demons.DemonStats;
import pc.PlayerCharacter;
import baseabilities.Ability;

import java.util.HashMap;
import java.util.ArrayList;

public class Demon {

	//The HashMap for demons made by the DemonInitialiizer holds the ID for each demon by a String, so no ID is required inside the Demon class
	DemonStats stats;
	HashMap<Integer, Ability> abilityMap = new HashMap<Integer, Ability>();
	ArrayList<Ability> debuffs = new ArrayList<Ability>();
	ArrayList<Ability> buffs = new ArrayList<Ability>();
	
	
	
public void displayStats() throws InterruptedException {
		
		System.out.println(stats.name + ": " + stats.desc);
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

public String[] getNameDesc() {
	String[] nameDesc = new String[2];
	
	nameDesc[0] = stats.name;
	nameDesc[1] = stats.desc;
	
	return nameDesc;
}



//Overriden by the Subclasses of Demon
//__________________________________________________________________________________________________________________________________________________________________________________________
public void addAbilities() { 
		System.out.println("Add Abilities Demon Not Overriden");
	}


	public void useAbility(PlayerCharacter player, Demon demon) {
		System.out.println("Use Ability Not Overriden");
	
	}




//Getters and Setters
//_________________________________________________________________________________________________________________________________________________________________________________________-

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


//There are two different changeCurrentHealth methods in order to deal with ones that deal damage (physical or magical) or thats that simply heal
public void changeCurrentHealth(int change) {
	System.out.println("Demon HEALTH CHANGE: " + change);
			
		if (stats.currentHealth + change > stats.maxHealth)
			stats.currentHealth = stats.maxHealth;
		else if (stats.currentHealth + change < 0)
			stats.currentHealth = 0;
		else
			stats.currentHealth += change;
	}

public void changeCurrentHealth(int change, boolean magical) {
	
	if (magical)
	{
		change += stats.magicResist;
	}
	
	else
		change -= stats.physicalResist;
	
	System.out.println("Demon HEALTH CHANGE: " + change);
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

	
	
	
}
