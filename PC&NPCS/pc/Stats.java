/*
 * This class manages all the stats for the PlayerCharacter, which calls an Stat object to hold throughout the entirety of the game
 * Every stat can be modified or gotten from this class, and these stats will be consistent throughout the game. 
 */


package pc;

import java.util.Scanner;

public class Stats {
	
	protected Stats stats;
	protected String name = "";
	protected String title = "";
	protected String choice = "";
	protected int maxHealth;
	protected int maxMana;
	protected int currentHealth;
	protected int currentMana;
	protected int goldAmount;
	protected int buffness;
	protected int friskiness;
	protected int brainpower;
	protected int edginess;
	protected int luck;
	protected int magicResist;
	protected int physicalResist;
	protected int xp;
	protected int maxXP = 10;
	protected int level = 1;
	
	public Stats() {
		
	}
	
	public Stats(int maxHealth, int maxMana, int currentHealth, int currentMana, int goldAmount, int buffness,
			int friskiness, int brainpower, int edginess, int luck,
			int magicResist, int physicalResist, int xp) {
		
		this.maxHealth = maxHealth;
		this.maxMana = maxMana;
		this.currentHealth = currentHealth;
		this.currentMana = currentMana;
		this.goldAmount = goldAmount;
		this.buffness = buffness;
		this.friskiness = friskiness;
		this.brainpower = brainpower;
		this.edginess = edginess;
		this.luck = luck;
		this.magicResist = magicResist;
		this.physicalResist = physicalResist;
		this.xp = xp;
		
	}
	
	
	//Called by logic to create a name and title for character after class is chosen
	
	
	

	} //End Stats Class
