package boletin06_for;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creacion del scaner y de las variables
		Scanner sc = new Scanner(System.in);
//		int tamaño;
//		tamaño = sc.nextInt();
//
//		for (int i = 0; i <= tamaño; i++) {
//			for (int j = 0; j <= tamaño; j++) {
//				if (j == 0) {
//					System.out.print("*");
//				}
//				if (i == 0 || i == tamaño) {
//
//					System.out.print("*");
//				} else {
//
//					System.out.print(" ");
//				}
//
//			}
//			System.out.println("*");
//		}

		int num;
		boolean primo = true;
		// Pedimos y guardamos un numero
		System.out.println("Introduce a number: ");
		num = sc.nextInt();

		// Si el número es 1 o al dividirlo da 0, es primo
	if(num == 1) {
		primo = false;
	} else {
	 for (int i = 2; i < num; i++) {
			if (num == 1 || num % i == 0) {
				primo = false;
			}
	 }
		}

		// Mostramos el resultado
		System.out.println(primo ? "Es primo" : "No es primo");
		sc.close();
	}

}
