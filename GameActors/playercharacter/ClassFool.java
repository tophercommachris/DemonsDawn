package playercharacter;

public class ClassFool extends BasePlayerCharacter{

	public ClassFool(String choice) {
		super(choice);
		playerStats = new PlayerStatBuilder()
		.setMaxHealth(10)
		.setMaxMana(10)
		.setCurrentHealth(10)
		.setCurrentMana(10)
		.setGoldAmount(1)
		.setBuffness(10)
		.setFriskiness(10)
		.setBrainpower(10)
		.setEdginess(10)
		.setLuck(20) 
		.setFireResist(0)
		.setLightningResist(0)
		.setIceResist(0)
		.setPhysicalResist(0)
		.setXp(5)
		.build();
	}

}
