package boletin05dowhile;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		String opcion;
		double num1;
		double num2;
		double suma = 0;

		do {
			// Solicitamos el número y lo guardamos, lo mismo con el segundo
			System.out.println("Introduce un número: ");
			num1 = sc.nextInt();

			System.out.println("Introduce el segundo número");
			num2 = sc.nextInt();
			sc.nextLine();

			// Operacion a realizar
			System.out.println("A.Sumar");
			System.out.println("B.Restar");
			System.out.println("C.Multiplicar");
			System.out.println("D.Dividir");
			System.out.println("E.Salir");
			System.out.println("Seleccione: ");
			opcion = sc.nextLine().toUpperCase();

			switch (opcion) {
			case "A" -> {
				suma = num1 + num2;
				System.out.println(suma);
			}
			case "B" -> {
				suma = num1 - num2;
				System.out.println(suma);

			}
			case "C" -> {
				suma = num1 * num2;
				System.out.println(suma);
			}
			case "D" -> {
				if (num1 == 0) {
					System.out.println("Error. No se puede dividir entre cero.");
				} else {
					suma = num1 / num2;
					System.out.println(suma);
				}
			}
			case "E" -> {
				System.out.println("Adioooos");
			}
			default -> {
				System.out.println("Inserte una opción válida");
			}
			}
		} while (!opcion.equals("E"));

		sc.close();
	}

}
