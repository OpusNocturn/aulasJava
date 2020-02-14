/*
* Nome: Gabriel Pimentel
* Objetivo:
Criar um menu de op��es:
Menu Principal
1 � Carregar Notas
2 � Retirar Notas
3 � Estat�stica
9 � Fim
1.1.	Carregar a quantidade de notas em uma �rea da mem�ria com 6 ocorr�ncias.
1.2.	Solicitar que o cliente fa�a a retirada de valores obedecendo ao crit�rio do maior pelo menor.
1.3.	Dar a op��o para o cliente escolher o valor e a quantidade de notas. P. ex.: 1 x 20, 2 x 10
1.4.	Caso n�o tenha o valor da maior c�dula, disponibilizar a pr�xima.
1.5.	Se o valor a ser solicitado for maior que o saldo total do caixa, enviar a mensagem �EXCEDEU O LIMITE DO CAIXA�.
1.6.	Solicitar at� 100 retiradas ou at� n�o haver mais notas.
1.7.	No momento da solicita��o do valor, coletar tamb�m o c�digo do banco que o cliente tem conta, segundo:
 
1.8.	No final, exibir a estat�stica, separada por bancos, com:
1.8.1.	O maior e o menor valor sacado;
1.8.2.	A m�dia dos saques;
1.8.3.	Valor total dos saques;
1.8.4.	Valor das sobras dos caixas.
* Data: 10/02/20
*/

package caixaEletronico;

import javax.swing.JOptionPane;

public class Caixa {
	
	//vari�veis globais
	
	public static int bancos[] = {0, 1, 2, 3};
	public static int maiorSaqueBanco[] = {0, 0, 0, 0};
	public static int menorSaqueBanco[] = {10000, 10000, 10000, 10000};
	
	public static boolean teveSaques = false;
	public static boolean teveRecarga = false;
	public static boolean usuarioLogado = true;
	
	//media dos saques dos bancos
	public static double mediaSaquesBanco[] = {0, 0, 0, 0};
	
	//array pra dividir pela media, exemplo: media = media / notas_sacas
	public static int quantidadeSaques[] = {0, 0, 0, 0};
	
	//valor total dos saques
	public static int valorTotalSaques[] = {0, 0, 0, 0};
	
	public static int valorNotasTotal[] = {0, 0, 0, 0, 0, 0};
	public static int qtdNotasTotal[] = {0, 0, 0, 0, 0, 0};
	
	public static int valorNotas[] = {2, 5, 10, 20, 50, 100};
	
	public static int qtdNotasSolicitadas[] = {0, 0, 0, 0, 0, 0};
	
	public static int valor, escolha, j, escolhaBanco;
	
	public static int dinheiroCaixa;
	
	//valores originais dos arrays
	//int valor_notas_total[6] = {400, 500, 500, 400, 500, 500};
	//int qtd_notas_total[6] = {200, 100, 50, 20, 10, 5};
	
	//metodos
	public static void totalCaixa() {
		dinheiroCaixa = 0;
		
		//definindo o valor total inicial do caixa:
		for(int i = 0; i<6; i++)
			dinheiroCaixa += valorNotasTotal[i];
		
	}
	
	public static void maiorSaque(int valor, int z) {
		if(valor > maiorSaqueBanco[z])
			maiorSaqueBanco[z] = valor;
	}
	
	public static void menorSaque(int valor, int z) {
		if(valor < menorSaqueBanco[z])
			menorSaqueBanco[z] = valor;
	}
	
	public static void zerandoNotasSolicitadas(){
		for(int i = 0; i < 6; i++){
			qtdNotasSolicitadas[i] = 0;
		}
	}
	
	public static void retirarNotas() {
		totalCaixa();
		int escolhaBanco = Integer.parseInt(JOptionPane.showInputDialog("Digite o codigo do seu banco, segundo:\\n0 - Banco do Brasil\\n1 - Santander\\n2 - Itau\\n3 - Caixa\\n"));
		int valor;
		for(int z = 0; z < 4; z++) {
			if(z == escolhaBanco) {
				do {
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja sacar."));
					
				}while(valor < 2);
				
				if(valor > dinheiroCaixa) {
					System.out.println("EXCEDEU O LIMITE DO CAIXA");
					return;
				}
				
				maiorSaque(valor, z);
				menorSaque(valor, z);
				
				System.out.println("Por favor, selecione uma das op��es, segundo:");
				
				for(int i = 0; i < 6; i++) {
					j = 0;
					while(j <= valor) {
						if(j == valor) {
							System.out.println("Op��o: " + i + " -> " + qtdNotasSolicitadas[i] + "nota(s) de " + valorNotas[i]);
							break;
						}
						
						j += valorNotas[i];
						qtdNotasSolicitadas[i]++;
						
					}
				}
				
				int escolha = Integer.parseInt(JOptionPane.showInputDialog("Digite sua op��o:"));
				if(escolha >= 0 && escolha < 6) {
					for(int i = 0; i < 6; i++) {
						if(i == escolha) {
						
							//decrementando o valor de notas total do caixa
							valorNotasTotal[i] -= (valorNotas[i] * qtdNotasSolicitadas[i]);

							//decrementando a quantidade de notas total do caixa
							qtdNotasTotal[i] -= qtdNotasSolicitadas[i];

							//media do banco = media do banco + (valor das notas * quantidade das notas)
							mediaSaquesBanco[z] += (valorNotas[i] * qtdNotasSolicitadas[i]);
							//incrementa notas sacadas do banco escolhido
							quantidadeSaques[z]++;
							//notas_sacadas[z] += qtd_notas_solicitadas[i];

							//valor total dos saques
							valorTotalSaques[z] += (valorNotas[i] * qtdNotasSolicitadas[i]);

							teveSaques = true;

							//atualiza as sobras do caixa
							totalCaixa();
							
							
						}
					}
				}else {
					System.out.println("Op��o inv�lida.");
				}
			}
		}
		
		zerandoNotasSolicitadas();
		
	}
	
