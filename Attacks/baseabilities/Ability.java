/*
 * This class handles the unique abilities of player classes.  The method for assigning abilities to the player is currently a Work In Progress
 * This class will inherit the stats method from the PlayerCharacter class in order to scale the abilities with the stats
 * It takes a variety of boolean variables as well as integers that change how the spell functions and what its purpose is, as well as potential healing or damage amount
 * Each ability in this game cost a resource called "mana", which is essentially an energy bar
 * The class uses an AbilityMethods Interface, and has the subclasses upcast, overriding the methods so that they are unique to the abilities
 */


package baseabilities;
import demons.Demon;
import pc.PlayerCharacter;

public abstract class Ability implements AbilityMethods {
	
	//Might add the option to increase mana cost in order to empower the spell
		

	protected String desc;
	protected String flavor;
	protected String name;
	protected String ID;
	protected String scalingStat;
	
	protected boolean instantCast = true;
	protected boolean doesDamage = false;
	protected boolean doesHealing = false;
	protected boolean altersStats = false;
	protected boolean magicDamage = false;
	protected boolean instantKillChance = false; //Only Edgelord and Fool Abilities will have this be true
	
	protected int manaCost;
	protected int damage = 0;
	protected int restoration = 0;
	protected double baseHitChance;
	protected int abilityCooldown;
	protected int abilityDuration;
	protected String alteredStat;
	
	protected double alterAmount;
	protected int alterRoundDuration;
	
	protected int roundsTillActivated;
	
	//This method is overridden and called for every ability, instead of having to call the method that is specific to the ability, the subclass customizes which method it calls
	public void callAbility(PlayerCharacter player, Demon demon) {
		System.out.println("Call Ability Player Method Not Overridden");
	}
	
	public void callAbility(Demon demon, PlayerCharacter player) {
		System.out.println("Call Ability Demon Not Overriden");
	}
	
	 public void determineAbilityMethod() {		
			System.out.println("Determine Ability Method Not Overriden");
		}
	 
	 public int calculateDamageOrHealing(PlayerCharacter player) {
		 System.out.println("Calculate Damage Or Healing Not Overriden");
		return -1;
		}
	 
	 public int calculateDamageOrHealing(Demon demon) {
		 System.out.println("Calculate Damage or Healing Demon Not Overriden");
		 return -1;
	 }
	 
	public void delayedCast() {
		System.out.println("Delayed Cast Not Overriden");
	}
	
	
	public void restoreMana() { //Mana restoring abilities can only scale with Brainpower or Luck, otherwise potions need to be used
		System.out.println("Restore Mana Not Overridden");
	
	}
		
	
	public void alterStats(PlayerCharacter player) { //Alters health for a certain number of rounds in combat
		System.out.println("Alter Stats Not Overriden");
	}
	
	public void alterStats(Demon demon) {
		System.out.println("Alter Stats Demon Not Overriden");
	}
	
	public int displayValues(PlayerCharacter player) {
		return -1;
		
	}

}



 

 

 
