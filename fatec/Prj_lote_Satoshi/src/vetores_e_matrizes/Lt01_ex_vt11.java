/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 * Data: 09/02/20
 */

package vetores_e_matrizes;

public class Lt01_ex_vt11 {
	
	public static void main(String[] args) {
		int[][] m = new int[8][8];
	    int i, j, z;
	    
	    for(z = 0; z < 4; z++){
	        for(i = z; i < (8 - z); i++){
	            for(j = z; j < (8 - z); j++){
	                m[i][j] = z;
	                System.out.println(m[i][j]);
	            }
	        }
	    }
	}
}
