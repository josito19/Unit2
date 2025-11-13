package boletin04while;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		int num;
		int contador = 0;

		// Solicitar al usuario un número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		// Cuenta los número añadidos hasta introducir un negativo
		while (num >= 0) {
			contador++;
			System.out.println("Introduce otro número: ");
			num = sc.nextInt();
		}

		// Mostrar por pantalla los números añadidos
		System.out.println("Hay " + contador + " números introducidos.");

		sc.close();

	}

}
