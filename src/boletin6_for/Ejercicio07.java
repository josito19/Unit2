package boletin6_for;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
// Creacion del scaner y de las variables
		Scanner sc = new Scanner(System.in);

		int tamaño;
		tamaño = sc.nextInt();

		for (int i = 0; i <= tamaño; i++) {
			for (int j = 0; j <= tamaño; j++) {
				if (j == 0) {
					System.out.print("*");
				}
				if (i == 0 || i == tamaño) {

					System.out.print("*");
				} else {

					System.out.print(" ");
				}

			}
			System.out.println("*");
		}

		sc.close();
	}

}
