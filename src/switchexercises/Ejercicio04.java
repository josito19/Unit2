package switchexercises;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		int suma;

		System.out.println("Primera tirada:");
		switch (sc.next()) {
		case "UNO":
			numero1 = 1;
			break;
		case "DOS":
			numero1 = 2;
			break;
		case "TRES":
			numero1 = 3;
			break;
		case "CUATRO":
			numero1 = 4;
			break;
		case "CINCO":
			numero1 = 5;
			break;
		case "SEIS":
			numero1 = 6;
			break;
		}
		System.out.println("Segunda tirada:");
		switch (sc.next()) {
		case "UNO":
			numero2 = 1;
			break;
		case "DOS":
			numero2 = 2;
			break;
		case "TRES":
			numero2 = 3;
			break;
		case "CUATRO":
			numero2 = 4;
			break;
		case "CINCO":
			numero2 = 5;
			break;
		case "SEIS":
			numero2 = 6;
			break;
		}

		suma = numero1 + numero2;

		System.out.println(suma);

		sc.close();
	}

}
