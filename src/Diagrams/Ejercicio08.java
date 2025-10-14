package Diagrams;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);

		// num1, num2 y num3 almacenan los datos introducidos por el usuario
		int num1;
		int num2;
		int num3;

		// Solicitamos los números y los asignamos a sus variables
		System.out.println("No hay tres iguales.");
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();
		System.out.println("Introduzca el tercer número:");
		num3 = sc.nextInt();

		// Los comparamos y mostramos que numero es mayor
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("El " + num1 + " es el mayor");
		} else if (num2 >= num3 && num2 >= num1) {
			System.out.println("El " + num2 + " es el mayor");
		} else {
			System.out.println("El " + num3 + " es el mayor");
		}

		sc.close();

	}

}
