package demonabilities;

import abilitysource.Attack;
import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class Attack_Slam extends Attack {
	
	public Attack_Slam () {
	flavor = "The Demon slams into you with its body, attempting to crush you underneath it";
	name = "Slam";
	ID = "slam";
	scalingStat = "buffness";
	abilityType = "attack";
	manaCost = 0;
	physicalDamage = true;
	damage = -20;
	baseHitChance = 95;
	instantCast = true;
	}
	
	public void activateAbility(BasePlayerCharacter player, BaseDemon demon) {
		
		System.out.println(flavor);
		
		hit = determineHitOrMiss();
		
		if (hit) {
		
			System.out.println("The Demon slams itself onto you, the impact sends you stumbling back");
			player.changeCurrentHealth(calculateDamage(demon), getDamageType());
			
		}
		
		else
			System.out.println("You dodge out of the way as the demon slams into the ground, cracking it");
	}
	
	public int calculateDamage(BaseDemon demon) {
		damage += (int)((-demon.getBuffness())*.10);
		System.out.println("Slam damage: " + damage);
		return damage;
	}
		
	

}
