/*
 * Nome: Gabriel Pimentel
 * Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 * Data: 09/02/20
 */

package exercicios_iniciais;

public class Lt01_ex41 {
	
	public static void main(String[] args) {
		for(int dado1 = 1; dado1 <= 6; dado1++)
			for(int dado2 = 1; dado2 <= 6; dado2++)
				if(dado1 + dado2 == 7)
					System.out.println(dado1 + " + " + dado2 + " = 7.");		
	}

}
