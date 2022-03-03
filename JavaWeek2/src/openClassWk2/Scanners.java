package openClassWk2;

import java.util.*;

public class Scanners {

	public static void main(String[] args) {
    //accepting ints
	Scanner kb = new Scanner(System.in);
	System.out.println("How old are you?");
	int age = kb.nextInt();
	System.out.println("You are " + age + " years old.");
	
	//accepting doubles
	System.out.println("What is your GPA?");
	double gPA = kb.nextDouble();
	System.out.println("Your GPA is " + gPA + ", well done!");
		
	//accepting words
	System.out.println("What is your name?");
	String name = kb.next();
	System.out.println("Hello " + name + ".");
	
	//anomaly
	System.out.println("What is your address?");
	String addr = kb.nextLine();
	System.out.println(addr);
			

	}

}
