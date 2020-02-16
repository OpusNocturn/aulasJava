/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

public class Lt01_ex39 {
	
	public static int calculaCasas() {

		int quantidade = 1, somatoria = 0;
		for(int i = 1; i <= 64; i++) {
			quantidade *= 2;
			somatoria += quantidade;
		}
		return somatoria;
	}
	
	public static void main(String[] args) {
		
		int somatoria = calculaCasas();
		
		System.out.println("Somatória: " + somatoria);
		
	}
	
}
