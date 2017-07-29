package dkpoker.main.game;

public class Player {
	private String name;
	private Hand hand;
	private int money;
	private int handRank;
	private int currentHandIndex;
	
	public Player(){
		name = "";
		hand = new Hand();
		money = 100;
		handRank = 0;
		currentHandIndex = 2;
	}
	
	public void setHand(Card card[]){
		this.hand.setPlayerHand(card);
	}
	
	public void clearHand(){
		this.hand.setPlayerHand(new Card[7]);
	}
	
	public void bet(int amount){
		this.money -= amount;
	}
	
	public void winPot(int amount){
		this.money += amount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public int setHandRank(Card[] hand){
		int rank = 0;	
		return rank;
	}
	public String displayPlayer(){
		return (this.getName() + ":\n" + this.hand.displayHand(this.getName()).toString() + "\n    Money: " + this.getMoney() + "\n");	
	}
	
	public void addToHand(Card card) {
		this.hand.setCardAtIndex(currentHandIndex, card);
		currentHandIndex++;
	}

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public int getHandRank() {
		return handRank;
	}

	public void setHandRank(int handRank) {
		this.handRank = handRank;
	}

	public int getCurrentHandIndex() {
		return currentHandIndex;
	}

	public void setCurrentHandIndex(int currentHandIndex) {
		this.currentHandIndex = currentHandIndex;
	}
	
}
