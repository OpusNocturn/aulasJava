/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o valor de um dep�sito em poupan�a. Calcule e mostre o valor ap�s 1 m�s de aplica��o sabendo que rende 1,3% a. m.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex08 {
	
	public static void main(String[] args) {
		
		double deposito, resultado;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do dep�sito."));
		resultado = (deposito*(1.3/100))+deposito;
		System.out.println("Resultado: " + resultado);
	}
}
