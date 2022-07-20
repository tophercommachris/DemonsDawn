package demons;

import java.util.Random;

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
			.setMagicResist(2)
			.setPhysicalResist(2)
			.setXp(5)
			.build();
	
		addAbilities();
	
		stats.name = "Slaughterblug";
		stats.desc = "Slimy demons, mostly composed of decomposing corpses the swallow into their body. They are known for their deceptive speed";
	}
			 
	public void addAbilities() { 
		abilityMap.put(0, new BodySlam());
		abilityMap.put(1, new BloodRush());
	}

	
	public void useAbility(PlayerCharacter player, Demon demon) {
		Random rand = new Random();
		int num;
		
		num = rand.nextInt((100-1))+1;
		
		if (num <= 70)
		abilityMap.get(0).callAbility(player, demon);
		
		else if (num >= 71)
		abilityMap.get(1).callAbility(player, demon);
		
	}

}
