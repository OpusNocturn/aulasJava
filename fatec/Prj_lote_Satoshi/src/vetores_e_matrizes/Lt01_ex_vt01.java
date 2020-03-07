/*
* Nome: Gabriel Pimentel
* Objetivo:
Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A m�dia dos valores entre 10 e 200;
b.	A soma dos n�meros �mpares.
* Data: 09/02/20
*/

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt01 {

	public static void main(String[] args) {
	
		double media = 0;
		double[] vt = new double[50];
		int somaImpares = 0;
		int quantidadeMedia = 0;
		for(int i = 0; i < 50; i++) {
			
			vt[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor."));
			
		}
		
		for(int i = 0; i < 50; i++) {
			if(vt[i] % 2 != 0)
				somaImpares+=vt[i];
			
			if(vt[i] >= 10 && vt[i] <= 200) {
				quantidadeMedia++;
				media += vt[i];
			}
		}
		
		media /= quantidadeMedia;
		
		System.out.println("M�dia: " + media + "\nSoma dos �mpares: " + somaImpares);
	}
	
}