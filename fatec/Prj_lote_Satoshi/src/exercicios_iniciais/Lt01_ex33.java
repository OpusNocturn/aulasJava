/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex33 {
	
	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
		double i = 1;
		double somatoria = 0;
		double divisao;
		
		for(double j = 1; j <= valor; j++) {
			
			divisao = (i / j);
			System.out.println(i + " / " + j + " = " + divisao);
			somatoria = somatoria + divisao;
			
		}
		
		somatoria += 1;
		
		System.out.println("\nSomatória: " + somatoria);
	}

}
