package boletin04while;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		double num;
		int contador = 1;
		double numExtra = 0;
		double media;

		// Solicitamos al usuario un número y lo guardamos en num
		System.out.println("Introduce a number: ");
		num = sc.nextInt();

		// Contador incrementa por cada iteración, sumamos los números extras y
		// solicitamos siguiente número
		while (contador != 10) {
			contador++;
			numExtra += num;
			System.out.println("Introduce another number: ");
			num = sc.nextInt();
		}

		// Calculo de la media y mostramos por pantalla
		media = numExtra / contador;
		System.out.println("La media es " + media);
		sc.close();

	}

}
