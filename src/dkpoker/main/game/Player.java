package dkpoker.main.game;

public class Player {
	private String name;
	private Card hand[];
	private int money;
	private int handRank;
	
	public Player(){
		name = "";
		hand = new Card[7];
		money = 0;
		handRank = 0;
	}
	
	public void setHand(Card card[]){
		this.hand = card;
	}
	
	public void clearHand(){
		hand = new Card[7];
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
		return  "    Hand: " + hand[0].toString() + ", " + hand[1].toString();
	}
	public int setHandRank(Card[] hand){
		int rank = 0;	
		return rank;
	}
	public String displayPlayer(){
		return (this.getName() + ":\n" + this.displayHand() + "\n    Money: " + this.getMoney() + "\n");	
	}
	
	
}
