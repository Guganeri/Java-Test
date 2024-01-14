package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class Program {
	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int menorDeIdade = 0;
		int avg = 0;		
		
		System.out.print("Quantas pessoas serão digitadas? ");
		int count = sc.nextInt();
		
		Pessoa[] p = new Pessoa[count];
		
		for(int i=0; i<count;i++) {
			System.out.println("Dados da "+ (i+1) +"a pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			sc.next();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			p[i] = new Pessoa(nome, idade, altura);
		}
				
		for(int i=0; i<count;i++) {			
			int validate = p[i].getIdade();
			System.out.printf("%s %d",p[i].getNome(),p[i].getIdade());
			if (validate<=16) {
				menorDeIdade +=1;			
				
			}					
		}
		
		System.out.printf("Pessoas com menos de 16 anos: %d", menorDeIdade);
		
		sc.close();
		
		
	}
}
