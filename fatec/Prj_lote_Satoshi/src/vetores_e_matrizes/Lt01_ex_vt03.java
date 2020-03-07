/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3� vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6
 * Data: 09/02/20
 */

package vetores_e_matrizes;

import javax.swing.JOptionPane;

public class Lt01_ex_vt03 {
	
	public static void main(String[] args) {
		
		int vt1[] = new int[3];
		int vt2[] = new int[3];
		int vt3[] = new int[6];
		
		for(int i = 0; i < 3; i++)
			vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor."));
		
		for(int i = 0; i < 3; i++)
			vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "� valor."));
		
		for(int i = 0; i < 6; i++)
			if(i >= 0 && i <= 2)
				vt3[i] = vt1[i];
		
			else
				vt3[i] = vt2[i - 3];
		
		for(int i = 0; i < 6; i++)
			System.out.println("Vetor 3 na posi��o " + i + ": " + vt3[i]);
	}
}
