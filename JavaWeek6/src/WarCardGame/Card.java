package WarCardGame;


public class Card {
		
	private int value;
	private String name;
	private String suit;
		
	
	public Card(String name, String suit, int value) {
		this.name = name;
		this.suit = suit;
		this.value = value;
	}
	
	@Override
	public String toString() {
		return name + " of " + suit;
	}
	
	//Getters
	public int getValue() {
		return value;
	}

	public String getName() {
		return name;
	}
	
	public String getSuit() {
		return suit;
	}
	
	
	//Setters
	//Only accessible by cheaters	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setValue(int value) {	
		this.value = value;
	}
}
