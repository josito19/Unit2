package switchexercises;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Creación del escáner y de las variables
		Scanner sc = new Scanner(System.in);
		// numero almacenará el número introducido por el usuario
		int numero;

		// mensaje será el mensaje que mostraremos por pantalla
		String mensaje;

		// Pedimos el número al usuario y lo asignamos a la variable
		System.out.println("Introduzca un número del 1 al 7");
		numero = sc.nextInt();

		// Asignamos a mensaje el día de la semana que corresponda al número introducido
		mensaje = switch (numero) {
		case 1:
			yield "Lunes";
		case 2:
			yield "Martes";
		case 3:
			yield "Miércoles";
		case 4:
			yield "Jueves";
		case 5:
			yield "Viernes";
		case 6:
			yield "Sábado";
		case 7:
			yield "Domingo";
		default:
			yield "Fuera de rango";
		};

		// Mostramos el resultado por pantalla
		System.out.println(mensaje);

		sc.close();
	}

}
