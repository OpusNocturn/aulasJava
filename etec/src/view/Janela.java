package view;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JTextField;

public class Janela extends JFrame {
	
		
	//CAMPO DE TEXTO DOS NUMEROS
	JTextField campo = new JTextField();
	
	//OP��ES NO TOPO DA JANELA
	JMenuBar menuBar = new JMenuBar();
	
	//BOT�ES
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMMais = new JButton("M+");
	JButton btnMMenos = new JButton("M-");
	JButton btnDelete = new JButton("<-");
	JButton btnCe = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+-");
	JButton btnRaiz = new JButton("-/");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnBarra = new JButton("/");
	JButton btnPercent = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnAsterisco = new JButton("*");
	JButton btnUmx = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnZero = new JButton("0");
	JButton btnVirgula = new JButton(",");
	JButton btnMais = new JButton("+");
	JButton btnIgual = new JButton("=");
	
	//Bot�o sair
	JButton btnSair = new JButton("Sair");
	
	//Configura��es de m�todos matem�ticos, valores...
	
//	FuncoesMatematicas mat = new FuncoesMatematicas();
	CalculosJanela calculo = new CalculosJanela();
	String sinal = null; //Serve para ter certeza que, ao clicar em um bot�o, tal campo estar� limpo, ou seja, antes o campo era nulo e s� depois obteve algum valor
	double valor1, valor2, mvalor;


