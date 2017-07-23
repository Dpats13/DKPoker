package dkpoker.main.game;

public class Game {
	private Player[] players;
	private Deck deck;
	private Card[] theFlop;
	private Card theTurn;
	private Card theRiver;
	private int pot;
	
	public Game(){
		this.players = new Player[2];
		players[0] = new Player();
		players[1] = new Player();
		this.deck = new Deck();
		this.theFlop = new Card[3];
		theFlop[0] = new Card();
		theFlop[1] = new Card();
		theFlop[2] = new Card();
		this.theTurn = new Card();
		this.theRiver = new Card();
		System.out.println(this.theFlop[0].toString());
		System.out.println(this.players[0].getName());
		
	}
	
	public void startGame(){
		System.out.println("Shuffled Deck: ");
		deck.shuffle();
		deck.displayDeck();
		dealHands();
		System.out.println("Player 1s hand: " + players[0].displayHand());
		System.out.println("Player 2s hand: " + players[1].displayHand());
		dealFlop();
		deck.displayDeck();
		dealTurn();
		deck.displayDeck();
		dealRiver();
		deck.displayDeck();
	}
	
	public void addToPot(int bet){
		this.pot = this.pot + bet;
	}
	
	public int getPot(){
		return this.pot;
	}
	
	public void dealHands(){
		Card[] cards = new Card[2];
		for (int i = 0; i < players.length; i++){
			cards = new Card[]{deck.deal(), deck.deal()};
			this.players[i].setHand(cards);
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
