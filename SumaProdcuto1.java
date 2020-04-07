package sesion2;

import java.util.Scanner;

public class SumaProdcuto1 {
	public static void main(String [] args) {
		Scanner teclado = new Scanner(System.in);
		float num1,num2,suma,multiplicacion;
		System.out.println("Digite un numero");
		num1 = teclado.nextFloat();
		System.out.println("Digite un numero");
		num2 = teclado.nextFloat();
		suma = num1 + num2;
		multiplicacion = num1 * num2;
		System.out.println("La Suma es "+suma);
		System.out.println("La Multiplicacion es "+multiplicacion);
	}
}
