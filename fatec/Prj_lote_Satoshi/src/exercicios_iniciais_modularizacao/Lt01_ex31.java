/*
 * Nome: Gabriel Pimentel
 * Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
 * Data: 10/02/20
 */

package exercicios_iniciais_modularizacao;

public class Lt01_ex31 {
	
	public static int retornaQuadrado(int i) {
		return (i * i);
	}
	
	public static void main(String[] args) {
		for(int i = 10; i <= 150; i++) {
			System.out.println(retornaQuadrado(i));
		}
	}
	
}
