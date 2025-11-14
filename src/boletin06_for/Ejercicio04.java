package boletin06_for;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);
		// suma almacena la suma de los números impares
		int suma = 0;

		for (int i = 0; i <= 10; i++) {
			if (i % 2 != 0) {
				suma += i;
				System.out.println(i);
			}
		}

		System.out.println(suma);
		
		
		sc.close();
	}

}
