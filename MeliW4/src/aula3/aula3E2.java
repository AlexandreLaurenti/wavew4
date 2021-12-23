package aula3;

import java.util.Scanner;

public class aula3E2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print(" Digite o primeiro número: ");

		int n = scan.nextInt();

		System.out.print(" Digite o segundo número: ");

		int m = scan.nextInt();

		int quantidadeDeNumerosMultiplos = 0;

		for (int i = 1; quantidadeDeNumerosMultiplos < n; i++) {

		if (i % m == 0) {

		System.out.println(i);

		quantidadeDeNumerosMultiplos++;

		}

		}

		scan.close();

	}

}
