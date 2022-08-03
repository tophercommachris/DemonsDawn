package playercharacter;


public class PlayerStatBuilder {
	
	private int maxHealth;
	private int maxMana;
	private int currentHealth;
	private int currentMana;
	private int goldAmount;
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
	
	public PlayerStatBuilder setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
		return this;
}
	
	public PlayerStatBuilder setMaxMana(int maxMana) {
		this.maxMana = maxMana;
		return this;
	}
	
	public PlayerStatBuilder setCurrentHealth(int currentHealth) {
		this.currentHealth = currentHealth;
		return this;
	}
	
	public PlayerStatBuilder setCurrentMana(int currentMana) {
		this.currentMana = currentMana;
		return this;
	}
	
	public PlayerStatBuilder setGoldAmount(int goldAmount) {
		this.goldAmount = goldAmount;
		return this;
	}
	
	public PlayerStatBuilder setBuffness(int buffness) {
		this.buffness = buffness;
		return this;
	}
	
	public PlayerStatBuilder setFriskiness(int friskiness) {
		this.friskiness = friskiness;
		return this;
	}
	
	public PlayerStatBuilder setBrainpower(int brainpower) {
		this.brainpower = brainpower;
		return this;
	}
	
	public PlayerStatBuilder setEdginess(int edginess) {
		this.edginess = edginess;
		return this;
	}
	
	public PlayerStatBuilder setLuck(int luck) {
		this.luck = luck;
		return this;
	}
	
	public PlayerStatBuilder setFireResist(int fireResist) {
		this.fireResist = fireResist;
		return this;
	}
	
	public PlayerStatBuilder setLightningResist(int lightningResist) {
		this.lightningResist = lightningResist;
		return this;
	}
	
	public PlayerStatBuilder setIceResist(int iceResist) {
		this.iceResist = iceResist;
		return this;
	}
	
	public PlayerStatBuilder setPhysicalResist(int physicalResist) {
		this.physicalResist = physicalResist;
		return this;
	}
	
	public PlayerStatBuilder setXp(int xp) {
		this.xp = xp;
		return this;
	}
	
	public PlayerStats build() {
		return new PlayerStats(maxHealth, maxMana, currentHealth, currentMana, goldAmount, buffness,
				friskiness, brainpower, edginess, luck, fireResist, lightningResist, iceResist,
				physicalResist, xp);
	}

}
