package boletin2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		// Declaramos las variables
		int nota;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Pedimos la nota
		System.out.print("Dime la nota: ");
		nota = sc.nextInt();
		
		//Switch para saber si es induficiente, suficiente, bien, notable y sobresaliente
		switch (nota) {
		case 0, 1, 2, 3, 4 -> {
			System.out.println("Insuficiente");
			System.out.println("Vaya mierda me has hecho");
		}
		case 5 -> {
			System.out.println("Suficiente");
			System.out.println("Aprobado esta peroo...");
		}
		case 6 -> {
			System.out.println("Bien");
			System.out.println("No esta mal");
		}
		case 7, 8 -> {
			System.out.println("Notable");
			System.out.println("De lujo chava");
		}
		case 9, 10 -> {
			System.out.println("Sobresaliente");
			System.out.println("Vaya dios");
		}
		default -> {
			System.out.println("La nota no es valida");
		}
		}

	}

}
