/*
 * Nome: Gabriel Pimentel
 * Objetivo:
Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.
 * Data: 09/02/20
 */

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt02 {
	
	public static void main(String[] args) {
		
		double media = 0;
		int maior = -10000;
		int menor = 10000;
		int[] vt = new int[100];
		
		for(int i = 0; i < 100; i++) {
			
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
			
			media += vt[i];
			
		}
		
		for(int i = 0; i < 100; i++) {
			if(vt[i] > maior) {
				maior = vt[i];
			}else if(vt[i] < menor){
				menor = vt[i];
			}
		}
		
		media /= 100;
		
		System.out.println("Maior valor: " + maior + "\nMenor valor: " + menor + "\nMédia: " + media);
	}

}
