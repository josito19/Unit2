package boletin05dowhile;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		final String piedra = "piedra";
		final String papel = "papel";
		final String tijeras = "tijeras";

		String jugada1;
		String jugada2;
		String otra;

		do {
			// Solicitamos al usuario la jugada
			System.out.println("Jugador 1: ¿Piedra, papel o tijeras?");
			jugada1 = sc.nextLine();
			System.out.println("Jugador 2: ¿Piedra, papel o tijeras?: ");
			jugada2 = sc.nextLine();

			if (!jugada1.equalsIgnoreCase(papel) && !jugada1.equalsIgnoreCase(tijeras)
					&& !jugada1.equalsIgnoreCase(piedra) && jugada2.equalsIgnoreCase(papel)
					&& jugada2.equalsIgnoreCase(tijeras) && jugada2.equalsIgnoreCase(piedra)) {
				System.out.println("Error");
			} else if ((jugada1.equalsIgnoreCase(papel) && jugada2.equalsIgnoreCase(tijeras))
					|| (jugada1.equalsIgnoreCase(tijeras) && jugada2.equalsIgnoreCase(piedra))
					|| (jugada1.equalsIgnoreCase(piedra) && jugada2.equalsIgnoreCase(papel))) {
				System.out.println("Gana el jugador 2");
			} else if (jugada1.equalsIgnoreCase(jugada2)) {
				System.out.println("Empate");
			} else {
				System.out.println("Gana el jugador 1");
			}
			System.out.println("¿Queréis seguir jugando? s/n");
			otra = sc.nextLine();
		} while (otra.equalsIgnoreCase("s"));
		sc.close();
	}

}
