package dkpoker.main.game;

public class Card {
	
	private String value;
	private String suit;
	
	public Card() {
		this.value = "";	
		this.suit = "";
	}
	
	public Card(String value, String suit) {
		this.value = value;	
		this.suit = suit;
	}
	
	@Override
	public String toString() {
		return value + " of " + suit;
	}

}
