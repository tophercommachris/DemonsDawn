package spellblade;

import baseabilities.Ability;
import pc.PlayerCharacter;


//Example of a multi-round duration ability, for round creation mechanics

public class ShadowCloak extends Ability {
	
	
	public ShadowCloak(PlayerCharacter player) {

		desc = "Turns the caster invisible for 1 round(s), granting 100% dodge rate";
		flavor = "Shadows leap from the flickering walls onto your skin, granting you sanctuary for but a moment";
		name="shadowcloak";
		scalingStat="brainpower";
		
		instantCast = true;
		doesDamage = false;
		magicDamage = false;
		
		manaCost = 5;
		damage = 0;
		restoration = 0;
		baseHitChance = 100;
		abilityCooldown = 3;
		abilityDuration = 1;
	
		
		roundsTillActivated = 0;
		

	}

}
