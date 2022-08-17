package abilitysource;

import java.util.ArrayList;

import demonblueprint.BaseDemon;
import playercharacter.BasePlayerCharacter;

public class StatusEffect extends BaseAbility {
	
	@Override
	public void checkBuffDebuffDuration(BasePlayerCharacter player) {
		ArrayList<BaseAbility> buffDebuffs = player.getbuffDebuffs();
		
		for (int i = 0; i < buffDebuffs.size(); i++) {
			System.out.println(buffDebuffs.get(i).getAbilityName());
			System.out.print("- " + buffDebuffs.get(i).getDuration());
		}
	}
	
	@Override
	public void deincrementStatusEffect(BaseAbility statusEffect) {
		
		statusEffect.durationChange(-1);
	
	}
	
	


}
