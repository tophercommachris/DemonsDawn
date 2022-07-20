package baseabilities;
import demons.Demon;
import pc.PlayerCharacter;

public interface AbilityMethods {
	
	public void callAbility(PlayerCharacter player, Demon demon);
	public void callAbility(PlayerCharacter player);
	public int calculateDamageOrHealing(PlayerCharacter player);
	public void determineAbilityMethod();
	public void alterStats(PlayerCharacter player);
	public void delayedCast();
	public int displayValues(PlayerCharacter player);

} 
