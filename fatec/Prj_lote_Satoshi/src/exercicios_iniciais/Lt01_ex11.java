/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o raio de uma circunfer�ncia. Calcule e mostre o comprimento da circunfer�ncia.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex11 {
	
	 public static void main(String[] args) {

		 double raio, comprimento;
		 
		 raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do raio."));
		 comprimento = 2 * 3.14 * raio;
		 System.out.println("Comprimento: " + comprimento);
			 
	}

}
