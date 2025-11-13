package boletin03condicionales;

import java.util.Scanner;

/* Introducir entero entre 0-9999
 * E=1 R.E=Capicúa R.O = Capicúa
 * E=120 R.E = No Capicúa R.O = No Capicúa
 */

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el numero introducido por el usuario
		int numero;

		// Solicitamos el número al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número entre 0 y 9999");
		numero = sc.nextInt();

		// Comparamos el número introducimos y mostramos lo que corresponda
		if (numero >= 0 && numero <= 9999) {
			if (numero < 10) {
				System.out.println("Capicúa");
			} else if (numero / 10 == numero % 10) {
				System.out.println("Capicúa");
			} else if (numero >= 100 && numero <= 999 && numero / 100 == numero % 10) {
				System.out.println("Capicúa");
			} else if (numero / 1000 == numero % 10 && (numero / 100) % 10 == (numero / 10) % 10) {
				System.out.println("Capicúa");
			} else {
				System.out.println("No Capicúa");
			}
		} else {
			System.out.println("Debe introducir un número entre 0-9999");
		}

		sc.close();
	}

}
