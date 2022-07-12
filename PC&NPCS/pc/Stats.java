/*
 * This class manages all the stats for the PlayerCharacter, which calls an Stat object to hold throughout the entirety of the game
 * Every stat can be modified or gotten from this class, and these stats will be consistent throughout the game. 
 */


package pc;

public class Stats {
	
	private int maxHealth;
	private int maxMana;
	private int currentHealth;
	private int currentMana;
	private int goldAmount;
	private int buffness;
	private int friskiness;
	private int brainpower;
	private int edginess;
	private int luck;
	private int magicResist;
	private int physicalResist;
	private int xp;
	private int maxXP = 10;
	private int level = 1;
	
	Stats(int maxHealth, int maxMana, int currentHealth, int currentMana, int goldAmount, int buffness,
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
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
	public void changeMaxHealth(int newMax) {
		if (maxHealth + newMax < 1) {
			maxHealth = 1;
			currentHealth = maxHealth;
		}
		else {
			maxHealth += newMax;
			currentHealth += newMax;
		}
	}
	
	public int getCurrentHealth() {
		return currentHealth;
	}
	
public void changeCurrentHealth(int change) {
		
		if (currentHealth + change > change)
			currentHealth = maxHealth;
		else if (currentHealth + change < 0)
			currentHealth = 0;
		else
		currentHealth += change;
	}
	
	public int getMaxMana() {
		return maxMana;
	}
	
 	public int getCurrentMana() {
 		return currentMana;
 	}
	
	public void changeMaxMana(int newMax) {
	 
		if (maxMana + newMax < 1) {
			maxMana = 1;
			currentMana = maxMana;
		}
		
		else {
			maxMana += newMax;
			currentMana += newMax;
		}
		
	}
	
	public void changeCurrentMana(int change) {
		if (currentMana + change > change)
			currentMana = maxMana;
		else if (currentMana + change < 0)
			currentMana = 0;
		else
			currentMana += change;
	}
	
	
	public int getGold() {
		return goldAmount;
	}
	
	public void addGold(int change) {
		if (goldAmount + change < 0)
		goldAmount = 0;
		
		else
			goldAmount += change;
	}
	
	public int getBuffness() {
		return buffness;
	}
	
	public void changeBuffness(int change) {
		if (buffness + change < 0)
			buffness = 0;
		
		else
			buffness += change;
	}

	public int getFriskiness() {
		return friskiness;
	}
	
	public void changeFriskiness(int change) {
		if (friskiness + change < 0)
			friskiness = 0;
		
		else
			friskiness += change;
	}
	
	public int getBrainpower() {
		return brainpower;
	}
	
	public void changeBrainpower(int change) {
		if (brainpower + change < 0)
			brainpower = 0;
		
		else
			brainpower += change;
	}
	
	public int getEdginess() {
		return edginess;
	}
	
	public void changeEdginess(int change) {
		if (edginess + change < 0)
			brainpower = 0;
			
		else
			edginess += change;
	}
	public int getLuck() {
		return luck;
	}
	
	public void changeLuck(int change) {
		if (luck + change < 0)
			luck = 0;
		
		else
			luck += change;
	}
	public int getMagicResist() {
		return magicResist;
	}
	
	public void changeMagicResist(int change) {
		if (magicResist + change < 0)
			magicResist = 0;
		
		else
			magicResist += change;
	}
	
	public int getPhysicalResist() {
		return physicalResist;
	}
	
	public void changePhysicalResist(int change) {
		
		if(physicalResist + change < 0)
			physicalResist = 0;
		
		else
			physicalResist += change;
		
	}
	
	public int getXP() {
		return xp;
	}
	
	public int getMaxXP() {
		return maxXP;
	}
	
	public void changeXP(int change) {
		xp += change;
		
	}
	
	public void changeMaxXP() {
		maxXP *= 2;
	}
	
	public int getLevel() {
		return level;
	}
	
	public void increaseLevel() {
		level++;
	}
	
	

	} //End Stats Class
