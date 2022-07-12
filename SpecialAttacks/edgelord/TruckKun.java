package edgelord;

import baseabilities.Ability;
import pc.Stats;

public class TruckKun extends Ability{
	
	public TruckKun(Stats stats) {
		super(stats);
		desc = "You summon your portal to this hell hole to crush your enemy, dealing 50 damage, and having a very small chance to instantly kill your opponent, sending them to another world";
		flavor = "The revving of the engine brings you back flashes of memories of your life before this world.  You scoff, remembering your left the stove on before you died, as the truck comes crashing through the wall";
		name = "trunkkun";
		scalingStat = "edginess";
		
		instantCast = true;
		doesDamage = true;
		altersStats = false;
		magicDamage = false;
		instantKillChance = true;
		
		manaCost = 10;
		damage = 50;
		restoration = 0;
		baseHitChance = .95;
		abilityCooldown = 6;
		abilityDuration = 0;
		
		alterAmount = 0;
		alterRoundDuration = 0;
		
		roundsTillActivated = 0;
	}

}
