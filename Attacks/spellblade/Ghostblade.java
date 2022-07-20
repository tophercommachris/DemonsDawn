package spellblade;

import baseabilities.Ability;
import baseabilities.BasicAttack;
import demons.Demon;

//Example of an instant cast ability for roudn based mechanics

import pc.PlayerCharacter;

public class Ghostblade extends Ability {
	
	BasicAttack basicAttack = new BasicAttack("friskiness");
		
	public Ghostblade() {
		
		
		
		desc = "(Costs 2 Mana): Your blade becomes ethereal, dealing basic attack damage and ignoring Magic Resistance";
		flavor = "A blue strand of energy wraps around your blade, as a gift to your enemy";
		name = "Ghostblade";		
		ID = "ghostblade";
		scalingStat = "friskiness";
		
		instantCast = true;
		doesDamage = true;
		magicDamage = true;
		
		manaCost = 2;
		damage = 0;
		restoration = 0;
		baseHitChance = .90;
		abilityCooldown = 3;
		abilityDuration = 0;
		
		
	}
	
	
	//Ghostblade specifically calls the method without the consideration for magic or physical damage because it ignores protections
	@Override
	public void callAbility(PlayerCharacter player, Demon demon) {
		System.out.println(flavor);
		demon.changeCurrentHealth(calculateDamageOrHealing(player));
	}
	
	@Override
	public int calculateDamageOrHealing(PlayerCharacter player) {
		
 		damage = basicAttack.calculateDamageOrHealing(player);
		
		return damage;
 		
 	
	}

	
	

}
