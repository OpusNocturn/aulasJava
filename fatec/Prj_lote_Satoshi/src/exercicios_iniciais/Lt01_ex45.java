/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 * Data: 09/02/20
 */

package exercicios_iniciais;

public class Lt01_ex45 {
	
	public static void main(String[] args) {
		
		double cima = 2;
		double baixo = 4;
		double somatoria = 0;
		double divisao;
		
		while(cima <= 15) {
			while(baixo <= 225) {
				
				divisao = (cima / baixo);
				
				if(cima % 2 == 0)
					somatoria -= divisao;
				else
					somatoria += divisao;
				
				//incremento
				cima++;
				baixo = cima * cima;
				
			}
		}
		
		somatoria += 1;
		System.out.println(somatoria);
		
	}

}