package demons;
import demons.DemonStats;
import java.util.HashMap;
import java.util.ArrayList;

public class Demon {

	
	DemonStats stats;
	String name;
	String desc;
	HashMap<String, DemonAbilities> abilityMap = new HashMap<String, DemonAbilities>();
	
	
	
public void displayStats() throws InterruptedException {
		
		System.out.println(name + ": " + desc);
		System.out.println("Health: "  + stats.getCurrentHealth() + "/" + stats.getMaxHealth());
		System.out.println("Mana: " + stats.getCurrentMana() + "/" + stats.getMaxMana());
		System.out.println("Buffess: " + stats.getBuffness());
		System.out.println("Friskiness: " + stats.getFriskiness());
		System.out.println("Brainpower: " + stats.getBrainpower());
		System.out.println("Edginess: " + stats.getEdginess());
		System.out.println("Luck: " + stats.getLuck());
		System.out.println("Magic Resistance: " + stats.getMagicResist());
		System.out.println("Physical Resistance: " + stats.getPhysicalResist());
		//Thread.sleep(3000);
		
	}
	
	
	
}
