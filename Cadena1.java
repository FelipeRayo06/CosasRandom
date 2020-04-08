package sesion2;

import java.util.Scanner;

public class Cadena1 {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		String name1, name2;
		
		System.out.println("Digite su nombre 1");
		name1 = input.next();
		System.out.println("Digite su nombre 2");
		name2 = input.next();
		if (name1.equals(name2)) {
			System.out.println("Nombres Iguales " + name1);
		}else {
			System.out.println("Hola "+name1+" "+name2);
		}
		
	}

}
