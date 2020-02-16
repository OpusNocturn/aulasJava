/*
 * Nome: Gabriel Pimentel
 * Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex41 {
	
	public static void jogarDoisDados(int v) {
		for(int dado1 = 1; dado1 <= 6; dado1++)
			for(int dado2 = 1; dado2 <= 6; dado2++)
				if(dado1 + dado2 == v)
					System.out.println(dado1 + " + " + dado2 + " = " + v);	
	}
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o resultado que você quer."));	
		jogarDoisDados(valor);
	}
}