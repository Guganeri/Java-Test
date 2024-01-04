package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rc = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rc.width = sc.nextDouble();
		rc.height = sc.nextDouble();
		System.out.printf("AREA = %.2f\n", rc.area());
		System.out.printf("PERIMETER = %.2f\n", rc.perimetro());
		System.out.printf("DIAGONAL = %.2f\n", rc.diagonal());		
		sc.close();
	}

}
