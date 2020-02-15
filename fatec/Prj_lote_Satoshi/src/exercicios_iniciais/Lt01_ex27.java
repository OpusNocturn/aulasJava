/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). Calcule e mostre a velocidade média em km/h.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex27 {
	
	public static void main(String[] args) {
		
		int numeroVoltas;
		double extensaoCircuito, tempoDuracao, velocidadeMedia;
		numeroVoltas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de voltas."));
		extensaoCircuito = Double.parseDouble(JOptionPane.showInputDialog("Digite a extensão do circuito em metros."));
		tempoDuracao = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo de duração em minutos."));
		
		velocidadeMedia = (extensaoCircuito * numeroVoltas) / tempoDuracao;
		System.out.println("Velocidade média: " + velocidadeMedia);
		
	}

}