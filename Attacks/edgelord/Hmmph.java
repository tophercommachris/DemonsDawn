package edgelord;

import baseabilities.Ability;
import baseabilities.Buff;
import demons.Demon;
import pc.PlayerCharacter;

public class Hmmph extends Buff{
	

	
	public Hmmph() {
		
		desc = "Scoff at your opponent, you know they can't harm you.  Increases your Physical and Magical Resistance by   for 2 rounds";
		flavor = "'Hmmph', you say with a smirk as they charge towards you.  Your glasses push up and turn white, you can read their every move.";
		name = "Hmmph";
		ID = "hmmph";
		scalingStat = "edginess";
		alteredStats.add("magicResist");
		alteredStats.add("physicalResist");
		instantCast = true;
		manaCost = 4;
		abilityCooldown = 2;
		buffDuration = 2;
		buffAmount = 0;
	

	}
	
	@Override
	public void callAbility(PlayerCharacter player) {
		System.out.println(flavor);
		player.addBuff(this);
		alterStats(player);
	}
	
	@Override
	public void alterStats(PlayerCharacter player) {
		buffAmount = player.getEdginess();
		player.changeMagicResist(buffAmount);
		player.changePhysicalResist(buffAmount);
		
	}

}
