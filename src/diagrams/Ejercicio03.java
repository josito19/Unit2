package diagrams;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {

		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);
		// Las variables num almacenarán los datos del usuario
		int num1;
		int num2;

		// suma, resta, mutiplicación y división almacenan los resultados de dichas
		// operaciones
		int suma;
		int resta;
		int multiplicacion;
		double division;

		// Preguntamos los números al usuario y los almacenamos
		System.out.println("Introduce el primer número: ");
		num1 = sc.nextInt();

		System.out.println("Introduce el segundo número: ");
		num2 = sc.nextInt();

		// Realizamos las operaciones
		suma = num1 + num2;
		resta = num1 - num2;
		multiplicacion = num1 * num2;

		// Mostramos los resultados
		System.out.println("La suma es: " + suma);
		System.out.println("La resta es: " + resta);
		System.out.println("La multiplicación es: " + multiplicacion);

		// Si el segundo número es cero mostramos error en la división
		if (num2 == 0) {
			System.out.println("No se puede dividir por cero");
		} else {
			division = num1 / num2;
			System.out.println("La división es: " + division);
		}

		sc.close();

	}

}
