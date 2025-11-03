package switchexercises;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		int numero1 = 0;
		int numero2 = 0;
		int suma;

		String tirada1;
		String tirada2;

		System.out.println("Primera tirada:");
		tirada1 = sc.next();
		switch (tirada1) {
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
		tirada2 = sc.next();
		switch (tirada2) {
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
		default:
			System.out.println("Tirada errónea");
		}

		suma = numero1 + numero2;
		if (suma == 0) {
			System.out.println("Error");
		} else {
			System.out.println(suma);
		}

		sc.close();
	}

}
