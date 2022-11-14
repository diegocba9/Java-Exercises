package view;

import java.awt.BorderLayout;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ClienteController;
import model.ClientePFisica;
import model.ClientePJuridica;

public class ClienteView {

	@SuppressWarnings("unused")
	private ClienteController controller;

	private JFrame frame;
	private JTextField txtInserirNome;
	private JTextField txtNome;
	private JTextField txtOptCliente;
	private JTextField txtInserirRF;
	private JTextField txtRF;
	private JTextField txtInserirEmail;
	private JTextField txtInserirTelefone;
	private JTextField txtInserirEnd;
	private JTextField txtEmail;
	private JTextField txtTelefone;
	private JTextField txtEnd;

	public ClienteView() {
		initialize();

		frame.setVisible(true);
	}

	public void setController(ClienteController controller) {
		this.controller = controller;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Cadastro do cliente");
		frame.setBounds(500, 100, 500, 300);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panelInformacoes = new JPanel();
		frame.getContentPane().add(panelInformacoes, BorderLayout.NORTH);
		GridBagLayout gbl_panelInformacoes = new GridBagLayout();
		gbl_panelInformacoes.columnWidths = new int[] { 0, 0, 0 };
		gbl_panelInformacoes.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panelInformacoes.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		panelInformacoes.setLayout(gbl_panelInformacoes);

		txtInserirNome = new JTextField();
		txtInserirNome.setText("Insira o nome do Cliente: *");
		txtInserirNome.setEditable(false);
		GridBagConstraints gbc_txtInserirNome = new GridBagConstraints();
		gbc_txtInserirNome.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirNome.gridx = 0;
		gbc_txtInserirNome.gridy = 0;
		panelInformacoes.add(txtInserirNome, gbc_txtInserirNome);
		txtInserirNome.setColumns(10);

		txtNome = new JTextField();
		GridBagConstraints gbc_txtNome = new GridBagConstraints();
		gbc_txtNome.insets = new Insets(0, 0, 5, 0);
		gbc_txtNome.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtNome.gridx = 1;
		gbc_txtNome.gridy = 0;
		panelInformacoes.add(txtNome, gbc_txtNome);
		txtNome.setColumns(10);

		txtInserirRF = new JTextField();
		txtInserirRF.setText("CPF/CNPJ do cliente (Apenas n\u00FAmeros): *");
		txtInserirRF.setEditable(false);
		GridBagConstraints gbc_txtInserirRF = new GridBagConstraints();
		gbc_txtInserirRF.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirRF.gridx = 0;
		gbc_txtInserirRF.gridy = 1;
		panelInformacoes.add(txtInserirRF, gbc_txtInserirRF);
		txtInserirRF.setColumns(10);

		txtRF = new JTextField();
		GridBagConstraints gbc_txtRF = new GridBagConstraints();
		gbc_txtRF.insets = new Insets(0, 0, 5, 0);
		gbc_txtRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtRF.gridx = 1;
		gbc_txtRF.gridy = 1;
		panelInformacoes.add(txtRF, gbc_txtRF);
		txtRF.setColumns(10);

		txtInserirEmail = new JTextField();
		txtInserirEmail.setText("Insira o e-mail do cliente:");
		txtInserirEmail.setEditable(false);
		GridBagConstraints gbc_txtInserirEmail = new GridBagConstraints();
		gbc_txtInserirEmail.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirEmail.gridx = 0;
		gbc_txtInserirEmail.gridy = 2;
		panelInformacoes.add(txtInserirEmail, gbc_txtInserirEmail);
		txtInserirEmail.setColumns(10);

		txtEmail = new JTextField();
		GridBagConstraints gbc_txtEmail = new GridBagConstraints();
		gbc_txtEmail.insets = new Insets(0, 0, 5, 0);
		gbc_txtEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEmail.gridx = 1;
		gbc_txtEmail.gridy = 2;
		panelInformacoes.add(txtEmail, gbc_txtEmail);
		txtEmail.setColumns(10);

		txtInserirTelefone = new JTextField();
		txtInserirTelefone.setEditable(false);
		txtInserirTelefone.setText("Insira o celular do Cliente:");
		GridBagConstraints gbc_txtInserirTelefone = new GridBagConstraints();
		gbc_txtInserirTelefone.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirTelefone.gridx = 0;
		gbc_txtInserirTelefone.gridy = 3;
		panelInformacoes.add(txtInserirTelefone, gbc_txtInserirTelefone);
		txtInserirTelefone.setColumns(10);

		txtTelefone = new JTextField();
		GridBagConstraints gbc_txtTelefone = new GridBagConstraints();
		gbc_txtTelefone.insets = new Insets(0, 0, 5, 0);
		gbc_txtTelefone.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtTelefone.gridx = 1;
		gbc_txtTelefone.gridy = 3;
		panelInformacoes.add(txtTelefone, gbc_txtTelefone);
		txtTelefone.setColumns(10);

		txtInserirEnd = new JTextField();
		txtInserirEnd.setEditable(false);
		txtInserirEnd.setText("Insira o endere\u00E7o do cliente:");
		GridBagConstraints gbc_txtInserirEnd = new GridBagConstraints();
		gbc_txtInserirEnd.insets = new Insets(0, 0, 0, 5);
		gbc_txtInserirEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirEnd.gridx = 0;
		gbc_txtInserirEnd.gridy = 4;
		panelInformacoes.add(txtInserirEnd, gbc_txtInserirEnd);
		txtInserirEnd.setColumns(10);

		txtEnd = new JTextField();
		GridBagConstraints gbc_txtEnd = new GridBagConstraints();
		gbc_txtEnd.anchor = GridBagConstraints.NORTH;
		gbc_txtEnd.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtEnd.gridx = 1;
		gbc_txtEnd.gridy = 4;
		panelInformacoes.add(txtEnd, gbc_txtEnd);
		txtEnd.setColumns(10);

		JPanel panelCadastrar = new JPanel();
		panelCadastrar.setBackground(Color.WHITE);
		frame.getContentPane().add(panelCadastrar, BorderLayout.CENTER);
		GridBagLayout gbl_panelCadastrar = new GridBagLayout();
		gbl_panelCadastrar.columnWidths = new int[] { 220, 340, 220 };
		gbl_panelCadastrar.rowHeights = new int[] { 0, 0, 0, 0 };
		gbl_panelCadastrar.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_panelCadastrar.rowWeights = new double[] { 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panelCadastrar.setLayout(gbl_panelCadastrar);

		txtOptCliente = new JTextField();
		txtOptCliente.setBackground(Color.WHITE);
		txtOptCliente.setForeground(Color.BLACK);
		txtOptCliente.setHorizontalAlignment(SwingConstants.CENTER);
		txtOptCliente.setText("O cliente a ser cadastrado \u00E9 uma pessoa f\u00EDsica ou jur\u00EDdica?");
		txtOptCliente.setEditable(false);
		GridBagConstraints gbc_txtOptCliente = new GridBagConstraints();
		gbc_txtOptCliente.ipady = 20;
		gbc_txtOptCliente.insets = new Insets(0, 0, 5, 5);
		gbc_txtOptCliente.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOptCliente.gridx = 1;
		gbc_txtOptCliente.gridy = 0;
		panelCadastrar.add(txtOptCliente, gbc_txtOptCliente);
		txtOptCliente.setColumns(10);

		JButton btnPF = new JButton("Pessoa F\u00EDsica");
		btnPF.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnIncluirPF();
			}
		});

		GridBagConstraints gbc_btnPF = new GridBagConstraints();
		gbc_btnPF.ipadx = 10;
		gbc_btnPF.ipady = 20;
		gbc_btnPF.insets = new Insets(0, 0, 5, 5);
		gbc_btnPF.gridx = 1;
		gbc_btnPF.gridy = 1;
		panelCadastrar.add(btnPF, gbc_btnPF);

		JButton btnPJ = new JButton("Pessoa Jur\u00EDdica");
		btnPJ.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnIncluirPJ();
			}
		});
		GridBagConstraints gbc_btnPJ = new GridBagConstraints();
		gbc_btnPJ.ipady = 20;
		gbc_btnPJ.insets = new Insets(0, 0, 0, 5);
		gbc_btnPJ.gridx = 1;
		gbc_btnPJ.gridy = 2;
		panelCadastrar.add(btnPJ, gbc_btnPJ);
	}

	private void actionBtnIncluirPF() {
		if (txtNome.getText().isEmpty() || txtRF.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nome e CPF devem ser preenchidos!", "Tente novamente",
					JOptionPane.WARNING_MESSAGE);
		} else {
			long num = converterLong(txtRF.getText());
			if (num == -1) {
				JOptionPane.showMessageDialog(null, "Insira um valor válido para o CPF!");
				txtRF.setText("");
			}
			else {
				ClientePFisica clientePF = new ClientePFisica(txtNome.getText(), num);
	
				if (txtEmail.getText().isEmpty() == false) {
					clientePF.setEmail(txtEmail.getText());
				}
	
				if (txtEnd.getText().isEmpty() == false) {
					clientePF.setEndereco(txtEnd.getText());
				}
	
				if (txtTelefone.getText().isEmpty() == false) {
					long tel = converterLong(txtTelefone.getText());
					while (tel == -1) {
						String str = JOptionPane.showInputDialog("Insira um valor válido para o telefone: ");
						tel = converterLong(str);
					}
	
					clientePF.setTelefone(tel);
				}
	
				ClienteController.addCliente(clientePF);
	
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
	
				frame.setVisible(false);
			}
		}
	}

	private void actionBtnIncluirPJ() {
		if (txtNome.getText().isEmpty() || txtRF.getText().isEmpty()) { // testes se os construtores não
																						// estão vazios
			JOptionPane.showMessageDialog(null, "Nome e CNPJ devem ser preenchidos!", "Tente novamente",
					JOptionPane.WARNING_MESSAGE);
		} else {
			long num = converterLong(txtRF.getText());
			if (num == -1) {
				JOptionPane.showMessageDialog(null, "Insira um valor válido para o CNPJ!");
				txtRF.setText("");
			}
			else {
				
				ClientePJuridica clientePJ = new ClientePJuridica(txtNome.getText(), num);
	
				if (txtEmail.getText().isEmpty() == false) { // teste se a caixa de texto não está vazia
					clientePJ.setEmail(txtEmail.getText());
				}
	
				if (txtEnd.getText().isEmpty() == false) {
					clientePJ.setEndereco(txtEnd.getText());
				}
	
				if (txtTelefone.getText().isEmpty() == false) {
					long tel = converterLong(txtTelefone.getText());
					while (tel == -1) {
						String str = JOptionPane.showInputDialog("Insira um valor válido para o telefone: ");
						tel = converterLong(str);
					}
	
					clientePJ.setTelefone(tel);
				}
	
				ClienteController.addCliente(clientePJ);
	
				JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
	
				frame.setVisible(false);
			}
		}
	}

	private long converterLong(String text) {
		try {
			long num = Long.parseLong(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMERICO",
					JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}

}
