package application;

import java.util.Locale;
import java.util.Scanner;
import entities.AccountBank;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBank accountBank;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char choice = sc.next().charAt(0);
		
		if(choice == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			accountBank = new AccountBank(accNumber, name, initialDeposit);
		} else {
			accountBank = new AccountBank(accNumber, name);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(accountBank);
		
		System.out.print("\nEnter a deposit value: ");
		double value = sc.nextDouble();
		accountBank.deposit(value);
		System.out.println("Update account data:");
		System.out.println(accountBank);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdraw = sc.nextDouble();
		accountBank.withdraw(withdraw);
		System.out.println("Update account data:");
		System.out.println(accountBank);
		

		
		sc.close();
	}

}
