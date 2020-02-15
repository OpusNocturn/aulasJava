/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex44 {
	public static void main(String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite a base:"));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o expoente:"));
		int potencia = 1;
		
		for(int i = 1; i <= expoente; i++)
			potencia *= base;
		
		System.out.println(base + " ^ " + expoente + " = " + potencia);
	}	

}
