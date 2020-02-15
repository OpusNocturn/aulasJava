/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 * Data: 09/02/20
 */

package exercicios_iniciais;
import javax.swing.JOptionPane;

public class Lt01_ex32 {
	
	public static void main(String[] args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro."));
		int fatorial = 1;
		for(int i = valor; i > 0; i--) {
			fatorial *= i;
		}
		System.out.println(fatorial);
	}
	
}
