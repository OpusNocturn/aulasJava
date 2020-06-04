/*
 * Nome: Gabriel Pimentel
 * Objetivo: Carregar códigos das peças em um tabuleiro de xadrez, onde:
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt12 {
	
	public static int pecas[][] = new int[3][3];
	public static int qtdPecas[] = new int[7];
	
	//mostra vetor
	public static void mostraVetor(int qtdPecas[]) {
		for(int i = 0; i < 7; i++)
				System.out.println(qtdPecas[i]);
	}
	
	//carrega vetor
	public static void carregaVetor(int pecas[][], int qtdPecas[]) {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				do {
					pecas[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor nas coordenadas " + i + ", " + j));
				}while(pecas[i][j] < 0 || pecas[i][j] > 6);	
				
				qtdPecas[pecas[i][j]]++;
				
			}
		}
	}
	
	public static void main(String[] args) {
		
		carregaVetor(pecas, qtdPecas);
		mostraVetor(qtdPecas);
	}
}