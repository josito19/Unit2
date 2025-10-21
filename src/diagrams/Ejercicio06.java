package diagrams;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);

		// num1 y num2 almacenan los datos introducidos por el usuario
		int num1;
		int num2;

		// Solicitamos los números y los asignamos a sus variables
		System.out.println("Introduzca el primer número:");
		num1 = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		num2 = sc.nextInt();

		// Los comparamos y mostramos en orden ascendente
		if (num1 > num2) {
			System.out.println(num2 + "<" + num1);
		} else {
			System.out.println(num1 + "<" + num2);
		}

		sc.close();

	}

}
