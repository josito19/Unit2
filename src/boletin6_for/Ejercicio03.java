package boletin6_for;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);
		// num guarda los números introducidos
		int num = 0;
		// media suma los números introducidos y luego divide entre 10
		double media = 0;

		for (int i = 0; i <= 9; i++) {
			num = sc.nextInt();
			media += num;
		}
		
		System.out.println(media / 10);

		sc.close();
	}

}
