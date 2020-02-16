/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex21 {
	
	public static void mostraMedia(double nt1, double nt2, double nt3, double nt4) {
		
		double media = ((nt1 + nt2 + nt3 + nt4) / 4);
		
		if(media >= 6) {
			System.out.println("Aprovado, média: " + media);
		}else if(media >= 3 && media < 6) {
			System.out.println("Exame, média: " + media);
		}else {
			System.out.println("Retido, média: " + media);
		}
		
	}
	
	public static void main(String[] args) {
		
		double nt1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1."));
		double nt2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2."));
		double nt3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3."));
		double nt4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4."));
		
		mostraMedia(nt1, nt2, nt3, nt4);
		
	}

}
