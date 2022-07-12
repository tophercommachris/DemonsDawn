package demons;

public class Slaughterblug extends Demon{
	
	public Slaughterblug() {
	stats = new DemonStatBuilder()
			.setMaxHealth(10)
			.setMaxMana(5)
			.setCurrentHealth(10)
			.setCurrentMana(5)
			.setBuffness(4)
			.setFriskiness(15)
			.setBrainpower(2)
			.setEdginess(1)
			.setLuck(1)
			.setMagicResist(0)
			.setPhysicalResist(0)
			.setXp(5)
			.build();
	
		name = "Slaughterblug";
		desc = "Slimy demons, mostly composed of decomposing corpses the swallow into thier body. They are known for their deceptive speed";
	}
			

}
