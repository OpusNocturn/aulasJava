/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 valores inteiros. Calcule e mostre o resultado da diferen�a do maior pelo menos valor.
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex18 {
	
	public static void main(String[] args) {
		int a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		
		if(a == b) {
			System.out.println("Valores id�nticos!");
			return;
		}
		
		if(a > b) {
			System.out.println("Diferen�a: " + (a - b));
		}else {
			System.out.println("Diferen�a: " + (b - a));
		}
		
	}

}
