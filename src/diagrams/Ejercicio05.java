package diagrams;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el número introducido por el usuario
		int numero;

		// Solicitamos los números y los asignamos a sus variables
		System.out.println("Introduzca el  número:");
		numero = sc.nextInt();

		// Lo comparamo y mostramos si es positivo o negativo
		if (numero >= 0) {
			System.out.println("Es positivo");
		} else {
			System.out.println("Es negativo");
		}

		sc.close();

	}

}
