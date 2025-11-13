package boletin01ifelse;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numeroA B y C guardarán los numeros introducidos por el usuario
		double numeroA;
		double numeroB;
		double numeroC;
		// resultadoX y neg almacenarán los resultados de la ecuación
		double resultadoX;
		double resultadoNeg;
		// discriminante es el discriminante de le ecuación
		double discriminante;

		// Solicitamos los numeros al usuario y los guardamos
		System.out.println("Introduzca el valor de A:");
		numeroA = sc.nextDouble();
		System.out.println("Introduzca el valor de B:");
		numeroB = sc.nextDouble();
		System.out.println("Introduzca el valor de C:");
		numeroC = sc.nextDouble();

		// Si el discriminante no es negativo realizamos la ecuación y mostramos los
		// resultados
		discriminante = numeroB * numeroB - 4.0 * numeroA * numeroC;
		if (discriminante >= 0) {

			resultadoX = (-numeroB + Math.sqrt(discriminante)) / (2.0 * numeroA);
			resultadoNeg = (-numeroB - Math.sqrt(discriminante)) / (2.0 * numeroA);
			System.out.println(resultadoX);
			System.out.println(resultadoNeg);
		} else {
			System.out.println("Discriminante negativo");
		}

		sc.close();
	}

}
