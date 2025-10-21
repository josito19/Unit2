package diagrams;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// Creacion del escaner y las variables
		Scanner sc = new Scanner(System.in);

		double horasTrabajadas;
		double tarifaHoras;
		double salarioBruto;
		double salarioNeto;
		double tasas;
		
		//Solicitamos el número de horas y la tarifa
		System.out.println("Horas trabajadas:");
		horasTrabajadas = sc.nextDouble();
		System.out.println("Tarifa horas:");
		tarifaHoras = sc.nextDouble();

		
		//Calculamos las tasas segun los datos introducidos
		if (horasTrabajadas < 35) {
			salarioBruto = horasTrabajadas * tarifaHoras;
		} else {
			salarioBruto = 35 * tarifaHoras + (horasTrabajadas - 35) * tarifaHoras * 1.5;
		}

		if (salarioBruto <= 500) {
			if (salarioBruto <= 900) {
				tasas = salarioBruto * 0.45;
				salarioNeto = salarioBruto - tasas;
			} else {
				tasas = salarioBruto * 0.25;
				salarioNeto = salarioBruto - tasas;
			}
		} else {
			tasas = salarioBruto * 0.25;
			salarioNeto = salarioBruto - tasas;
		}

		// Mostramos el nombre, salarioBruto, tasas y salarioNeto
		System.out.println("El empleado cobra:");
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Salario Neto: " + salarioNeto);
		System.out.println("Tasas: " + tasas);

		sc.close();
	}

}
