package boletin6_for;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);
		// num almacenará el numero introducido por el usuario
		int num;

		System.out.println("Introduzca un número:");
		num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}

		sc.close();
	}

}
