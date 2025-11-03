package dowhile;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Creación del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el numero que se irá mostrando solo si es par
		int numero = 1;

		// max es el maximo de numeros a imprimir
		int max = 200;

		do {
			// Incrementa numero
			numero++;
			// Cuando el resto de dividir entre dos el numero da cero es par
			if (numero % 2 == 0) {
				// Mostramos el numero par
				System.out.println(numero);
			}
			// Mientras el numero sea menor o igual que el max escogido
		} while (numero <= max);

		sc.close();
	}
}