package pc;

import edgelord.EdgelordAbilityBuilder;

public class Edgelord extends PlayerCharacter {
	
	//Dealing damage based on the damage they feel emotionally, tank
	
	public Edgelord() {
		stats = new StatBuilder()
				.setMaxHealth(50)
				.setMaxMana(15)
				.setCurrentHealth(50)
				.setCurrentMana(15)
				.setGoldAmount(0)
				.setBuffness(12)
				.setFriskiness(10)
				.setBrainpower(10)
				.setEdginess(15)
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
		EdgelordAbilityBuilder initialize = new EdgelordAbilityBuilder();
		abilityMap = initialize.initializeAbilities();
		
	}
	
	@Override 
	public void useAbility(PlayerCharacter player) {
		abilityMap.get(1).callAbility(player);
	}
	
	

}
