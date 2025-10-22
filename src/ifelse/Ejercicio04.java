package ifelse;

import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y de las variables
		Scanner sc = new Scanner(System.in);

		// numero almacenará el número introducido por teclado
		int numero;

		// Solicitamos el numero y lo guardamos en la variable
		System.out.println("Introduzca un número entre 0 y 99999");
		numero = sc.nextInt();

		// Comprobamos que esté dentro del rango y vamos viendo cuantas cifras tiene
		// para
		// mostrarlo por pantalla
		if (numero < 0 || numero > 99999) {
			System.out.println("Fuera de rango");
		} else if (numero <= 9) {
			System.out.println("Tiene una cifra");
		} else if (numero <= 99) {
			System.out.println("Tiene dos cifras");
		} else if (numero <= 999) {
			System.out.println("Tiene tres cifras");
		} else if (numero <= 9999) {
			System.out.println("Tiene cuatro cifras");
		} else if (numero <= 99999) {
			System.out.println("Tiene cinco cifras");
		}

		sc.close();
	}

}
