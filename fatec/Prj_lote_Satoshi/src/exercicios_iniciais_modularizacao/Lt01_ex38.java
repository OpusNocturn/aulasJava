/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. Obs.: somente valores positivos.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex38 {
	
	public static double maiorValor(double maior, double v) {
		if(v > maior)
			maior = v;
		return maior;
	}
	
	public static double menorValor(double menor, double v) {
		if(v < menor)
			menor = v;
		return menor;
	}
	public static void main(String[] args) {
		
		double valor;
		double maior, menor;
		
		do {
			valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor."));
			
			if(valor < 0 || valor > 10000)
				System.out.println("Por favor, digite somente valores positivos e menores ou iguais a 10000.");
			
		}while(valor < 0 || valor > 10000);
		
		maior = valor;
		menor = valor;
		
		for(int i = 1; i < 4; i++) {
			do {
				valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor."));
				
				if(valor < 0 || valor > 10000)
					System.out.println("Por favor, digite somente valores positivos e menores ou iguais a 10000.");
				
			}while(valor < 0 || valor > 10000);
			
			maiorValor(maior, valor);
			menorValor(menor, valor);
			if(valor >= maior)
				maior = valor;
			else if(valor < menor)
				menor = valor;
		}
		
		double fMaior = maiorValor(maior, valor);
		double fMenor = menorValor(menor, valor);
		
		System.out.println("Maior valor: " + fMaior);
		System.out.println("Menor valor: " + fMenor);
		
	}

}