package boletin01ifelse;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		String jugador1;
		String jugador2;

		// Pedir la jugada y almacenarla
		System.out.println("Jugador 1:");
		jugador1 = sc.next();
		System.out.println("Jugador 2:");
		jugador2 = sc.next();

		// Analizamos los casos posibles y mostramos el ganador
		if (jugador1.equalsIgnoreCase(jugador2)) {
			System.out.println("Empate");
		} else if (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Tijeras")) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase("Piedra") && jugador2.equalsIgnoreCase("Papel")) {
			System.out.println("Gana el jugador 2");
		} else if (jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Piedra")) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase("Papel") && jugador2.equalsIgnoreCase("Tijeras")) {
			System.out.println("Gana el jugador 2");
		} else if (jugador1.equalsIgnoreCase("Tijeras") && jugador2.equalsIgnoreCase("Papel")) {
			System.out.println("Gana el jugador 1");
		} else if (jugador1.equalsIgnoreCase("Tijeras") && jugador2.equalsIgnoreCase("Piedra")) {
			System.out.println("Gane el jugador 2");
		}

		sc.close();
	}

}
