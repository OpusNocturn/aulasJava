/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex22 {
	
	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		
		if(a != b) {
			
			if(a > b) {
				System.out.println(b + ", " + a);
			}else {
				System.out.println(a + ", " + b);
			}
		}else {
			System.out.println("Valores idênticos.");
		}
	}

}
