package week06;

import java.util.ArrayList;
import java.util.List;

public class Player {
	List<Card> hand = new ArrayList<Card>();
	int score;
	String name;
	
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card>();
		
	}
	
	// prints out information about the player and calls the describe method for each card in the hand list
	public void describe() {
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	// removes and returns the top card of the hand
	public Card flip() {
		Card card = this.hand.remove(0);
		card.describe();
		return card;
	}
	
	// takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field
	public void draw(Deck deck)
	{
		Card newCard = deck.draw();
		this.hand.add(newCard);
	}
	
	//adds 1 to the player's score
	public void incrementScore() {
		this.score++;
	}
	
}
