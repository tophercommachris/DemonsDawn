package pc;

public class Fool extends PlayerCharacter {
	
	//Higher probability of things working out, but starts with nothing.  
	
	public Fool() {
		stats = new StatBuilder()
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
				.setMagicResist(0)
				.setPhysicalResist(0)
				.setXp(5)
				.build();
		
	}

}
