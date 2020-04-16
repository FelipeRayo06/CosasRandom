package tutorial2;

import java.util.Scanner;

public class VectorMayor {
	
	private Scanner input;
	private String[] nombres;
	private float[] sueldos;
	
	public static void main(String[] ar) {
		VectorMayor pv=new VectorMayor();
		pv.cargar();
		pv.mayorSueldo();
	}

	public void cargar() {
		input=new Scanner(System.in);
		nombres=new String[5];
		sueldos=new float[5];
		for(int f=0;f<nombres.length;f++) {
			System.out.print("Ingrese el nombre del empleado:");
			nombres[f]=input.next();
			System.out.print("Ingrese el sueldo:");
			sueldos[f]=input.nextFloat();
		}
	}

	public void mayorSueldo() {
		float mayor;
		int pos;
		mayor=sueldos[0];
		pos=0;
		for(int f=1;f<nombres.length;f++) {
			if (sueldos[f]>mayor) {
				mayor=sueldos[f];
				pos=f;
			}
		}
		System.out.println("El empleado con sueldo mayor es "+nombres[pos]);
		System.out.println("Tiene un sueldo:"+mayor);
	}

	
}

