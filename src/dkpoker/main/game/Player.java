package dkpoker.main.game;

public class Player {
	private String name;
	private Card hand[];
	private int money;
	
	public Player(){
		name = "";
		hand = new Card[2];
		money = 0;
	}
	
	public void setHand(Card card[]){
		this.hand = card;
	}
	
	public void clearHand(){
		hand = new Card[2];
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

	public Card[] getHand() {
		return hand;
	}
	
	public String displayHand() {
		return "Your hand: " + hand[0].toString() + " and " + hand[1].toString();
	}
	
	
}
