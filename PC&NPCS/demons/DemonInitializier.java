package demons;

import java.util.HashMap;

public class DemonInitializier {
	
	HashMap<String, Demon> demonID = new HashMap<>();
	
	public DemonInitializier() {
		demonID.put("slaughterblug", new Slaughterblug());
		demonID.put("yecheolus", new Yecheolus());
	}
	
	
	public HashMap<String, Demon> fillDemonMap() {
		return demonID;
	}

}
