/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 * Data: 09/02/20
 */

package exercicios_iniciais;

import javax.swing.JOptionPane;

public class Lt01_ex40 {
	
	public static void main(String[] args) {
		int valor1, valor2;
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
		
		while(valor1 < valor2) {
			for(int j = 2; j<=valor1;j++){
	            if(valor1 % j == 0 && j != valor1) break;
	            else if(j==valor1){
	                System.out.println(j);
	            }
	        }
			valor1++;
		}
	}
}