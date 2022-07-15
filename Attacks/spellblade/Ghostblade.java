package spellblade;

import baseabilities.Ability;

//Example of an instant cast ability for roudn based mechanics

import pc.PlayerCharacter;

public class Ghostblade extends Ability {
		
	public Ghostblade(PlayerCharacter player) {
		
		desc = "(Costs 2 Mana): Your blade becomes ethereal, dealing basic attack damage and greatly increasing your chances to hit. |Scales with Friskiness|";
		flavor = "A blue strand of energy wraps around your blade, as a gift to your enemy";
		name = "ghostblade";
		scalingStat = "friskiness";

		manaCost = 2;
		damage = ((player.getFriskiness() / 2 ));
		restoration = 0;
		baseHitChance = .90;
		abilityCooldown = 3;
		abilityDuration = 3;
		
		instantCast = true;
		doesDamage = true;
		altersStats = false;
		magicDamage = true;
		
		alterAmount = 0;
		alterRoundDuration = 0;
				
	
		
		roundsTillActivated = 0;
		
	}

	
	

}