	public Janela() {
		super("Calculadora");
		
		Container paine = this.getContentPane();
		
		//configura��es do menu
		 setJMenuBar(menuBar);
		 JMenu exibirMenu = new JMenu("Exibir");
	     JMenu editarMenu = new JMenu("Editar");
	     JMenu ajudaMenu = new JMenu("Ajuda");
	     menuBar.add(exibirMenu);
	     menuBar.add(editarMenu);
	     menuBar.add(ajudaMenu);
			
	     
		//Campo em branco para mostrar resultado
		paine.add(campo);
		campo.setFont(new Font("Arial", Font.PLAIN, 25));
		campo.setBounds(5,8,335,70);
		campo.setEditable(false); //Pra impedir que digitem letras na calculadora
		
		
		
	
		//Configura��es dos bot�es
		paine.add(btnMC);
		btnMC.setBounds(5,85,60,50);
		btnMC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				 mvalor = 0;
			}
			
		});
		
		paine.add(btnMR);
		btnMR.setBounds(70,85,60,50);
		btnMR.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 campo.setText(Double.toString(mvalor));
				
			}
			
		});

		paine.add(btnMS);
		btnMS.setBounds(140,85,60,50);
		btnMS.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 mvalor = Double.parseDouble(campo.getText());
				
			}
			
		});

		paine.add(btnMMais);
		btnMMais.setBounds(210,85,60,50);
		btnMMais.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				 mvalor += Double.parseDouble(campo.getText());
				 
			}
			
		});

		paine.add(btnMMenos);
		btnMMenos.setBounds(280,85,60,50);
		btnMMenos.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				mvalor -= Double.parseDouble(campo.getText());
				
			}
			
		});

		paine.add(btnDelete);
		btnDelete.setBounds(5,140,60,50);
		btnDelete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				campo.setText(campo.getText().substring(0, campo.getText().length() - 1)); 
			}
			
		});

		paine.add(btnCe);
		btnCe.setBounds(70,140,60,50);
		btnCe.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				valor1 = 0;
				valor2 = 0;
				sinal = null;
				campo.setText("0");
			}
		});
		
		paine.add(btnC);
		btnC.setBounds(140,140,60,50);
		btnC.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				campo.setText(""); 
			}
			
		});

		paine.add(btnMaisMenos);
		btnMaisMenos.setBounds(210,140,60,50);
		btnMaisMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "maismenos";
				campo.setText("0");
			}
		});

		paine.add(btnRaiz);
		btnRaiz.setBounds(280,140,60,50);
		btnRaiz.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "raiz";
				campo.setText("0");
			}
		});

		paine.add(btnSete);
		btnSete.setBounds(5,200,60,50);
		btnSete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("7");
				}else {
					campo.setText(campo.getText() + "7");
				}			
			}
		});

		paine.add(btnOito);
		btnOito.setBounds(70,200,60,50);
		btnOito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("8");
				}else {
					campo.setText(campo.getText() + "8");
				}			
			}
		});
		
		paine.add(btnNove);
		btnNove.setBounds(140,200,60,50);
		btnNove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("9");
				}else {
					campo.setText(campo.getText() + "9");
				}			
			}
		});

		paine.add(btnBarra);
		btnBarra.setBounds(210,200,60,50);
		btnBarra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "divisao";
				campo.setText("0");
			}
		});

		paine.add(btnPercent);
		btnPercent.setBounds(280,200,60,50);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "porcentagem";
				campo.setText("0");
			}
		});
		

		paine.add(btnQuatro);
		btnQuatro.setBounds(5,260,60,50);
		btnQuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("4");
				}else {
					campo.setText(campo.getText() + "4");
				}			
			}
		});

		paine.add(btnCinco);
		btnCinco.setBounds(70,260,60,50);
		btnCinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("5");
				}else {
					campo.setText(campo.getText() + "5");
				}			
			}
		});

		paine.add(btnSeis);
		btnSeis.setBounds(140,260,60,50);
		btnSeis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("6");
				}else {
					campo.setText(campo.getText() + "6");
				}			
			}
		});

		paine.add(btnAsterisco);
		btnAsterisco.setBounds(210,260,60,50);
		btnAsterisco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "multiplicacao";
				campo.setText("0");
			}
		});

		paine.add(btnUmx);
		btnUmx.setBounds(280,260,60,50);
		btnUmx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "umx";
				campo.setText("0");
			}
		});

		paine.add(btnUm);
		btnUm.setBounds(5,320,60,50);
		btnUm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("1");
				}else {
					campo.setText(campo.getText() + "1");
				}			
			}
		});

		paine.add(btnDois);
		btnDois.setBounds(70,320,60,50);
		btnDois.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("2");
				}else {
					campo.setText(campo.getText() + "2");
				}			
			}
		});

		paine.add(btnTres);
		btnTres.setBounds(140,320,60,50);
		btnTres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("3");
				}else {
					campo.setText(campo.getText() + "3");
				}			
			}
		});

		paine.add(btnMenos);
		btnMenos.setBounds(210,320,60,50);
		btnMenos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "subtracao";
				campo.setText("0");
			}
		});

		paine.add(btnMais);
		btnMais.setBounds(210,380,60,50);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(campo.getText());
				sinal = "soma";
				campo.setText("0");
			}
		});
		

		paine.add(btnZero);
		btnZero.setBounds(5,380,125,50);
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText("0");
				}else {
					campo.setText(campo.getText() + "0");
				}			
			}
		});

		

		paine.add(btnVirgula);
		btnVirgula.setBounds(140,380,60,50);
		btnVirgula.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {

				if(campo.getText().equals("0")) {
					campo.setText(".");
				}else {
					campo.setText(campo.getText() + ".");
				}			
			}
		});
		
		
		//Bot�o de igual
		paine.add(btnIgual);
		btnIgual.setBounds(280,320,60,110);
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valor2 = Double.parseDouble(campo.getText());

				
				if(sinal.equals("soma")) {
					campo.setText(calculo.soma(valor1, valor2) + "");
				}
				else if(sinal.equals("subtracao")) {
					campo.setText(calculo.subtracao(valor1, valor2) + "");
				}
				else if(sinal.equals("multiplicacao")) {
					campo.setText(calculo.multiplicacao(valor1, valor2) + "");
				}
				else if(sinal.equals("divisao")){
					campo.setText(calculo.divisao(valor1, valor2) + "");
				}
				else if(sinal.equals("raiz")){
					campo.setText(calculo.raiz(valor1)+"");
				}
				
				else if(sinal.equals("porcentagem")) {
					campo.setText(calculo.porcentagem(valor1, valor2)+"");
				}
				
				else if(sinal.equals("umx")) {
					campo.setText(calculo.umx(valor1)+"");
				}
				else {
					campo.setText(calculo.maismenos(valor1)+"");
				}
			}
		});
		
			
		
		//Bot�o sair
		paine.add(btnSair);
		btnSair.setBounds(100,440,125,50);
		btnSair.addActionListener(e -> System.exit(0)); //Encerra a aplica��o
		
		//Configura��es da tela
		paine.setLayout(null);
		this.setSize(360, 550);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	public static void main(String[] args) {
		Janela janela = new Janela();
	}
}
