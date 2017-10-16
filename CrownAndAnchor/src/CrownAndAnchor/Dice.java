package CrownAndAnchor;

public class Dice {
			
	private DiceValue value;
	
	public Dice() {
		value =  DiceValue.getRandom();
	}
	
	public DiceValue getValue() {
		this.value = DiceValue.getRandom();
		return value;
	}

	public DiceValue roll() {
		return DiceValue.getRandom();
	}		
	
	public String toString() {
		return value.toString();
	}
}
