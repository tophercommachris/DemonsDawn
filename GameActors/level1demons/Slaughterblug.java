package level1demons;

import demonabilities.*;
import demonblueprint.BaseDemon;
import demonblueprint.DemonStatBuilder;
import playercharacter.BasePlayerCharacter;

public class Slaughterblug extends BaseDemon {
	
	public Slaughterblug() {
		
		demonStats = new DemonStatBuilder()
				.setMaxHealth(10)
				.setCurrentHealth(10)
				.setBuffness(5)
				.setFriskiness(10)
				.setBrainpower(2)
				.setEdginess(5)
				.setLuck(1)
				.setFireResist(0)
				.setLightningResist(0)
				.setIceResist(0)
				.setPhysicalResist(0)
				.setXP(5)
				.build();

		
		setArchetype("grunt");
		setName("Slaughterblug");
		setDifficulty(1);
		setDesc("A rotting mass of corpses, seemingly moving together in unison.  Each corpse groans with a gutteral noise, and you swear you hear faint cries for help");
		setWeakness("fire");
		addAbilities();
	}
	
	@Override
	public void addAbilities() {
		abilityMap.put(0, new Attack_Slam());
		abilityMap.put(1, new Attack_BloodRush());
	}
	
	@Override
	public void useAbility(BasePlayerCharacter player, BaseDemon demon) {
		int abilityUsed = rand.nextInt(100)+1;
		
		if (abilityUsed <= 50)
		abilityMap.get(0).activateAbility(player, demon);
		
		else if (abilityUsed >= 51)
			abilityMap.get(1).activateAbility(player, demon);
		
	}

}
