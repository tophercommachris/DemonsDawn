package pc;

import java.util.Scanner;
import java.util.ArrayList;
import items.Item;

public class OldPLayerCharacter {
	 
	 /*
	  
	  Stats statCreator = new StatBuilder()
			.setMaxHealth(50)
			.setMaxMana(20)
			.setGoldAmount(5)
			.setBuffness(10)
			.setFriskiness(10)
			.setBrainpower(10)
			.setEdginess(10)
			.setLuck(1) 
			.setMagicResist(0)
			.setPhysicalResist(0)
			.build();
			*/
	
	ArrayList<Item> items = new ArrayList<Item>();
	
	int maxHealth;
	int currentHealth;
	int currentMana;
	int maxMana;
	int classCode;
	String name;
	String title;
	String desc;
	
	
	int location;
	int playerNum;
	

	//Creates a name and title for the wizard
		public void createNameTitle() {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please, enter a name for your champion: ");
			name = scanner.nextLine();
			System.out.print("\nNow, enter a title for your champion: ");
			title = scanner.nextLine();	
			this.name=name;
			this.title = title;
			
			
		}
		
		
		//Returns a string array to use for grabbing name and title
		public String[] getNameTitle() {
			String[] nameTitle = new String[2];
			nameTitle[0] = this.name;
			nameTitle[1] = this.title;
			
			return nameTitle;
		}
		
		
		
		//Changes the current health of the character
		public void changeHealth(int change) {
			
			if (currentHealth + change > change)
				currentHealth = maxHealth;
			else if (currentHealth + change < 0)
				currentHealth = 0;
			else
			currentHealth += change;
		}
		
		public void changeHealthMaximum(int change) {
			maxHealth += change;
			currentHealth += change;
		}
		
		//Changes the current mana for the character
		public void changeMana(int change) {
			
			if (currentMana + change > change)
				currentMana = maxMana;
			else if (currentMana + change < 0)
				currentMana = 0;
			else
			currentMana += change;
		}
		
		public void changeManaMaximum(int change) {
			maxMana += change;
			currentMana += change;
		}
		
		
		//Grabs the health of the character and health maximum
		public int[] getHealth() {
			int[] maxCurrent = new int[2];
			
			maxCurrent[0] = maxHealth;
			maxCurrent[1] = currentHealth;
			
			return maxCurrent;
		}
		
		//Grabs the mana of the character
		public int[] getMana() {
			int[] maxCurrent = new int[2];
			maxCurrent[0] = maxMana;
			maxCurrent[1] = currentMana;
			return maxCurrent;
		}

		
		public void addItem(Item item) {
			items.add(item);
			
		} 
		
		public void displayItems() {
		
			for (int i = 0; i < items.size(); i++) {
				
				System.out.println(items.get(i).getInfo());			
		}
			
		} 
	
	
}
