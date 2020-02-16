/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um n�mero. Calcule e mostre a s�rie 1 + 1/2 + 1/3 + ... + 1/N.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex33 {
	
	public static double calculaSerie(double valor) {
		
		double somatoria = 0;
		double divisao;
		for(double j = 1; j <= valor; j++) {
			divisao = 1/j;
			somatoria += divisao;
		}
		somatoria += 1;
		return somatoria;
	}
	
	public static void main(String[] args) {
		
		double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite um valor."));
		
		System.out.println("Somat�ria: " + calculaSerie(valor));
	}

}
