package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creacion del random, el escaner y de las variables
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();

		// min y max serán los límites de generación de número aleatorio
		int min = 1;
		int max = 101;

		// numAleatorio almacena el número aleatorio
		int numAleatorio;

		// Respuesta almacena la respuesta del usuario
		String respuesta;

		do {
			// Se crea y muestra el número aleatorio
			numAleatorio = rand.nextInt(min, max);
			System.out.println(numAleatorio + "\r¿Tu número es mayor, menor o igual?");
			respuesta = sc.nextLine();

			// Si el numero aleatorio es mayor o menor modificamos los límites
			if (respuesta.equalsIgnoreCase("mayor")) {
				min = numAleatorio + 1;
			} else if (respuesta.equals("menor")) {
				max = numAleatorio;
			}

			// Cuando el usuario escriba igual se cierra el bucle
		} while (!respuesta.equalsIgnoreCase("igual"));

		sc.close();
	}

}
