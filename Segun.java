package sesion2;

import java.util.Scanner;

public class Segun {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		int valor;
		
		System.out.println("Digite un valor");
		valor = input.nextInt();
		switch(valor) {
		
		case 1:
			System.out.println("Uno");
			
			break;
		case 2:
			System.out.println("Dos");
			
			break;
		
		case 3:
			System.out.println("Tres");
			
			break;
		
		default: 	
			System.out.println("Opción no válida");
			
			break;
		
		
		}
	
	}
}
