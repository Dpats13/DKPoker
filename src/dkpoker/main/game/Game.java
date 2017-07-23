package dkpoker.main.game;

import java.util.Scanner;

public class Game {
	private Player[] players;
	private Deck deck;
	private Card[] theFlop;
	private Card theTurn;
	private Card theRiver;
	private int pot;
	private int numberOfPlayers;
	private Scanner scanner = new Scanner(System.in);
	
	public Game() {
		this.players = new Player[5];
		this.deck = new Deck();
		this.theFlop = new Card[3];
		theFlop[0] = new Card();
		theFlop[1] = new Card();
		theFlop[2] = new Card();
		this.theTurn = new Card();
		this.theRiver = new Card();
	}

	public void start() {
		System.out.println("Welcome to Dan and Kyle's Bullshit Poker!\n");
		System.out.println("Let's get started!\n");
		createPlayers();
		startGame();
		for (int i = 0; i < this.numberOfPlayers; i++) {
			if (players[i] != null) {
				System.out.println(players[i].displayPlayer());
			}
		}
		displayGameStats();
		for (int i = 0; i < this.numberOfPlayers; i++) {
			rankHand(players[i]);
		}
		this.scanner.close();
	}

	public void startGame() {
		while (numberOfPlayersWithMoney() > 1) {
			dealPhase();
			flopPhase();
			turnPhase();
			riverPhase();
			comparePhase();
			winPhase();
			resetPhase();
		}
	}

	public void betting() {
		System.out.println("How many money to bet?\n");
		int bet = this.scanner.nextInt();
		System.out.println(bet + "\n");
	}

	public void dealPhase() { // deal
		deck.shuffle();
		dealHands();
		betting();
	}

	public void flopPhase() { // the flop
		dealFlop();
		betting();
	}

	public void turnPhase() { // the turn
		dealTurn();
		betting();
	}

	public void riverPhase() { // the river
		dealRiver();
		betting();
	}

	public void comparePhase() { // compare cards

	}

	public void winPhase() { // the pot

	}

	public void resetPhase() { // reset for next round
		for (int i = 0; i < this.numberOfPlayers; i++) {
			if (players[i] == null || players[i].getMoney() <= 0) {
				players[i] = null;
			} else {

				players[i].setCurrentHandIndex(2);
				players[i].setMoney(players[i].getMoney() - 10);
				if (players[2] != null)
					players[2].setMoney(players[2].getMoney() - 15);
			}
		}
		this.setPot(0);
		this.deck.setTopOfDeck(0);

	}

	public void setPot(int pot) {
		this.pot = pot;
	}

	public void displayGameStats() {
		displayFlop();
		displayTurn();
		displayRiver();
	}

	public void addToPot(int bet) {
		this.pot = this.pot + bet;
	}

	public int getPot() {
		return this.pot;
	}

	public void dealHands() {
		for (int i = 0; i < numberOfPlayers; i++) {
			if (players[i] != null) {
				Card[] cards = new Card[7];
				cards[0] = deck.deal();
				cards[1] = deck.deal();
				this.players[i].setHand(cards);
			}
		}
	}

	public void dealFlop() {
		Card cards[] = new Card[] { deck.deal(), deck.deal(), deck.deal() };
		this.theFlop = cards;
		// now add to players hand
		for (int i = 0; i < numberOfPlayers; i++) {
			for (int cardsIndex = 0; cardsIndex < cards.length; cardsIndex++) {
				if (players[i] != null) {
					players[i].addToHand(cards[cardsIndex]);
				}
			}
		}
	}

	public void dealTurn() {
		this.theTurn = deck.deal();
		// now add to players hand
		for (int i = 0; i < numberOfPlayers; i++) {
			if (players[i] != null) {
				players[i].addToHand(this.theTurn);
			}
		}
	}

	public void dealRiver() {
		this.theRiver = deck.deal();
		// now add to players hand
		for (int i = 0; i < numberOfPlayers; i++) {
			if (players[i] != null) {
				players[i].addToHand(this.theRiver);
			}
		}
	}

	public void displayFlop() {
		System.out.println(
				"The Flop: " + theFlop[0].toString() + ", " + theFlop[1].toString() + ", " + theFlop[2].toString());
	}

	public void displayRiver() {
		System.out.println("The River: " + theRiver.toString());
	}

	public void displayTurn() {
		System.out.println("The Turn: " + theTurn.toString());
	}

	public void clearRound() {
		this.pot = 0;
		theFlop = new Card[3];
		theTurn = new Card();
		theRiver = new Card();
	}

	public void createPlayers() {
		System.out.println("How many Players are there?\n");
		this.numberOfPlayers = scanner.nextInt();
		for (int i = 0; i < this.numberOfPlayers; i++) {
			System.out.println("Player " + (i + 1) + ": What is your name?\n");
			players[i] = new Player();
			players[i].setName(scanner.next());
		}
	}

	public void rankHand(Player player) {
		String hand = "";
		if(player != null){
			for (int i = 0; i < player.getHand().length; i++) {
			hand += player.getHand()[i].toString();
				if (i < 6){
					hand += ", ";
				}
			}
			System.out.println(player.getName() + "'s" + " hand: " + hand);
		}
	}

	public int numberOfPlayersWithMoney() {
		int playersWithMoney = 0;
		for (int i = 0; i < this.numberOfPlayers; i++) {
			if (players[i] != null && players[i].getMoney() > 0) {
				playersWithMoney++;
			}
		}
		return playersWithMoney;
	}

}
