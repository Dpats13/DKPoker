package dkpoker.main.game;

public class HandFinder {

	public HandFinder() {

	}

	public int findHandRank(Hand hand){
		int rank = 0;
		
		if(checkRoyalFlush(hand)){
			rank = 9;
		}else if(checkStraightFlush(hand)){
			rank = 8;
		}else if(checkFourOfAKind(hand)){
			rank = 7;
		}else if(checkFullHouse(hand)){
			rank = 6;
		}else if(checkFlush(hand)){
			rank = 5;
		}else if(checkStraight(hand)){
			rank = 4;
		}else if(checkThreeOfAKind(hand)){
			rank = 3;
		}else if(checkTwoPair(hand)){
			rank = 2;
		}else if(checkPair(hand)){
			rank = 1;
		}else{
			rank = 0;
		}
		
		return rank;
	}
	

	public boolean checkRoyalFlush(Hand hand) {
		
		
		return false;
	}

	public boolean checkStraightFlush(Hand hand) {
		return false;
	}

	public boolean checkFourOfAKind(Hand hand) {
		return false;
	}

	public boolean checkFullHouse(Hand hand) {
		return false;
	}

	public boolean checkFlush(Hand hand) {
		return false;
	}

	public boolean checkStraight(Hand hand) {
		return false;
	}

	public boolean checkThreeOfAKind(Hand hand) {
		return false;
	}

	public boolean checkTwoPair(Hand hand) {
		return false;
	}

	public boolean checkPair(Hand hand) {
		return false;
	}

	public boolean checkHighCard(Hand hand) {
		return false;
	}

}
