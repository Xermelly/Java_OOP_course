package application;

import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		CurrencyConverter.cotDollar = sc.nextDouble();

		
		System.out.print("How many dollar will be bought? ");
		CurrencyConverter.dollarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.amountToPaid());
		
		sc.close();
	}

}
