package dkpoker.main.game;
public class Deck {
	private Card deck[];
	private int topOfDeck;
	private String[] values; 
	
	public Deck() {
		deck = new Card[52];
		values = new String[] {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
		generateDiamonds();
		generateHearts();
		generateClubs();
		generateSpaids();
		topOfDeck = 0;
	}
	
	private void generateDiamonds() {
		int count = 0;
		for (int i = 0; i < 13; i++) {
			deck[i] = new Card(values[count], "Diamonds", "Deck");
			count++;
		}
	}
	
	private void generateHearts() {
		int count = 0;
		for (int i = 13; i < 26; i++) {
			deck[i] = new Card(values[count], "Hearts", "Deck");
			count++;
		}
	}
	
	private void generateClubs() {
		int count = 0;
		for (int i = 26; i < 39; i++) {
			deck[i] = new Card(values[count], "Clubs", "Deck");
			count++;
		}
	}
	
	private void generateSpaids() {
		int count = 0;
		for (int i = 39; i < 52; i++) {
			deck[i] = new Card(values[count], "Spaids", "Deck");
			count++;
		}
	}
	
	public Card[] getDeck() {
		return deck;
	}
}
