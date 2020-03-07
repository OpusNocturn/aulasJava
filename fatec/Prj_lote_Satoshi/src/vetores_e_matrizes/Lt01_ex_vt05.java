/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
[SIGMA] (A[1] – A[21–1])
i = 1
 * Data: 09/02/20
 */

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt05 {
	
	public static void main(String[] args) {
		
		int vt[] = new int [20];
		
		for(int i = 0; i < 20; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		int somatoria = 0;
		
		int i = 0, j = 19;
		while(i < 20 && j > 1) {
			somatoria += vt[i] + vt[j];
			System.out.println(vt[i] + ", " + vt[j]);
			
			i++;
			j--;
		}
		System.out.println("Somatória: " + somatoria);
		
	}

}
