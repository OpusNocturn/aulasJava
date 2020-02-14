package view;

import java.awt.Container;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroCliente extends JFrame{

	JLabel txtNome = new JLabel("Nome: ");
	JTextField campoNome = new JTextField();
	JButton btn = new JButton("Clique aqui!");
	
public CadastroCliente() {
	super("Janela"); 				//Nome que aparece na aba
	
	Container paine = this.getContentPane();
	
	paine.add(txtNome);
	txtNome.setBounds(20,20,100,20);
	
	paine.add(campoNome);
	campoNome.setBounds(60,20,150,20);
	
	paine.add(btn);
	btn.setBounds(140,120,120,40);
	
	btn.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("Nome: "+ campoNome.getText());
		}
	});
	
	this.setLayout(null);
	this.setVisible(true);
	this.setResizable(false);
	this.setLocation(700, 200);
	this.setSize(400, 200);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);
}

public static void main(String[] args) {
	
	CadastroCliente janela = new CadastroCliente();
	
	}
}