/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a hora de início e de final de um jogo (HH,MM), calcular o tempo
 * do jogo em horas e minutos, sabendo que o tempo máximo é menor que 24 horas e pode
 * começar num dia e terminar noutro.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex25 {
	
	public static void main(String[] args) {
		int horaInicio, minutoInicio, horaFinal, minutoFinal;
		
		int horaTotal, minutoTotal;

		//pegando hora de inicio e minuto de inicio
		do {
			horaInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora de início."));
			minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto de início."));
			
		}while((minutoInicio < 0 || minutoInicio >= 60) || (horaInicio < 0 || horaInicio >= 24));
		
		
		//pegando hora final e minuto final
		do {
		
			horaFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite a hora final."));
			minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Digite o minuto final."));
			
		}while((minutoFinal < 0 || minutoFinal >= 60) || (horaFinal < 0 || horaFinal >= 24));
		
		
		horaTotal = horaFinal - horaInicio;
		
		minutoTotal = minutoFinal - minutoInicio;
		
		if(horaFinal < horaInicio) {
			horaTotal += 24;
		}
		
		if(minutoFinal < minutoInicio) {
			minutoTotal += 60;
			horaTotal--; //se nao houver incremento, o horário terá um erro de 1 hora adiantado
		}
		
		System.out.println(horaTotal + ":" + minutoTotal);
		
	}
	
	//conferir se está certo:
	//https://www.horlogeparlante.com/calcular-as-dura%C3%A7%C3%B5es.html

}