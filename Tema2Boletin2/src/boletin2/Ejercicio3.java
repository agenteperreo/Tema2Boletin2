package boletin2;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		// Declaramos las variables
		double num1, num2;
		char seleccion;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos los numeros
		System.out.print("Dime un numero: ");
		num1 = sc.nextDouble();
		System.out.print("Dime otro numero: ");
		num2 = sc.nextDouble();

		// Menu
		System.out.printf(
				"A. SUMAR LOS NUMEROS\nB. RESTAR LOS NUMEROS\nC. MULTIPLICAR LOS NUMEROS\nD. DIVIDIR LOS NUMEROS\n");

		// Seleccion
		seleccion = sc.next();

		// Ifs
		if (seleccion == 'A') {
			num1 = +num2;
			System.out.printf("La suma es %.2f", num1);
		} else if (seleccion == 'B') {
			num1 = -num2;
			System.out.printf("La resta es %.2f", num1);
		} else if (seleccion == "C") {
			num1 *= num2;
			System.out.printf("La multiplicacion es %.2f", num1);
		} else if (seleccion == "D") {
			if (num2 == 0) {
				System.out.println("El divisor es 0 por lo que no se puede dividir");
			} else {
				num1 /= num2;
				System.out.printf("La division es %.2f", num1);
			}
		} else {
			System.out.printf("La opcion elegida no es valida");
		}
		
		//Cerramos el escanner
		sc.close();
	}

}
