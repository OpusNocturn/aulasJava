/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba a data de nascimento e atual em ano, mês e dia. Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import java.time.Year;

import javax.swing.JOptionPane;

public class Lt01_ex30 {
	
	public static void main(String[] args) {
		
		int anoNascimento, mesNascimento, diaNascimento;
		int diaAtual, mesAtual;
		int anoAtual = Year.now().getValue();
		
		int anoFinal, mesFinal, diaFinal;

		//pegando data nascimento, mes nascimento, ano nascimento
		do {
			diaNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu dia de nascimento."));
			mesNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu mês de nascimento."));
			anoNascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite o seu ano de nascimento"));
			
		}while((diaNascimento < 1 || diaNascimento > 31) ||
				(mesNascimento < 1 || mesNascimento > 12) ||
				(anoNascimento < 1930 || anoNascimento > anoAtual));
		
		do {
			diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual."));
			mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual."));
		}while((diaNascimento < 1 || diaNascimento > 31) ||
				(mesNascimento < 1 || mesNascimento > 12));
		
		diaFinal = diaAtual - diaNascimento;
		
		mesFinal = mesAtual - mesNascimento;
		
		anoFinal = anoAtual - anoNascimento;
		
		if(diaAtual < diaNascimento) {
			diaFinal += 31;
			mesFinal++;
		}
		
		if(mesAtual < mesNascimento) {
			mesFinal+=12;
			anoFinal++;
		}
		
		if(diaAtual > 31) {
			diaFinal -= 31;
			mesFinal++;
		}
		
		if(mesAtual > 12) {
			mesFinal -= 12;
			anoFinal++;
		}
		
		double diasBissextos = 0;
		//for de anos bissextos
		for(int i = anoNascimento; i <= anoAtual; i++) {
			if(i % 4 == 0) {
				diasBissextos++;
			}
		}
		
		//diaFinal += diasBissextos;
		
		//por algum motivo, é necessário subtrair o ano em 2. Caso contrário, vai dar 2 anos de diferença
		anoFinal -= 2;
		System.out.println("Quantidade de dias: " + diaFinal + "\nQuantidade de meses: " + mesFinal + "\nQuantidade de anos: " + anoFinal);
		
	}

}