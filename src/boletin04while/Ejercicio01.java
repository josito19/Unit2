package boletin04while;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creación del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// num almacena la respuesta del usuario
		int num;
		int numExtra = 0;

		// Solicitamos el número
		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		// Se suman los números añadidos hasta introducir un negativo
		while (num >= 0) {
			numExtra += num;
			System.out.println("Introduce otro numerín: ");
			num = sc.nextInt();
		}

		// Mostrar por pantalla
		System.out.println("La suma es: " + numExtra);

		// Close scanner
		sc.close();

	}

}
