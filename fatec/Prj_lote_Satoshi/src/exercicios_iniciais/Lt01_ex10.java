/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex10 {
	
	public static void main(String[] args) {

		double a, b, diferenca;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		
		diferenca = a - b;
		
		System.out.println("Diferença entre os valores: " + diferenca);
	}

}
