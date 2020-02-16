/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 3 coeficientes A, B, e C de uma equa��o do 2� grau da f�rmula AX�+BX+C=0. Verifique e mostre a exist�ncia de ra�zes reais e se caso exista, calcule e mostre.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex20 {
	
	public static void calculaBhaskara(int a, int b, int c){
		
		double delta;
		
		delta = (b*b) - (4 * a * c);
		if(delta > 0) {
			
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			
			System.out.println("X1: " + x1 + ", X2: " + x2);
		}else {
			System.out.println("Delta � negativo, n�o � poss�vel continuar.");
		}
	
	}
	
	public static void main(String[] args) {
		
		int a, b, c;

		a = Integer.parseInt(JOptionPane.showInputDialog("Digite A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite B."));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite C."));
		
		calculaBhaskara(a, b, c);
		
	}
	
}
