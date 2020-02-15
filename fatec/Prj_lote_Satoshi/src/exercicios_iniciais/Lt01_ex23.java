/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. Mostre os 4 números em ordem crescente.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex23 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor B."));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor C."));
		
		if((a < b) && (b < c) && (a < c)) {
			int d = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor D."));
			
			if(d < a) {
				System.out.println(d + ", " + a + ", " + b + ", " + c);
			}else if(d < b) {
				System.out.println(a + ", " + d + ", " + b + ", " + c);
			}else if(d < c) {
				System.out.println(a + ", " + b + ", " + d + ", " + c);
			}else {
				System.out.println(a + ", " + b + ", " + c + ", " + d);
			}
		}else {
			System.out.println("Números inválidos.");
		}
	}

}
