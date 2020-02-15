/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex07 {
	
	public static void main(String[] args) {
		
		double comp, larg, alt, vol;
		
		alt = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura."));
		comp = Integer.parseInt(JOptionPane.showInputDialog("Digite o comprimento."));
		larg = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura."));
		
		vol = comp * larg * alt;
		System.out.println("Volume: " + vol);
		
	}

}
