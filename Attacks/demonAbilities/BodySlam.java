package demonAbilities;

import baseabilities.Ability;
import demons.Demon;
import pc.PlayerCharacter;

public class BodySlam extends Ability{
	
	
	public BodySlam() {
		flavor = "The demon jumps towards you, it's body crushing against you with a force that could break bones";
		name = "Body Slam";
		ID = "bodyslam";
		scalingStat = "buffness";
		
		instantCast = true;
		doesDamage = true;
		doesHealing = false;
		altersStats = false;
		magicDamage = false;
		instantKillChance = false;
		
		manaCost = 0;
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
	public void callAbility(Demon demon, PlayerCharacter player) {
		System.out.println(flavor);
		player.changeCurrentHealth(calculateDamageOrHealing(demon));
	}
	
	@Override
	public int calculateDamageOrHealing(Demon demon) {
		
		damage = (int) (demon.getBuffness() * (-.40));
		
		return damage;
	}

}
