/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex37 {
	
	/*
	 * Foi necess�rio criar duas fun��es, visto que Java n�o permite o retorno de duas vari�veis (no caso, 'primeiro' e 'ultimo')
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
			System.out.println("S�rie de Fibonacci: " + primeiroSerieFibonacci(i));
			System.out.println("S�rie de Fibonacci: " + ultimoSerieFibonacci(i));
		}
		
	}

}
