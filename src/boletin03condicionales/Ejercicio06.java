package boletin03condicionales;

import java.util.Scanner;

/*
 * E = 2 2024, R.E = El mes 2 del año 2024 tiene 29 días, R.O = El mes 2 del año 2024 tiene 29 días
 * E = 2 2023, R.E = El mes 2 del año 2023 tiene 28 días, R.O = El mes 2 del año 2023 tiene 28 días
 * E = 4 2025, R.E = El mes 4 del año 2025 tiene 30 días, R.O = El mes 4 del año 2025 tiene 30 días
 */

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creación del escáner y las variables
		Scanner sc = new Scanner(System.in);

		// Variables para el mes, año y días
		int mes;
		int ano;
		int dias = 0;

		// Pedimos los datos al usuario
		System.out.println("Introduzca el número del mes (1-12):");
		mes = sc.nextInt();

		System.out.println("Introduzca el año:");
		ano = sc.nextInt();

		// Comprobamos si el mes es válido
		if (mes >= 1 && mes <= 12) {

			switch (mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				dias = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				dias = 30;
				break;
			case 2:
				// Comprobamos si el año es bisiesto
				if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
					dias = 29;
				} else {
					dias = 28;
				}
				break;
			}

			// Mostramos el resultado
			System.out.println("El mes " + mes + " del año " + ano + " tiene " + dias + " días.");
		} else {
			System.out.println("Debe introducir un número de mes válido (1-12).");
		}

		sc.close();

	}

}
