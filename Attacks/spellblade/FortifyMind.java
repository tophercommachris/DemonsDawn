package spellblade;

import baseabilities.Ability;
import pc.PlayerCharacter;

//Example of a direct stat buff

public class FortifyMind extends Ability {
	
	public FortifyMind(PlayerCharacter player) {
		desc = "Bolsters the mind, giving a temporary 30% increase to Brainpower for 3 rounds";
		flavor = "You conjure glyphs that write into your mind, granting you better flow of your thoughts for your time of need";
		name = "fortifymind";
		scalingStat="brainpower";
		
		instantCast = true;
		doesDamage = false;
		altersStats = true;
		magicDamage = false;
		
		manaCost = 4;
		damage = 0;
		restoration = 0;
		baseHitChance = 1;
		abilityCooldown = 5;
		abilityDuration = 3;
		
		roundsTillActivated = 0;
		
	}

}
