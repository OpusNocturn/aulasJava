/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex13 {
	
	public static void main(String[] args) {
		
		double dias, alimento;
		alimento = Double.parseDouble(JOptionPane.showInputDialog("Digite o alimento em quilos."));
		dias = alimento / 0.05;
		System.out.println("Dias necessários: " + dias);
		
	}

}
