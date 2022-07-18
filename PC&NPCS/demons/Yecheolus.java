package demons;

import java.util.Random;

import baseabilities.*;
import demonAbilities.*;
import demonAbilities.BodySlam;
import pc.PlayerCharacter;

public class Yecheolus extends Demon{
	
	public Yecheolus() {
		stats = new DemonStatBuilder()
				.setMaxHealth(18)
				.setMaxMana(5)
				.setCurrentHealth(18)
				.setCurrentMana(5)
				.setBuffness(15)
				.setFriskiness(3)
				.setBrainpower(2)
				.setEdginess(5)
				.setLuck(1)
				.setMagicResist(0)
				.setPhysicalResist(0)
				.setXp(5)
				.build();
		
		addAbilities();
		stats.name = "Yechelous";
		stats.desc ="A Yechelous is a bulbous mass of fat and muscle.  The stench brings water to your eyes, and the yellow and pink skin seems to pulse like a heartbeat.  It's glowing red eyes seems to ooze a green liquid.";
		
	}
	
	
	public void addAbilities() { 
		abilityMap.put(0, new BasicAttack("buffness"));
		abilityMap.put(1, new BodySlam());
	}

	
	public void useAbility(Demon demon, PlayerCharacter player) {
		Random rand = new Random();
		int num;
		
		num = rand.nextInt((100-1))+1;
		
		if (num <= 50)
		abilityMap.get(0).callAbility(demon, player);
		
		else if (num >= 51)
		abilityMap.get(1).callAbility(demon,player);
		
	}

}
