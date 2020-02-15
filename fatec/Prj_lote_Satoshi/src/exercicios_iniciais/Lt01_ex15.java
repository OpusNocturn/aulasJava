/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex15 {
	
	public static void main(String[] args) {
		
		double cat1, cat2, hip;
		
		cat1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de um dos catetos."));

		cat2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do outro cateto."));
		
		hip = (cat1 * cat1) + (cat2 * cat2);
		
		hip = Math.sqrt(hip);
		System.out.println("Hipotenusa: " + hip);
	}

}
