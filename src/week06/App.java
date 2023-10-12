package week06;

public class App {

	public static void main(String[] args) {
		
		// instantiate deck and two players
		Deck playingDeck = new Deck();
		Player player1 = new Player("Stephanie");
		Player player2 = new Player("Mike");
		
		// shuffle deck
		playingDeck.shuffle();
		
		// Using a traditional for loop, iterate 52 times calling the Draw method on the other player each 
		// iteration using the Deck you instantiated.
		
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(playingDeck);
			}
			else {
				player2.draw(playingDeck);
			}
		}
		
		// using a traditional for loop, iterate 26 times and call the flip method for each player
		for (int i = 0; i < 26; i++) {
			Card card1 = player1.flip();
			Card card2 = player2.flip();
			
			//Compare the value of each card returned by the two player’s flip methods
			if (card1.value > card2.value) {
				System.out.println(player1.name + " wins this turn.");
				// call the incrementScore method on the player whose card has the higher value
				player1.incrementScore();
				//print out the current score after each turn
				System.out.println(player1.name + "'s score is: " + player1.score);
				System.out.println(player2.name + "'s score is: " + player2.score);
				System.out.println();
			}
			else if (card2.value > card1.value) {
				System.out.println(player2.name + " wins this turn.");
				// call the incrementScore method on the player whose card has the higher value
				player2.incrementScore();
				//print out the current score after each turn
				System.out.println(player1.name + "'s score is: " + player1.score);
				System.out.println(player2.name + "'s score is: " + player2.score);
				System.out.println();
			}
			else {
				System.out.println("Draw");
				//print out the current score after each turn
				System.out.println(player1.name + "'s score is: " + player1.score);
				System.out.println(player2.name + "'s score is: " + player2.score);
				System.out.println();
			}
		}
		
		//compare the final score from each player
		System.out.println(player1.name + "'s final score is: " + player1.score);
		System.out.println(player2.name + "'s final score is: " + player2.score);
		
		if (player1.score > player2.score) {
			System.out.println(player1.name);
		}
		else if (player1.score < player2.score) {
			System.out.println(player2.name);
		}
		else {
			System.out.println("Draw");
		}
		

	}

}
