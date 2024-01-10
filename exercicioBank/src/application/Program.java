package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountUser = sc.nextInt();		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nameUser = sc.nextLine();
		Account cb = new Account(accountUser, nameUser);
		
		System.out.print("Is there na initial deposit (y/n)?");
		String firstDeposit = sc.next();
		
		
		if (firstDeposit.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value: ");
			double value = sc.nextDouble();
			cb.depositoUsuario(value);
			System.out.println();
			System.out.println("Account data");
			System.out.println(cb);
			
		} else {
			System.out.println();
			System.out.println("Account data");
			System.out.println(cb);
		}
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double value = sc.nextDouble();
		cb.depositoUsuario(value);
		System.out.println("Updated account data: ");
		System.out.println(cb);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		value = sc.nextDouble();
		cb.saqueUsuario(value);
		System.out.println("Updated account data: ");
		System.out.println(cb);
		
		sc.close();
	}
}
