package openClassWk2;

import java.util.*;

public class GuessingGame {

	public static void main(String[] args) {
	//This is a guessing game!
//		Scanner answer = new Scanner(System.in);
			
		
	Scanner dice = new Scanner(System.in);
	int rand = (int)(Math.random() * 10 + 1);
	System.out.println(rand);
	
	for (int j = 0; j < 5; j++) {
	System.out.println("Please guess my number");
	int guess = dice.nextInt();  //where i store the data
	 
	if (rand < guess) {
		System.out.println("Your guess is too high.");
	 }else if (rand > guess) {
		System.out.println("Your guess is too low");
	 }else {
		System.out.println("You got it!");
		break;
	 }
	}	
		
	//for loops
//	for (int j = 0; j < 4; j++) {
//		System.out.println("Hello!");
//	}
//	
//	//while loops
//	boolean run = true;
//	while (run) {
//		System.out.println("Do you want to run? If not say 0");
//		int run = answer.nextInt();
//		if (run == 0) {
//			run = false;
		
		
		
		
	
		
	}

}
