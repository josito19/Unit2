package boletin6_for;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// contMult incrementa cuando hay un múltiplo de tres
		int contMult = 0;
		// num almacenará el numero introducido por el usuario
		int num;
		System.out.println("Introduzca un número:");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			if (i % 3 == 0) {
				contMult++;
			}
		}

		System.out.println(contMult);
		sc.close();
	}

}
