/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar em um vetor [30] real e calcular e exibir:
a.	A média do grupo;
b.	A quantidade de notas acima do grupo;
c.	As posições dos valores abaixo da média do grupo.
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt04 {
	
	public static double retornaMedia(double vt[]) {
		double media = 0;
		for(int i = 0; i < 30; i++)
				media += vt[i];

		media /= 30;
		return media;
	}
	
	public static int quantidadeAcimaMedia(double vt[], double media) {
		int qtdNotasAcima = 0;
		
		for(int i = 0; i < 30; i++)
			if(vt[i] > media)
				qtdNotasAcima++;
		
		return qtdNotasAcima;
	}
	
	public static void mostraValoresAbaixoMedia(double vt[], double media) {
		for(int i = 0; i < 30; i++)
			if(vt[i] < media)
				System.out.println("Posição que ficou abaixo da média: " + i);
	}
	
	public static void main(String[] args) {
		double vt[] = new double[30];
		
		for(int i = 0; i < 30; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a " + (i + 1) + "ª nota."));
		
		
		double media = retornaMedia(vt);
		int qtdNotasAcima = quantidadeAcimaMedia(vt, media);
		
		System.out.println("Quantidade de pessoas que ficaram acima da média: " + qtdNotasAcima);
		System.out.println("Média: " + media);
		
		mostraValoresAbaixoMedia(vt, media);
	}
}