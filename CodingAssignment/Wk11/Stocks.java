package sortApp;

import java.util.LinkedList;
import java.util.List;

public class Stocks {

	private String symbolName;
	private static List<Stocks> symbols = List.of(			
			new Stocks("AMD"), new Stocks("TTD"), new Stocks("SCHW"), 
			new Stocks("CVX"), new Stocks("FB"), new Stocks("GM"), 
			new Stocks("BAC"), new Stocks("DOW"), new Stocks("XOM"), 
			new Stocks("ZM"));
	
	
	public Stocks(String symbols) {
		this.symbolName = symbols;
	}
	
	public String getSymbolName() {
		return symbolName;
	}
	
	@Override
	public String toString() {
		return "" + symbolName;
	}
	
	public static int compareSymbols(Stocks s1, Stocks s2) {
		return s1.symbolName.compareTo(s2.symbolName);
	}
	
	public static List<Stocks> getSymbols() {
		return new LinkedList<>(symbols); 
	}
}
