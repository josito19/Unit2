package boletin04while;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		int altura;
		int max = 0;

		// Solicitamos los datos al usuario y los guardamos
		System.out.println("Introduce la altura del árbol: ");
		altura = sc.nextInt();

		// Guardamos la altura más alta
		while (altura >= 0) {
			if (altura > max) {
				max = altura;
			}

			System.out.println("Introduce la siguiente altura: ");
			altura = sc.nextInt();
		}

		System.out.println("El árbol más alto mide: " + max);

		sc.close();

	}

}
