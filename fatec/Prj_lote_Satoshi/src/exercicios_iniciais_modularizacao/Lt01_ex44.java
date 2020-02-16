/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex44 {
	
	public static int retornaExpoente(int base, int expoente) {
		int potencia = 1;
		
		for(int i = 1; i <= expoente; i++)
			potencia *= base;
		
		return potencia;
	}
	
	public static void main(String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
		
		int potencia = retornaExpoente(base, expoente);
		System.out.println(base + " ^ " + expoente + " = " + potencia);
	}
}