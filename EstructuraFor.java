package sesion2;
import java.util.Scanner;

public class EstructuraFor {
	public static void main (String[]args) {
		Scanner teclado = new Scanner(System.in);
		int x,num,suma = 0,promedio = 0;
		
//		for(x=1; x<=10; x=x+2) {
//			System.out.println(x);
//		}
		
		for(x=1; x<=10; x++) {
			System.out.println("Digite un numero");
			num = teclado.nextInt();
			suma=num+num;
				
		}
		promedio = suma/10;
		System.out.println("La Suma es: "+ suma);
		System.out.println("El promedio es: "+ promedio);
	}
	
}
