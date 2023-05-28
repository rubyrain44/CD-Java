
public class Gorilla extends Mammal {
	
	public void throwThings() {
		setEnergyLevel(getEnergyLevel() - 5);
		System.out.println("Take that!");
	}
	
	public void eatBananas() {
		setEnergyLevel(getEnergyLevel() + 10);
		System.out.println("Nummy nana!");
	}
	
	public void climb() {
		setEnergyLevel(getEnergyLevel() - 10);
		System.out.println("Up up!");
	}
}
