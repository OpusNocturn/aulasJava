/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e carregar uma matriz [4][4] com valores aleatórios, sendo que a diagonal principal terá seus dados carregados no programa segundo:
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt09 {
	
	public static void mostraMatriz(int matriz[][]) {
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++)
				System.out.println(matriz[i][j]);
	}
	
	public static int[][] preencheMatriz(int matriz[][]) {
		int valor = 1;
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 4; j++) {
				if(i == j) {
					matriz[i][j] = valor;
					valor *= 4;
				}else {
					matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor nas coordenadas " + i + ", " + j));
				}
			}
		return matriz;
	}
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		
		int[][] matrizPreenchida = preencheMatriz(matriz);
		
		mostraMatriz(matrizPreenchida);
	}

}