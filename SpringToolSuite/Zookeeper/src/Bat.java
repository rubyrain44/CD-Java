
public class Bat extends Mammal {
	private int energyLevel = 300;
	
	public void fly() {
		System.out.println("SWOOP SWOOP!");
		setEnergyLevel(getEnergyLevel() - 25);
	}
	
	public void eatHuman() {
		System.out.println("DEAR GOD NO! -- Mm, tasty.");
		setEnergyLevel(getEnergyLevel() + 25);
	}
	
	public void attackTown() {
		System.out.println("OH GOD! EVERYTHINGS ON FIRE! THE TOWN IS ON FIRE! PROTECT THE WOMAN AND CHILDREN! DEAR GOOOODDDD! SAVE US ALL!");
		setEnergyLevel(getEnergyLevel() - 100);
	}
}
