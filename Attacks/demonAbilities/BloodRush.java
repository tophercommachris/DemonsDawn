package demonAbilities;

import baseabilities.Ability;
import demons.Demon;

public class BloodRush extends Ability {
	
	public BloodRush() {
		flavor = "The demon rushes towards you with a ravenous fury, blood seems to trail behind it as it rears back to crush your bones.";
		name = "Bloodrush";
		ID = "bloodrush";
		scalingStat = "friskiness";
		
		instantCast = true;
		doesDamage = true;
		doesHealing = false;
		altersStats = false;
		magicDamage = false;
		instantKillChance = false;
		
		manaCost = 1;
		damage = 0;
		restoration = 0;
		baseHitChance = .95;
		abilityCooldown = 0;
		abilityDuration = 0;
		alteredStat = "";
		
		alterAmount = 0;
		alterRoundDuration = 0;
		
		roundsTillActivated = 0;
	}
	
	@Override
	public void callAbility(Demon demon) {
		System.out.println(flavor);
		calculateDamageOrHealing(demon);
	}
	
	public int calculateDamageOrHealing(Demon demon) {
		
		damage = (int) (demon.getFriskiness() * (-.15));
		
		return damage;
	}

}
