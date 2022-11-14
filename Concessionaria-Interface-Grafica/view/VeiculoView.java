package view;

import java.awt.BorderLayout;
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
import controller.VeiculoController;
import javax.swing.JComboBox;

public class VeiculoView {

	private VeiculoController controller;
	private ClienteController controller2;

	private JFrame frame;
	private JTextField txtInserirRF;
	private JTextField txtInserirModelo;
	private JTextField txtModelo;
	private JTextField txtInserirAnoModelo;
	private JTextField txtAnoFabricacao;
	private JTextField txtInserirPlaca;
	private JTextField txtPlaca;
	private JTextField txtInserirFabricacao;
	private JTextField txtAnoModelo;
	private JTextField txtInserirCor;
	private JTextField txtCor;
	private JTextField txtInserirDataCompra;
	private JComboBox<String> comboBoxRF;
	private JComboBox<String> comboBoxDia;
	private JComboBox<String> comboBoxMes;
	private JComboBox<String> comboBoxAno;

	public VeiculoView() {
		initialize();

		frame.setVisible(true);
	}

	public void setController(VeiculoController controller) {
		this.controller = controller;
	}

	public void setController(ClienteController controller) {
		controller2 = controller;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setTitle("Cadastro do ve\u00EDculo");
		frame.setBounds(500, 100, 700, 300);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));

		JPanel panelInformacoes = new JPanel();
		frame.getContentPane().add(panelInformacoes, BorderLayout.NORTH);
		GridBagLayout gbl_panelInformacoes = new GridBagLayout();
		gbl_panelInformacoes.columnWidths = new int[] { 400, 100, 100, 100 };
		gbl_panelInformacoes.rowHeights = new int[] { 0 };
		gbl_panelInformacoes.columnWeights = new double[] { 1.0, 1.0, 1.0, 1.0 };
		gbl_panelInformacoes.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		panelInformacoes.setLayout(gbl_panelInformacoes);

		txtInserirRF = new JTextField();
		txtInserirRF.setText("Selecione o CPF/CNPJ do dono do ve\u00EDculo:  *");
		txtInserirRF.setEditable(false);
		GridBagConstraints gbc_txtInserirRF = new GridBagConstraints();
		gbc_txtInserirRF.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirRF.gridx = 0;
		gbc_txtInserirRF.gridy = 0;
		panelInformacoes.add(txtInserirRF, gbc_txtInserirRF);
		txtInserirRF.setColumns(10);

		comboBoxRF = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxRF = new GridBagConstraints();
		gbc_comboBoxRF.gridwidth = 3;
		gbc_comboBoxRF.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRF.gridx = 1;
		gbc_comboBoxRF.gridy = 0;
		panelInformacoes.add(comboBoxRF, gbc_comboBoxRF);

		preencherComboBoxRF();

		txtInserirModelo = new JTextField();
		txtInserirModelo.setEditable(false);
		txtInserirModelo.setText("Insira o modelo do ve\u00EDculo:  *");
		txtInserirModelo.setHorizontalAlignment(SwingConstants.LEFT);
		GridBagConstraints gbc_txtInserirModelo = new GridBagConstraints();
		gbc_txtInserirModelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirModelo.gridx = 0;
		gbc_txtInserirModelo.gridy = 1;
		panelInformacoes.add(txtInserirModelo, gbc_txtInserirModelo);
		txtInserirModelo.setColumns(10);

		txtModelo = new JTextField();
		GridBagConstraints gbc_txtModelo = new GridBagConstraints();
		gbc_txtModelo.gridwidth = 3;
		gbc_txtModelo.insets = new Insets(0, 0, 5, 0);
		gbc_txtModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtModelo.gridx = 1;
		gbc_txtModelo.gridy = 1;
		panelInformacoes.add(txtModelo, gbc_txtModelo);
		txtModelo.setColumns(10);

		txtInserirPlaca = new JTextField();
		txtInserirPlaca.setText("Insira a placa do ve\u00EDculo: *");
		txtInserirPlaca.setEditable(false);
		GridBagConstraints gbc_txtInserirPlaca = new GridBagConstraints();
		gbc_txtInserirPlaca.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirPlaca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirPlaca.gridx = 0;
		gbc_txtInserirPlaca.gridy = 2;
		panelInformacoes.add(txtInserirPlaca, gbc_txtInserirPlaca);
		txtInserirPlaca.setColumns(10);

		txtPlaca = new JTextField();
		GridBagConstraints gbc_txtPlaca = new GridBagConstraints();
		gbc_txtPlaca.gridwidth = 3;
		gbc_txtPlaca.insets = new Insets(0, 0, 5, 0);
		gbc_txtPlaca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPlaca.gridx = 1;
		gbc_txtPlaca.gridy = 2;
		panelInformacoes.add(txtPlaca, gbc_txtPlaca);
		txtPlaca.setColumns(10);

		txtInserirFabricacao = new JTextField();
		txtInserirFabricacao.setText("Insira o ano de fabrica\u00E7\u00E3o do ve\u00EDculo: ");
		txtInserirFabricacao.setEditable(false);
		GridBagConstraints gbc_txtInserirFabricacao = new GridBagConstraints();
		gbc_txtInserirFabricacao.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirFabricacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirFabricacao.gridx = 0;
		gbc_txtInserirFabricacao.gridy = 3;
		panelInformacoes.add(txtInserirFabricacao, gbc_txtInserirFabricacao);
		txtInserirFabricacao.setColumns(10);

		txtAnoFabricacao = new JTextField();
		GridBagConstraints gbc_txtAnoFabricacao = new GridBagConstraints();
		gbc_txtAnoFabricacao.gridwidth = 3;
		gbc_txtAnoFabricacao.insets = new Insets(0, 0, 5, 0);
		gbc_txtAnoFabricacao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAnoFabricacao.gridx = 1;
		gbc_txtAnoFabricacao.gridy = 3;
		panelInformacoes.add(txtAnoFabricacao, gbc_txtAnoFabricacao);
		txtAnoFabricacao.setColumns(10);

		txtInserirAnoModelo = new JTextField();
		txtInserirAnoModelo.setText("Insira o ano do modelo do ve\u00EDculo: ");
		txtInserirAnoModelo.setEditable(false);
		GridBagConstraints gbc_txtInserirAnoModelo = new GridBagConstraints();
		gbc_txtInserirAnoModelo.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirAnoModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirAnoModelo.gridx = 0;
		gbc_txtInserirAnoModelo.gridy = 4;
		panelInformacoes.add(txtInserirAnoModelo, gbc_txtInserirAnoModelo);
		txtInserirAnoModelo.setColumns(10);

		txtAnoModelo = new JTextField();
		GridBagConstraints gbc_txtAnoModelo = new GridBagConstraints();
		gbc_txtAnoModelo.gridwidth = 3;
		gbc_txtAnoModelo.insets = new Insets(0, 0, 5, 0);
		gbc_txtAnoModelo.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtAnoModelo.gridx = 1;
		gbc_txtAnoModelo.gridy = 4;
		panelInformacoes.add(txtAnoModelo, gbc_txtAnoModelo);
		txtAnoModelo.setColumns(10);

		txtInserirCor = new JTextField();
		txtInserirCor.setEditable(false);
		txtInserirCor.setText("Insira a cor do ve\u00EDculo: ");
		GridBagConstraints gbc_txtInserirCor = new GridBagConstraints();
		gbc_txtInserirCor.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirCor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirCor.gridx = 0;
		gbc_txtInserirCor.gridy = 5;
		panelInformacoes.add(txtInserirCor, gbc_txtInserirCor);
		txtInserirCor.setColumns(10);

		txtCor = new JTextField();
		GridBagConstraints gbc_txtCor = new GridBagConstraints();
		gbc_txtCor.gridwidth = 3;
		gbc_txtCor.insets = new Insets(0, 0, 5, 0);
		gbc_txtCor.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCor.gridx = 1;
		gbc_txtCor.gridy = 5;
		panelInformacoes.add(txtCor, gbc_txtCor);
		txtCor.setColumns(10);

		txtInserirDataCompra = new JTextField();
		txtInserirDataCompra.setText("Insira a data de compra do ve\u00EDculo: (apenas n\u00FAmeros)");
		txtInserirDataCompra.setEditable(false);
		GridBagConstraints gbc_txtInserirDataCompra = new GridBagConstraints();
		gbc_txtInserirDataCompra.insets = new Insets(0, 0, 0, 5);
		gbc_txtInserirDataCompra.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirDataCompra.gridx = 0;
		gbc_txtInserirDataCompra.gridy = 6;
		panelInformacoes.add(txtInserirDataCompra, gbc_txtInserirDataCompra);
		txtInserirDataCompra.setColumns(10);

		comboBoxDia = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxDia = new GridBagConstraints();
		gbc_comboBoxDia.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxDia.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxDia.gridx = 1;
		gbc_comboBoxDia.gridy = 6;
		panelInformacoes.add(comboBoxDia, gbc_comboBoxDia);

		preencherComboBoxDia();

		comboBoxMes = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxMes = new GridBagConstraints();
		gbc_comboBoxMes.insets = new Insets(0, 0, 0, 5);
		gbc_comboBoxMes.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxMes.gridx = 2;
		gbc_comboBoxMes.gridy = 6;
		panelInformacoes.add(comboBoxMes, gbc_comboBoxMes);

		preencherComboBoxMes();

		comboBoxAno = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxAno = new GridBagConstraints();
		gbc_comboBoxAno.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxAno.gridx = 3;
		gbc_comboBoxAno.gridy = 6;
		panelInformacoes.add(comboBoxAno, gbc_comboBoxAno);

		preencherComboBoxAno();

		JPanel panelCadastrar = new JPanel();
		frame.getContentPane().add(panelCadastrar, BorderLayout.CENTER);

		JButton Cadastrar = new JButton("Cadastrar");
		Cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnInserirVeiculo();
			}
		});
		panelCadastrar.add(Cadastrar);

	}

	private void preencherComboBoxRF() {
		int size = ClienteController.sizeCliente();
		String options[] = ClienteController.returnRF();
		for (int i = 0; i < size; i++) {
			comboBoxRF.addItem(options[i]);
		}
	}

	private void preencherComboBoxDia() {
		comboBoxDia.addItem("Dia");
		for (int i = 0; i < 31; i++) {
			comboBoxDia.addItem(Integer.toString(i + 1));
		}
	}

	private void preencherComboBoxMes() {
		comboBoxMes.addItem("Mês");
		for (int i = 0; i < 12; i++) {
			comboBoxMes.addItem(Integer.toString(i + 1));
		}
	}

	private void preencherComboBoxAno() {
		comboBoxAno.addItem("Ano");
		for (int i = 0; i < 72; i++) {
			comboBoxAno.addItem(Integer.toString(i + 1950));
		}
	}

	private void actionBtnInserirVeiculo() {

		if (comboBoxRF.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null,
					"Ainda não existe cliente cadastrado! Só é possível cadastrar um veículo se existir um cliente!");
			frame.setVisible(false);
		} else {
			if (txtModelo.getText().isEmpty() || txtPlaca.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Modelo e placa devem ser preenchidos!", "Tente novamente",
						JOptionPane.WARNING_MESSAGE);
			}

			else {
				// ano de fabricação
				int anoFab = 0;

				if (txtAnoFabricacao.getText().isEmpty() == false) {
					anoFab = converterInt(txtAnoFabricacao.getText());

					while (anoFab > 2020 || anoFab < 1900) {
						String str = JOptionPane.showInputDialog(null, "Insira um ano de fabricação válido!",
								"Tente Novamente", JOptionPane.WARNING_MESSAGE);
						anoFab = converterInt(str);
					}
				}

				// ano do modelo
				int anoModelo = 0;

				if (txtAnoModelo.getText().isEmpty() == false) {
					anoModelo = converterInt(txtAnoModelo.getText());
					while (anoModelo > 2020 || anoModelo < 1900) {
						String str = JOptionPane.showInputDialog(null, "Insira um ano do modelo válido!",
								"Tente Novamente", JOptionPane.WARNING_MESSAGE);
						anoModelo = converterInt(str);
					}
				}

				// cor
				String cor = "-";
				if (txtCor.getText().isEmpty() == false) {
					cor = txtCor.getText();
				}

				// Data de compra
				String stringData = "";
				long data = 0;
				int dia = 0;
				int mes = 0;
				if (comboBoxDia.getSelectedItem().toString().equals("Dia") == false
						&& comboBoxMes.getSelectedItem().toString().equals("Mês") == false
						&& comboBoxAno.getSelectedItem().toString().equals("Ano") == false) {

					dia = converterInt(comboBoxDia.getSelectedItem().toString());
					String stringDia = comboBoxDia.getSelectedItem().toString();
					if (dia < 10) {
						stringDia = "0" + Integer.toString(dia);
					}

					mes = converterInt(comboBoxMes.getSelectedItem().toString());
					String stringMes = comboBoxMes.getSelectedItem().toString();
					if (mes<10) {
						stringMes = "0" + Integer.toString(mes);
					}
					stringData = stringDia + stringMes + comboBoxAno.getSelectedItem().toString();

					data = converterLong(stringData);
				}

				// criando o objeto no controlador
				controller.addVeiculo(txtPlaca.getText(), txtModelo.getText(),
						controller2.pesquisarCliente(comboBoxRF.getSelectedItem().toString()), anoFab, anoModelo, cor,
						data);

				JOptionPane.showMessageDialog(null, "Veículo cadastrado com sucesso!");

				frame.setVisible(false);
			}
		}
	}

	private int converterInt(String text) {
		try {
			int num = Integer.parseInt(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMERICO",
					JOptionPane.ERROR_MESSAGE);
			return -1;
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
