/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somatória dos números ímpares entre esses valores.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex35 {
	
	public static int somatoria(int v1, int v2) {
		int somatoria = 0;
		for(int i = v1; i <= v2; i++) {
			if(i % 2 != 0)
				somatoria += i;
		}
		return somatoria;
	}
	
	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2:"));
		
		if(valor1 <= valor2)
			System.out.println("Somatória: " + somatoria(valor1, valor2));
		else
			System.out.println("Somatória: " + somatoria(valor2, valor1));
	}
}