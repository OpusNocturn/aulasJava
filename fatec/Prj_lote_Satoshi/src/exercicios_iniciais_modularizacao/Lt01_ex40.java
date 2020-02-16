/*
 * Nome: Gabriel Pimentel
 * Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex40 {
	
	public static void mostraPrimos(int valor1, int valor2) {
		while(valor1 < valor2) {
			for(int i = 2; i<=valor1;i++){
	            if(valor1 % i == 0 && i != valor1) break;
	            else if(i==valor1){
	                System.out.println(i);
	            }
	        }
			valor1++;
		}
	}
	
	public static void main(String[] args) {
		int valor1, valor2;
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor."));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor."));
		
		mostraPrimos(valor1, valor2);
	}
}