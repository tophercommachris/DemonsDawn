/* This class uses the Builder Design pattern in order to simplify using the different constructors for the player classes
 * This class allows you to use a format for setting the stats if you are creating a new class, examples of how to set the stats of a new class
 * can be found in any of the pickable classes, such as Edgelord.java, Fool.java, Godfather.java or SpellBlade.java
 */


package pc;
public class StatBuilder {
			
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
		private int magicResist;
		private int physicalResist;
		private int xp;
		

			public StatBuilder setMaxHealth(int maxHealth) {
				this.maxHealth = maxHealth;
				return this;
		}
			
			public StatBuilder setMaxMana(int maxMana) {
				this.maxMana = maxMana;
				return this;
			}
			
			public StatBuilder setCurrentHealth(int currentHealth) {
				this.currentHealth = currentHealth;
				return this;
			}
			
			public StatBuilder setCurrentMana(int currentMana) {
				this.currentMana = currentMana;
				return this;
			}
			
			public StatBuilder setGoldAmount(int goldAmount) {
				this.goldAmount = goldAmount;
				return this;
			}
			
			public StatBuilder setBuffness(int buffness) {
				this.buffness = buffness;
				return this;
			}
			
			public StatBuilder setFriskiness(int friskiness) {
				this.friskiness = friskiness;
				return this;
			}
			
			public StatBuilder setBrainpower(int brainpower) {
				this.brainpower = brainpower;
				return this;
			}
			
			public StatBuilder setEdginess(int edginess) {
				this.edginess = edginess;
				return this;
			}
			
			public StatBuilder setLuck(int luck) {
				this.luck = luck;
				return this;
			}
			
			public StatBuilder setMagicResist(int magicResist) {
				this.magicResist = magicResist;
				return this;
			}
			
			public StatBuilder setPhysicalResist(int physicalResist) {
				this.physicalResist = physicalResist;
				return this;
			}
			
			public StatBuilder setXp(int xp) {
				this.xp = xp;
				return this;
			}
			
			public Stats build() {
				return new Stats(maxHealth, maxMana, currentHealth, currentMana, goldAmount, buffness,
						friskiness, brainpower, edginess, luck, magicResist,
						physicalResist, xp);
			}
	
} //End StatBuilder Class


