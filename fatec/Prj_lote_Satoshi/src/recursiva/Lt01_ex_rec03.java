/*
 * Nome: Gabriel Pimentel
 * Objetivo: Série 3: (1/1) + (1/2) + (1/3) + ... + (1/n)
 * Data: 10/02/20
 */

package recursiva;

public class Lt01_ex_rec03 {
	
	public static double serie(double n) {
		
		if(n == 1) return n;
		else
			return ((1/n) + serie(n-1));
		
	}
	public static void main(String[] args) {
		
		double n = 4;
		
		System.out.println(serie(n));
		
	}

}
