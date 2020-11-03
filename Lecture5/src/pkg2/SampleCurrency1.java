package pkg2;

import java.util.Currency;

public class SampleCurrency1 {

	public static void main(String[] args) {
		Currency c1 = Currency.getInstance("AUD");
		Currency c2 = Currency.getInstance("JPY");
		Currency c3 = Currency.getInstance("USD");
		
		String cCode1 = c1.getCurrencyCode();
		String cCode2 = c2.getCurrencyCode();
		
		System.out.println("Australlian Dollar Code: "+cCode1);
		System.out.println("Japanese Yen Code: "+cCode2);
		System.out.println();
		
		int D1 = c1.getDefaultFractionDigits();
		System.out.println("AUD Fraction digits: "+D1);
		
		int D2 = c2.getDefaultFractionDigits();
		System.out.println("JPY Fraction digits: "+D2);
		System.out.println();
		
		System.out.println("AYD Display: "+c1.getDisplayName());
		System.out.println("JPY Display: "+c2.getDisplayName());
		System.out.println();
		
		System.out.println("JPY Symbol: "+c2.getSymbol());
		System.out.println("USD Display: "+c3.getSymbol());
	}

}
