/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 n�meros inteiros. Verifique e mostre se o maior n�mero � m�ltiplo do menor.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex26 {
	
	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1."));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2."));
		
		if(valor2 > valor1) {
			
			if(valor2 % valor1 == 0) System.out.println(valor2 + " � m�ltiplo de " + valor1 + ".");
			else System.out.println(valor2 + " n�o � m�ltiplo de " + valor1 + ".");
			
		}else if(valor1 > valor2){
			
			if(valor1 % valor2 == 0) System.out.println(valor1 + " � m�ltiplo de " + valor2 + ".");
			else System.out.println(valor1 + " n�o � m�ltiplo de " + valor2 + ".");
			
		}
		
	}

}
