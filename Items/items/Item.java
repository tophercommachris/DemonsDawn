package items;

public class Item {
	
	String[] info = new String[4];
	
	public String name;
	public String desc;
	public String purpose;
	public String itemNature; //Item nature being damaging, buffing, or cursing
	
	public int starValue = 1; //1 - 5 Star Rating.  By default all items are 1-star
	public int charges = 1; //If applicable, how many times you can use an item before it is useless.  By default all items have one charge, if they reach 0, item is deleted
	public int itemNumber; //Keeps track of the position of the item in the backpack for indexing purposes
	
	public boolean potion = false; //If this is true, will set it up as a one time use.  By default an item is not a potion.
	public boolean passive = false; //If the item is a passive benefit, or active.  By default, all items are active unless this is true
	
	public String[] getInfo() {
		
		info[0] = name;
		info[1] = desc;
		info[2] = purpose;
		info[3] = itemNature;
		return info;
	}

}