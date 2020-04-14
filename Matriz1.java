package tutorial2;

import tutorial2.Matrices;

public class Matriz1 extends Matrices {
	
	public static void main(String[] args) {
		Matriz1 ma = new Matriz1();
		ma.cargar();
		ma.imprimir();
		ma.cambiarfila1y2();
		System.out.println("El intercambio de la primera con la segunda fila queda así");
		ma.imprimir();
	}
	
	public void cambiarfila1y2() {
		int aux;
        for(int c = 0; c != mat[0].length; ++c) {
            aux = mat[0][c];
            mat[0][c] = mat[1][c];
            mat[1][c] = aux;
        }  
	}		
}
