package playercharacter;

import demonblueprint.BaseDemon;
import edgelord.EdgelordAbilityBuilder;

public class ClassEdgelord extends BasePlayerCharacter{

	public ClassEdgelord(String choice) {
		super(choice);
		
		playerStats = new PlayerStatBuilder()
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
				.setFireResist(0)
				.setLightningResist(0)
				.setIceResist(0)
				.setPhysicalResist(0)
				.setXp(0)
				.build();
		
		addAbilities();
	}
	
	@Override
	public void addAbilities() {
		EdgelordAbilityBuilder edgelordAbilities = new EdgelordAbilityBuilder();
		abilityMap = edgelordAbilities.getAbilities();
	}
	
	@Override
	public void levelUp() {
		System.out.println("\n\nLEVEL UP!\n\n");
		changeMaxHealth(5);
		changeMaxMana(3);
		changeBuffness(2);
		changeFriskiness(1);
		changeBrainpower(1);
		changeEdginess(3);
		changeLuck(1);
		changeFireResist(2);
		changeLightningResist(2);
		changeIceResist(2);
		changePhysicalResist(2);
		changeMaxXP();
		increaseLevel();
	}
	
	@Override
	public void useAbility(int index, BasePlayerCharacter player, BaseDemon demon) {
		abilityMap.get(index).activateAbility(player, demon);
	}

}
