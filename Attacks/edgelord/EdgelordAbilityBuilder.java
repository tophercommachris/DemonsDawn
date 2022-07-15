package edgelord;
import baseabilities.Ability;
import java.util.HashMap;
import java.util.Map;

public class EdgelordAbilityBuilder {
	
	HashMap<Integer, Ability> edgelordAbilities = new HashMap<>(20);
	
	public EdgelordAbilityBuilder() {	
	edgelordAbilities.put(0, new Hmmph());
	edgelordAbilities.put(1, new TruckKun());
	}
	
	
	
	public HashMap<Integer, Ability> initializeAbilities() {
		
		return edgelordAbilities;
	}

	
	
	
	

}
