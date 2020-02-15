/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * Data: 09/02/20
 */

package exercicios_iniciais;

public class Lt01_ex43 {
	
	
	public static void main(String[] args) {
		
		int qtdAnos = 0;
		double alturaMaria = 1.5;
		
		double alturaAna = 1.10;
		
		while(alturaAna <= alturaMaria) {
			alturaAna += 0.03;
			alturaMaria += 0.02;
			qtdAnos++;
		}
		
		System.out.println("Serão necessários " + qtdAnos + " anos.");
			
	}

}
