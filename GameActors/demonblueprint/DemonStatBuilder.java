package demonblueprint;

public class DemonStatBuilder {
	
	private int maxHealth;
	private int maxMana;
	private int currentHealth;
	private int currentMana;
	private int buffness;
	private int friskiness;
	private int brainpower;
	private int edginess;
	private int luck;
	private int fireResist;
	private int lightningResist;
	private int iceResist;
	private int physicalResist;
	private int xp;
	
	public DemonStatBuilder setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		return this;
}
	
	public DemonStatBuilder setMaxMana(int maxMana) {
		this.maxMana = maxMana;
		return this;
	}
	
	public DemonStatBuilder setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		return this;
	}
	
	public DemonStatBuilder setCurrentMana(int currentMana) {
		this.currentMana = currentMana;
		return this;
	}
	
	
	public DemonStatBuilder setBuffness(int buffness) {
		this.buffness = buffness;
		return this;
	}
	
	public DemonStatBuilder setFriskiness(int friskiness) {
		this.friskiness = friskiness;
		return this;
	}
	
	public DemonStatBuilder setBrainpower(int brainpower) {
		this.brainpower = brainpower;
		return this;
	}
	
	public DemonStatBuilder setEdginess(int edginess) {
		this.edginess = edginess;
		return this;
	}
	
	public DemonStatBuilder setLuck(int luck) {
		this.luck = luck;
		return this;
	}
	
	public DemonStatBuilder setFireResist(int fireResist) {
		this.fireResist = fireResist;
		return this;
	}
	
	public DemonStatBuilder setLightningResist(int lightningResist) {
		this.lightningResist = lightningResist;
		return this;
	}
	
	public DemonStatBuilder setIceResist(int iceResist) {
		this.iceResist = iceResist;
		return this;
	}
	
	public DemonStatBuilder setPhysicalResist(int physicalResist) {
		this.physicalResist = physicalResist;
		return this;
	}
	
	public DemonStatBuilder setXp(int xp) {
		this.xp = xp;
		return this;
	}
	
	public DemonStats build() {
		return new DemonStats(maxHealth, maxMana, currentHealth, currentMana, buffness,
				friskiness, brainpower, edginess, luck, fireResist, lightningResist, iceResist,
				physicalResist, xp);
	}

}
