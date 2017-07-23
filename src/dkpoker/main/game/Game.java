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
		
	}
	
	public void addToPot(int bet){
		this.pot = this.pot + bet;
	}
	public int getPot(){
		return this.pot;
	}
	public void emptyPot(){
		this.pot = 0;
	}
	
	
	
	
}
