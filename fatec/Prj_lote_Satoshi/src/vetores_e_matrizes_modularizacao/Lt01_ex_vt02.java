/*
 * Nome: Gabriel Pimentel
 * Objetivo:
Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt02 {
	
	public static double retornaMedia(int vt[]) {
		double media = 0;
		for(int i = 0; i < 100; i++) {
			if(vt[i] >= 10 && vt[i] <= 200) {
				media += vt[i];
			}
		}
		media /= 100;
		return media;
	}
	
	public static int retornaMenor(int vt[]) {
		int menor = 10000;
		for(int i = 0; i < 100; i++) {
			if(vt[i] < menor){
				menor = vt[i];
			}
		}
		return menor;
	}
	
	public static int retornaMaior(int vt[]) {
		int maior = -10000;
		for(int i = 0; i < 100; i++) {
			if(vt[i] > maior){
				maior = vt[i];
			}
		}
		return maior;
	}
	
	public static void main(String[] args) {
		
		int[] vt = new int[4];
		
		for(int i = 0; i < 100; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		double media = retornaMedia(vt);
		int menor = retornaMenor(vt);
		int maior = retornaMaior(vt);
		
		System.out.println("Maior valor: " + maior + "\nMenor valor: " + menor + "\nMédia: " + media);
	}

}