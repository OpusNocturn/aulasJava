/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o tipo de investimento (1 = poupan�a e 2 = renda fixa) e o valor do investimento.
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupan�a = 3% e a renda fixa = 5%. Demais
 * tipos n�o ser�o considerados.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex29 {
	
	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a op��o desejada:\n1 - Poupan�a\n2 - Renda fixa"));
		
		double valorCorrigido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento."));
		
		if(opcao == 1)
			System.out.println("Valor corrigido: " + (valorCorrigido * 1 + 0.03));
			//System.out.println("Valor corrigido: " + (valorCorrigido * 0.03 + valorCorrigido));
		else if(opcao == 2)
			System.out.println("Valor corrigido: " + (valorCorrigido * (1 + 0.05)));
		else
			System.out.println("Op��o inv�lida.");
		
	}

}
