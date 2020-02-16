/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;
import javax.swing.JOptionPane;

public class Lt01_ex32 {
	
	public static int fatorial(int valor) {
		int fatorial = 1;
		for(int i = valor; i > 0; i--) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro."));
		System.out.println(fatorial(valor));
	}
	
}
