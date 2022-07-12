package items;

public class ItemHealthAmulet extends Item {
	
	public ItemHealthAmulet() {
		name = "Health Amulet";
		desc = "A golden necklace with a ruby embedded in the center, shaped like a heart.  You feel a strange invigoration from it.";
		purpose = "Increases health by 30 points";
		itemNature = "buffing";
		
		starValue = 1;
		passive = true;
	}
	
	

}
