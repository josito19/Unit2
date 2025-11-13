package boletin05dowhile;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// contador irá incrementando su valor en uno
		int contador = 0;

		// suma almacena la suma del contador hasta max
		int suma = 0;

		// max almacena el numero maximo a sumar
		int max;

		// Solicitamos y almacenamos en max el máximo
		System.out.println("¿Hasta que número?");
		max = sc.nextInt();

		do {

			// contador va aumentando y suma lo va sumando y almacenando cada vez
			contador++;
			suma += contador;

			// Mientras contador sea menor o igual que el max establecido
		} while (contador <= max);

		// Mostramos la suma
		System.out.println("La suma es: " + suma);

		sc.close();
	}

}
