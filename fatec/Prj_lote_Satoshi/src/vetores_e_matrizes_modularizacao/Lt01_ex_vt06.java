/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar em um vetor [20] com números aleatórios. Classificar este vetor em ordem crescente e mostre os dados.
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt06 {
	
	public static int[] reordenaVetor(int vt[]) {
		int aux;
		for(int i = 0; i < 20; i++) {
			for(int j = i + 1; j < 20; j++) {
				if(vt[i] > vt[j]) {
					aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		return vt;
	}
	
	public static void main(String[] args) {
		int vt[] = new int [20];
		int aux;
		for(int i = 0; i < 20; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		int[] vetorOrdenado = reordenaVetor(vt);
		
		for(int i = 0; i < 20; i++)
			System.out.println(vetorOrdenado[i]);
	}
}