/*
* Nome: Gabriel Pimentel
* Objetivo:
Criar e coletar um vetor [50] inteiro. Calcular e exibir:
a.	A média dos valores entre 10 e 200;
b.	A soma dos números ímpares.
* Data: 10/02/20
*/

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt01 {
	
	public static double retornaMedia(double vt[]) {
		double media = 0;
		int quantidadeMedia = 0;
		for(int i = 0; i < 50; i++) {
			if(vt[i] >= 10 && vt[i] <= 200) {
				quantidadeMedia++;
				media += vt[i];
			}
		}
		media /= quantidadeMedia;
		return media;
	}

	public static int retornaSomatoria(double vt[]) {
		int somaImpares = 0;
		for(int i = 0; i < 50; i++) {
			if(vt[i] % 2 != 0)
				somaImpares+=vt[i];
		}
		return somaImpares;
	}

	public static void main(String[] args) {
	
		double[] vt = new double[50];
		for(int i = 0; i < 50; i++)			
			vt[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		double media = retornaMedia(vt);
		int somaImpares = retornaSomatoria(vt);
		
		System.out.println("Média: " + media + "\nSoma dos ímpares: " + somaImpares);
	}
	
}
