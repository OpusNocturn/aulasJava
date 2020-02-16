/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento.
 * Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. Demais
 * tipos não serão considerados.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex29 {
	
	public static void calculaValorCorrigido(int opcao, double valorCorrigido) {
		
		if(opcao == 1)
			System.out.println("Valor corrigido: " + (valorCorrigido * 1 + 0.03));
			//System.out.println("Valor corrigido: " + (valorCorrigido * 0.03 + valorCorrigido));
		else if(opcao == 2)
			System.out.println("Valor corrigido: " + (valorCorrigido * (1 + 0.05)));
		else
			System.out.println("Opção inválida.");
		
	}
	
	public static void main(String[] args) {
		
		int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada:\n1 - Poupança\n2 - Renda fixa"));
		double valorCorrigido;
		
		if(opcao != 1 || opcao != 2)
			System.out.println("Opção inválida!");
		else {
			valorCorrigido = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento."));
			calculaValorCorrigido(opcao, valorCorrigido);
		}
		
	}

}
