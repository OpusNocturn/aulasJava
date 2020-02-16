/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex37 {
	
	/*
	 * Foi necessário criar duas funções, visto que Java não permite o retorno de duas variáveis (no caso, 'primeiro' e 'ultimo')
	 */
	
	public static int primeiroSerieFibonacci(int v) {
		int primeiro = 1, ultimo = 1;
		
		for(int i = 0; i < v; i++) {
			primeiro += ultimo;
			ultimo += primeiro;
		}
		
		return primeiro;
	}
	
	public static int ultimoSerieFibonacci(int v) {
		int primeiro = 1, ultimo = 1;
		
		for(int i = 0; i < v; i++) {
			primeiro += ultimo;
			ultimo += primeiro;
		}
		
		return ultimo;
	}
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor."));
		
		for(int i = 0; i < num; i++) {
			System.out.println("Série de Fibonacci: " + primeiroSerieFibonacci(i));
			System.out.println("Série de Fibonacci: " + ultimoSerieFibonacci(i));
		}
		
	}

}
