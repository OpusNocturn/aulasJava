package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

import java.awt.Container;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JTextField;

import calculos.FuncoesMatematicas;

public class Calculadora extends JFrame {
	
	ButtonGroup tipo = new ButtonGroup ();
	
	JMenu Exibir = new JMenu("Exibir");
	JRadioButtonMenuItem radipadrao = new JRadioButtonMenuItem("Padão");
	JRadioButtonMenuItem radicienti = new JRadioButtonMenuItem("Cientifica");
	JRadioButtonMenuItem radiprograma = new JRadioButtonMenuItem("Programador");
	JRadioButtonMenuItem radiestatist = new JRadioButtonMenuItem("Estatistica");
	JCheckBoxMenuItem cbAgrupamento = new JCheckBoxMenuItem ("Agrupamento de Digitos");
	
	
	JMenu Editar = new JMenu("Editar");
	JMenu Ajuda = new JMenu("Ajuda");
	
	JMenuBar menuBar = new JMenuBar();
	
	JTextField visor = new JTextField("0");
	// primeira fileira de botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMais = new JButton("M+");
	JButton btnMenos = new JButton("M-");
	
	//segunda fileira de botões
	JButton backsp = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnmom = new JButton("+/-");
	JButton btnraiz = new JButton("Raiz");
	
	//botões da terceira fileira
	JButton btnbarra = new JButton("/");
	JButton btnporc = new JButton("%");
	
	//botões da quarta fileira
	JButton btnmul = new JButton("*");
	JButton btnfra = new JButton("1/x");
	
	//botões da quinta fileira
	JButton btnfmenos = new JButton("-");
	JButton btnfigual = new JButton("=");
	
	//botões da sexta fileira
	JButton btnvirgula = new JButton(",");
	JButton btnfmais = new JButton("+");
	
	//numeros
	JButton um = new JButton("1");
	JButton dois = new JButton("2");
	JButton tres = new JButton("3");
	JButton quatro = new JButton("4");
	JButton cinco = new JButton("5");
	JButton seis = new JButton("6");
	JButton sete = new JButton("7");
	JButton oito = new JButton("8");
	JButton nove = new JButton("9");
	JButton zero = new JButton("0");
	
	FuncoesMatematicas mat = new FuncoesMatematicas();
	String sinal = null;
	double valor1 = 0, valor2 = 0;
	
