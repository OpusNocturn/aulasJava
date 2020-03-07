/*
 * Nome: Gabriel Pimentel
 * Objetivo: Série 5: (n)! + (n-1)! + (n-2)! + ... + (1)!
 * Data: 10/02/20
 */

package recursiva;

public class Lt01_ex_rec05 {
	
	public static int fatorial(int n) {
		if(n == 1)
			return n;
		else
			return n * fatorial(n - 1);
	}
	
	public static int serie(int n) {
		int somatoria;
		if(n == 1 || n == 0) return n;
		else{
			somatoria = fatorial(n) + serie(n-1);
			return somatoria;
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println(serie(3));
		
	}

}
