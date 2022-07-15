package demons;

import java.util.HashMap;

public class DemonInitializier {
	
	HashMap<String, Demon> demonID = new HashMap<>();
	
	public DemonInitializier() {
		demonID.put("slaughterblug", new Slaughterblug());
	}
	
	
	public HashMap<String, Demon> fillDemonMap() {
		return demonID;
	}

}
