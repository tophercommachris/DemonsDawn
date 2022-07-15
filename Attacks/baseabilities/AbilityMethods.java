package baseabilities;
import pc.PlayerCharacter;

public interface AbilityMethods {
	
	public void callAbility(PlayerCharacter player);
	public void calculateDamageOrHealing(PlayerCharacter player);
	public void determineAbilityMethod();
	public void alterStats(PlayerCharacter player);
	public void delayedCast();
	public int displayValues(PlayerCharacter player);

}
