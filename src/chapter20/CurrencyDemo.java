package chapter20;

import java.util.Currency;
import java.util.Locale;

public class CurrencyDemo {
	public static void main(String[]args)
	{
		Currency currency = Currency.getInstance(Locale.UK);
		System.out.println(currency.getCurrencyCode());
		System.out.println(currency.getDisplayName());
	}
}
