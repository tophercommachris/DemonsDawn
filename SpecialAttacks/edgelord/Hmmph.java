package edgelord;

import baseabilities.Ability;
import pc.Stats;

public class Hmmph extends Ability{
	
	public Hmmph(Stats stats) {
		super(stats);
		
		desc = "Scoff at your opponent, you know they can't harm you.  Increases your Physical and Magical Resistance by 30 for 2 rounds";
		flavor = "'Hmmph', you say with a smirk as they charge towards you.  Your glasses push up and turn white, you can read their every move.";
		name = "hmmph";
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

}
