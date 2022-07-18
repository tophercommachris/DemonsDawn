package edgelord;
import baseabilities.*;
import java.util.HashMap;
import java.util.Map;

public class EdgelordAbilityBuilder {
	
	HashMap<Integer, Ability> edgelordAbilities = new HashMap<>(20);
	
	public EdgelordAbilityBuilder() {	
	edgelordAbilities.put(0, new BasicAttack("buffness"));
	edgelordAbilities.put(1, new Hmmph());
	edgelordAbilities.put(2, new TruckKun());
	}
	
	
	
	public HashMap<Integer, Ability> initializeAbilities() {
		
		return edgelordAbilities;
	}

	
	
	
	

}
