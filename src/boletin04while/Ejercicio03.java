package boletin04while;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		double num;
		int contador = 0;
		double numExtra = 0;
		double media;

		// Solicitamos al usuario un número y lo guardamos en num
		System.out.println("Introduce un número: ");
		num = sc.nextInt();

		// Vamos contando cuantos numeros se añaden
		while (num >= 0) {
			contador++;
			numExtra += num;
			System.out.println("Introduce otro número: ");
			num = sc.nextInt();
		}

		// Calculamos la media y la mostramos por pantalla
		media = numExtra / contador;
		System.out.println("The mean of the numbers is " + media);
		// Close scanner
		sc.close();

	}

}
