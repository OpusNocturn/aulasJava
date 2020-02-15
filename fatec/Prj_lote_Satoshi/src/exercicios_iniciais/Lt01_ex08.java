/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex08 {
	
	public static void main(String[] args) {
		
		double deposito, resultado;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito."));
		resultado = (deposito*(1.3/100))+deposito;
		System.out.println("Resultado: " + resultado);
	}
}