	public Calculadora(){
		super("calculadora");
		
		Container paine = this.getContentPane();
		paine.setLayout(null);
		
		// Barra de menu superior
		menuBar.setBounds(0, 0, 228, 25);
		paine.add(menuBar);
		
		
		
		Exibir.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Exibir.setBounds(1, 5, 45, 20);
		menuBar.add(Exibir);
		Exibir.add(radipadrao);
		Exibir.add(radicienti);
		Exibir.add(radiprograma);
		Exibir.add(radiestatist);
		Exibir.addSeparator();
		Exibir.add("Histórico       Crtl + H");
		Exibir.add(cbAgrupamento);
		Exibir.addSeparator();
		
		
		
		
		Editar.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Editar.setBounds(46, 5, 45, 20);
		menuBar.add(Editar);
		
		Ajuda.setFont( new Font( "Arial", Font.PLAIN, 12 ));
		Ajuda.setBounds(91, 5, 45, 20);
		menuBar.add(Ajuda);
		
		
		
		
		// Visor
		visor.setFont( new Font( "Arial", Font.PLAIN, 20 ));
		visor.setBounds(20, 40, 171, 50);
		paine.add(visor);
		
		//primeira fileira
		btnMC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMC.setMargin(new Insets(1,1,1,1));
		btnMC.setBounds(20, 95, 30,25);
		paine.add(btnMC);
		
		btnMR.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMR.setMargin(new Insets(1,1,1,1));
		btnMR.setBounds(55, 95, 30,25);
		paine.add(btnMR);
		
		btnMS.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMS.setMargin(new Insets(1,1,1,1));
		btnMS.setBounds(90, 95, 30,25);
		paine.add(btnMS);
		
		btnMais.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMais.setMargin(new Insets(1,1,1,1));
		btnMais.setBounds(125, 95, 30,25);
		paine.add(btnMais);
		btnMais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sinal = "soma";
			}
		});
		
		btnMenos.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnMenos.setMargin(new Insets(1,1,1,1));
		btnMenos.setBounds(160, 95, 30,25);
		paine.add(btnMenos);
		
		//segunda fileira
		backsp.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		backsp.setMargin(new Insets(1,1,1,1));
		backsp.setBounds(20, 125, 30, 25);
		paine.add(backsp);
		
		btnCE.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnCE.setMargin(new Insets(1,1,1,1));
		btnCE.setBounds(55, 125, 30, 25);
		paine.add(btnCE);
		btnCE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText("0");
				
			}
		});
		
		btnC.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnC.setMargin(new Insets(1,1,1,1));
		btnC.setBounds(90, 125, 30, 25);
		paine.add(btnC);
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				visor.setText("0");
				
			}
		});
		
		btnmom.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnmom.setMargin(new Insets(1,1,1,1));
		btnmom.setBounds(125, 125, 30, 25);
		paine.add(btnmom);
		
		btnraiz.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnraiz.setMargin(new Insets(1,1,1,1));
		btnraiz.setBounds(160, 125, 30, 25);
		paine.add(btnraiz);
		
		//terceira fileira
		sete.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		sete.setMargin(new Insets(1,1,1,1));
		sete.setBounds(20, 155, 30, 25);
		paine.add(sete);
		sete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(visor.getText().equals("0")) {
					visor.setText("7");
				}else {
					visor.setText(visor.getText() + "7");
				}
				
				
			}
		});
		
		oito.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		oito.setMargin(new Insets(1,1,1,1));
		oito.setBounds(55, 155, 30, 25);
		paine.add(oito);
		oito.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if(visor.getText().equals("0")) {
					visor.setText("8");
				}else {
					visor.setText(visor.getText() + "8");
				}
				
				
			}
		});
		
		nove.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		nove.setMargin(new Insets(1,1,1,1));
		nove.setBounds(90, 155, 30, 25);
		paine.add(nove);
		
		btnbarra.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnbarra.setMargin(new Insets(1,1,1,1));
		btnbarra.setBounds(125, 155, 30, 25);
		paine.add(btnbarra);
		
		btnporc.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnporc.setMargin(new Insets(1,1,1,1));
		btnporc.setBounds(160, 155, 30, 25);
		paine.add(btnporc);
		
		//quarta fileira
		quatro.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		quatro.setMargin(new Insets(1,1,1,1));
		quatro.setBounds(20, 185, 30, 25);
		paine.add(quatro);
		
		cinco.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		cinco.setMargin(new Insets(1,1,1,1));
		cinco.setBounds(55, 185, 30, 25);
		paine.add(cinco);
		
		seis.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		seis.setMargin(new Insets(1,1,1,1));
		seis.setBounds(90, 185, 30, 25);
		paine.add(seis);
		
		btnmul.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnmul.setMargin(new Insets(1,1,1,1));
		btnmul.setBounds(125, 185, 30, 25);
		paine.add(btnmul);
		
		btnfra.setFont( new Font( "Arial", Font.PLAIN, 12 ) );
		btnfra.setMargin(new Insets(1,1,1,1));
		btnfra.setBounds(160, 185, 30, 25);
		paine.add(btnfra);
		
		//quinta fileira
		
		um.setFont(new Font("Arial", Font.PLAIN, 12));
		um.setMargin(new Insets(1,1,1,1));
		um.setBounds(20, 215, 30, 25);
		paine.add(um);
		
		dois.setFont(new Font("Arial", Font.PLAIN, 12));
		dois.setMargin(new Insets(1,1,1,1));
		dois.setBounds(55, 215, 30, 25);
		paine.add(dois);
		
		tres.setFont(new Font("Arial", Font.PLAIN, 12));
		tres.setMargin(new Insets(1,1,1,1));
		tres.setBounds(90, 215, 30, 25);
		paine.add(tres);
		
		btnfmenos.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfmenos.setMargin(new Insets(1,1,1,1));
		btnfmenos.setBounds(125, 215, 30, 25);
		paine.add(btnfmenos);
		
		btnfigual.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfigual.setMargin(new Insets(1,1,1,1));
		btnfigual.setBounds(160, 215, 30, 55);
		paine.add(btnfigual);
		btnfigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor2 = Double.parseDouble(visor.getText());

				if(sinal.equals("soma")) {
					visor.setText(mat.soma(valor1, valor2) + "");
				}
				
			}
		});
		
		//sexta fileira
		zero.setFont(new Font("Arial", Font.PLAIN, 12));
		zero.setMargin(new Insets(1,1,1,1));
		zero.setBounds(20, 245, 65, 25);
		paine.add(zero);
		
		btnvirgula.setFont(new Font("Arial", Font.PLAIN, 12));
		btnvirgula.setMargin(new Insets(1,1,1,1));
		btnvirgula.setBounds(90, 245, 30, 25);
		paine.add(btnvirgula);
		
		btnfmais.setFont(new Font("Arial", Font.PLAIN, 12));
		btnfmais.setMargin(new Insets(1,1,1,1));
		btnfmais.setBounds(125, 245, 30, 25);
		paine.add(btnfmais);	
		btnfmais.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valor1 = Double.parseDouble(visor.getText());
				sinal = "soma";
				visor.setText("0");
			}
		});
		
		this.setSize(228, 322);
		this.setVisible(true);
		this.setResizable(true);
		
		
	}

	public static void main(String []args) {
		Calculadora calc = new Calculadora();
	}
}
