
public class App {

	public static void main(String[] args) {
		
		Logger myInput = new AsteriskLogger();
		myInput.Log("iLoveMyWife");
		myInput.Error("Wordle");
		
		Logger input2 = new SpacedLogger();
		input2.Log("TheDuck");
		input2.Error("WhatIsHappening");
		
		

	}

}
