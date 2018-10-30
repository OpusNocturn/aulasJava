package aula;

import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PrimeiraTela extends JFrame{
	JLabel lblNome = new JLabel("Nome: ");
	JTextField txtNome = new JTextField();
	public PrimeiraTela() {
		super("Titulo da Minha Janela");
		
		Container paine = this.getContentPane();   //Fixa os objetos no layout
		
		paine.add(lblNome);
		lblNome.setBounds(20,20,100,20);
		
		paine.add(txtNome);
		txtNome.setBounds(130,20,200,20);
		
		////////////////////////////////////////////////////
		
		JLabel lblCpf = new JLabel("CPF: ");
		JTextField txtCpf = new JTextField();
			
			
			paine.add(lblCpf);
			lblCpf.setBounds(20,50,100,20);
			
			paine.add(txtCpf);
			txtCpf.setBounds(130,50,200,20);
			
		////////////////////////////////////////////////////
			
		JLabel lblEndereco = new JLabel("Endereço: ");
		JTextField txtEndereco = new JTextField();
		
			paine.add(lblEndereco);
			lblEndereco.setBounds(20,80,100,20);
			
			paine.add(txtEndereco);
			txtEndereco.setBounds(130,80,200,20);
		
		////////////////////////////////////////////////////
			
		this.setLayout(null);
		this.setSize(400, 400);
		//this.setResizable(0);
		this.setVisible(true);
		
		
	}
	public static void main(String args[]) {
		PrimeiraTela tela = new PrimeiraTela();
	}
}
