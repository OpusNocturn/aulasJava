/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o autom�vel faz 12 km/l. Receber o tempo de percurso e a velocidade m�dia.
 * Data: 07/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex17 {
	
	public static void main(String[] args) {
		
		double tempo, vm, espaco, litros;

		tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do tempo."));
		vm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da velocidade m�dia."));
		
		espaco = vm * tempo;
		
		litros = espaco / 12;
		
		System.out.println("Litros gastos: " + litros);
	}

}
