package ifelse;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// numero almacena el número que introduzca el usuario
		int numero;

		// Solicitamos el numero al usuario y lo guardamos en la variable
		System.out.println("Introduzca un número");
		numero = sc.nextInt();

		// Si al dividir entre dos el número da resto 0, diremos que es par, sino impar
		if (numero % 2 == 0) {
			System.out.println("Es par");
		} else {
			System.out.println("Es impar");
		}

		sc.close();
	}

}
