package edgelord;

import abilitysource.*;
import playercharacter.BasePlayerCharacter;

public class Buff_Hmmph extends StatusEffect{
	
	public Buff_Hmmph() {
		desc = "You predict your opponents every move, making it much harder to hit you.  All of your resistances go by half of your edginess stat for 3 rounds";
		flavor = "You push your glasses up as they turn white, and let out a contemptful noise, as you read their every move";
		name = "Hmmph";
		ID = "hmmph";
		abilityType = "buff";
		scalingStat = "edginess";
		manaCost = -15;
		abilityCooldown = 5;
		abilityDuration = 3;
		activeAbilityDuration = 3;
		
		affectedStats.add("fireResist");
		affectedStats.add("lightningResist");
		affectedStats.add("iceResist");
		affectedStats.add("physicalResist");
		
	}
	
	@Override
	public void activateAbility(BasePlayerCharacter player) {
		System.out.println(flavor);
		player.changeFireResist((player.getEdginess()/2));
		player.changeLightningResist((player.getEdginess()/2));
		player.changeIceResist((player.getEdginess()/2));
		player.changePhysicalResist((player.getEdginess()/2));
		
	}
	
	@Override
	public void clearStatusEffect(BasePlayerCharacter player) {
		
		player.changeFireResist(-(player.getEdginess()/2));
		player.changeLightningResist(-(player.getEdginess()/2));
		player.changeIceResist(-(player.getEdginess()/2));
		player.changePhysicalResist(-(player.getEdginess()/2));
		
	}
	
	
	
	

}
