package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.ClienteController;
import controller.FuncionarioController;
import controller.OrdemServicoController;
import controller.VeiculoController;
import model.OrdemServico;

public class OSView {

	private OrdemServicoController controller;
	private ClienteController controllerC;
	private VeiculoController controllerV;
	private FuncionarioController controllerF;

	private JFrame frame;
	private JTextField txtInserirRF;
	private JTextField txtInserirPlaca;
	private JTextField textInserirIDFunc;
	private JTextField txtInserirKmAtual;
	private JTextField txtKmAtual;
	private JTextField txtInserirDescricao;
	private JTextField txtDescricao;
	private JComboBox<String> comboBoxRF;
	private JComboBox<String> comboBoxPlaca;
	private JComboBox<String> comboBoxID;

	public OSView() {
		initialize();

		frame.setVisible(true);
	}

	public void setController(OrdemServicoController controller) {
		this.controller = controller;
	}
	
	public void setController(ClienteController controller) {
		this.controllerC = controller;
	}
	
	public void setController(FuncionarioController controller) {
		this.controllerF = controller;
	}
	
	public void setController(VeiculoController controller) {
		this.controllerV = controller;
	}

	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Ordem de Servi\u00E7o");
		frame.setResizable(false);
		frame.setBounds(500, 100, 600, 250);

		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 174, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0 };
		gbl_panel.columnWeights = new double[] { 1.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0 };
		panel.setLayout(gbl_panel);

		txtInserirRF = new JTextField();
		txtInserirRF.setEditable(false);
		txtInserirRF.setText("Selecione o CPF/CNPJ do propriet\u00E1rio do ve\u00EDculo: *");
		GridBagConstraints gbc_txtInserirRF = new GridBagConstraints();
		gbc_txtInserirRF.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirRF.gridx = 0;
		gbc_txtInserirRF.gridy = 0;
		panel.add(txtInserirRF, gbc_txtInserirRF);
		txtInserirRF.setColumns(10);

		comboBoxRF = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxRF = new GridBagConstraints();
		gbc_comboBoxRF.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxRF.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxRF.gridx = 1;
		gbc_comboBoxRF.gridy = 0;
		panel.add(comboBoxRF, gbc_comboBoxRF);

		preencherComboBoxRF();

		txtInserirPlaca = new JTextField();
		txtInserirPlaca.setEditable(false);
		txtInserirPlaca.setText("Selecione a placa do ve\u00EDculo: *");
		GridBagConstraints gbc_txtInserirPlaca = new GridBagConstraints();
		gbc_txtInserirPlaca.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirPlaca.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirPlaca.gridx = 0;
		gbc_txtInserirPlaca.gridy = 1;
		panel.add(txtInserirPlaca, gbc_txtInserirPlaca);
		txtInserirPlaca.setColumns(10);

		comboBoxPlaca = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxPlaca = new GridBagConstraints();
		gbc_comboBoxPlaca.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxPlaca.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxPlaca.gridx = 1;
		gbc_comboBoxPlaca.gridy = 1;
		panel.add(comboBoxPlaca, gbc_comboBoxPlaca);

		preencherComboBoxPlaca();

		textInserirIDFunc = new JTextField();
		textInserirIDFunc.setText("Selecione o ID do funcion\u00E1rio respons\u00E1vel: *");
		textInserirIDFunc.setEditable(false);
		GridBagConstraints gbc_textInserirIDFunc = new GridBagConstraints();
		gbc_textInserirIDFunc.insets = new Insets(0, 0, 5, 5);
		gbc_textInserirIDFunc.fill = GridBagConstraints.HORIZONTAL;
		gbc_textInserirIDFunc.gridx = 0;
		gbc_textInserirIDFunc.gridy = 2;
		panel.add(textInserirIDFunc, gbc_textInserirIDFunc);
		textInserirIDFunc.setColumns(10);

		comboBoxID = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxID = new GridBagConstraints();
		gbc_comboBoxID.insets = new Insets(0, 0, 5, 0);
		gbc_comboBoxID.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxID.gridx = 1;
		gbc_comboBoxID.gridy = 2;
		panel.add(comboBoxID, gbc_comboBoxID);

		preencherComboBoxID();

		txtInserirKmAtual = new JTextField();
		txtInserirKmAtual.setEditable(false);
		txtInserirKmAtual.setText("Insira a quilometragem atual do ve\u00EDculo: *");
		GridBagConstraints gbc_txtInserirKmAtual = new GridBagConstraints();
		gbc_txtInserirKmAtual.insets = new Insets(0, 0, 5, 5);
		gbc_txtInserirKmAtual.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirKmAtual.gridx = 0;
		gbc_txtInserirKmAtual.gridy = 3;
		panel.add(txtInserirKmAtual, gbc_txtInserirKmAtual);
		txtInserirKmAtual.setColumns(10);

		txtKmAtual = new JTextField();
		GridBagConstraints gbc_txtKmAtual = new GridBagConstraints();
		gbc_txtKmAtual.insets = new Insets(0, 0, 5, 0);
		gbc_txtKmAtual.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtKmAtual.gridx = 1;
		gbc_txtKmAtual.gridy = 3;
		panel.add(txtKmAtual, gbc_txtKmAtual);
		txtKmAtual.setColumns(10);

		txtInserirDescricao = new JTextField();
		txtInserirDescricao.setText("Insira a descri\u00E7\u00E3o do problema do ve\u00EDculo: *");
		txtInserirDescricao.setEditable(false);
		GridBagConstraints gbc_txtInserirDescricao = new GridBagConstraints();
		gbc_txtInserirDescricao.insets = new Insets(0, 0, 0, 5);
		gbc_txtInserirDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtInserirDescricao.gridx = 0;
		gbc_txtInserirDescricao.gridy = 4;
		panel.add(txtInserirDescricao, gbc_txtInserirDescricao);
		txtInserirDescricao.setColumns(10);

		txtDescricao = new JTextField();
		GridBagConstraints gbc_txtDescricao = new GridBagConstraints();
		gbc_txtDescricao.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtDescricao.gridx = 1;
		gbc_txtDescricao.gridy = 4;
		panel.add(txtDescricao, gbc_txtDescricao);
		txtDescricao.setColumns(10);

		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[] { 220, 340, 220 };
		gbl_panel_1.rowHeights = new int[] { 0, 0 };
		gbl_panel_1.columnWeights = new double[] { 0.0, 0.0, 0.0 };
		gbl_panel_1.rowWeights = new double[] { 0.0, Double.MIN_VALUE };
		panel_1.setLayout(gbl_panel_1);

		JButton btnCriarOS = new JButton("Criar");
		btnCriarOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnCriarOS();
			}
		});

		GridBagConstraints gbc_btnCriarOS = new GridBagConstraints();
		gbc_btnCriarOS.ipady = 20;
		gbc_btnCriarOS.ipadx = 50;
		gbc_btnCriarOS.insets = new Insets(0, 0, 0, 5);
		gbc_btnCriarOS.gridx = 1;
		gbc_btnCriarOS.gridy = 0;
		panel_1.add(btnCriarOS, gbc_btnCriarOS);
	}

	private void actionBtnCriarOS() {
		if (comboBoxRF.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null,
					"Ainda não existe cliente cadastrado! Só é possível criar uma ordem de serviço se existir um cliente!");
			frame.setVisible(false);
		} else if (comboBoxPlaca.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null,
					"Ainda não existe veículo cadastrado! Só é possível criar uma ordem de serviço se existir um veículo!");
			frame.setVisible(false);
		} else if (comboBoxID.getSelectedIndex() == -1) {
			JOptionPane.showMessageDialog(null,
					"Ainda não existe funcionário cadastrado! Só é possível criar uma ordem de serviço se existir um funcionário!");
			frame.setVisible(false);
		} else {
			
			int idFunc = converterInt(comboBoxID.getSelectedItem().toString());
			
			OrdemServico os = new OrdemServico(new Date(),
					controllerC.pesquisarCliente(comboBoxRF.getSelectedItem().toString()),
					controllerV.pesquisaVeiculo(comboBoxPlaca.getSelectedItem().toString()),
					controllerF.pesquisaFuncionario(idFunc));
			
			if (txtKmAtual.getText().isEmpty() || txtDescricao.getText().isEmpty()) {
				JOptionPane.showMessageDialog(null, "Insira um valor para a quilometragem atual e descrição!");
			}
			else {
				long kmAtual = converterLong(txtKmAtual.getText());
				if (kmAtual == -1) {
					JOptionPane.showMessageDialog(null, "Insira um valor válido para a quilometragem atual!");
					txtKmAtual.setText("");
				} 
				else { 
					os.setKmAtual(kmAtual);
					os.setDescricao(txtDescricao.getText());
					
					//Itens do catálogo
					CatalogoView catalogo = new CatalogoView();
					catalogo.setOS(os);
					catalogo.setController(controller);
					
					frame.setVisible(false);
				}
			}
		}
	}

	private void preencherComboBoxRF() {
		int size = ClienteController.sizeCliente();
		String options[] = ClienteController.returnRF();
		for (int i = 0; i < size; i++) {
			comboBoxRF.addItem(options[i]);
		}
	}

	private void preencherComboBoxPlaca() {
		int size = VeiculoController.sizeVeiculo();
		String options[] = VeiculoController.returnPlaca();
		for (int i = 0; i < size; i++) {
			comboBoxPlaca.addItem(options[i]);
		}
	}

	private void preencherComboBoxID() {
		int size = FuncionarioController.sizeFuncionario();
		String options[] = FuncionarioController.returnID();
		for (int i = 0; i < size; i++) {
			comboBoxID.addItem(options[i]);
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
	
	private long converterLong(String text) {
		try {
			long num = Long.parseLong(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMÉRICO",
					JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}
}
