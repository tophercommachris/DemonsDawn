package edgelord;

import abilitysource.BaseAbility;
import playercharacter.BasePlayerCharacter;

public class Buff_Hmmph extends BaseAbility{
	
	public Buff_Hmmph() {
		desc = "You predict your opponents every move, making it much harder to hit you.  All of your resistances go by half of your edginess stat for 3 rounds";
		flavor = "You push your glasses up as they turn white, and let out a contemptful noise, as you read their every move";
		name = "Hmmph";
		ID = "hmmph";
		abilityType = "buff";
		scalingStat = "edginess";
		manaCost = 3;
		abilityCooldown = 5;
		abilityDuration = 3;
		
		affectedStats.add("fireResist");
		affectedStats.add("lightningResist");
		affectedStats.add("iceResist");
		affectedStats.add("physicalResist");
		
	}
	
	public void activateAbility(BasePlayerCharacter player) {
		
		
	}
	

}
