/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
 * Data: 06/02/20
 */

package exercicios_iniciais;
import javax.swing.JOptionPane;

public class Lt01_ex02 {
	
	public static void main(String[] args) {
		
		double salario, salarioReajustadoMais, salarioReajustadoMenos, valorReajuste;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário."));
		valorReajuste = salario * 0.15;
		salarioReajustadoMais = salario * (1 + 0.15); //salario com reajuste de aumento
		salarioReajustadoMenos = salario * (1 - 0.15); //salario com reajuste negativo
		
		System.out.println("Valor do reajuste: " + valorReajuste);
		System.out.println("Valor + reajuste: " + salarioReajustadoMais);
		System.out.println("Valor - reajuste: " + salarioReajustadoMenos);
	}

}
