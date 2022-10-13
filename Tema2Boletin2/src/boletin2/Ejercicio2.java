package boletin2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		//Declaramos las variables
		int dia;
		
		//Abrimos el escaner
		Scanner sc = new Scanner(System.in);
		
		//Pedimos el numerod el dia
		System.out.print("Dime el dia en numero: ");
		dia = sc.nextInt();
		
		//Switch para saber que dia es
		switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sabado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		default:
			System.out.println("Dia no valido");
		}
		
		sc.close();
		
	}

}
