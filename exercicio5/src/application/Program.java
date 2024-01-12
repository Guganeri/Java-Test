package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double sum = 0;
		
		System.out.print("Quantos numeros você vai digitar? ");
		int size = sc.nextInt();
		
		double vector[] = new double [size];
		
		for(int i=0; i<vector.length;i++) {
			vector[i] = sc.nextDouble();
		}
		
		
		System.out.print("VALORES = ");
		for(int i = 0; i<vector.length; i++) {			
			System.out.printf("%.1f ", vector[i]);
			sum +=vector[i];			
		}		
		System.out.printf("\nSOMA = %.2f",sum);
		System.out.printf("\nMEDIA = %.2f",sum/vector.length);
		sc.close();

	}

}
