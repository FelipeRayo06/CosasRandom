package tutorial2;

import java.util.Scanner;

public class Matrices {
	
	private Scanner input;
    protected int[][] mat;
    protected int filas, columnas;

	public static void main(String[] args) {
		Matrices ma = new Matrices();
		ma.cargar();
		ma.imprimir();
		ma.imprimirUltimaFila();
		ma.imprimirMayor();
	}
	
	public void cargar() {
        input = new Scanner(System.in);
        System.out.print("Cuantas fila tiene la matriz:");
        filas = input.nextInt();
        System.out.print("Cuantas columnas tiene la matriz:");
        columnas = input.nextInt();
        mat=new int[filas][columnas];
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print("Ingrese componente:");
                mat[f][c]=input.nextInt();
            }
        }
    }
	
	public void imprimir() {
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                System.out.print(mat[f][c]+" ");
            }
            System.out.println();
        }
    }
	
	public void imprimirUltimaFila() {
    	System.out.println("Ultima fila");
        for(int c=0;c<mat[mat.length-1].length;c++) {
             System.out.print(mat[mat.length-1][c]+" ");
        }
    }
	
	public void imprimirMayor() {
    	int mayor=mat[0][0];
    	int filamay=0;
    	int columnamay=0;
        for(int f=0;f<mat.length;f++) {
            for(int c=0;c<mat[f].length;c++) {
                if (mat[f][c]>mayor) {
                    mayor=mat[f][c];
                    filamay=f;
                    columnamay=c;
                }
            }
        }
        System.out.println(" ");
        System.out.println("El elemento mayor es: "+mayor);
        System.out.println("Se encuentra en la fila: "+filamay+ " y en la columna: "+columnamay);
    }

}
