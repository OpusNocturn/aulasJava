package view;

import java.awt.Container;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Tela extends JFrame{
	
	//Campos Exibir, Editar, Ajuda
	JLabel exibir = new JLabel("Exibir");
	JLabel editar = new JLabel("Editar");
	JLabel ajuda = new JLabel("Ajuda");
	
	//Campo onde digita os números
	JTextField campo = new JTextField();
	
	//Botões
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnMmais = new JButton("M+");
	JButton btnMmenos = new JButton("M-");
	JButton btnBack = new JButton("<-");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnMaisMenos = new JButton("+/-");
	JButton btnR = new JButton("R...");
	JButton btnSete = new JButton("7");
	JButton btnOito = new JButton("8");
	JButton btnNove = new JButton("9");
	JButton btnBarra = new JButton("/");
	JButton btnPercent = new JButton("%");
	JButton btnQuatro = new JButton("4");
	JButton btnCinco = new JButton("5");
	JButton btnSeis = new JButton("6");
	JButton btnEstrela = new JButton("*");
	JButton btnX = new JButton("1/x");
	JButton btnUm = new JButton("1");
	JButton btnDois = new JButton("2");
	JButton btnTres = new JButton("3");
	JButton btnMenos = new JButton("-");
	JButton btnIgual = new JButton("=");
	JButton btnZero = new JButton("0");
	JButton btnPonto = new JButton(",");
	JButton btnMais = new JButton("+");

	
	public Tela(){
		super("Calculadora");
		
		Container paine = this.getContentPane();
		
		//Guia superior
		paine.add(exibir);
		exibir.setBounds(10,10,100,20);
		
		paine.add(editar);
		editar.setBounds(60,10,100,20);
		
		paine.add(ajuda);
		ajuda.setBounds(110,10,100,20);
		
		//Campo de texto
		paine.add(campo);
		campo.setBounds(10,38,330,75);
		
		//Botões
		paine.add(btnMC);
		btnMC.setBounds(10,119,60,50);
		
		paine.add(btnMR);
		btnMR.setBounds(78,119,60,50);
		
		paine.add(btnMS);
		btnMS.setBounds(145,119,60,50);
		
		paine.add(btnMmais);
		btnMmais.setBounds(212,119,60,50);
		
		paine.add(btnMmenos);
		btnMmenos.setBounds(280,119,60,50);
		
		paine.add(btnCE);
		btnCE.setBounds(78,175,60,50);
		
		paine.add(btnC);
		btnC.setBounds(145,175,60,50);
		
		paine.add(btnMaisMenos);
		btnMaisMenos.setBounds(212,175,60,50);
		
		paine.add(btnBack);
		btnBack.setBounds(10,175,60,50);
		
		paine.add(btnR);
		btnR.setBounds(280,175,60,50);
		
		paine.add(btnSete);
		btnSete.setBounds(10,230,60,50);
		
		paine.add(btnOito);
		btnOito.setBounds(78,230,60,50);
		
		paine.add(btnPercent);
		btnPercent.setBounds(280,230,60,50);
		
		paine.add(btnBarra);
		btnBarra.setBounds(212,230,60,50);
		
		paine.add(btnNove);
		btnNove.setBounds(145,230,60,50);
		
		paine.add(btnCinco);
		btnCinco.setBounds(78,288,60,50);
		
		paine.add(btnQuatro);
		btnQuatro.setBounds(10,288,60,50);
		
		paine.add(btnUm);
		btnUm.setBounds(10,347,60,50);
		
		paine.add(btnX);
		btnX.setBounds(280,288,60,50);
		
		paine.add(btnEstrela);
		btnEstrela.setBounds(212,288,60,50);
		
		paine.add(btnSeis);
		btnSeis.setBounds(145,288,60,50);
		
		paine.add(btnDois);
		btnDois.setBounds(78,347,60,50);
		
		paine.add(btnTres);
		btnTres.setBounds(145,347,60,50);
		
		paine.add(btnMenos);
		btnMenos.setBounds(212,347,60,50);
		
		paine.add(btnIgual);
		btnIgual.setBounds(280,348,60,108);
		
		paine.add(btnZero);
		btnZero.setBounds(10,405,129,50);
		
		paine.add(btnPonto);
		btnPonto.setBounds(145,405,60,50);
		
		paine.add(btnMais);
		btnMais.setBounds(212,405,60,50);
		
		
		
		
		//Config janela
		this.setLayout(null);
		this.setVisible(true);
		this.setLocation(700, 200);
		this.setSize(365, 500);
		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	
		
		
		
	public static void main(String[] args) {
		Tela janelaCalculadora = new Tela();
	}

}