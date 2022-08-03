/*
 * This class is the master class of every ability used.  This class holds all the methods overwritten by the different subclasses, and is organized into categories.
 * Each subclass will either be an attack, healing, buff, or debuff ability. The naming convention for each ability will be the type of ability it is, followed by an
 * underscore and then the name of the ability.  For example, a healing spell called cure wounds would be named Healing_CureWounds
 */

package abilitysource;

import java.util.ArrayList;
import java.util.Random;

import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public abstract class BaseAbility {
	
	//Shared by all subclasses
	public Random rand = new Random();
	private int hitNumber;
	protected String desc;
	protected String flavor;
	protected String name;
	protected String ID;
	protected String scalingStat;
	protected String abilityType;
	protected int manaCost;
	protected int abilityCooldown;
	protected int abilityDuration;
	protected int roundsTillActivated;
	
	
	
	//Used by attack abilities
	protected boolean fireDamage = false;
	protected boolean iceDamage = false;
	protected boolean lightningDamage = false;
	protected boolean physicalDamage = true;
	protected boolean instantKillChance = false; //Only Edgelord and Fool Abilities will have this be true
	protected int damage = 0;
	protected double baseHitChance;
	protected boolean instantCast = true;
	protected boolean hit;
	protected int instantKill;
	
	
	//Used by Healing abilities
	protected int healing;
	
	//Used by buff and debuff abilities
	protected ArrayList<String> affectedStats = new ArrayList<String>();
	
//Methods used by all subclasses (Not Overriden) _______________________________________


public int determineScalingStat(BasePlayerCharacter player) {
		
		if (scalingStat.equals("buffness")) 
			return player.getBuffness();
		
		else if (scalingStat.equals("friskiness"))
			return player.getFriskiness();
		
		else if (scalingStat.equals("brainpower"))
			return player.getBrainpower();
		
		else if (scalingStat.equals("edginess"))
			return player.getEdginess();
		
		else if (scalingStat.equals("luck"))
			return player.getLuck();
		
		else {
			System.out.println("Couldn't find scaling stat");
			return -1;
		}
	
		
	}

public int determineScalingStat(BaseDemon demon) {
	
	if (scalingStat.equals("buffness")) 
		return demon.getBuffness();
	
	else if (scalingStat.equals("friskiness"))
		return demon.getFriskiness();
	
	else if (scalingStat.equals("brainpower"))
		return demon.getBrainpower();
	
	else if (scalingStat.equals("edginess"))
		return demon.getEdginess();
	
	else if (scalingStat.equals("luck"))
		return demon.getLuck();
	
	else {
		System.out.println("Couldn't find scaling stat");
		return -1;
	}
	
	

	
}

	public String getAbilityName() {
		
	return name;
	
	}
	

	public String getAbilityType() {
		return abilityType;
	}
	
	
	//Will probably use instanceof if stateents in a castAbility() method to determine which activateAbility method to use
	//Overridden Methods used by all subclasses ________________________________________________
	public void activateAbility(BasePlayerCharacter player, BaseDemon demon) {
		System.out.println("Call Ability Player/Demon Method Not Overriden");
	}
	
	public void activateAbility(BasePlayerCharacter player) {
		System.out.println("Call Ability Player Method (player only) Not Overriden");
	}
	
	
	public void delayedCast() {
		//Maybe have something in the loop that holds an ability and releases it when the
		//counter reaches the appropiate number?
		System.out.println("Delayed Cast Not Overriden");
	}
	
	
	
	
	//Overridden methods used by attack abilities___________________________________________________
	public int calculateDamage() {
		System.out.println("Calculate damage not overriden");
		return -1;
	}
	
	public int calculateDamage(BaseDemon demon) {
		System.out.println("Calculate damage (demon) not overriden");
		return -1;
	}
	
	public int calculateDamage(BasePlayerCharacter player) {
		System.out.println("Calculate damage (player) not overriden");
		return -1;
	}
	
	public boolean determineHitOrMiss() {
		System.out.println("Determine hit or miss not overriden");
		return false;
	}
	
	public boolean determineInstantKill() {
		System.out.println("Determine Instant Kill not overriden");
		return false;
	}
	
	public int getHitNumber() {
		return hitNumber;
	}

	public void setHitNumber(int hitNumber) {
		this.hitNumber = hitNumber;
	}
	
	
	
	
	//Overridden methods used by healing abilities______________________________________________
	public void calculateHealing() {
		System.out.println("Calculate healing not overriden");
	}
	
	
	//Overriden methods from both buff & debuff classes____________________________________________
	public void clearStatusEffect() {
		
		System.out.println("Clear Status Effect not overriden");
		
	}

	
	
	
	
	

}
