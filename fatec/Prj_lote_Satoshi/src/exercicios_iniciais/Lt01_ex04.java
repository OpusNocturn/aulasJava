/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a temperatura em graus Celsius. Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5.
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex04 {
	
	public static void main(String[] args) {
		double celsius, fahrenheit;
		
		celsius = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em celsius."));
		
		fahrenheit = ((9*celsius)+160)/5;
		
		System.out.println("Fahrenheit: " + fahrenheit);
	}
	
}