package baseabilities;
import pc.PlayerCharacter;
import pc.Stats;

import java.util.ArrayList;

import demons.DemonStats;

public class Buff extends Ability{
	
	@Override
	public void deincrementTimer(PlayerCharacter player) {
		System.out.println("BUFF DURATION: " + buffDuration);
		buffDuration -= 1;
		checkBuff(player);
	}
	
	@Override
	public void checkBuff(PlayerCharacter player) {
		
		if (buffDuration <= 0) {
			
			reverseBuff(player);
		}
		
	}
	
	@Override
	public void reverseBuff(PlayerCharacter player) {
		buffAmount *= -1;
		for (int i = 0; i < alteredStats.size(); i++) {
			
			if (alteredStats.get(i).equals("buffness")) {
			
				player.changeBuffness(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("friskiness")) {
		
				player.changeFriskiness(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("brainpower")) {
		
				player.changeBrainpower(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("edginess")) {
			
				player.changeEdginess(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("luck")) {
			
				player.changeLuck(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("magicResist")) {
	
				player.changeMagicResist(buffAmount);
				
			}
			
			else if (alteredStats.get(i).equals("physicalResist")) {
			
				player.changePhysicalResist(buffAmount);
				
			}
			
		} //End For Loop
		
	} //End reverseBuff Method
	
	@Override
	public boolean buffActive() {
		if (buffDuration <= 0)
			return true;
		
		else
		return false;
	}
	
	

}
