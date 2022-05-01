package Week3;

import java.util.Arrays;

public class HomeworkWeek3 {

	public static void main(String[] args) {
		//Question 1a
		 int[] ages = new int[] {3, 9, 23, 64, 2, 8, 28, 93};
		  System.out.println(ages[ages.length-1]-ages[0]);
		  
		//Question 1b  - changed name to ages1b to differentiate array
		  int[] ages1b = new int[] {3, 9, 23, 64, 2, 8, 28, 93, 57}; 
		  System.out.println(ages1b[ages1b.length-1]-ages1b[0]);  
		  
		//Question 1c  
		  double avg = 0;
		  for(int i=0; i<ages.length; i++) {
			  avg += ages[i];		  	  
		  } System.out.println(avg / ages.length);
		  
		  // Question 2a
		  String[] names ={"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		  
		  int charCount = 0; 
		  for(int i=0; i<names.length; i++) {
			  
			  charCount += names[i].length();
		  }
		  System.out.println(charCount / names.length);
		  
		  //Question 2b
		  String glueWords= "";
		  for (int j=0; j<names.length; j++) {
			  glueWords += names[j];
			  glueWords += " ";
		  }
		  System.out.println(glueWords);
		  
		  //Question 5
		  int[] nameLengths = new int[names.length]; 
		  int a = 0;
		  	while (a<names.length) {
			  nameLengths[a] =  names[a].length();
			  a++;
		  	}
		  System.out.println(Arrays.toString(nameLengths));
		  
		  //Question 6
		  int sum = 0;
		  for (int k=0; k<nameLengths.length; k++) {
			  sum += nameLengths[k];
		  } 
		  System.out.println(sum);
		  
		  //Question 7
		  String copier = repeater("Harley", 3);
		  System.out.println(copier);
		  
		  //Question 8
		  String doggo = fullName("Harley", "Teh");
		  System.out.println(doggo);
		  		  
		  //Question 9
		  int[] number = {3, 5, 8, 0, 1, 6};
			 boolean isTotalMoreThan100 = sum(number);
			 System.out.println(isTotalMoreThan100);
			  
		  //Question 10
		  double[] question10Input = {13.56, 55.11, 123.6, 164.50};
		  	 double findAverage = averageOfNumbers(question10Input);
		  	 System.out.format("%.2f\n",findAverage);
		  
		  //Question 11	 
		  double[] arrayNumbahOne = {12.5, 66.2, 145.22, 41.33};
		  double[] arrayNumbahTwo = {154.2, 63.21, 111.92, 98.12};
		  boolean oneBiggerThanTwo = arrayCompare(arrayNumbahOne, arrayNumbahTwo);
		  System.out.println(oneBiggerThanTwo);
		  
		  //Question 12
		 boolean iWantCoolAid = willBuyDrink(true, 20.50);
		 System.out.println(iWantCoolAid);
		 
		 //Question 13
		 /* Create a method to find an element in an array,
		  * If element is found: print found element;
		  * otherwise print error code.
		  */
		 String[] myStrings = {"Dav", "Aya", "Bour", "Harley"};  
		 String findElement = findElementInArray("dav", myStrings);
		 if(findElement.equalsIgnoreCase("")) {
			 System.out.println("404 Error.");
		 } else 
			 System.out.println("Found element.");
	}
	
	public static String repeater(String w, int n) { //Question 7
		String word = w;
		for (int i=0; i < n-1; i++) {
		word = word.concat(w) ;
		}
		return word;
	  } 
	
	public static String fullName(String firstName, String lastName) { //Question 8
		String fullName = "";
		fullName = firstName + " " +lastName;		
		return fullName;
	}

	public static boolean sum(int[] input) {  //Question 9
		
		int total = 0;
		for(int i=0; i<input.length; i++ ) {
			total += input[i];
		}
		
		if(total > 100) {
			return true;
		}  
		
		return false;

	}

	public static double averageOfNumbers(double[] input) { //Question 10
		
		double result = 0;
		for(int i=0; i<input.length; i++) {
			result += input[i];
		}
		return result /= input.length;
	}  
	
	public static boolean arrayCompare(double[] input1, double[] input2) {  //Question 11	
		
		double avgArrayNumbah1 = averageOfNumbers(input1);
	  	double avgArrayNumbah2 = averageOfNumbers(input2);
		return avgArrayNumbah1 > avgArrayNumbah2;
		
	}
	
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) { //Question 12
		
		return isHotOutside == true && moneyInPocket > 10.50; 
		
	}

	public static String findElementInArray(String input, String[] arr) { //Question 13
		
		String search = input;
		for (int i=0; i<arr.length; i++) {
			if (search.equalsIgnoreCase(arr[i])) {
				return search;
			} 
				
		} return "";
	}

}
