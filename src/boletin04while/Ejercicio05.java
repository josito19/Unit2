package boletin04while;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		int edad;
		int edadMayor = 0;
		int contador = 0;
		int numExtra = 0;
		double media;

		// Solicitamos al usuario la edad y la guardamos en edad
		System.out.println("Introduce un alumno: ");
		edad = sc.nextInt();

		// Contador incrementa por cada iteración, sumamos los números extras y
		// solicitamos siguiente número, guardamos si hay mayor de edad
		while (edad >= 0) {
			contador++;
			if (edad >= 18) {
				edadMayor++;
			}
			numExtra += edad;
			System.out.println("Introduce el siguiente alumno: ");
			edad = sc.nextInt();
		}

		// Calculo de la media y mostramos por pantalla
		media = (double) numExtra / contador;

		// Mostramos por pantalla los datos de los estudiantes
		System.out.println("La media es " + media + "\rSumatorio de edades: " + numExtra + "\rNº de alumnos: "
				+ contador + "\rMayores de edad: " + edadMayor);

		sc.close();

	}

}
