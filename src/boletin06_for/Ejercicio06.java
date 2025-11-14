package boletin06_for;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// usuario almacena las notas del usuario
		int usuario;
		// suspenso será true si hay algun suspenso y false sino
		boolean suspenso = false;

		// Valoramos las notas para ver si hay suspensos
		for (int i = 1; i <= 5; i++) {
			usuario = sc.nextInt();
			if (usuario < 5) {
				suspenso = true;
			}

		}

		// Mostramos si hay o no suspensos
		System.out.println(suspenso ? "Ha suspenido" : "No ha suspendido");

		sc.close();

	}

}
