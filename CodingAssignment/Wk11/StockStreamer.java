package sortApp;

import java.util.stream.Collectors;

public class StockStreamer {

	public static void main (String[] args) {
		
		String stockSymbols = Stocks.getSymbols()
			.stream()
			.map(symbols -> symbols.toString())
			.sorted()
			.collect(Collectors.joining(", "));
		
		System.out.println(stockSymbols);
		
	}
}
