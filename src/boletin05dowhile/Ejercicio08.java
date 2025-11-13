package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		String tirada;
		int num1 = 0;
		int num2 = 0;

		do {
			// Solicitamos la primera tirada
			System.out.println("Primera tirada:");
			tirada = sc.nextLine().toUpperCase();

			// num1 guarda la primera tirada según corresponda
			num1 = switch (tirada) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Inserte una opción válida.");
				yield -1;
			}
			};
		} while (num1 == -1);
		do {
			// Solicitamos la segunda
			System.out.println("Segunda tirada:");
			tirada = sc.nextLine().toUpperCase();
			num2 = switch (tirada) {
			case "UNO" -> {
				yield 1;
			}
			case "DOS" -> {
				yield 2;
			}
			case "TRES" -> {
				yield 3;
			}
			case "CUATRO" -> {
				yield 4;
			}
			case "CINCO" -> {
				yield 5;
			}
			case "SEIS" -> {
				yield 6;
			}
			default -> {
				System.out.println("Inserte una opción válida.");
				yield -1;
			}
			};
		} while (num2 == -1);

		System.out.println(num1 + num2);

		sc.close();
	}

}
