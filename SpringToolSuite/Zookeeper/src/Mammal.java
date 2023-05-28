
public class Mammal {
	private int energyLevel = 100;
	
	public Mammal() {};
	
	
	public void displayEnergy() {
		System.out.println("Energy level is " + energyLevel);
	}
	
	
	
	public Integer getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(Integer energyLevel) {
		this.energyLevel = energyLevel;
	}
}
