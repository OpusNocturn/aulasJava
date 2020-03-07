//Nome do projeto: prj_05032020
//Classe: MenuPrincipal
//=================================
//package prj_05032020;

package exercicios_iniciais_modularizacao;

import javax.swing.JOptionPane;

public class MenuPrincipal {

	public static int[] retornaClassificado(int v[]) {
		int aux;
		for (int i = 0; i < 4; i++) {
			for (int j = (i + 1); j < 5; j++) {

				if (v[i] > v[j]) {
					aux = v[i];
					v[i] = v[j];
					v[j] = aux;
				}
			}
		}
		return v;
	}

	public static int[] carregaVetor(int vt[]) {
		for (int i = 0; i < 5; i++)
			vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor na posição " + i));
		
		return vt;
	}

	public static void mostraVetor(int vt[]) {
		for (int i = 0; i < 5; i++)
			System.out.println("Valor do vetor na posição [" + i + "] -> " + vt[i]);
	}

	public static boolean vetorVazio(int vt[]) {
		for (int i = 0; i < vt.length; i++) {
			if (vt[i] != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		boolean vtVazio;
		int vt[] = new int [5];
		int opc;
		do {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção desejada, segundo:\n\n"
																+ "1 -> Carregar vetor\n"
																+ "2 -> Classificar vetor\n"
																+ "3 -> Mostrar vetor\n"
																+ "9 -> Finalizar sessão"));
			
			switch(opc) {
			
				case 1:
					vt = carregaVetor(vt);
				break;
				
				case 2:
					vt = retornaClassificado(vt);
				break;
				
				case 3:
					vtVazio = vetorVazio(vt);
					if(vtVazio == true) {
						JOptionPane.showMessageDialog(null, "O vetor está vazio!");
					}else {
						mostraVetor(vt);
					}
					
				break;
				
				case 9:
					JOptionPane.showMessageDialog(null, "Finalizando o sistema.");
					break;
				
				default:
					JOptionPane.showMessageDialog(null, "Opção incorreta.");
			}
			
		}while(opc != 9);
		
	}

}
