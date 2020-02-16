/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. Receber o tempo de percurso e a velocidade média.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex17 {
	
	public static void calculaLitrosGastos(double tempo, double vm) {
		
		double espaco = vm * tempo;
		double litros = espaco / 12;
		
		System.out.println("Litros gastos: " + litros);
		
	}
	
	public static void main(String[] args) {
		
		double tempo, vm;

		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do tempo."));
		vm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da velocidade média."));
		
		calculaLitrosGastos(tempo, vm);
		
	}

}
