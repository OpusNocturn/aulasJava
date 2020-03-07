/*
 * Nome: Gabriel Pimentel
 * Objetivo: Série 2: (n) + (n-1) + ... + (1)
 * Data: 10/02/20
 */

package recursiva;

public class Lt01_ex_rec02 {
	
	public static int serie(int n) {
		if(n == 1) return n;
		else{
			n += (serie(n-1));
			return n;
			//OU: else return n += (serie(n-1));
		}
	}
	public static void main(String[] args) {
		System.out.println(serie(4));
	}

}
