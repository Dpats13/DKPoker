package dkpoker.main.game;

public class Card {
	
	private String value;
	private String suit;
	
	public Card(){
		this.value = "";	
		this.suit = "";
	}
	
	public Card(String value, String suit, String loc) {
		this.value = value;	
		this.suit = suit;
	}
	
	public String toString() {
		return value + " of " + suit;
	}

}
