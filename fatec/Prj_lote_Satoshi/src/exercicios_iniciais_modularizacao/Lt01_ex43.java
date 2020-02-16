/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

public class Lt01_ex43 {
	
	public static int retornaQtdAnos(double alturaPessoa1, double alturaPessoa2, double crescePessoa1, double crescePessoa2) {
		int qtdAnos = 0;
		
		while(alturaPessoa1 <= alturaPessoa2) {
			alturaPessoa1 += crescePessoa1;
			alturaPessoa2 += crescePessoa2;
			qtdAnos++;
		}	
		return qtdAnos;
	}
	
	public static void main(String[] args) {
		
		double alturaAna = 1.10;
		double alturaMaria = 1.5;
		double cresceAna = 0.03;	//quantos cm Ana cresce por ano
		double cresceMaria = 0.02;	//quantos cm Maria cresce por ano
		
		int qtdAnos = retornaQtdAnos(alturaAna, alturaMaria, cresceAna, cresceMaria);
		System.out.println("Serão necessários " + qtdAnos + " anos.");
			
	}
}