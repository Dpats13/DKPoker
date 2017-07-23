package dkpoker.main.game;

public class Deck {
	private Card deck[];
	private int topOfDeck;
	
	public Deck(){
		deck = new Card[52];
		topOfDeck = 0;
	}
}
