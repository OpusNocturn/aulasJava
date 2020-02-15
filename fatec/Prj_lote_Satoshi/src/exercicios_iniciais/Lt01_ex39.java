/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
 * Data: 09/02/20
 */

package exercicios_iniciais;

public class Lt01_ex39 {
	
	public static void main(String[] args) {
		
		int quantidade = 1, somatoria = 0;
		
		for(int i = 1; i <= 64; i++) {
			quantidade *= 2;
			somatoria += quantidade;
		}
		
		System.out.println("Somatória: " + somatoria);
		
	}
	
}
