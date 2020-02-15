//Nome inicial do pacote -> 06022020

/*
* Nome: Gabriel Pimentel
* Objetivo:	Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado.
* Data: 06/02/20
*/

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex01 {
	
	public static void main(String[] args) {
		
		int area, lado;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado."));
		area = lado * lado;
		System.out.println("Área: " + area);
		
	}
	
}