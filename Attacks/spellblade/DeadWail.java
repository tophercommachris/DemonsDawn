package spellblade;

import baseabilities.Ability;
import pc.PlayerCharacter;

//Example of an ability that doesn't happen till a certain amount of rounds pass.

public class DeadWail extends Ability {
	
	public DeadWail(PlayerCharacter player) {
		
		desc = "Conjure a glyph summons a banshee to scream after 3 rounds, dealing 30 Physical damage";
		flavor = "You whisper an incantation, splitting the veil between the spirit world and your own world, calling the wails of a banshee";
		name = "deadwail";
		scalingStat= "brainpower";
		
		instantCast = false;
		doesDamage = true;
		altersStats = false;
		magicDamage = false;
		
		manaCost = 8;
		damage = 30;
		restoration = 0;
		baseHitChance = .95;
		abilityCooldown = 5;
		abilityDuration = 0;
		
		alterAmount = 0;
		alterRoundDuration = 0;
		
		roundsTillActivated = 3;
		
		
		
	}
	

}
