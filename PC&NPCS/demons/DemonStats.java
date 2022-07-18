package demons;
/*
 * The only difference between the stats for PlayerCharacter and for Demon is that Demon handles XP by giving XP upon death
 */


public class DemonStats {

	protected int maxHealth;
	protected int maxMana;
	protected String name;
	protected String desc;
	protected int currentHealth;
	protected int currentMana;
	protected int buffness;
	protected int friskiness;
	protected int brainpower;
	protected int edginess;
	protected int luck;
	protected int magicResist;
	protected int physicalResist;
	protected int xp;
	protected int level;
	
	public DemonStats(int maxHealth, int maxMana, int currentHealth, int currentMana, int buffness,
			int friskiness, int brainpower, int edginess, int luck,
			int magicResist, int physicalResist, int xp) {
		
		
		this.maxHealth = maxHealth;
		this.maxMana = maxMana;
		this.currentHealth = currentHealth;
		this.currentMana = currentMana;
		this.buffness = buffness;
		this.friskiness = friskiness;
		this.brainpower = brainpower;
		this.edginess = edginess;
		this.luck = luck;
		this.magicResist = magicResist;
		this.physicalResist = physicalResist;
		this.xp = xp;
		
	}
	
	
	
}
