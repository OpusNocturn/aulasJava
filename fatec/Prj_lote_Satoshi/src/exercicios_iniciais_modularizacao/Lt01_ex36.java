/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex36 {
	
	//funcao fatorial
	public static double fatorial(double v) {
		int fatorial = 1;
		for(double i = v; i > 0; i--) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	//funcao calculSomatoria
	public static double calculaSomatoria(double valor) {
		
		double resultadoFatorial, divisao, somatoria = 0, cima = 1;
		
		for(int baixo = 1; baixo <= valor; baixo++) {
			
			resultadoFatorial = fatorial(baixo);

			divisao = cima/resultadoFatorial;
			somatoria += divisao;
			
		}
		somatoria += 1;
		return somatoria;
	}
	
	public static void main(String[] args) {
		
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		
		System.out.println("Somatória: " + calculaSomatoria(valor));
	}
	
}