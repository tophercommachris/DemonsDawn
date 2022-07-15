package spellblade;

import baseabilities.Ability;
import java.util.ArrayList;

import pc.PlayerCharacter;

public class SBAbilityCreator {
	
	ArrayList<Ability> abilities= new ArrayList<Ability>();
	PlayerCharacter player;
	Ghostblade ghostblade;
	DeadWail deadwail;
	FortifyMind fortifymind;
	ShadowCloak shadowcloak;
	
	public SBAbilityCreator(PlayerCharacter player) {
		this.player = player;
		ghostblade = new Ghostblade(player);
		
	}
	

	



}
