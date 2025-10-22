package ifelse;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero almacenará el número introducido por el usuario
		double numero;

		// Solicitamos el numero y lo guardamos en la variable
		System.out.println("Introduzca el número:");
		numero = sc.nextDouble();

		// Comparamos si el numero es casi cero o no y lo mostramos en pantalla
		if (numero < 1 && numero > -1 && numero != 0) {
			System.out.println("Es casi-cero");
		} else {
			System.out.println("No es casi-cero");
		}

		sc.close();
	}

}
