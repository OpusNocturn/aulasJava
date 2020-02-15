/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex14 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B."));
		c = 180 - (a + b);
		System.out.println("Valor de C: " + c);
	}

}
