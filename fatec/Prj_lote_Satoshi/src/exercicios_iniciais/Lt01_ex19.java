/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex19 {
	
	public static void main(String[] args) {
		double a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		
		if(a == b) {
			System.out.println("Valores iguais...");
			return;
		}
		
		if(a > b) {
			System.out.println("Maior valor: " + a);
		}else {
			System.out.println("Maior valor: " + b);
		}
	}
	
}
