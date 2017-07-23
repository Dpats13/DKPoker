package dkpoker.main.game;

public class Game {
	private Player players[] = new Player[2];
	private Deck deck = new Deck();
	private Card theFlop[] = new Card[3];
	private Card theTurn = new Card();
	private Card theRiver = new Card();
	private int pot;
	
	public Game(){
		players = new Player[2];
		deck = new Deck();
		theFlop = new Card[3];
		theTurn = new Card();
		theRiver = new Card();
	}
	
	public void startGame(){
		for (int i = 0; i < 52; i++) {
			System.out.println(deck.getDeck()[i].toString());
		}
		deck.displayDeck();
		System.out.println("Shuffled Deck: ");
		deck.shuffle();
		deck.displayDeck();
	}
	
	public void addToPot(int bet){
		this.pot = this.pot + bet;
	}
	
	public int getPot(){
		return this.pot;
	}
	
	public void dealHands(){
		Card cards[] = new Card[2];
		for (int i = 0; i < 2; i++){
		cards = new Card[]{deck.deal(), deck.deal()};
		players[i].setHand(cards);
		}
	}
	
	public void dealFlop(){
		Card cards[] = new Card[]{deck.deal(), deck.deal(), deck.deal()};
		this.theFlop = cards;
	}
	
	public void dealTurn(){
		this.theTurn = deck.deal();
	}
	
	public void dealRiver(){
		this.theRiver = deck.deal();
	}
	
	public void clearRound(){
		this.pot = 0;
		theFlop = new Card[3];
		theTurn = new Card();
		theRiver = new Card();
	}
	
}
