package edgelord;

import java.util.HashMap;

import abilitysource.BaseAbility;
import edgelord.*;

public class EdgelordAbilityBuilder {
	
	HashMap<Integer, BaseAbility> abilityMap = new HashMap<Integer, BaseAbility>();
	
	public EdgelordAbilityBuilder() {
		abilityMap.put(0, new Attack_TruckKun());
		abilityMap.put(1, new Buff_Hmmph());
		abilityMap.put(2, new Heal_PowerOfFriendship());
		
	}
	
	public HashMap<Integer, BaseAbility> getAbilities() {
		return abilityMap;
	}

}
