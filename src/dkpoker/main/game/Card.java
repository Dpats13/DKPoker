package dkpoker.main.game;

public class Card {
	
	private String value;
	private String suit;
	
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public Card(){
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
