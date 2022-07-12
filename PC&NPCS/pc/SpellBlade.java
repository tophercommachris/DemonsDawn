package pc;
import java.util.*;

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
	
	
	

}
