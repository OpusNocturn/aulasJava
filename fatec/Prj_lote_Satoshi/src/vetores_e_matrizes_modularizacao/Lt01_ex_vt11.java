/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

public class Lt01_ex_vt11 {
	
	public static int[][] retornaMatrizPreenchida() {
		int[][] matriz = new int[8][8];
		
		for(int z = 0; z < 4; z++){
	        for(int i = z; i < (8 - z); i++){
	            for(int j = z; j < (8 - z); j++){
	                matriz[i][j] = z;
	            }
	        }
	    }
		
		return matriz;
	}
	
	public static void main(String[] args) {
	  
	    int matriz[][] = retornaMatrizPreenchida();
	    
	    for(int i = 0; i < 8; i++)
	    	for(int j = 0; j < 8; j++)
	    		System.out.println(matriz[i][j]);
	    
	}
}