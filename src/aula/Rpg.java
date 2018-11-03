package aula;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Rpg extends JFrame{
	
	JLabel titulo = new JLabel("Preencha a ficha:");
	
	JTextField txtNome = new JTextField();
	JLabel nome = new JLabel("Nome: ");
	
	JTextField txtIdade = new JTextField();
	JLabel idade = new JLabel("Idade: ");
	
	JTextField txtOrigem = new JTextField();
	JLabel origem = new JLabel("Local de origem: ");
	
	JComboBox racabox = new JComboBox();
	JLabel raca = new JLabel("Raça: ");
	
	JComboBox classebox = new JComboBox();
	JLabel classe = new JLabel("Classe: ");
	
	JTextField txtJogador = new JTextField();
	JLabel jogador = new JLabel("Jogador: ");
	
	JLabel sexo = new JLabel("Sexo: ");
	JRadioButton[] rdbsexo = new JRadioButton[2]; //botão para opçoes
	ButtonGroup grupo = new ButtonGroup();{ //group impede marcar mais de uma opçao no mesmo objeto
	
	rdbsexo[0] = new JRadioButton("Feminino");
	rdbsexo[1] = new JRadioButton("Masculino");} //fechar chave nos groups
	
	JButton btnSalvar = new JButton("Salvar.");
	
	JButton btnImprimir = new JButton("Imprimir ficha.");

public Rpg() {
	super("Ficha RPG");
	
	Container paine = this.getContentPane();
	
	paine.add(titulo);
	titulo.setBounds(5,0,100,15);
	
	paine.add(nome);
	paine.add(txtNome);
	nome.setBounds(5,20,40,15);
	txtNome.setBounds(50,20,140,18);
	
	paine.add(idade);
	paine.add(txtIdade);
	idade.setBounds(5,40,40,15);
	txtIdade.setBounds(50,40,35,18);
	
	paine.add(origem);
	paine.add(txtOrigem);
	origem.setBounds(165,40,100,15);
	txtOrigem.setBounds(265,40,140,18);
	
	
	paine.add(raca);
	raca.setBounds(5,60,40,15);
	
	paine.add(racabox);
	racabox.setBounds(40,60,90,18);
	racabox.addItem("Anão");
	racabox.addItem("Elfo");
	racabox.addItem("Homem");
	racabox.addItem("Orc");
	
	paine.add(classe);
	classe.setBounds(145,60,50,15);
	
	paine.add(classebox);
	classebox.setBounds(190,60,100,18);
	classebox.addItem("Arqueiro");
	classebox.addItem("Cavaleiro");
	classebox.addItem("Ladrão");
	classebox.addItem("Mago");
	classebox.addItem("Necromante");
	classebox.addItem("Paladino");
	classebox.addItem("Piromante");
	
	paine.add(jogador);
	paine.add(txtJogador);
	jogador.setBounds(210,20,90,15);
	txtJogador.setBounds(265,20,140,18);
	
	paine.add(sexo);			
	sexo.setBounds(5, 80, 55, 30);		
	grupo.add(rdbsexo[0]); //grupo para o sexo
	grupo.add(rdbsexo[1]);
	paine.add(rdbsexo[0]); //opção para o sexo
	rdbsexo[0].setBounds(40, 80, 85, 30);
	paine.add(rdbsexo[1]);
	rdbsexo[1].setBounds(120, 80, 90, 30);
	
	paine.add(btnSalvar);
	btnSalvar.setBounds(5,230,90,30);
	
	paine.add(btnImprimir);
	btnImprimir.setBounds(280,230,120,30);
	
	this.setLayout(null);
	this.setLocation(700, 200); //Posição em que a janela aparecerá quando for aberta
	this.setVisible(true);
	this.setSize(420, 300);
	this.setResizable(false);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}



public static void main(String[] args) {
	Rpg rpg = new Rpg();
	}

}