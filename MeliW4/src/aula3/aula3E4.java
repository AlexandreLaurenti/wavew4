package aula3;

import java.util.ArrayList;

import java.util.List;

import java.util.Scanner;

public class aula3E4 {

	public static boolean isPrime(int n) {

		if (n < 2) {

			return false;

		} else if (n == 2) {

			return true;

		} else if (n % 2 == 0) {

			return false;

		}

		int sqrt = (int) Math.sqrt(n);

		for (int i = 3; i <= sqrt; i += 2) {

			if (n % i == 0) {

				return false;

			}

		}

		return true;

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		List<Integer> arrNumeros = new ArrayList<Integer>();

		System.out.println("Digite um número: ");

		int m = scan.nextInt();

		for (int i = 1; i <= m; i++) {

			if (isPrime(i)) {

				arrNumeros.add(i);

			}

		}

		arrNumeros.stream().forEach(n -> System.out.println(n));

		scan.close();

	}

}
