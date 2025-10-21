package diagrams;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// Las variables horas, minutos y segundos almacenarán las horas minutos y
		// segundos
		int horas;
		int minutos;
		int segundos;

		// Solicitamos los datos y los asignamos a las variables
		System.out.println("Introduca las horas:");
		horas = sc.nextInt();
		System.out.println("Introduca los minutos:");
		minutos = sc.nextInt();
		System.out.println("Introduca los segundos:");
		segundos = sc.nextInt();

		if (segundos < 59) {
			segundos++;
		} else {
			segundos = 0;
			if (minutos < 59) {
				minutos++;
			} else {
				minutos = 0;
				if (horas < 23) {
					horas++;
				} else {
					horas = 0;
				}
			}
		}

		// Mostramos horas minutos y segundos
		System.out.println(horas + ":" + minutos + ":" + segundos);

		sc.close();
	}

}
