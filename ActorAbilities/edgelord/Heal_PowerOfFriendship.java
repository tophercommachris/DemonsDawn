package edgelord;

import abilitysource.Healing;
import playercharacter.BasePlayerCharacter;

public class Heal_PowerOfFriendship extends Healing{
	
	public Heal_PowerOfFriendship() {
		desc = "The power of friendship motivates you to move on.  You heal a number of hitpoints equal to your edginess";
		flavor = "You flashback to all of your friends, giving you the strength to carry on.  The wounds are still there, you're just happy now";
		name = "The Power of Friendship";
		ID = "poweroffriendship";
		scalingStat = "edginess";
		abilityType = "healing";
		manaCost = -5;
		abilityCooldown = 5;
		abilityDuration = 0;
	}
	
	public void activateAbility(BasePlayerCharacter player) {
		System.out.println(flavor);
		
		healing = calculateHealing(player);
		System.out.println("HEALING: " + healing);
		player.changeCurrentHealth(healing);
	}
	
	@Override
	public int calculateHealing(BasePlayerCharacter player) {
		healing = player.getEdginess();
		
		return healing;
	}

}
