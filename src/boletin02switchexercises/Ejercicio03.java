package boletin02switchexercises;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);
		// numero1 y 2 almacenarán el número introducido por el usuario
		double numero1;
		double numero2;

		// letra guardará la respuesta del usuario al menú
		String letra;
		// resultado almacenará el resultado de la operación
		double resultado = 0;

		// Pedimos los dos numeros por pantalla y los almacenamos en sus variables
		System.out.println("Introduzca el primer número:");
		numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo número:");
		numero2 = sc.nextInt();

		// Mostramos el menú de las operaciones y guardamos la respuesta
		System.out.println("A.SUMAR LOS NÚMEROS\r" + "B.RESTAR LOS NÚMEROS\r" + "C.MULTIPLICAR LOS NÚMEROS\r"
				+ "D.DIVIDIR LOS NÚMEROS\r");
		letra = sc.next();

		// Mostramos el resultado de segun que operacion
		switch (letra) {
		case "A":
			resultado = numero1 + numero2;
			break;
		case "B":
			resultado = numero1 - numero2;
			break;
		case "C":
			resultado = numero1 * numero2;
			break;
		case "D":
			resultado = numero1 / numero2;
			break;
		default:
			System.out.println("Incorrecto");

		}
		System.out.println(resultado);

		sc.close();
	}

}
