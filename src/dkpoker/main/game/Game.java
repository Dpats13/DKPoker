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
	
	public void start(){
		System.out.println("Welcome to Dan and Kyle's Bullshit Poker!\n");
		System.out.println("Let's get started!\n");
		createPlayers();
		startGame();
		System.out.println(players[0].displayPlayer());
		System.out.println(players[1].displayPlayer());
		displayGameStats();
		rankHand(players[0]);
		rankHand(players[1]);
	}
	
	public void startGame(){
		System.out.println(numberOfPlayersWithMoney());
		while (numberOfPlayersWithMoney() > 1){
			phase0();
			phase1();
			phase2();
			phase3();
			phase4();
			phase5();
			phase6();
		}
	}
	
	public void betting(){
		
	}
	
	public void phase0(){ //deal
		deck.shuffle();
		dealHands();
		betting();
	}
	
	public void phase1(){ //the flop
		dealFlop();
		betting();
	}
	public void phase2(){ //the turn
		dealTurn();
		betting();
	}
	
	public void phase3(){ //the river
		dealRiver();
		betting();
	}
	
	public void phase4(){ //compare cards
		
	}
	
	public void phase5(){ //the pot
		
	}
	
	public void phase6(){ //reset for next round
		for (int i = 0; i < this.numberOfPlayers; i++){
			players[i].setCurrentHandIndex(2);
			players[i].setMoney(players[i].getMoney()-10);
		}
		this.deck.setTopOfDeck(0);
		
	}
	
	public void displayGameStats(){
		displayFlop();
		displayTurn();
		displayRiver();
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
	
	public void createPlayers(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many Players are there?\n");
		this.numberOfPlayers = scanner.nextInt();
		for(int i = 0; i < this.numberOfPlayers; i++){
			System.out.println("Player " + (i+1) + ": What is your name?\n");
			players[i].setName(scanner.next());
		}
		scanner.close();
	}
	public void rankHand(Player player) {
		String hand = "";
		for (int i = 0; i < player.getHand().length; i++) {
			hand += player.getHand()[i].toString();
			if (i < 6){
				hand += ", ";
			}
		}
		System.out.println(player.getName() + "'s" + " hand: " + hand);
	}
	
	public int numberOfPlayersWithMoney(){
		int playersWithMoney = 0;
		for (int i = 0; i < this.numberOfPlayers; i++){
			if(players[i].getMoney() > 0){
				playersWithMoney++;
			}
		}
		return playersWithMoney;
	}
	
}
