package sortApp;

import java.util.NoSuchElementException;
import java.util.Optional;



public class StockOptionals {
	
	public static void main (String[] args) {
		new StockOptionals().run();
	}

	private void run() {
		
		Optional<Stocks> optionalSymbol = Optional.of(new Stocks("DASH"));	
		System.out.println("Stock " + optionalSymbol + " is added to my watchlist.");
		
		try {
			Optional<Stocks> empty = Optional.empty();
			optionalStocks(empty);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	private Stocks optionalStocks (Optional<Stocks> stockOptional) {	
		return stockOptional.orElseThrow(
					()-> new NoSuchElementException("Not a valid symbol."));				
		}		

}
