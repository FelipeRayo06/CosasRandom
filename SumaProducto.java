package sesion2;

import java.util.Scanner;

public class SumaProducto {
	
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		double lado;
		double superficie;
		System.out.println("Digite el lado de la superficie");
		lado = teclado.nextFloat();
		superficie = lado * lado;
		System.out.println("La superficie es "+superficie);
	}
	
}
