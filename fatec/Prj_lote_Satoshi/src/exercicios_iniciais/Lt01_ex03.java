/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex03 {
	
	public static void main(String[] args) {
		
		double area, altura, base;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base."));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura."));
		
		
		area = (base * altura) / 2;
		
		
		System.out.println("Área: " + area);
	}

}
