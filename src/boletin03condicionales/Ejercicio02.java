package boletin03condicionales;

import java.util.Scanner;

/*
 * E = 2, R.E = El valor absoluto de 2 es 2, R.O = El valor absoluto de 2 es 2
 * E = 0, R.E = El valor absoluto de 0 es 0, R.O = El valor absoluto de 0 es 0
 * E = -2, R.E = El valor absoluto de -2 es 2, R.O = El valor absoluto de -2 es 2
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el número introducido por el usuario
		int numero;

		// Solicitamos el numero al usuario y lo almacenamos
		System.out.println("Introduca el número:");
		numero = sc.nextInt();

		// Si el numero es positivo ese es su valor absoluto, sino se hace positivo y se
		// muestra
		System.out.println(numero > 0 ? "El valor absoluto de " + numero + " es " + numero
				: "El valor absoluto de " + numero + " es " + numero * -1);

		sc.close();
	}

}
