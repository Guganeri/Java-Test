package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Studenty;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Studenty al = new Studenty();
		
		System.out.println("Nome do aluno: ");
		al.aluno = sc.next();
		
		System.out.println("Media do primeiro trimestre");
		al.media1 = sc.nextDouble();
		System.out.println("Media do segundo trimestre");
		al.media2 = sc.nextDouble();
		System.out.println("Media do terceiro trimestre");
		al.media3 = sc.nextDouble();
		System.out.println(al.calcMedia());
		
		
		sc.close();

	}

}
