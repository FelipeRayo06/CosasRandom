package tutorial2;

import java.util.Scanner;

public class ProblemaVector {
	private Scanner input;
    private int[] numeros;
    private int suma=0;
	
	public static void main(String [] args) {
		ProblemaVector numero = new ProblemaVector();
		numero.cargar();
		numero.sumar();
	}
	
	public void cargar(){
         input = new Scanner(System.in);
         System.out.print("Cuantos numeros ingresará:");
         int cant;
         cant=input.nextInt();
        numeros= new int[cant];
        for(int f=0; f<numeros.length; f++) {
            System.out.print("Ingrese numero:");
            numeros[f] = input.nextInt();
        }	
    }
	
	public void sumar() {
		for (int f = 0; f < numeros.length; f++) {
			 suma = numeros[f]+suma;
		}
		 System.out.println("La suma de los numeros ingresados es: "+suma);
	}

}
