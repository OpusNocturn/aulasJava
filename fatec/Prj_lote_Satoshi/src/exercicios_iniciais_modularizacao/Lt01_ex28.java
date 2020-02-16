/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o preço atual e a média mensal de um produto. Calcule e mostre o novo preço sabendo que:
Venda Mensal			Preço Atual		Preço Novo
< 500						< 30			+ 10%
>= 500 e < 1000			>= 30 e < 80		+15%
>= 1000						>= 80			- 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex28 {
	
	public static void mostraPrecoAtual(double mediaMensal, double precoAtual) {
		
		if(mediaMensal < 500 && precoAtual < 30)
			System.out.println("Preço novo (+10%): " + (precoAtual * (1 + 0.10)));
		
		else if((mediaMensal >= 500 && mediaMensal < 1000) && (precoAtual >= 30 && precoAtual < 80))
			System.out.println("Preço novo (+15%): " + (precoAtual * (1 + 0.15)));
		
		else if((mediaMensal >= 1000) && (precoAtual >= 80))
			System.out.println("Preço novo (-5%): " + (precoAtual * (1 - 0.05)));
			
		else
			System.out.println("Preço não mudou, preço: " + precoAtual);
		
	}
	
	public static void main(String[] args) {

		double mediaMensal, precoAtual;
		
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto."));
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual."));
		
		mostraPrecoAtual(mediaMensal, precoAtual);
	}

}