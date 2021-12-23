package aula3;

import java.util.Scanner;

public class aula3E3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número: ");

		int n = scan.nextInt();

		if (n % 2 == 1 && n != 1 || n == 2) {

			System.out.println("O número é primo: " + n);

		} else {
			System.out.println("O número não é primo: " + n);

		}

		scan.close();

	}

}
