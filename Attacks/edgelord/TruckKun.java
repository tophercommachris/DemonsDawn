package edgelord;

import baseabilities.Ability;
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
		altersStats = false;
		magicDamage = false;
		instantKillChance = true;
		
		manaCost = 10;
		damage = 0;
		restoration = 0;
		baseHitChance = .95;
		abilityCooldown = 6;
		abilityDuration = 0;
		
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
	public void calculateDamageOrHealing(PlayerCharacter player) {
		
		if(rand.nextInt(100) <= 5) {
			damage = -9999;
			System.out.println("It seems that Truck-Kun has claimed another victim, the demon vaporizes into another world");
		}
		else {
		
 		damage = (int)(player.getEdginess() * -2.5);
 		System.out.println("Damage:" + damage);
 		
		}
 		
 	
	}


}
