package boletin6_for;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);
		// num almacena el numero introducido por el usuario
		int num;
		// factorial irá guardando la multiplicación
		int factorial = 1;

		// Solicitamos al usuario el numero y lo guardamos
		num = sc.nextInt();

		// Se calcula el factorial del número
		for (int i = num; i >= 1; i--) {
			factorial *= i;
		}

		// Se muestra el factorial
		System.out.println(factorial);

		sc.close();
	}

}
