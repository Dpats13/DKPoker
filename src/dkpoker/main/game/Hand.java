package dkpoker.main.game;

public class Hand {
	private Card playerHand[];
	private Card bestHand[];
	private int handRank;
	
	public Hand(){
		this.playerHand = new Card[7];
		this.handRank = 0;
	}

	public void setCardAtIndex(int index, Card card){
		this.playerHand[index] = card;
	}
	
	public Card getCardAtIndex(int index){
		return this.playerHand[index];
	}
	
	public Card[] getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(Card[] playerHand) {
		this.playerHand = playerHand;
	}

	public Card[] getBestHand() {
		return bestHand;
	}

	public void setBestHand(Card[] bestHand) {
		this.bestHand = bestHand;
	}

	public int getHandRank() {
		return handRank;
	}

	public void setHandRank(int handRank) {
		this.handRank = handRank;
	}
	
	public String displayHand(String playerName) {
		if (this.playerHand[0] != null) {
			return playerName + "'s hand: " + this.playerHand[0].toString() + ", " + this.playerHand[1].toString();
		}
		else {
			
			return "Cards not dealt yet";
		}
		
	}
	
	
	
}
