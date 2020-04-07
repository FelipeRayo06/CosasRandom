package sesion2;

import java.util.Scanner;

public class CalcularSueldo {
	
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		int horasTrabajadas;
		float valorHora;
		float Sueldo;
		System.out.println("Digite las horas");
		horasTrabajadas = teclado.nextInt();
		System.out.println("Digite el valor de la hora");
		valorHora = teclado.nextInt();
		Sueldo = horasTrabajadas * valorHora;
		System.out.println("Su sueldo es "+Sueldo);
	}
}
