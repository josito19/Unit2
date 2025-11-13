package boletin05dowhile;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el numero que se irá mostrando en pantalla
		int numero = 1;

		// max almacena el máximo de números a mostrar
		int max = 20;

		// Va incrementando el numero y se va mostrando por pantalla
		do {
			System.out.println(numero);
			numero++;

			// Mientras el número esté dentro del rango
		} while (numero <= max);

		sc.close();
	}

}
