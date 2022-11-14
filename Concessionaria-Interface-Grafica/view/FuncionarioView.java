package view;

import java.awt.BorderLayout;

import java.awt.FlowLayout;
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

import controller.FuncionarioController;

public class FuncionarioView {
	
	private FuncionarioController controller;
	
	private JFrame frame;
	private JTextField txtInserirNome;
	private JTextField txtNome;
	private JTextField txtInserirID;
	private JTextField txtID;
	private JPanel panelCadastrar;
	private JButton btnCadastrar;

	public FuncionarioView() {
		initialize();
		
		frame.setVisible(true);
	}

	public void setController(FuncionarioController controller) {
		this.controller = controller;
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Cadastro do funcion\u00E1rio");
		frame.setBounds(500, 100, 450, 150);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panelInformacoes = new JPanel();
		frame.getContentPane().add(panelInformacoes, BorderLayout.NORTH);
		GridBagLayout gbl_panelInformacoes = new GridBagLayout();
		gbl_panelInformacoes.columnWidths = new int[] {0, 0, 0};
		gbl_panelInformacoes.rowHeights = new int[] {0, 0, 0};
		gbl_panelInformacoes.columnWeights = new double[]{1.0, 1.0, Double.MIN_VALUE};
		gbl_panelInformacoes.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panelInformacoes.setLayout(gbl_panelInformacoes);
		
		txtInserirNome = new JTextField();
		txtInserirNome.setText("Insira o nome do funcion\u00E1rio: ");
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
		
		txtInserirID = new JTextField();
		txtInserirID.setText("Insira a ID do funcion\u00E1rio:");
		txtInserirID.setEditable(false);
		GridBagConstraints gbc_txtInserirID = new GridBagConstraints();
		gbc_txtInserirID.insets = new Insets(0, 0, 0, 5);
		gbc_txtInserirID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirID.gridx = 0;
		gbc_txtInserirID.gridy = 1;
		panelInformacoes.add(txtInserirID, gbc_txtInserirID);
		txtInserirID.setColumns(10);
		
		txtID = new JTextField();
		GridBagConstraints gbc_txtID = new GridBagConstraints();
		gbc_txtID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtID.gridx = 1;
		gbc_txtID.gridy = 1;
		panelInformacoes.add(txtID, gbc_txtID);
		txtID.setColumns(10);
		
		panelCadastrar = new JPanel();
		frame.getContentPane().add(panelCadastrar, BorderLayout.CENTER);
		panelCadastrar.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnIncluirFuncionario();
			}
		});
		panelCadastrar.add(btnCadastrar);

	}
		
	private void actionBtnIncluirFuncionario() {
		if (txtNome.getText().isEmpty() || txtID.getText().isEmpty()) {
			JOptionPane.showMessageDialog(null, "Nome e ID devem ser preenchidos!", "Tente novamente", JOptionPane.WARNING_MESSAGE);
		}
		else {
			int id = converterInt (txtID.getText());
			if (id == -1) {
				JOptionPane.showMessageDialog(null, "Insira um valor válido para o ID: ");
				txtID.setText("");
			}
			else {
			
				controller.addFuncionario (txtNome.getText(), id);
				
				JOptionPane.showMessageDialog(null, "Funcionário cadastrado com sucesso!");
				frame.setVisible(false);
			}
		}
	}
	
	private int converterInt(String text) {
		try {
			int num = Integer.parseInt(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMÉRICO",
					JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}

}
