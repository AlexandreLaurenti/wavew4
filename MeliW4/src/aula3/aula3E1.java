package aula3;

import java.util.Scanner;

public class aula3E1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int numeroPar = 0;

		int i = 0;

		System.out.print("Digite o numero: ");

		int n = scan.nextInt();

		while (numeroPar <= n) {

		if (i % 2 == 0) {

		System.out.println(i);

		numeroPar++;

		}

		i++;

		}

		scan.close();

		}

}
