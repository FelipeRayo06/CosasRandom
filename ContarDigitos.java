package sesion2;

import java.util.Scanner;

public class ContarDigitos {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("Digite un numero");
		num = input.nextInt();
		if(num>0 && num<10) {
			
			System.out.println("El numero tiene 1 digito");
			
		}else if(num>=10 && num<100) {
			
			System.out.println("El numero tiene 2 digitos");
			
		}else if(num>=100 && num<1000) {
			
			System.out.println("El numero tiene 3 digitos");
		}
	}

}
