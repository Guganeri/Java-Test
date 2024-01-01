package curso;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x = 0;

		for (int i = 1; i <= 3; i++) {
			
			int y = sc.nextInt();
			
			if(y>x) {
				x = y;
			} else {
				
			}		
		}
		System.out.println(x);
		sc.close();
	}

}
