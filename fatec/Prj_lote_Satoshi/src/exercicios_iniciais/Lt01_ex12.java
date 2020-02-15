/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex12 {
	
	public static void main(String[] args) {
			
		int nasc, atual, idade, idadefuturo;
		
		nasc = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento."));
		atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual."));
		idade = atual - nasc;
		idadefuturo = idade + 17;
		System.out.println("Sua idade no futuro: " + idadefuturo);
	}

}
