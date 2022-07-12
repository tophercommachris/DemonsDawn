package npcs;

abstract public class NPC {
	
		int health;
		int mana;
		String name;
		String desc;
		String title;

		abstract public void changeHealth(int change);

		abstract public void changeMana(int change);

		abstract public int getHealth();

		abstract public int getMana();



}
