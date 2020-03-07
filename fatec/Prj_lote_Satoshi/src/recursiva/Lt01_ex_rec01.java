/*
 * Nome: Gabriel Pimentel
 * Objetivo: Série 1: 1 + 2 + 3 + ... + 100
 * Data: 10/02/20
 */

package recursiva;

public class Lt01_ex_rec01 {
	
	public static int serieRecursiva(int n) {
		if(n == 100) {
			return n;
		}
			
		else {
			n += serieRecursiva(n + 1);
			return n;
		}
	}
	
	public static void main(String[] args) {
		int n = 1;
		System.out.println(serieRecursiva(n));
	}

}