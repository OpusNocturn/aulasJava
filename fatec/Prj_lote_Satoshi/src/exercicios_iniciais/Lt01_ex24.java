/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex24 {
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor."));
		
		if((valor % 2 == 0) && (valor % 3 == 0))
			System.out.println(valor + " é divisível por 2 e 3.");
		else
			System.out.println(valor + " não é divisível por 2 e 3.");
	}

}
