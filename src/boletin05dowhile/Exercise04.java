package boletin05dowhile;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero irá incrementando hasta salirse de rango
		int numero = 0;

		// numeroUsuario será el número introducido por el usuario
		int numeroUsuario;

		// resultado almacena el resultado de la multiplicación
		int resultado;

		// Pedimos el numero y lo asignamos
		System.out.println("Introduzca el número:");
		numeroUsuario = sc.nextInt();

		do {
			// Incrementa numero
			numero++;
			// resultado almacena la multiplicación de numero y numeroUsuario
			resultado = numero * numeroUsuario;
			// Mostramos en cada línea la multiplicación correspondiente
			System.out.println(numeroUsuario + " x " + numero + " = " + resultado);
		} while (numero < 10);

		sc.close();
	}

}
