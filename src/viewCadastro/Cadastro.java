package viewCadastro;

import java.awt.Container;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

public class Cadastro extends JFrame {
	
	//TextField
	JTextField txtNome = new JTextField();
	JTextField txtEndereco = new JTextField();
	JTextField txtCidade = new JTextField();
	JTextField txtBairro = new JTextField();
	JTextField txtTelefone = new JTextField();
	JTextField txtRg = new JTextField();
	JTextField txtCep = new JTextField();
	JTextField txtCelular = new JTextField();
	JTextField txtCpf = new JTextField();
	
	//Label
	JLabel lblNome = new JLabel("Nome: ");
	JLabel lblEndereco = new JLabel("Endereço: ");
	JLabel lblCidade = new JLabel("Cidade: ");
	JLabel lblBairro = new JLabel("Bairro: ");
	JLabel lblTelefone = new JLabel("Telefone: ");
	JLabel lblRg = new JLabel("RG: ");
	JLabel lblCep = new JLabel("CEP: ");
	JLabel lblCelular = new JLabel("Celular: ");
	JLabel lblCpf = new JLabel("Cpf: ");
	JLabel lblSexo = new JLabel("Sexo: ");
	JLabel lblEstado = new JLabel("Estado: ");
	
	//Button
	JButton btnSalvar = new JButton();
	JButton btnImprimir = new JButton();
	
	//ComboBox
	JComboBox boxEstado = new JComboBox();
	
	//JRadioButton
	JRadioButton[] rdbSexo = new JRadioButton[2]; //botão para opçoes
	ButtonGroup grupo = new ButtonGroup();{ //group impede marcar mais de uma opçao no mesmo objeto
	rdbSexo[0] = new JRadioButton("Feminino");
	rdbSexo[1] = new JRadioButton("Masculino");} //fechar chave nos groups
	
	
	public Cadastro() {
				
		//Container
		Container paine = this.getContentPane();
		
		paine.add(lblNome);
		lblNome.setBounds(10,10,100,15);
		
		paine.add(lblEndereco);
		lblEndereco.setBounds(10,40,100,15);
		
		paine.add(lblCidade);
		lblCidade.setBounds(10,70,100,15);
		
		paine.add(lblBairro);
		lblBairro.setBounds(10,100,100,15);
		
		paine.add(lblTelefone);
		lblTelefone.setBounds(10,130,100,15);
		
		paine.add(lblRg);
		lblRg.setBounds(10,130,100,15);
		
		//Arrumar a partir daqui
		//Basta ajustar o eixo X deles
		//
		//
		
		paine.add(lblSexo);
		lblSexo.setBounds(10,10,100,15);
		
		paine.add(lblCep);
		lblCep.setBounds(10,40,100,15);
		
		paine.add(lblEstado);
		lblEstado.setBounds(10,70,100,15);
		
		paine.add(lblCelular);
		lblCelular.setBounds(10,100,100,15);
		
		paine.add(lblCpf);
		lblCpf.setBounds(110,130,100,15);
		
		//Configurações janela
		this.setLayout(null);
		this.setVisible(true);
		this.setResizable(false);
		// Abrir janela no meio -> this.setLocationRelativeTo(null);
		this.setSize(500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
	}
}
