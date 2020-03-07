/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * Data: 09/02/20
 */

package vetores_e_matrizes;

public class Lt01_ex_vt10 {
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[8][8];
		int valor = 1;
		
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++) {
				matriz[i][j] = valor;
				valor *= 2;
			}
		
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				System.out.println(matriz[i][j]);
	}

}