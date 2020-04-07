package sesion2;

import java.util.Scanner;

public class ParesEImpares {
	
	public static void main(String [] args) {
		
		Scanner input = new Scanner(System.in);
		int x, num, numeros, pares, impares;
		pares = 0;
		impares = 0;
		x=0;
		
		System.out.println("¿Cuantos números va a ingresar?");
		numeros=input.nextInt();
		while(x<numeros) {
			do {
				System.out.println("Digite un numero");
				num=input.nextInt();
			}while(num<0);
			if(num%2==0) {
				pares++;
			}else {
				impares++;
			}
			x++;
		}
		System.out.println("Cantidad de numero pares ingresados: "+pares);
		System.out.println("Cantidad de numeros impares ingresados: "+impares);
	}	
	
}
