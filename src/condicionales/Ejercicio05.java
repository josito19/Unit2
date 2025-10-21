package condicionales;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		//Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);
		
		//distancia y dias almacenarán los datos de consola
		int distancia;
		int dias;
		double resultado;
		//El precio por kilómetro lo guardamos en la constante PRECIO_KM
		final double PRECIO_KM = 2.5;
		
		System.out.println("Introduzca la distancia a recorrer:");
		distancia = sc.nextInt();
		System.out.println("Introduzca los dias que se alojará:");
		dias = sc.nextInt();
		
		resultado = distancia * PRECIO_KM;
		
		if (dias > 7 && distancia > 800) {
			resultado -= (resultado * 0.30); 
		}
		System.out.println(resultado);
		
		sc.close();
	}

}
