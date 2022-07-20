package pc;
import java.util.*;

import baseabilities.Buff;
import demons.Demon;
import edgelord.EdgelordAbilityBuilder;
import spellblade.SBAbilityBuilder;

public class SpellBlade extends PlayerCharacter{

	//SpellBlade, assassin mage who utilizes magic to find weaknesses of creatures.
	
	//Spell list would probably work best as a file that is read when the object is created, and can be added onto. Question is, is it best to add the file reading here?
	
	//Constructor for wizard class
	public SpellBlade() {
		stats = new StatBuilder()
				.setMaxHealth(15)
				.setMaxMana(25)
				.setCurrentHealth(15)
				.setCurrentMana(25)
				.setGoldAmount(10)
				.setBuffness(5)
				.setFriskiness(15)
				.setBrainpower(15)
				.setEdginess(10)
				.setLuck(0) 
				.setMagicResist(0)
				.setPhysicalResist(0)
				.setXp(0)
				.build();
		
		
		
	}
	
	@Override
	public void levelUp() throws InterruptedException { //This function will need to be called after every battle to check if leveling up is available
		if (getXP() >= getMaxXP()) {
			
			changeMaxHealth(10);
			changeMaxMana(5);
			changeBuffness(4);
			changeFriskiness(1);
			changeBrainpower(1);
			changeEdginess(4);
			changeLuck(0);
			changeMagicResist(2);
			changePhysicalResist(2);
			increaseLevel();
			
			System.out.println("\nLEVEL UP!");
			changeMaxXP();
			displayStats();
			
			
		}
		
	}
	
	@Override
	public void addAbilities() {
		SBAbilityBuilder initialize = new SBAbilityBuilder();
		abilityMap = initialize.initializeAbilities();
		
	}
	
	//Does Use Ability even need to be overridden?
	@Override 
	public void useAbility(int index, PlayerCharacter player, Demon demon) {
		
		if (abilityMap.get(index) instanceof Buff) {
			abilityMap.get(index).callAbility(player);
		}
		
		//May have to change structure to allow for debuffs as well, though debuffs will change demon stats as well, so the else statement may be enough
		else
		abilityMap.get(index).callAbility(player, demon);
	}

	
	
	

}
