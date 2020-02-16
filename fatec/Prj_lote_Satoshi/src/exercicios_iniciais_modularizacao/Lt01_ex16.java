/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto
 * e o n�mero de descendentes. Calcule o sal�rio que ser�o as horas trabalhadas x o valor por hora.
 * Calcule o sal�rio l�quido (= Sal�rio Bruto � desconto). A cada dependente ser� acrescido R$ 100 no
 * Sal�rio L�quido. Exiba o sal�rio a receber.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex16 {
	
	public static void calculaSalarioLiquido(double horasTrabalhadas, double valorHora, double desconto, int descendentes) {
		
		double salarioBruto = horasTrabalhadas * valorHora;
		desconto = (desconto/100);
		double salarioLiquido = salarioBruto - (salarioBruto * desconto);
		salarioLiquido = salarioBruto - (salarioBruto * desconto);
		salarioLiquido = salarioLiquido + (100 * descendentes);
		System.out.println("Sal�rio l�quido: " + salarioLiquido);
		
	}
	
	public static void main(String[] args) {
		
		double horasTrabalhadas, valorHora, desconto;
		int descendentes;
		
		horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor das horas trabalhadas."));
		valorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor/hora."));
		desconto = Double.parseDouble(JOptionPane.showInputDialog("Digite o desconto."));
		descendentes = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de descendentes."));
		
		calculaSalarioLiquido(horasTrabalhadas, valorHora, desconto, descendentes);
					
	}

}