	public static void mostrarEstatisticas() {
		if(teveSaques == false)
			System.out.println("Ainda n�o houve nenhum saque em nenhum banco.");
		else {
			for(int i = 0; i < 4; i++) {
				
				//necessario montar essa condicao pois sem ela, se tiver um banco que nao teve saques, vai ocasionar em divisao ( 0 / 0 ), causando um erro...
				if(quantidadeSaques[i] != 0) {
					mediaSaquesBanco[i] = (mediaSaquesBanco[i] / quantidadeSaques[i]);
					System.out.println("C�digo do banco: " + bancos[i] +
										"\nValor total dos saques: " + valorTotalSaques[i] +
										"\nM�dia dos saques: " + mediaSaquesBanco[i] +
										"\nMaior valor sacado: " + maiorSaqueBanco[i] +
										"\nMenor valor sacado:" + menorSaqueBanco[i] +
										"\nQuantidade de saques realizados: " + quantidadeSaques[i] +
										"\nSobras do caixa: " + dinheiroCaixa);
				}
			}
		}
	}
	
	public static void carregarNotas() {
		
		int nota, qtdNota, resposta;
		do {
			System.out.println("Escolha uma op��o de nota para carregar:");
			for(int i = 0; i < 6; i++) {
				System.out.println("Op��o " + i + " -> nota de " + valorNotas[i]);
			}
			
			do {
				nota = Integer.parseInt(JOptionPane.showInputDialog("Digite abaixo sua op��o."));
				
				if(nota < 0 || nota > 5)
					System.out.println("Voc� n�o digitou notas v�lidas!");
				
			}while(nota < 0 || nota > 5);
			
			do {
				qtdNota = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de notas que voc� deseja carregar (m�ximo permitido: 30 notas)."));
				
				if(qtdNota > 30 || qtdNota < 0)
					System.out.println("Voc� n�o digitou uma quantidade v�lida!");
			
			}while(qtdNota > 30 || qtdNota < 0);
			
			for(int i = 0; i < 6; i++) {
				if(nota == i) {
					valorNotasTotal[i] += (valorNotas[i] * qtdNota);
					qtdNotasTotal[i] += qtdNota;
				}
			}
			resposta = Integer.parseInt(JOptionPane.showInputDialog("Deseja carregar mais notas? Se sim, digite 1. Senao, digite qualquer tecla."));
		}while(resposta == 1);
		totalCaixa();
		usuarioLogado = false;
		System.out.println("Logout realizado automaticamente.\n");
		
	}
	
	public static void mostraValoresBanco() {
		for(int i = 0; i < 6; i++) {
			System.out.println("Valor total das notas na posi��o ["+ i +"] = " + valorNotasTotal[i] + ".");
			System.out.println("Quantidade de notas total na posicao [" + i + "] = " + qtdNotasTotal[i] + ".\n");
		}
		usuarioLogado = false;
		System.out.println("Logout realizado automaticamente.\n");
	}
	
	public static void realizarLogin() {
		String senha = "12345";
		String valorDigitado = JOptionPane.showInputDialog("Digite a senha para realizar login:");
		if(valorDigitado.equals(senha)) {
			System.out.println("Login realizado com sucesso! Por seguranca, agora voce tem acesso a recarregar o caixa e ver os valores restantes apenas uma vez.");
			usuarioLogado = true;
		}else
			System.out.println("Senha inv�lida!");
	}
	
	public static void main(String[] args) {
		
		int escolhaSwitch = 0;
		int escolhaFim = 0;
		usuarioLogado = false;
		
		while(escolhaSwitch != 9) {
			do {
				escolhaSwitch = Integer.parseInt(JOptionPane.showInputDialog("Menu Principal\n1 - Carregar Notas (necessario login)\n2 - Retirar Notas\n3 - Estatistica\n4 - Visualizar Notas do Caixa (necessario login)\n5 - Realizar Login\n9 - Fim"));
				switch(escolhaSwitch) {
					case 1:
						if(!usuarioLogado)
							System.out.println("� necess�rio estar logado para ter acesso a esse recurso.");
						else
							carregarNotas();
						break;
					
					case 2:
						totalCaixa();
						if(dinheiroCaixa <= 1)
							System.out.println("O caixa est� vazio.");
						
						else
							retirarNotas();
						break;
						
					case 3:
						mostrarEstatisticas();
						break;
						
					case 4:
						if(!usuarioLogado)
							System.out.println("� necess�rio estar logado para ter acesso a esse recurso.");
					
						else
							mostraValoresBanco();
						break;
					
					case 5:
						realizarLogin();
						break;
						
					case 9:
						escolhaFim = Integer.parseInt(JOptionPane.showInputDialog("Tem certeza de que deseja sair? Digite 9 novamente para sair. Se quiser utilizar o sistema novamente, digite qualquer valor."));
						break;
						
					default:
						System.out.println("Op��o inv�lida!");
						
				}
			}while(escolhaFim != 9);
			System.out.println("Obrigado por utilizar nosso sistema! Tenha um �timo dia!");
		}
	}
	
}
