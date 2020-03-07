/*
 * Nome: Gabriel Pimentel
 * Objetivo: Série 4: (n)/1 + (n-1)/2 + (n-2)/3 + ... + (1)/n
 * Data: 10/02/20
 */

package recursiva;

import javax.swing.JOptionPane;

public class Lt01_ex_rec04 {
	
	public static double serie(double n, int i) {
		double somatoria;
		
		//eh necessario n retornar 0, se tornar 1, o calculo fica errado
		if(n == 0 || i == n) return n;
		else {
			somatoria = (n/i) + serie((n-1), (i+1));
			return somatoria;
		}
	}
	
	public static void main(String[] args) {
		double n = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de N."));
		int i = 1;
		System.out.println(serie(n, i));
	}

}
