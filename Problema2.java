package sesion2;
import java.util.Scanner;
public class Problema2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, triangulos, equilateros=0, isoceles=0, escalenos=0;
		float lado1=0, lado2=0, lado3=0;
		System.out.println("Triángulos a ingresar");
		triangulos = input.nextInt();
		for(i=1; i<=triangulos; i++) {
			System.out.println("Ingrese los valores de un triangulo");
			System.out.println("Ingrese el valor del lado 1");
			lado1= input.nextInt();
			System.out.println("Ingrese el valor del lado 2");
			lado2= input.nextInt();
			System.out.println("Ingrese el valor del lado 3");
			lado3= input.nextInt();
			
			if(lado1 == lado2 & lado1 == lado3 & lado2 == lado3) {
				
				equilateros++;
				
			}else if (lado1 == lado2 | lado1 ==lado3 | lado2 == lado3) {
				
				isoceles++;
			}else {
				escalenos++;
			}		
		}
		
		System.out.println("Triangulos equilateros ingresados"+equilateros);
		System.out.println("Triangulos isoceles ingresados"+isoceles);
		System.out.println("Triangulos escalenos ingresados"+escalenos);
		
		if(equilateros>isoceles & equilateros>escalenos & isoceles>escalenos) {
			System.out.println("Triangulos equilateros ingresados"+equilateros);
		}
		
	}
}
