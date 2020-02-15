/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex06 {
	
	public static void main(String[] args) {
		
		int x, y, z;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));

		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
		
		z = x;
		x = y;
		y = z;
		
		System.out.println("X = " + x + ", Y = " + y);
		
	}
	
}
