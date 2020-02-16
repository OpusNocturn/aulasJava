/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o n�mero de voltas, a extens�o do circuito (em metros) e o tempo de dura��o (minutos). Calcule e mostre a velocidade m�dia em km/h.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex27 {
	
	public static void velocidadeMedia(int numeroVoltas, double extensaoCircuito, double tempoDuracao) {
		
		double velocidadeMedia = (extensaoCircuito * numeroVoltas) / tempoDuracao;
		System.out.println("Velocidade m�dia: " + velocidadeMedia);
		
	}
	
	public static void main(String[] args) {
		
		int numeroVoltas;
		double extensaoCircuito, tempoDuracao, velocidadeMedia;
		numeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de voltas."));
		extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extens�o do circuito em metros."));
		tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de dura��o em minutos."));
		
		velocidadeMedia(numeroVoltas, extensaoCircuito, tempoDuracao);
		
	}

}