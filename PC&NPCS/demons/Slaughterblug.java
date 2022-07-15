package demons;

import baseabilities.BasicAttack;
import demonAbilities.*;
import pc.PlayerCharacter;

public class Slaughterblug extends Demon{
	
	public Slaughterblug() {
	stats = new DemonStatBuilder()
			.setMaxHealth(10)
			.setMaxMana(5)
			.setCurrentHealth(10)
			.setCurrentMana(5)
			.setBuffness(4)
			.setFriskiness(15)
			.setBrainpower(2)
			.setEdginess(1)
			.setLuck(1)
			.setMagicResist(0)
			.setPhysicalResist(0)
			.setXp(5)
			.build();
	
		stats.name = "Slaughterblug";
		stats.desc = "Slimy demons, mostly composed of decomposing corpses the swallow into their body. They are known for their deceptive speed";
	}
			 
	public void addAbilities() { 
		abilityMap.put(0, new BasicAttack("friskiness"));
		abilityMap.put(1, new BloodRush());
	}

	
public void useAbility(Demon demon) {
	abilityMap.get(0).callAbility(demon);
		
	}

}
