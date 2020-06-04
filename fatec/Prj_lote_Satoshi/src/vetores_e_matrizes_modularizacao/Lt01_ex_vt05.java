/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
10
[SIGMA] (A[1] � A[21�1])
i = 1
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt05 {
	
	public static int somatoria = 0;
	
	public static void somatoriaVetor(int vt[]) {
		
		int i = 0, j = 5;
		
		/*
		 * No caso do c�digo abaixo, ser� efetuada uma soma completa dos vetores. Num vetor com 6 posi��es {0, 1, 2, 3, 4, 5}
		 * ficaria assim: (0 + 5) + (1 + 4) + (2 + 3) + (3 + 2) + (4 + 1) + (5 + 0)
		 * Obs.: o exerc�cio 5 dos vetores sem modulariza��o est� dessa forma.
		 */
		
		/**********************************************************
		while(i < 20 && j > 1) {
		
			if((j - i) == 1) {
				somatoria += (vt[i] + vt[j]);
				System.out.println(vt[i] + ", " + vt[j]);
				break;
			}
			
			somatoria += (vt[i] + vt[j]);
			System.out.println(vt[i] + ", " + vt[j]);
			
			i++;
			j--;
		}
		**********************************************************/
		
		/*
		 * No c�digo abaixo, utilizando um vetor {0, 1, 2, 3, 4, 5}, fica assim:
		 * (0 + 5) + (1 + 4) + (2 + 3)
		 */
		
		while(i < 6 && j >= 0) {
			
			if((j - i) == 1) {
				somatoria += (vt[i] + vt[j]);
				System.out.println(vt[i] + ", " + vt[j]);
				break;
			}
			
			System.out.println(vt[i] + ", " + vt[j]);
			somatoria += (vt[i] + vt[j]);
			i++;
			j--;
			
		}
	}
	
	public static void main(String[] args) {
		
		int vt[] = new int [6];
		
		for(int i = 0; i < 6; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor."));
		
		somatoriaVetor(vt);
		
		System.out.println("Somat�ria: " + somatoria);
		
	}

}