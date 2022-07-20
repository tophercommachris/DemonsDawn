package spellblade;

import baseabilities.Ability;
import baseabilities.BasicAttack;

import java.util.ArrayList;
import java.util.HashMap;

import pc.PlayerCharacter;

public class SBAbilityBuilder {

	HashMap<Integer, Ability> spellbladeAbilities = new HashMap<>(20);
	
	public SBAbilityBuilder() {
		
		spellbladeAbilities.put(0, new BasicAttack("friskiness"));
		spellbladeAbilities.put(1, new Ghostblade());
	
	}
	
	public HashMap<Integer, Ability> initializeAbilities() {
		
		return spellbladeAbilities;
	}


	



}
