package dkpoker.main.game;

public class Card {
	
	private String value;
	private String suit;
	private String loc;
	
	public Card(String value, String suit, String loc) {
		this.value = value;	
		this.suit = suit;
		this.loc = loc;
	}
	
	public String toString() {
		return value + " of " + suit + " located in " + loc;
	}
	
}
