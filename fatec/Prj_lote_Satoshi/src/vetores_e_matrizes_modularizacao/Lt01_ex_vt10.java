/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar uma matriz [8][8] onde o programa irá carregar segundo:
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

public class Lt01_ex_vt10 {
	
	public static int[][] preencheMatriz(int matriz[][]) {
		int valor = 1;
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++) {
				matriz[i][j] = valor;
				valor *= 2;
			}
		return matriz;
	}
	
	public static void mostraMatriz(int matriz[][]) {
		for(int i = 0; i < 8; i++)
			for(int j = 0; j < 8; j++)
				System.out.println(matriz[i][j]);
	}
	
	public static void main(String[] args) {
		
		int matriz[][] = new int[8][8];
		
		int[][] matrizPreenchida = preencheMatriz(matriz);
		mostraMatriz(matrizPreenchida);
	}

}