package diagrams;

import java.util.Scanner;

public class Ejercicio09 {

	public static void main(String[] args) {
		// Creamos el escaner y las variables
		Scanner sc = new Scanner(System.in);
		int nota;

		// Solicitamos la nota y la almacenamos
		System.out.println("Introduzca la calificación:");
		nota = sc.nextInt();

		if (nota >= 0 && nota < 3) {
			System.out.println("Muy deficiente");
		} else if (nota >= 3 && nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Bien");
		} else if (nota >= 7 && nota < 9) {
			System.out.println("Notable");
		} else if (nota == 9 || nota == 10) {
			System.out.println("Sobresaliente");
		} else {
			System.out.println("Debe ser un entero del 0 al 10");
		}

		sc.close();
	}

}
