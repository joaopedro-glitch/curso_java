package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Bank bank;
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		sc.nextLine(); // Consome o \n do buffer
		
		System.out.print("Enter account holder: ");
		String name = sc.nextLine();
		
		System.out.print("Is there na initial deposit (y/n)? ");
		char initialChoise = sc.next().charAt(0);
		
		if(initialChoise == 'y' || initialChoise == 'Y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(accountNumber, name, initialDeposit);
		}
		
		else {
			bank = new Bank(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data: \n" + bank);
		
		System.out.print("Enter a deposit value: ");
		double deposit = sc.nextDouble();
		bank.deposit(deposit);
		
		System.out.println();
		System.out.println("Updated account data: \n" + bank);
		
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		
		if(withdraw > 0) {
			bank.withdraw(withdraw);
			System.out.println();
			System.out.println("Updated account data: \n" + bank);
		}
		
		else {
			System.out.println();
			System.out.println("Updated account data: \n" + bank);	
		}
		

		sc.close();
	}

}
