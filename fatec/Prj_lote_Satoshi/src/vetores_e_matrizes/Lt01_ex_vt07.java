/*
 * Nome: Gabriel Pimentel
 * Objetivo: A partir do exercício 6 (vetor classificado) solicitar um valor qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
 * Data: 09/02/20
 */

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt07 {
	
	public static void main(String[] args) {
		int vt[] = new int [20];
		int aux;
		for(int i = 0; i < 20; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		for(int i = 0; i < 20; i++) {
			for(int j = i + 1; j < 20; j++) {
				if(vt[i] > vt[j]) {
					aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		for(int i = 0; i < 20; i++) {
			System.out.println(vt[i]);
		}
		
		System.out.println("Vetor ordenado!");
		
		int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que você quer procurar:"));
		
		int inicio = 0, fim = 19;
		
		int meio;
		boolean encontrado = false;
		while(inicio <= fim){
		
		meio = ((fim + inicio) / 2);
		
			if(vt[meio] == escolha){
				encontrado = true;
		        System.out.println("Valor encontrado na posição: " + meio);
		        break;
		     }
	
			else if(escolha > vt[meio]){
		        
		        inicio = meio + 1;
		      }else{
		        fim = meio - 1;
		      }
		
		}
		if(encontrado == false) {
			System.out.println("Valor não encontrado.");
		}
	}
}
