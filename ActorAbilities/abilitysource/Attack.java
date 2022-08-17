package abilitysource;

/*
 * Class used to indicate the ability is an attack. It is important that damage values are NEGATIVE.
 */

public class Attack extends BaseAbility {
	
	@Override
	public boolean determineHitOrMiss() {
		
		if (getHitNumber() <= baseHitChance)
			return true;
		else
			return false;
	}

	
	
}
