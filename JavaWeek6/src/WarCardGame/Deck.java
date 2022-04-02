package WarCardGame;

import java.util.*;


public class Deck{
	
	//final(const) static to make it immutable
	final static int[] VALUE = {2,3,4,5,6,7,8,9,10,11,12,13,14};
	final static String[] NAME = {"Two","Three","Four","Five", "Six", "Seven", "Eight", "Nine","Ten", "Jack", "Queen", "King", "Ace"};
	final static String[] SUIT = {"Diammonds", "Clubs", "Hearts", "Spades"};
	List<Card> deck;
	
	//initialize deck
	public Deck() {
	
		deck = new ArrayList<Card>();
				
		for (int i = 0; i < NAME.length; i++) {
			for (int j = 0; j < SUIT.length; j++) {
				deck.add(new Card(NAME[i], SUIT[j], VALUE[i])); 		//create new card using loop
				
			}
		}		
	}
	
	//shuffle deck (think of this as an action I want compiler to perform, hence return method is void)
	public void shuffle() {
		
		Collections.shuffle(this.deck);		
					
	}
	//return drawn element from deck
	public Card draw() {
		return deck.remove(0);		
	}
		
}
