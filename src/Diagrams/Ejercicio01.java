package Diagrams;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// La variable edad almacena la edad del usuario
		int edad;

		// Preguntamos la edad al usuario y la almacenamos
		edad = sc.nextInt();

		// Si es mayor de edad lo mostramos en pantalla
		if (edad >= 18) {
			System.out.println("Eres mayor de edad.");
		}

		sc.close();
	}

}
