package util;

public class CurrencyConverter {
	
	public static double IOF = 6;
	
	public static double converter(double dollars, double dollarsPrice) {
		return dollars*dollarsPrice + (dollars * dollarsPrice * IOF / 100);
		
	}

}
