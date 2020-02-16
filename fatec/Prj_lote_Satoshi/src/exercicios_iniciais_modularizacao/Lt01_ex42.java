/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

public class Lt01_ex42 {
	
	public static double retornaSomatoria() {
		double somatoria = 0, divisao, cima = 2, baixo = 3;
		
		while(cima <= 50) {
			while(baixo <= 99) {

				divisao = (cima / baixo);
				somatoria += divisao;
				
				cima++;
				baixo+=2;
			}
		}
		
		somatoria += 1;
		return somatoria;
	}
	
	public static void main(String[] args) {
		double somatoria = retornaSomatoria();
		System.out.println("Somatória: " + somatoria);
	}

}
