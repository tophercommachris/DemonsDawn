/*
 * This is the base demon class used as the superclass for all demons. Abilites and stats are mapped here, as well as potential buffs and debuffs.  
 */

package demonblueprint;

import java.util.ArrayList;
import java.util.HashMap;

import abilitysource.BaseAbility;

public class BaseDemon {
	
	DemonStats demonStats;
	
	HashMap<Integer, BaseAbility> abilityMap = new HashMap<>(20);
	ArrayList<BaseAbility> debuffs = new ArrayList<BaseAbility>();
	ArrayList<BaseAbility> buffs = new ArrayList<BaseAbility>();
	
	String archetype = "";
	String name = "";
	String desc = "";
	String weakness = "";
	int demonDifficulty = 0;
	
	
	//Overriden Methods____________________________________________________________________________________________________________________________
	
	public void addAbilities() {
		System.out.println("Add Abilties Method Not Overriden");
	}

	public void useAbility() {
		System.out.println("Use Ability Not Overriden");
	}	
	//Getters and Setters__________________________________________________________________________________________________________________________
	
public void displayStats() throws InterruptedException {
		
		System.out.println("\n\n" + name);
		System.out.println("Level: " + getLevel());
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

public int getLevel() {
		return demonStats.level;
	}

public String getName() {
	return name;
}

public String getDesc() {
	return desc;
}

public int getMaxHealth() {
	return demonStats.maxHealth;
}

public void changeMaxHealth(int newMax) {
	if (demonStats.maxHealth + newMax < 1) {
		demonStats.maxHealth = 1;
		demonStats.currentHealth = demonStats.maxHealth;
	}
	else {
		demonStats.maxHealth += newMax;
		demonStats.currentHealth += newMax;
	}
}

public int getCurrentHealth() {
	return demonStats.currentHealth;
}


//public void changeCurrentHealth() {
	

public void changeCurrentHealth(int change) {
	if (demonStats.currentHealth + change > demonStats.maxHealth)
		demonStats.currentHealth = demonStats.maxHealth;
	else if (demonStats.currentHealth + change < 0)
		demonStats.currentHealth = 0;
	else
		demonStats.currentHealth += change;
	
}

public int getMaxMana() {
	return demonStats.maxMana;
}

	public int getCurrentMana() {
		return demonStats.currentMana;
	}

public void changeMaxMana(int newMax) {
 
	if (demonStats.maxMana + newMax < 1) {
		demonStats.maxMana = 1;
		demonStats.currentMana = demonStats.maxMana;
	}
	
	else {
		demonStats.maxMana += newMax;
		demonStats.currentMana += newMax;
	}
	
}

public void changeCurrentMana(int change) {
	if (demonStats.currentMana + change > demonStats.maxMana)
		demonStats.currentMana = demonStats.maxMana;
	else if (demonStats.currentMana + change < 0)
		demonStats.currentMana = 0;
	else
		demonStats.currentMana += change;
}

public int getBuffness() {
	return demonStats.buffness;
}

public void changeBuffness(int change) {
	if (demonStats.buffness + change < 0)
		demonStats.buffness = 0;
	
	else
		demonStats.buffness += change;
}

public int getFriskiness() {
	return demonStats.friskiness;
}

public void changeFriskiness(int change) {
	if (demonStats.friskiness + change < 0)
		demonStats.friskiness = 0;
	
	else
		demonStats.friskiness += change;
}

public int getBrainpower() {
	return demonStats.brainpower;
}

public void changeBrainpower(int change) {
	if (demonStats.brainpower + change < 0)
		demonStats.brainpower = 0;
	
	else
		demonStats.brainpower += change;
}

public int getEdginess() {
	return demonStats.edginess;
}

public void changeEdginess(int change) {
	if (demonStats.edginess + change < 0)
		demonStats.brainpower = 0;
		
	else
		demonStats.edginess += change;
}
public int getLuck() {
	return demonStats.luck;
}

public void changeLuck(int change) {
	if (demonStats.luck + change < 0)
		demonStats.luck = 0;
	
	else
		demonStats.luck += change;
}
public int getFireResist() {
	return demonStats.fireResist;
}

public void changeFireResist(int change) {
	if (demonStats.fireResist + change < 0)
		demonStats.fireResist = 0;
	
	else
		demonStats.fireResist += change;
}

public int getLightningResist() {
	return demonStats.lightningResist;
}

public void changeLightningResist(int change) {
	if (demonStats.lightningResist + change < 0)
		demonStats.lightningResist = 0;
	
	else
		demonStats.lightningResist += change;
}

public int getIceResist() {
	return demonStats.iceResist;
}

public void changeIceResist(int change) {
	if (demonStats.iceResist + change < 0)
		demonStats.iceResist = 0;
	
	else
		demonStats.iceResist += change;
}

public int getPhysicalResist() {
	return demonStats.physicalResist;
}

public void changePhysicalResist(int change) {
	
	if(demonStats.physicalResist + change < 0)
		demonStats.physicalResist = 0;
	
	else
		demonStats.physicalResist += change;
	
}

public void setArchetype(String archetype) {
	this.archetype = archetype;
}

public void setName(String name) {
	this.name = name;
}

public void setDifficulty(int difficulty) {
	this.demonDifficulty = difficulty;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public void setWeakness(String weakness) {
	this.weakness = weakness;
}


}
