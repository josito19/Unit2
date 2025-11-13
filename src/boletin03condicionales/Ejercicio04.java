package boletin03condicionales;

import java.util.Random;
import java.util.Scanner;

/* numRand1 = 3 numRand2 = 5
 * E = 8 R.E = Correcto R.O = Correcto
 * E = 9 R.E = Incorrecto R.O = Incorrecto
 */
public class Ejercicio04 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		// numRand1 y 2 almacenan los numeros aleatorios
		int numRand1;
		int numRand2;

		// suma almacena la suma de los numeros randoms
		int suma;

		// sumaUsuario almacena la suma introducida por el usuario
		int sumaUsuario;

		// Creamos los dos numeros aleatorios y los asignamos a sus variables
		Random rand = new Random();
		numRand1 = rand.nextInt(1, 100);
		numRand2 = rand.nextInt(1, 100);

		// Sumamos los numeros y lo guardamos en suma
		suma = numRand1 + numRand2;

		// Solicitamos al usuario el resultado de la suma
		System.out.println("Introduzca el resultado de sumar " + numRand1 + " y " + numRand2);
		sumaUsuario = sc.nextInt();
		System.out.println(sumaUsuario == suma ? "Correcto" : "Incorrecto, la suma es " + suma);

		sc.close();
	}

}
