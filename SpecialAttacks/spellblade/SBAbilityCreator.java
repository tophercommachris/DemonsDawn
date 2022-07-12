package spellblade;

import baseabilities.Ability;
import java.util.ArrayList;

import pc.Stats;

public class SBAbilityCreator {
	
	ArrayList<Ability> abilities= new ArrayList<Ability>();
	Stats stats;
	Ghostblade ghostblade;
	DeadWail deadwail;
	FortifyMind fortifymind;
	ShadowCloak shadowcloak;
	
	public SBAbilityCreator(Stats stats) {
		this.stats = stats;
		ghostblade = new Ghostblade(stats);
		
	}
	

	



}
