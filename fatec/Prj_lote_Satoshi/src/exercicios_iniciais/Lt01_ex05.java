/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
 * Data: 06/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Lt01_ex05 {
	
	public static void main(String[] args) {
		
		int a, b, c;
		double delta, x1, x2;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite A."));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite B."));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite C."));
		
		delta = (b*b) - (4 * a * c);
		
		x1 = (-b + Math.sqrt(delta)) / (2 * a);
		x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.println("X1: " + x1 + ", X2: " + x2);
		
	}

}