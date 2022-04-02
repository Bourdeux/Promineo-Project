package WarCardGame;

import java.util.*;

public class Player {
	
	private String name;
	public int score;
	public List<Card> hand;
	
	//can only initialize their name ONCE
	public Player(String name) {
		this.name = name;
		this.score = 0;
		this.hand = new ArrayList<Card>();
	}
	
	public String getName() {
		return name;
	}
	
	@Override //overriding object.toString (return hashcode) to return player's name instead.
	public String toString() {
		return this.name;
	}
	
	public void describe() {
		System.out.println(this.name + " " + "score: " + this.score + " " + this.hand);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	public void incrementScore() {
		score += 1;
	}

}
