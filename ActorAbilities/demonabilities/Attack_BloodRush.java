package demonabilities;

import abilitysource.Attack;
import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class Attack_BloodRush extends Attack{
	
	public Attack_BloodRush() {
		flavor = "The demon rears back before rushing forward at a surpising speed, a trail of blood follows behind the blur";
		name = "Bloodrush";
		ID = "bloodrush";
		scalingStat = "friskiness";
		abilityType = "attack";
		manaCost = -1;
		physicalDamage = true;
		damage = -2;
		baseHitChance = 95;
		instantCast = true;
	}
	
	public void activateAbility(BasePlayerCharacter player, BaseDemon demon) {
		System.out.println(flavor);
		
		hit = determineHitOrMiss();
		
		if (hit) {
			
			System.out.println("The Demon barrels into you, sending you flying back");
			player.changeCurrentHealth(calculateDamage(demon), getDamageType());
		}
		
		else
			System.out.println("You quickly dodge out of the way as the demon grinds to a halt");
		
	}
	
	public int calculateDamage(BaseDemon demon) {
		damage += (int)(-demon.getFriskiness()*.10);
		System.out.println("Bloodrush Damage: " + damage);
		return damage;
	}

}
