/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex34 {
	
	public static int resultadoTabuada(int i, int valor) {
		int resultado = i * valor;
		return resultado;
	}
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		for(int i = 0; i <= 10; i++)
			System.out.println(valor + " * " + i + " = " + resultadoTabuada(i, valor));
	}

}