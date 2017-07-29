package dkpoker.main.game;

public class HandFinder {

	public HandFinder() {

	}

	public Card[] findHandRank(Hand hand){
		Card[] bestHand = new Card[5];
		
		if((bestHand = checkRoyalFlush(hand)) != null){
			hand.setHandRank(9);
		}else if((bestHand = checkStraightFlush(hand)) != null){
			hand.setHandRank(8);
		}else if((bestHand = checkFourOfAKind(hand)) != null){
			hand.setHandRank(7);
		}else if((bestHand = checkFullHouse(hand)) != null){
			hand.setHandRank(6);
		}else if((bestHand = checkFlush(hand)) != null){
			hand.setHandRank(5);
		}else if((bestHand = checkStraight(hand)) != null){
			hand.setHandRank(4);
		}else if((bestHand = checkThreeOfAKind(hand)) != null){
			hand.setHandRank(3);
		}else if((bestHand = checkTwoPair(hand)) != null){
			hand.setHandRank(2);
		}else if((bestHand = checkPair(hand)) != null){
			hand.setHandRank(1);
		}else{
			bestHand = checkHighCard(hand);
			hand.setHandRank(0);
		}
		
		return bestHand;
	}
	

	public Card[] checkRoyalFlush(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkStraightFlush(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkFourOfAKind(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkFullHouse(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkFlush(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkStraight(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkThreeOfAKind(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkTwoPair(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkPair(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

	public Card[] checkHighCard(Hand hand) {
		Card cards[] = new Card[5];
		Card playerHand[] = hand.getPlayerHand();
		
		return cards;
	}

}
