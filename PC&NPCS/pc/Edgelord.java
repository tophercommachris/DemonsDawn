package pc;

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
	
	

}
