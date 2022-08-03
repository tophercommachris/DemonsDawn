package playercharacter;

public class ClassGodfather extends BasePlayerCharacter{

	public ClassGodfather(String choice) {
		super(choice);
		playerStats = new PlayerStatBuilder()
				.setMaxHealth(25)
				.setMaxMana(5)
				.setCurrentHealth(25)
				.setCurrentMana(5)
				.setGoldAmount(30)
				.setBuffness(15)
				.setFriskiness(10)
				.setBrainpower(12)
				.setEdginess(5)
				.setLuck(5) 
				.setFireResist(0)
				.setLightningResist(0)
				.setIceResist(0)
				.setPhysicalResist(0)
				.setXp(0)
				.build();
	}

}
