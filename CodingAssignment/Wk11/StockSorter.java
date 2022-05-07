package sortApp;

import java.util.List;

public class StockSorter {

	public static void main (String[] args) {
		StockSorter.run();
	}

	
	private static void run() {
		
		List<Stocks> myWatchList = Stocks.getSymbols();
		System.out.println("Before sorting: " + myWatchList);
		
		List<Stocks> lambdaSortedWatchList = lambdaSort(myWatchList);		
		System.out.println("Lambda sorted: " + lambdaSortedWatchList);
		
		List<Stocks> methodReferenceSorted = methodReference(myWatchList);
		System.out.println("Method Reference sorted: " + methodReferenceSorted);
		
		
	}
	@SuppressWarnings("static-access")
	private static List<Stocks> lambdaSort(List<Stocks> watchList) {
		List<Stocks> sortedWatchList = watchList; 
		sortedWatchList.sort((s1,s2) -> s1.compareSymbols(s1, s2));
		return sortedWatchList;
	}
	
	private static List<Stocks> methodReference(List<Stocks> watchList) {
		List<Stocks> sortedWatchList = watchList;
		sortedWatchList.sort(Stocks::compareSymbols);
		return sortedWatchList;
	}
	
}
