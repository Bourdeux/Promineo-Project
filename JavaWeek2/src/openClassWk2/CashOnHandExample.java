package openClassWk2;

public class CashOnHandExample {
  public static void main(String[] args) {
  // Want to see how many sandwich can I buy
	  double sandwichCost = 7.99;
	  double myCash = 28.00;
	  int numBought = 0;
	  double cashSpent = 0.0;
	  
	  while (myCash >= sandwichCost) {
		  numBought += 1;
		  cashSpent += sandwichCost;
		  myCash -= sandwichCost;
	  }
	  
	  String spent = String.format("%.2f", cashSpent);
	  String cash = String.format("%.2f", myCash);
	  
		System.out.println("I bought " + numBought + " sandwich(es) for $"
				+ spent + ". I have $" + cash + " left.");
	

	}
   
}
