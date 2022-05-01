package WarCardGame;

public class App {

	public static void main(String[] args) {
		new App().run();
	}	

	/*Used run method to improve reuseability 
	 * and code maintenance.
	 */
	private void run() {
		
		Deck deck = new Deck();
		
		Player player1 = new Player("Wall-E");
		Player player2 = new Player("Eva");
				
		System.out.println(player1 + " vs " + player2);
		
		deck.shuffle();
				
		//add cards to players' hand
		for (int i = 0; i < 26; i++) {
			player1.draw(deck);
			player2.draw(deck);
		}
		//show and check player hands
		player1.describe();
		player2.describe();
		
		/*Game played without considering if flipped card has equal values
		 * as it was not included in the instruction sheet;
		 */
		for (int i = 0; i < 26; i++) {
			Card flippedPlayer1Card = player1.flip();
			Card flippedPlayer2Card = player2.flip();
			
			if(flippedPlayer1Card.getValue() > flippedPlayer2Card.getValue()) {
				player1.incrementScore();				
			} 
			else if (flippedPlayer1Card.getValue() < flippedPlayer2Card.getValue()) {
				player2.incrementScore();				
			}
			
		}
		//describing just to make sure player hands are empty after loop
		player1.describe();
		player2.describe();
		
		if (player1.score > player2.score) {
			System.out.println("Winner is: " + player1 + " with score of " + player1.score);
		}
		else if (player1.score < player2.score) {
			System.out.println("Winner is: " + player2 + " with score of " + player2.score);
		}
		else
			System.out.println("This is a draw game.");
						
	}
		
}
