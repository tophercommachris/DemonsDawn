package baseabilities;

import demons.Demon;
import pc.PlayerCharacter;

public class BasicAttack extends Ability {
	
	public BasicAttack(String scalingStat) {
	
		desc = "You swing your weapon, or maybe a rock so happened to fall on the demon's head. Whatever the case, this attack is always reliable";
		flavor = "You attack basically";
		name = "Basic Attack";
		ID = "basicattack";
		this.scalingStat = scalingStat;
		
		instantCast = true;
		doesDamage = true;
		doesHealing = false;
		altersStats = false;
		magicDamage = false;
		instantKillChance = false;
		
		manaCost = 0;
		damage = 0;
		restoration = 0;
		baseHitChance = 0;
		abilityCooldown = 0;
		abilityDuration = 0;
		alteredStat = "";
		
		alterAmount = 0;
		alterRoundDuration = 0;
		
		roundsTillActivated = 0;

		
	}
	@Override
	public void callAbility(PlayerCharacter player) {
		System.out.println(flavor);
		calculateDamageOrHealing(player);
	}
	@Override
	public void callAbility(Demon demon) {
		System.out.println("The Demon Swings Basically");
		calculateDamageOrHealing(demon);
	}
	
	public int calculateDamageOrHealing(PlayerCharacter player) {
		
		if (scalingStat.equals("friskiness")) {
			damage = (int)(player.getFriskiness() * -.20);
			
		}
		
		else if (scalingStat.equals("buffness")) {
			damage = (int)(player.getBuffness() * -.40);
		}
		return damage;
		
	}
	
	public int calculateDamageOrHealing(Demon demon) {
		
		if (scalingStat.equals("friskiness")) {
			damage = (int)(demon.getFriskiness() * -.10);
			
		}
		
		else if (scalingStat.equals("buffness")) {
			damage = (int)(demon.getBuffness() * -.30);
		}
		
		return damage;
	}

}
