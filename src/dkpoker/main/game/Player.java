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
}
