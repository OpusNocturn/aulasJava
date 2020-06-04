/*
 * Nome: Gabriel Pimentel
 * Objetivo: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.
 * Data: 10/02/20
 */

package vetores_e_matrizes_modularizacao;

import javax.swing.JOptionPane;

public class Lt01_ex_vt08 {
	
	public static int matriz[][] = new int[4][3];
	public static int totalVendidoMes = 0;
	public static int qtdVendidoMes[] = new int[3];
	public static int qtdVendidoSemana[] = new int[4];
	
	public static void mostraMatriz(int[] qtdVendidoSemana, int[] qtdVendidoMes) {
		
		for(int i = 0; i < 4; i++){
		      if(i > 2){
		    	  System.out.println("Produtos vendidos na semana " + (i + 1) + ": " + qtdVendidoSemana[i]);
		      }else{
		    	  System.out.println("Produtos vendidos na semana " + (i + 1) + ": " + qtdVendidoSemana[i]);
		    	  System.out.println("Produtos vendidos no mês: " + qtdVendidoMes[i]);
		      }
		  }
	}
	
	public static void carregaMatriz() {
		
		for(int i = 0; i < 4; i++)
			for(int j = 0; j < 3; j++) {
				matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade da " + (i+1) + "ª semana e do " + (j+1) + "º produto."));
				totalVendidoMes += matriz[i][j];
				qtdVendidoSemana[i] += matriz[i][j];
		        qtdVendidoMes[j] += matriz[i][j];
		        
			}
		
	}
	
	public static void main(String[] args) {
		
		carregaMatriz();
		mostraMatriz(qtdVendidoSemana, qtdVendidoMes);
		System.out.println("Total vendido no mês: " + totalVendidoMes);
		 
	}

}