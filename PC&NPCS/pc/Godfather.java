package pc;

public class Godfather extends PlayerCharacter {
	
	
	//Gets stronger the more money they have, spends money on their abilities.  Can call hits on monsters
	public Godfather () {
		stats = new StatBuilder()
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
				.setMagicResist(0)
				.setPhysicalResist(0)
				.setXp(0)
				.build();
		
	}

}
