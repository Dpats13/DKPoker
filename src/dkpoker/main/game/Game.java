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
		
	}
	
	public void startGame(){
		System.out.println("Shuffled Deck: ");
		deck.shuffle();
		deck.displayDeck();
		dealHands();
		System.out.println("Player 1s hand: " + players[0].displayHand());
		System.out.println("Player 2s hand: " + players[1].displayHand());
		dealFlop();
		displayFlop();
		dealTurn();
		displayTurn();
		dealRiver();
		displayRiver();
		rankHand(players[0]);
		rankHand(players[1]);
	}
	
	public void addToPot(int bet){
		this.pot = this.pot + bet;
	}
	
	public int getPot(){
		return this.pot;
	}
	
	public void dealHands(){
		for (int i = 0; i < players.length; i++){
			Card[] cards = new Card[7];
			cards[0] = deck.deal();
			cards[1] = deck.deal();
			System.out.println("card 0: " + cards[0] + " card 1: " + cards[1]);
			this.players[i].setHand(cards);
		}
	}
	
	public void dealFlop(){
		Card cards[] = new Card[]{deck.deal(), deck.deal(), deck.deal()};
		this.theFlop = cards;
		//now add to players hand
		for (int i = 0; i < players.length; i++) {
			for (int cardsIndex = 0; cardsIndex < cards.length; cardsIndex++) {
				players[i].addToHand(cards[cardsIndex]);
			}
		}
	}
	
	public void dealTurn(){
		this.theTurn = deck.deal();
		//now add to players hand
		for (int i = 0; i < players.length; i++) {
			players[i].addToHand(this.theTurn);
		}
	}
	
	public void dealRiver(){
		this.theRiver = deck.deal();
		//now add to players hand
		for (int i = 0; i < players.length; i++) {
			players[i].addToHand(this.theRiver);
		}
	}
	
	public void displayFlop() {
		System.out.println("The Flop: " + theFlop[0].toString() + ", " + theFlop[1].toString() + ", " + theFlop[2].toString());
	}
	
	public void displayRiver() {
		System.out.println("The River: " + theRiver.toString());
	}
	
	public void displayTurn() {
		System.out.println("The Turn: " + theTurn.toString());
	}
	
	public void clearRound(){
		this.pot = 0;
		theFlop = new Card[3];
		theTurn = new Card();
		theRiver = new Card();
	}
	
	public void rankHand(Player player) {
		String hand = "";
		for (int i = 0; i < player.getHand().length; i++) {
			hand += player.getHand()[i].toString() + ", ";
		}
		System.out.println(player.getName() + "'s" + " hand: " + hand);
	}
	
}
