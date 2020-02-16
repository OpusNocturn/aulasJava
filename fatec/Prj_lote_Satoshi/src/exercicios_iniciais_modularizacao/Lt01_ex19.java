/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 valores reais. Calcule e mostre o maior deles.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex19 {
	
	public static void mostraMaiorValor(double a, double b) {
		
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
	
	public static void main(String[] args) {
		double a, b;
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		
		mostraMaiorValor(a, b);
	}
	
}
