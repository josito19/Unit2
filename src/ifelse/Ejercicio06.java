package ifelse;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creación del escáner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero1, 2 y 3 guardarán los números introducidos por consola
		int numero1;
		int numero2;
		int numero3;

		// Solicitamos los números y los guardamos en las variables
		System.out.println("Introduzca el primer entero:");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo entero:");
		numero2 = sc.nextInt();
		System.out.println("Introduzca el tercer entero:");
		numero3 = sc.nextInt();

		// Verificamos si la suma de dos de los números da como resultado el otro número
		// restante y lo mostramos por pantalla según
		if (numero1 == numero2 + numero3) {
			System.out.println(numero2 + " + " + numero3 + " = " + numero1);
		} else if (numero2 == numero1 + numero3) {
			System.out.println(numero1 + " + " + numero3 + " = " + numero2);
		} else if (numero3 == numero1 + numero2) {
			System.out.println(numero1 + " + " + numero2 + " = " + numero3);
		} else {
			System.out.println("El resultado de la suma de dos de los números no es el otro número.");
		}

		sc.close();
	}

}
