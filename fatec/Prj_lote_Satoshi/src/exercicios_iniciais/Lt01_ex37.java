/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um n�mero inteiro. Calcule e mostre a s�rie de Fibonacci at� o seu N�n�simo termo.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex37 {
	
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor."));
		int ultimo = 1, primeiro = 1;
		
		for(int i = 0; i < num; i++) {
			
			System.out.println(primeiro + ", " + ultimo);

			primeiro += ultimo;
			ultimo += primeiro;
			
		}
		
	}

}
