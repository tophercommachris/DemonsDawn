/*
 * This attack is a hard hitting ability with an instant kill chance.  It also has a very high hit chance, but a very high mana cost to pair with it as well. 
 */

package edgelord;

import abilitysource.BaseAbility;
import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class Attack_TruckKun extends BaseAbility{
	
	public Attack_TruckKun() {
		desc = "You summon the very thing that sent you to this wretched world. Always does a flat 50 physical damage, with a 95% chance to hit";
		flavor = "The sound of the truck horn brings flashbacks to your mind of your simple life before this. The truck apparates and bolts for the demon, hoping to send it to another realm";
		name = "Truck-Kun";
		ID = "truckkun";
		scalingStat = "edginess";
		abilityType = "attack";
		manaCost = 10;
		physicalDamage = true;
		damage = 50;
		baseHitChance = .95;
		instantCast = true;
		
	}
	@Override
	public void activateAbility(BasePlayerCharacter player, BaseDemon demon) {
		System.out.println(flavor);
		
		hit = determineHitOrMiss();
		
		if (hit && determineInstantKill()) {
			System.out.println("Truck-Kun hits its mark, and the demon evaporates into another dimension... you feel... jealous");
		}
		
		else if (hit && !determineInstantKill()) {
			System.out.println("The truck clips the demon, not a head on impact, but enough to leave him wondering how the hell you did that");
			demon.changeCurrentHealth(calculateDamage(player));
		}
		
		else
			System.out.println("The truck misses, instead slamming into a wall and leaving a nasty hole in it.");
				
	}
	
	public int calculateDamage(BasePlayerCharacter player) {
		damage = 50;
		return damage;
	}
	
	@Override
	public boolean determineHitOrMiss() {
		setHitNumber(rand.nextInt(100)+1);
		
		if (getHitNumber() <= 95)
			return true;
		else
			return false;
	}
	
	
	//5% chance to instant kill with this ability
	@Override
	public boolean determineInstantKill() {
		instantKill = rand.nextInt(100)+1;
		
		if (instantKill >= 95)
			return true;
		
		else
		return false;
	}
	
	
	
	

}
