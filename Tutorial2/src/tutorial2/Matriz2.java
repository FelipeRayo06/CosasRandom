package tutorial2;

import tutorial2.Matrices;

public class Matriz2 extends Matrices {
 
	public static void main(String[] args) {
		Matriz2 ma = new Matriz2();
		ma.cargar();
		ma.imprimir();
		ma.imprimirVertices();
	}
	
	public void imprimirVertices() {
		int x = filas-1;
		int y = columnas-1;
		System.out.println("Vértice 1: " + mat[0][0]);
		System.out.println("Vértice 2: " + mat[0][y]);
		System.out.println("Vértice 3: " + mat[x][0]);
		System.out.println("Vértice 4: " + mat[x][y]);
  
	}
}
