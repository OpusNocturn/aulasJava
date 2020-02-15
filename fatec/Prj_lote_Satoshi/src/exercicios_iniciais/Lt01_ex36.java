/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex36 {
	
	public static void main(String[] args) {
		
		double valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		
		double somatoria = 0, divisao = 0, cima = 1, fatorial = 1, resultadoFatorial;
		
		for(int baixo = 1; baixo <= valor; baixo++) {
			
			resultadoFatorial = 1;
			for(fatorial = baixo; fatorial > 1; fatorial--) {
				resultadoFatorial *= fatorial;
			}
				
			divisao = cima/resultadoFatorial;
			somatoria += divisao;
		}
		
		somatoria += 1;
		System.out.println("Somatória: " + somatoria);
	}
	
}