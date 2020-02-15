/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex09 {
	
	public static void main(String[] args) {
			
		int valor1, valor2, soma;
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1."));
		
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2."));
		
		soma = (valor1*valor1) + (valor2*valor2);
		
		System.out.println("Soma: " + soma);
	}

}