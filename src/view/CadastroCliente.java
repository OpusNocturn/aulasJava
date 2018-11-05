package view;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame{

	JLabel lblText = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	
public CadastroCliente() {
	super("Janela"); 				//Nome que aparece na aba
	
	Container paine = this.getContentPane();
	
	paine.add(lblText);
	lblText.setBounds(20,20,100,20);
	
	paine.add(txtNome);
	txtNome.setBounds(60,20,150,20);
	
	this.setLayout(null);
	this.setVisible(true);
	this.setResizable(false);
	this.setLocation(700, 200);
	this.setSize(400, 200);
}

public static void main(String[] args) {
	
	CadastroCliente janela = new CadastroCliente();
	
	}
}