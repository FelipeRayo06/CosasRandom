package sesion2;

import java.util.Scanner;

public class CondicionalSi {
	public static void main(String [] args ) {
		Scanner captura = new Scanner(System.in);
		int num1, num2;
		System.out.println("Digite num1");
		num1 = captura.nextInt();
		System.out.println("Digite num2");
		num2 = captura.nextInt();
		if(num1>num2) {
			System.out.println("El numero mayor es "+ num1);
		}else {
			System.out.println("El numero mayor es "+ num2);
		}
	
	}

}
