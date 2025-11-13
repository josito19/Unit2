package boletin03condicionales;

import java.util.Scanner;

/*
 * E = 12345678, R.E = La letra del DNI es Z, R.O = La letra del DNI es Z
 * E = 00000000, R.E = La letra del DNI es T, R.O = La letra del DNI es T
 * E = 11111111, R.E = La letra del DNI es H, R.O = La letra del DNI es H
 */

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creación del escáner y las variables
		Scanner sc = new Scanner(System.in);

		// numeroDNI almacena el número introducido por el usuario
		int numeroDNI;
		int resto;
		char letra = ' ';

		// Solicitamos el número de DNI
		System.out.println("Introduzca el número de DNI (sin letra):");
		numeroDNI = sc.nextInt();

		// Comprobamos que está dentro del rango válido
		if (numeroDNI >= 0 && numeroDNI <= 99999999) {

			// Calculamos el resto al dividir entre 23
			resto = numeroDNI % 23;

			// Determinamos la letra según el resto usando switch
			switch (resto) {
			case 0:
				letra = 'T';
				break;
			case 1:
				letra = 'R';
				break;
			case 2:
				letra = 'W';
				break;
			case 3:
				letra = 'A';
				break;
			case 4:
				letra = 'G';
				break;
			case 5:
				letra = 'M';
				break;
			case 6:
				letra = 'Y';
				break;
			case 7:
				letra = 'F';
				break;
			case 8:
				letra = 'P';
				break;
			case 9:
				letra = 'D';
				break;
			case 10:
				letra = 'X';
				break;
			case 11:
				letra = 'B';
				break;
			case 12:
				letra = 'N';
				break;
			case 13:
				letra = 'J';
				break;
			case 14:
				letra = 'Z';
				break;
			case 15:
				letra = 'S';
				break;
			case 16:
				letra = 'Q';
				break;
			case 17:
				letra = 'V';
				break;
			case 18:
				letra = 'H';
				break;
			case 19:
				letra = 'L';
				break;
			case 20:
				letra = 'C';
				break;
			case 21:
				letra = 'K';
				break;
			case 22:
				letra = 'E';
				break;
			default:
				System.out.println("Error al calcular la letra.");
				break;
			}

			System.out.println("La letra del DNI es: " + letra);

		} else {
			System.out.println("Debe introducir un número de DNI válido (0 - 99999999).");
		}

		sc.close();
	}

}
