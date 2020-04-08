package sesion2;

import java.util.Scanner;

public class Triangulo {
	
	private Scanner input;
    private float lado1, lado2, lado3;
    
    public void inicializar() {
    	input=new Scanner(System.in);
    	System.out.println("Ingrese el lado 1 ");
    	lado1 = input.nextFloat();
    	System.out.println("Ingrese el lado 2 ");
    	lado2 = input.nextFloat();
    	System.out.println("Ingrese el lado 3 ");
    	lado3 = input.nextFloat();
    }
    
    public void ladoMayor() {
    	if(lado1 > lado2 & lado1 > lado3 ) {
    		System.out.println("El lado mayor es el lado 1 "+lado1);
    	}else if(lado2 > lado1 & lado2 > lado3  ) {
    		System.out.println("El lado mayor es el lado 2 "+lado2);
    	}else if(lado3 > lado1 & lado3 > lado2) {
    		System.out.println("El lado mayor es el lado 3 "+lado3);
    	}
		
    }
    
    public void equilatero() {
    	if(lado1 == lado2 & lado1 == lado3 & lado2 == lado3 ) {
    		System.out.println("El triangulo es equilatero");
    	}else {
    		System.out.println("El triangulo no es equilatero");
    	}	
    }
    
    public static void main(String[] args) {
    	Triangulo triangulo1;
    	triangulo1 = new Triangulo();
    	triangulo1.inicializar();
    	triangulo1.ladoMayor();
    	triangulo1.equilatero();
    	
    }
    
    
}
