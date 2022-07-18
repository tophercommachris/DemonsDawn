package edgelord;

import baseabilities.Ability;
import demons.Demon;
import pc.PlayerCharacter;

public class Hmmph extends Ability{
	
	public Hmmph() {
		
		desc = "Scoff at your opponent, you know they can't harm you.  Increases your Physical and Magical Resistance by   for 2 rounds";
		flavor = "'Hmmph', you say with a smirk as they charge towards you.  Your glasses push up and turn white, you can read their every move.";
		name = "Hmmph";
		ID = "hmmph";
		scalingStat = "edginess";
		
		instantCast = true;
		doesDamage = false;
		altersStats = true;
		magicDamage = false;
		instantKillChance = false;
		
		manaCost = 4;
		damage = 0;
		restoration = 0;
		baseHitChance = 1;
		abilityCooldown = 2;
		abilityDuration = 2;
		
		alterAmount = 30;
		alterRoundDuration = 2;
		
		roundsTillActivated = 0;
	}
	
	@Override
	public void callAbility(PlayerCharacter player, Demon demon) {
		System.out.println(flavor);
		alterStats(player);
	}
	
	@Override
	public void alterStats(PlayerCharacter player) {
		player.changeMagicResist(player.getEdginess());
		player.changePhysicalResist(player.getEdginess());
		
	}

}
