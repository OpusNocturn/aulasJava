/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 n�meros inteiros, verifique qual o maior entre eles. Calcule e mostre o resultado da somat�ria dos n�meros �mpares entre esses valores.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex35 {
	
	public static void main(String[] args) {
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1:"));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2:"));
		int somatoria = 0;
		
		if(valor1 <= valor2) {
			for(int i = valor1; i <= valor2; i++)
				if(i % 2 != 0)
					somatoria += i;
			
		}else {
			for(int i = valor2; i <= valor1; i++)
				if(i % 2 != 0)
					somatoria += i;
		}
		System.out.println("Somat�ria: " + somatoria);
		
	}
}