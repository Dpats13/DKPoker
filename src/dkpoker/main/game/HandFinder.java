package dkpoker.main.game;

public class HandFinder {

	public HandFinder() {

	}

	public void findHandRank(Hand hand){
		Card[] bestHand = new Card[5];
		
		if(checkRoyalFlush(hand) != null){
			hand.setHandRank(9);
		}else if(checkStraightFlush(hand) != null){
			hand.setHandRank(8);
		}else if(checkFourOfAKind(hand) != null){
			hand.setHandRank(7);
		}else if(checkFullHouse(hand) != null){
			hand.setHandRank(6);
		}else if(checkFlush(hand) != null){
			hand.setHandRank(5);
		}else if(checkStraight(hand) != null){
			hand.setHandRank(4);
		}else if(checkThreeOfAKind(hand) != null){
			hand.setHandRank(3);
		}else if(checkTwoPair(hand) != null){
			hand.setHandRank(2);
		}else if(checkPair(hand) != null){
			hand.setHandRank(1);
		}else{
			hand.setHandRank(0);
		}
		
	}
	

	public Card[] checkRoyalFlush(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkStraightFlush(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkFourOfAKind(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkFullHouse(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkFlush(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkStraight(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkThreeOfAKind(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkTwoPair(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkPair(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

	public Card[] checkHighCard(Hand hand) {
		Card cards[] = new Card[5];
		
		return cards;
	}

}
