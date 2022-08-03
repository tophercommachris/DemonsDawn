package playercharacter;

public class ClassSpellblade extends BasePlayerCharacter{

	public ClassSpellblade(String choice) {
		super(choice);
		playerStats = new PlayerStatBuilder()
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
				.setFireResist(0)
				.setLightningResist(0)
				.setIceResist(0)
				.setPhysicalResist(0)
				.setXp(0)
				.build();
	}

}
