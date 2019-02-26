package view;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Janela extends JFrame {
	

	
	JLabel titulo = new JLabel("Calculadora:");
	JLabel exibir = new JLabel("Exibir");
	JLabel editar = new JLabel("Editar");
	JLabel ajuda = new JLabel("Ajuda");
	
	//CAMPO DE TEXTO
	JTextField campo = new JTextField();
	
	//BOTÕES
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


	public Janela() {
		super("Principal");
		
		Container paine = this.getContentPane();
		
		/////////////////////
		
		paine.add(campo);
		campo.setBounds(5,20,335,60);
		
		paine.add(exibir);
		exibir.setBounds(5,5,40,15);
		paine.add(editar);
		editar.setBounds(45,5,40,15);
		paine.add(ajuda);
		ajuda.setBounds(85,5,40,15);
		
		
		/////////////////////
		
		paine.add(btnMC);
		btnMC.setBounds(5,85,60,50);
		
		paine.add(btnMR);
		btnMR.setBounds(70,85,60,50);

		paine.add(btnMS);
		btnMS.setBounds(140,85,60,50);

		paine.add(btnMMais);
		btnMMais.setBounds(210,85,60,50);

		paine.add(btnMMenos);
		btnMMenos.setBounds(280,85,60,50);

		paine.add(btnDelete);
		btnDelete.setBounds(5,140,60,50);

		paine.add(btnCe);
		btnCe.setBounds(70,140,60,50);

		paine.add(btnC);
		btnC.setBounds(140,140,60,50);

		paine.add(btnMaisMenos);
		btnMaisMenos.setBounds(210,140,60,50);

		paine.add(btnRaiz);
		btnRaiz.setBounds(280,140,60,50);

		paine.add(btnSete);
		btnSete.setBounds(5,230,90,30);

		paine.add(btnOito);
		btnOito.setBounds(5,230,90,30);

		paine.add(btnBarra);
		btnBarra.setBounds(5,230,90,30);

		paine.add(btnPercent);
		btnPercent.setBounds(5,230,90,30);

		paine.add(btnQuatro);
		btnQuatro.setBounds(5,230,90,30);

		paine.add(btnCinco);
		btnCinco.setBounds(5,230,90,30);

		paine.add(btnSeis);
		btnSeis.setBounds(5,230,90,30);

		paine.add(btnAsterisco);
		btnAsterisco.setBounds(5,230,90,30);

		paine.add(btnUmx);
		btnUmx.setBounds(5,230,90,30);

		paine.add(btnUm);
		btnUm.setBounds(5,230,90,30);

		paine.add(btnDois);
		btnDois.setBounds(5,230,90,30);

		paine.add(btnTres);
		btnTres.setBounds(5,230,90,30);

		paine.add(btnMenos);
		btnMenos.setBounds(5,230,90,30);

		paine.add(btnMais);
		btnMais.setBounds(5,230,90,30);

		paine.add(btnZero);
		btnZero.setBounds(5,230,90,30);

		paine.add(btnIgual);
		btnIgual.setBounds(5,230,90,30);

		paine.add(btnVirgula);
		btnVirgula.setBounds(5,230,90,30);
		
		
		/////////////////////////
		
		paine.setLayout(null);
		this.setSize(370, 600);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*
		paine.add(btnSair);
		btnSair.setBounds(130,230,120,30);
		btnSair.addActionListener(e -> System.exit(0)); //Encerra a aplicação
		*/
		
		
	}
	public static void main(String[] args) {
		Janela janela = new Janela();
	}
}
