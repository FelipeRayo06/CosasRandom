package tutorial2;

import java.util.Scanner;

public class VectorMenor {
	private Scanner input;
    private int[] numeros;
   private boolean seRepite = false;
	
	public static void main(String [] args) {
		VectorMenor numero = new VectorMenor();
		numero.cargar();
		numero.menor();
	}
	
	public void cargar(){
        input = new Scanner(System.in);
        System.out.print("Cuantos numeros ingresará:");
        int cant;
        cant=input.nextInt();
        numeros= new int[cant];
        for(int f = 0; f < numeros.length; f++) {
            System.out.print("Ingrese numero:");
            numeros[f] = input.nextInt();
        }	
    }
	
	public void menor() {
		float menor;
		int rep = 0;
		menor=numeros[0];
		for(int f = 0; f < numeros.length; f++) {
			
			if (numeros[f] < menor) {
				menor = numeros[f];	
			}
			if(numeros[f] == menor) {
				seRepite = true;
				rep++;
			}
		}
		System.out.println("El numero menor es "+ menor);
		if(seRepite ) {
			System.out.println("El numero se repite "+ rep + " veces");
		}else {
			System.out.println("El numero no se repite");
		}
		
	}

}