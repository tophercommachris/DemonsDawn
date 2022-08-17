package level1demons;

import demonabilities.Attack_BloodRush;
import demonabilities.Attack_Slam;
import demonblueprint.BaseDemon;
import demonblueprint.DemonStatBuilder;
import playercharacter.BasePlayerCharacter;

public class Yecheolus extends BaseDemon{
	
	public Yecheolus() {
		
		demonStats = new DemonStatBuilder()
				.setMaxHealth(10)
				.setCurrentHealth(5)
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
		setName("Yecheolus");
		setDifficulty(1);
		setDesc("A short and stubby mass of muscle, the Yecheolus rears its legs as if it's ready to charge at you.  It seems like this demon is decievingly fast.");
		setWeakness("ice");
		
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
