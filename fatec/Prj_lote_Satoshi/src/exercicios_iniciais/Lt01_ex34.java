/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex34 {
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		for(int i = 0; i <= 10; i++)
			System.out.println(valor + " * " + i + " = " + (valor * i));
	}

}