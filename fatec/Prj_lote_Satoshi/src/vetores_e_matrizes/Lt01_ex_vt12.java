/*
 * Nome: Gabriel Pimentel
 * Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
 * Data: 09/02/20
 */

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt12 {
	
	public static void main(String[] args) {
		int pecas[][] = new int[3][3];
		
		int qtdPecas[] = new int[7];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				do {
					pecas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor nas coordenadas " + i + ", " + j));
				}while(pecas[i][j] < 0 || pecas[i][j] > 6);	
				
				qtdPecas[pecas[i][j]]++;
				
			}
		}
		
		for(int i = 0; i < 7; i++)
			System.out.println("Posição " + i + ": " + qtdPecas[i]);
	}
}