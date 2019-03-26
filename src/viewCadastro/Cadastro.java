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
	JLabel lblCpf = new JLabel("CPF: ");
	JLabel lblSexo = new JLabel("Sexo: ");
	JLabel lblEstado = new JLabel("Estado: ");
	
	//Button
	JButton btnSalvar = new JButton("Salvar");
	JButton btnImprimir = new JButton("Imprimir");
	
	//ComboBox
	JComboBox boxEstado = new JComboBox();
	
	//JRadioButton
	JRadioButton[] rdbSexo = new JRadioButton[2]; //botão para opçoes
	ButtonGroup grupo = new ButtonGroup();{ //group impede marcar mais de uma opçao no mesmo objeto
	rdbSexo[0] = new JRadioButton("Feminino");
	rdbSexo[1] = new JRadioButton("Masculino");} //fechar chave nos groups
	
	
	public Cadastro() {
				
		super("Cadastro de clientes");
		//Container
		Container paine = this.getContentPane();
		
		//Nome
		paine.add(lblNome);
		lblNome.setBounds(10,10,100,15);
		
		paine.add(txtNome);
		txtNome.setBounds(80,10,140,20);
		
		//Endereço
		paine.add(lblEndereco);
		lblEndereco.setBounds(10,40,100,15);
		
		paine.add(txtEndereco);
		txtEndereco.setBounds(80,40,140,20);
		
		//Cidade
		paine.add(lblCidade);
		lblCidade.setBounds(10,70,100,15);
		
		paine.add(txtCidade);
		txtCidade.setBounds(80,70,140,20);
		
		//Bairro
		paine.add(lblBairro);
		lblBairro.setBounds(10,100,100,15);
		
		paine.add(txtBairro);
		txtBairro.setBounds(80,100,140,20);
		
		//Telefone
		paine.add(lblTelefone);
		lblTelefone.setBounds(10,130,100,15);
		
		paine.add(txtTelefone);
		txtTelefone.setBounds(80,130,140,20);
		
		//RG
		paine.add(lblRg);
		lblRg.setBounds(10,160,100,15);
		
		paine.add(txtRg);
		txtRg.setBounds(80,160,140,20);
		
		
		//Sexo
		paine.add(lblSexo);
		lblSexo.setBounds(250,10,100,15);
		
		grupo.add(rdbSexo[0]); //grupo para o sexo
		grupo.add(rdbSexo[1]);
		paine.add(rdbSexo[0]); //opção para o sexo
		rdbSexo[0].setBounds(300, 3, 85, 30);
		paine.add(rdbSexo[1]);
		rdbSexo[1].setBounds(380, 3, 90, 30);
		
		//CEP
		paine.add(lblCep);
		lblCep.setBounds(250,40,100,15);
		
		paine.add(txtCep);
		txtCep.setBounds(300,40,140,20);
		
		//Estado
		paine.add(lblEstado);
		lblEstado.setBounds(250,70,100,15);
		
		paine.add(boxEstado);
		boxEstado.setBounds(300,70,140,18);
		boxEstado.addItem("São Paulo");
		boxEstado.addItem("Rio de Janeiro");
		boxEstado.addItem("Minas Gerais");
		boxEstado.addItem("Acre");
		
		//Celular
		paine.add(lblCelular);
		lblCelular.setBounds(250,100,100,15);
		
		paine.add(txtCelular);
		txtCelular.setBounds(300,100,140,20);
		
		//CPF
		paine.add(lblCpf);
		lblCpf.setBounds(250,130,100,15);
		
		paine.add(txtCpf);
		txtCpf.setBounds(300,130,140,20);
		
		//Botões
		paine.add(btnSalvar);
		btnSalvar.setBounds(100,210,100,40);
		
		paine.add(btnImprimir);
		btnImprimir.setBounds(250,210,100,40);
		
		
		//Configurações janela
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.setResizable(false);
		this.setSize(480, 320);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Cadastro cadastro = new Cadastro();
	}
}
