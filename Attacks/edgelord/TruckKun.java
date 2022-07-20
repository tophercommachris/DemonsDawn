package edgelord;

import baseabilities.Ability;
import demons.Demon;
import pc.PlayerCharacter;
import pc.Stats;
import java.util.Random;

public class TruckKun extends Ability{
	
	Random rand = new Random();
	
	public TruckKun() {
		desc = "You summon your portal to this hell hole to crush your enemy, dealing damage, and having a very small chance to instantly kill your opponent, sending them to another world";
		flavor = "The revving of the engine brings you back flashes of memories of your life before this world.  You scoff, remembering your left the stove on before you died, as the truck comes crashing through the wall";
		name = "Truck-Kun";
		ID = "truckkun";
		scalingStat = "edginess";
		
		instantCast = true;
		doesDamage = true;
		magicDamage = false;
		instantKillChance = true;
		
		manaCost = 10;
		damage = 0;
		restoration = 0;
		baseHitChance = .95;
		abilityCooldown = 6;
		abilityDuration = 0;
		
		
		
		roundsTillActivated = 0;
	}
	
	@Override
	public void callAbility(PlayerCharacter player, Demon demon) {
		System.out.println(flavor);
		demon.changeCurrentHealth(calculateDamageOrHealing(player), magicDamage);
	}
	
	@Override
	public int calculateDamageOrHealing(PlayerCharacter player) {
		
		if(rand.nextInt(100) <= 1) {
			damage = -9999;
			System.out.println("It seems that Truck-Kun has claimed another victim, the demon get's Isekai'd into another world");
		}
		else {
		
 		damage = (int)(player.getEdginess() * -2.5);
 		System.out.println("Damage:" + damage);
 		
		}
		
		return damage;
 		
 	
	}


}
