/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt03 {
	
	public static int[] retornaVetor3(int vt1[], int vt2[]) {
		int[] vt3 = new int[6];
		for(int i = 0; i < 6; i++)
			if(i >= 0 && i <= 2)
				vt3[i] = vt1[i];
		
			else
				vt3[i] = vt2[i - 3];
		return vt3;
	}
	
	public static void main(String[] args) {
		
		int vt1[] = new int[3];
		int vt2[] = new int[3];
		
		for(int i = 0; i < 3; i++)
			vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		for(int i = 0; i < 3; i++)
			vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o " + (i + 1) + "º valor."));
		
		
		int[] vetor3 = retornaVetor3(vt1, vt2);
		
		for(int i = 0; i < 6; i++)
			System.out.println("Vetor 3 na posição " + i + ": " + vetor3[i]);
	}
}