package dkpoker.main.game;

public class Main {

	public static void main(String[] args) {
		Game game = new Game();
		game.startGame();
		
		Deck deck = new Deck();
		for (int i = 0; i < 52; i++) {
			System.out.println(deck.getDeck()[i].toString());
		}

	}

}
