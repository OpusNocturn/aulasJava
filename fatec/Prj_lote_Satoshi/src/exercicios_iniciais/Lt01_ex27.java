/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex27 {
	
	public static void main(String[] args) {
		
		int numeroVoltas;
		double extensaoCircuito, tempoDuracao, velocidadeMedia;
		numeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de voltas."));
		extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extens�o do circuito em metros."));
		tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de dura��o em minutos."));
		
		velocidadeMedia = (extensaoCircuito * numeroVoltas) / tempoDuracao;
		System.out.println("Velocidade m�dia: " + velocidadeMedia);
		
	}

}