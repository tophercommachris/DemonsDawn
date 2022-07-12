/*
 * This class handles the unique abilities of player classes.  The method for assigning abilities to the player is currently a Work In Progress
 * This class will inherit the stats method from the PlayerCharacter class in order to scale the abilities with the stats
 * It takes a variety of boolean variables as well as integers that change how the spell functions and what its purpose is, as well as potential healing or damage amount
 * Each ability in this game cost a resource called "mana", which is essentially an energy bar
 */


package baseabilities;
import pc.Stats;

public class Ability {
	
	//Might add the option to increase mana cost in order to empower the spell
		
	protected Stats stats;
	protected String desc;
	protected String flavor;
	protected String name;
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
	
	
	
	public Ability(Stats stats) {
		this.stats = stats;
	}
	
	public void determineAbilityMethod() {
		//will determine what methods to call
		
		if (doesDamage || doesHealing && !altersStats) //Heals or damages but does not alter stats
			calculateDamageOrHealing();
		
		else if (doesDamage || doesHealing && altersStats ) { //Heals or damages and alters stats
			calculateDamageOrHealing();
			alterStats();
		}
			
		else if (!doesDamage && !doesHealing && altersStats) {
			alterStats();
		}
	
			
		
	}
	
	
	public void delayedCastValueChange() {
		
	}
	
	public int calculateDamageOrHealing() { //All of the formulas are placeholder formulas until the right ones are found
		double statHolder;
		
		if (doesDamage) {
			
			if (scalingStat.equals("buffness")) {
				
				statHolder = stats.getBuffness();
				statHolder /= 10;
				
				damage *= statHolder;
				return damage;
					
			}
			
			else if (scalingStat.equals("friskiness")) {
				statHolder = stats.getFriskiness();
				statHolder /= 10;
				
				damage *= statHolder;
				return damage;
			}
			
			else if (scalingStat.equals("brainpower")) {
				
				statHolder = stats.getBrainpower();
				statHolder /= 10;
				
				damage *= statHolder;
				return damage;
				
			}
			
			else if (scalingStat.equals("edginess")) {
				
				statHolder = stats.getEdginess();
				statHolder /= 10;
				
				damage *= statHolder;
				return damage;
				
			}
			
			else if (scalingStat.equals("luck")) {
				statHolder = stats.getLuck();
				statHolder /= 10;
				
				damage *= statHolder;
				return damage;
			}
			
			
		} //End if statement
		
		else if (doesHealing) {  //If healing instead of damage, healing can only scale off of Luck or Brainpower
			
			if (scalingStat.equals("brainpower")) {
				
				statHolder = stats.getBrainpower();
				statHolder /= 15;
				
				restoration *= statHolder;
				return restoration;
				
			}
			
			else if (scalingStat.equals("luck")) {
				
				statHolder = stats.getLuck();
				statHolder /= 15;
				
				restoration *= statHolder;
				return restoration;
			}
			
		
		} //End Else Statement
		
		return -1;
		
	} //End Healing and Damage Method
	
	
	public void restoreMana() { //Mana restoring abilities can only scale with Brainpower or Luck, otherwise potions need to be used
		double statHolder = 0;
		if (scalingStat.equals("brainpower")) {
			statHolder = stats.getBrainpower();
			
			statHolder /= 15;
			restoration *= statHolder;
		}
		
		else if (scalingStat.equals("luck")) {
			statHolder = stats.getLuck();
			
			statHolder /=15;
			restoration *= statHolder;
		}
		
		
	}
	
	public void alterStats() { //Alters health for a certain number of rounds in combat
		
		if (alteredStat.equals("health")) {
			
		}
		
		else if (alteredStat.equals("mana")) {
			
		}
		
		else if (alteredStat.equals("buffness")) {
			
		}
		
		else if (alteredStat.equals("brainpower")) {
			
		}
		
		else if (alteredStat.equals("edginess")) {
			
		}
		
		else if (alteredStat.equals("luck")) {
			
		}
		
		else if (alteredStat.equals("luck")) {
			
		}
		
		else if (alteredStat.equals("magicresistance")) {
			
		}
		
		else if (alteredStat.equals("physicalresistance")) {
			
		}
	}
	
	
	
}
