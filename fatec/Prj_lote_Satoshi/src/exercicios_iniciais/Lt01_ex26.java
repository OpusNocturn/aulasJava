/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex26 {
	
	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1."));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2."));
		
		if(valor2 > valor1) {
			
			if(valor2 % valor1 == 0) System.out.println(valor2 + " é múltiplo de " + valor1 + ".");
			else System.out.println(valor2 + " não é múltiplo de " + valor1 + ".");
			
		}else if(valor1 > valor2){
			
			if(valor1 % valor2 == 0) System.out.println(valor1 + " é múltiplo de " + valor2 + ".");
			else System.out.println(valor1 + " não é múltiplo de " + valor2 + ".");
			
		}
		
	}

}
