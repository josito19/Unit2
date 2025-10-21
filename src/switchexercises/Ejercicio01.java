package switchexercises;

import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);
		// mensaje almacenará el mensaje a mostrar segun la nota
		String mensaje;
		// nota almacena la nota del usuario
		int nota;

		// Solicitamos al usuario la nota y la guardamos en nota
		System.out.println("Introduzca su nota:");
		nota = sc.nextInt();

		// Comparamos la nota y le asignamos un valor segun corresponda
		mensaje = switch (nota) {
		case 0, 1, 2, 3, 4:
			yield "Insuficiente";
		case 5:
			yield "Suficiente";
		case 6:
			yield "Bien";
		case 7, 8:
			yield "Notable";
		case 9, 10:
			yield "Sobresaliente";
		default:
			throw new IllegalArgumentException("Unexpected value: " + nota);
		};

		// Mostramos el mensaje segun la nota
		System.out.println(mensaje);
		sc.close();
	}

}
