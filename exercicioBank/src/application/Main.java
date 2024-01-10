package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CadastroBanco;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountUser = sc.nextInt();
		System.out.print("Enter account holder: ");
		String nameUser = sc.nextLine();
		
		CadastroBanco cb = new CadastroBanco(accountUser, nameUser);
		
		System.out.print("Is there na initial deposit (y/n)?");
		String firstDeposit = sc.next();
		
		
		if (firstDeposit.equalsIgnoreCase("y")) {
			System.out.print("Enter initial deposit value");
			double value = sc.nextDouble();
			cb.depositoUsuario(value);
			System.out.println("Account data");
			System.out.println("Account " + cb.getNumeroUsuario() + ", Holder: " + cb.getNomeUsuario() + ", Balance: $" + cb.getSaldoUsuario());
			
		} else {
			

		}
		

						

	}

}
