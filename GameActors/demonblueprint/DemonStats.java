package demonblueprint;

public class DemonStats {
	
	protected int maxHealth;
	protected int maxMana;
	protected int currentHealth;
	protected int currentMana;
	protected int goldAmount;
	protected int buffness;
	protected int friskiness;
	protected int brainpower;
	protected int edginess;
	protected int luck;
	protected int fireResist;
	protected int lightningResist;
	protected int iceResist;
	protected int physicalResist;
	protected int xp;
	protected int maxXP = 10;
	protected int level = 1;



	public DemonStats() {
		
	}
	
	public DemonStats(int maxHealth, int maxMana, int currentHealth, int currentMana,
					   int buffness, int friskiness, int brainpower, int edginess, int luck,
					   int fireResist, int lightningResist, int iceResist, int physicalResist, int xp) {
		
		this.maxHealth = maxHealth;
		this.maxMana = maxMana;
		this.currentHealth = currentHealth;
		this.currentMana = currentMana;
		
		this.buffness = buffness;
		this.friskiness = friskiness;
		this.brainpower = brainpower;
		this.edginess = edginess;
		this.luck = luck;
		this.fireResist = fireResist;
		this.lightningResist = lightningResist;
		this.iceResist = iceResist;
		this.physicalResist = physicalResist;
		this.xp = xp;
		
	}

}
