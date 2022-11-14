package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
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

import controller.CatalogoController;
import controller.ClienteController;
import controller.FuncionarioController;
import controller.OrdemServicoController;
import controller.VeiculoController;

public class MenuView {

	private JFrame frmMenu;
	private JTextField txtAcaoMenu;
	
	OrdemServicoController controllerOS = new OrdemServicoController();
	ClienteController controllerC = new ClienteController();
	FuncionarioController controllerF = new FuncionarioController();
	VeiculoController controllerV = new VeiculoController();
	CatalogoController controllerCat = new CatalogoController();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuView window = new MenuView();
					window.frmMenu.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MenuView() {
		initialize();
		
	}
	
	private void initialize() {
		frmMenu = new JFrame();
		frmMenu.setTitle("Menu");
		frmMenu.setResizable(false);
		frmMenu.setBackground(Color.WHITE);
		frmMenu.setBounds(500, 100, 700, 300);
		frmMenu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMenu.getContentPane().setLayout(new BorderLayout(0, 0));	
		
		txtAcaoMenu = new JTextField();
		txtAcaoMenu.setEditable(false);
		txtAcaoMenu.setHorizontalAlignment(SwingConstants.CENTER);
		txtAcaoMenu.setText("Selecione o que quer fazer:");
		frmMenu.getContentPane().add(txtAcaoMenu, BorderLayout.NORTH);
		txtAcaoMenu.setColumns(100);
		
		JPanel OptPanel = new JPanel();
		OptPanel.setBackground(Color.WHITE);
		frmMenu.getContentPane().add(OptPanel, BorderLayout.SOUTH);
		GridBagLayout gbl_OptPanel = new GridBagLayout();
		gbl_OptPanel.columnWidths = new int[] {300, 300, 0, 0, 0, 0};
		gbl_OptPanel.rowHeights = new int[]{23, 23, 23, 0, 0, 0, 0};
		gbl_OptPanel.columnWeights = new double[]{0.0, 1.0};
		gbl_OptPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		OptPanel.setLayout(gbl_OptPanel);
		
		JButton btnAddCliente = new JButton("Adicionar um cliente");
		btnAddCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClienteView cliente = new ClienteView();
				cliente.setController(controllerC);
			}
		});
		
		GridBagConstraints gbc_btnAddCliente = new GridBagConstraints();
		gbc_btnAddCliente.fill = GridBagConstraints.BOTH;
		gbc_btnAddCliente.ipady = 10;
		gbc_btnAddCliente.ipadx = 99;
		gbc_btnAddCliente.anchor = GridBagConstraints.NORTH;
		gbc_btnAddCliente.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddCliente.gridx = 0;
		gbc_btnAddCliente.gridy = 0;
		OptPanel.add(btnAddCliente, gbc_btnAddCliente);
		
		JButton btnAddVeiculo = new JButton("Adicionar um ve\u00EDculo");
		btnAddVeiculo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VeiculoView veiculo = new VeiculoView();
				veiculo.setController(controllerV);
				veiculo.setController(controllerC);
			}
		});
		
		JButton btnListarClientes = new JButton("Listar os clientes");
		btnListarClientes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ClienteController.listarClientes();
			}
		});
		
		GridBagConstraints gbc_btnListarClientes = new GridBagConstraints();
		gbc_btnListarClientes.fill = GridBagConstraints.BOTH;
		gbc_btnListarClientes.ipady = 10;
		gbc_btnListarClientes.anchor = GridBagConstraints.NORTH;
		gbc_btnListarClientes.insets = new Insets(0, 0, 5, 5);
		gbc_btnListarClientes.gridx = 1;
		gbc_btnListarClientes.gridy = 0;
		OptPanel.add(btnListarClientes, gbc_btnListarClientes);
		GridBagConstraints gbc_btnAddVeiculo = new GridBagConstraints();
		gbc_btnAddVeiculo.fill = GridBagConstraints.BOTH;
		gbc_btnAddVeiculo.ipady = 10;
		gbc_btnAddVeiculo.anchor = GridBagConstraints.NORTH;
		gbc_btnAddVeiculo.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddVeiculo.gridx = 0;
		gbc_btnAddVeiculo.gridy = 1;
		OptPanel.add(btnAddVeiculo, gbc_btnAddVeiculo);
		
		JButton btnListarVeiculos = new JButton("Listar os ve\u00EDculos");
		btnListarVeiculos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VeiculoController.listarVeiculos();
			}
		});
		
		GridBagConstraints gbc_btnListarVeiculos = new GridBagConstraints();
		gbc_btnListarVeiculos.fill = GridBagConstraints.BOTH;
		gbc_btnListarVeiculos.ipady = 10;
		gbc_btnListarVeiculos.insets = new Insets(0, 0, 5, 5);
		gbc_btnListarVeiculos.gridx = 1;
		gbc_btnListarVeiculos.gridy = 1;
		OptPanel.add(btnListarVeiculos, gbc_btnListarVeiculos);
		
		JButton btnAddFunc = new JButton("Adicionar um funcion\u00E1rio");
		btnAddFunc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FuncionarioView func = new FuncionarioView();
				func.setController(controllerF);
			}
		});
		
		GridBagConstraints gbc_btnAddFunc = new GridBagConstraints();
		gbc_btnAddFunc.fill = GridBagConstraints.BOTH;
		gbc_btnAddFunc.ipady = 10;
		gbc_btnAddFunc.anchor = GridBagConstraints.NORTH;
		gbc_btnAddFunc.insets = new Insets(0, 0, 5, 5);
		gbc_btnAddFunc.gridx = 0;
		gbc_btnAddFunc.gridy = 2;
		OptPanel.add(btnAddFunc, gbc_btnAddFunc);
		
		JButton btnListarFuncs = new JButton("Listar os funcion\u00E1rios");
		btnListarFuncs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controllerF.listarFuncionarios();
			}
		});
		
		GridBagConstraints gbc_btnListarFuncs = new GridBagConstraints();
		gbc_btnListarFuncs.fill = GridBagConstraints.BOTH;
		gbc_btnListarFuncs.ipady = 10;
		gbc_btnListarFuncs.insets = new Insets(0, 0, 5, 5);
		gbc_btnListarFuncs.gridx = 1;
		gbc_btnListarFuncs.gridy = 2;
		OptPanel.add(btnListarFuncs, gbc_btnListarFuncs);
		
		JButton btnOS = new JButton("Iniciar uma ordem de servi\u00E7o");
		btnOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OSView os = new OSView();
				os.setController(controllerOS);
				os.setController(controllerC);
				os.setController(controllerF);
				os.setController(controllerV);
			}
		});
		
		GridBagConstraints gbc_btnOS = new GridBagConstraints();
		gbc_btnOS.fill = GridBagConstraints.BOTH;
		gbc_btnOS.ipady = 10;
		gbc_btnOS.anchor = GridBagConstraints.NORTH;
		gbc_btnOS.insets = new Insets(0, 0, 5, 5);
		gbc_btnOS.gridx = 0;
		gbc_btnOS.gridy = 3;
		OptPanel.add(btnOS, gbc_btnOS);
		
		JButton btnRemoverPeca = new JButton("Remover a pe\u00E7a de determinado servi\u00E7o");
		btnRemoverPeca.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnRemoveItemOS();
			}
		});
		
		JButton btnPrintServico = new JButton("Listar uma ordem de servi\u00E7o");
		btnPrintServico.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnPrintOS();
			}
		});
		
		GridBagConstraints gbc_btnPrintServico = new GridBagConstraints();
		gbc_btnPrintServico.fill = GridBagConstraints.BOTH;
		gbc_btnPrintServico.insets = new Insets(0, 0, 5, 5);
		gbc_btnPrintServico.ipady = 10;
		gbc_btnPrintServico.gridx = 1;
		gbc_btnPrintServico.gridy = 3;
		OptPanel.add(btnPrintServico, gbc_btnPrintServico);		
		GridBagConstraints gbc_btnRemoverPeca = new GridBagConstraints();
		gbc_btnRemoverPeca.fill = GridBagConstraints.BOTH;
		gbc_btnRemoverPeca.ipady = 10;
		gbc_btnRemoverPeca.insets = new Insets(0, 0, 5, 5);
		gbc_btnRemoverPeca.gridx = 0;
		gbc_btnRemoverPeca.gridy = 4;
		OptPanel.add(btnRemoverPeca, gbc_btnRemoverPeca);
		
		JButton btnRenegocia = new JButton("Renegociar determinado servi\u00E7o");
		btnRenegocia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnRenegocia();
			}
		});
		
		GridBagConstraints gbc_btnRenegocia = new GridBagConstraints();
		gbc_btnRenegocia.fill = GridBagConstraints.BOTH;
		gbc_btnRenegocia.ipady = 10;
		gbc_btnRenegocia.insets = new Insets(0, 0, 5, 5);
		gbc_btnRenegocia.gridx = 1;
		gbc_btnRenegocia.gridy = 4;
		OptPanel.add(btnRenegocia, gbc_btnRenegocia);
		
		JButton btnListarOS = new JButton("Listar o hist\u00F3rico de ordens de servi\u00E7o de determinado ve\u00EDculo");
		btnListarOS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				controllerOS.setVeiculoController(controllerV);
				controllerOS.listarHistoricoOS();
			}
		});
		GridBagConstraints gbc_btnListarOS = new GridBagConstraints();
		gbc_btnListarOS.fill = GridBagConstraints.BOTH;
		gbc_btnListarOS.insets = new Insets(0, 0, 0, 5);
		gbc_btnListarOS.ipady = 10;
		gbc_btnListarOS.anchor = GridBagConstraints.NORTH;
		gbc_btnListarOS.gridx = 0;
		gbc_btnListarOS.gridy = 5;
		OptPanel.add(btnListarOS, gbc_btnListarOS);
		
		JButton btnListarCatalogo = new JButton("Listar o cat\u00E1logo");
		btnListarCatalogo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnListarCatalogo();
			}
		});
		GridBagConstraints gbc_btnListarCatalogo = new GridBagConstraints();
		gbc_btnListarCatalogo.fill = GridBagConstraints.BOTH;
		gbc_btnListarCatalogo.insets = new Insets(0, 0, 0, 5);
		gbc_btnListarCatalogo.gridx = 1;
		gbc_btnListarCatalogo.gridy = 5;
		OptPanel.add(btnListarCatalogo, gbc_btnListarCatalogo);
	}
	
	private void actionBtnRemoveItemOS() {
		String str = JOptionPane.showInputDialog(null, "Insira o número da ordem de serviço da qual quer retirar um item:");
		if (str != null) {
			int input = converterInt(str);
			
			while (input == -1 ) {
				str = JOptionPane.showInputDialog(null, "Insira um valor válido para o número da ordem de serviço!");
				if (str == null) break;
				input = converterInt(str);
			}
			
			if (controllerOS.pesquisaOS(input) == null) {
				JOptionPane.showMessageDialog(null, "Ordem de serviço não foi encontrada!");
			}
			else {
				controllerOS.pesquisaOS(input).removeItemOS();
			}
		}
	}
	
	private void actionBtnRenegocia() {
		String str = JOptionPane.showInputDialog(null, "Insira o número da ordem de serviço cujo serviço você quer renegociar o preço:");
		if (str != null) {
			int input = converterInt(str);
			
			while (input == -1) {
				str = JOptionPane.showInputDialog(null, "Insira um valor válido para o número da ordem de serviço!");
				if (str == null) break;
				input = converterInt(str);
			}
			
			if (controllerOS.pesquisaOS(input) == null) {
				JOptionPane.showMessageDialog(null, "Ordem de serviço não foi encontrada!");
			}
			else {
				String str2 = JOptionPane.showInputDialog(null, "Insira o novo valor que deseja para esse serviço:");
				double preco = converterDouble(str2);
				
				while (preco == -1) {
					str = JOptionPane.showInputDialog(null, "Insira um valor válido para o preço do serviço!");
					if (str == null) break;
					preco = converterDouble(str);
				}
						
				double precoAtual = controllerOS.pesquisaOS(input).getListaItens().get(0).getPreco();
				while ((precoAtual - preco) > ((0.15) * precoAtual)) {
					int opt = JOptionPane.showConfirmDialog(null,
							"Não é possível renegociar um desconto maior do que 15% do preço inicial do serviço! Deseja tentar novamente? ",
							"Selecione uma opção", JOptionPane.YES_NO_OPTION);
					if (opt == 0) {
						str = JOptionPane.showInputDialog(null, "Insira o novo valor que deseja para esse serviço:");
						preco = converterDouble(str);
						while (preco == -1) {
							str = JOptionPane.showInputDialog(null, "Insira um valor válido para o preço do serviço!");
							preco = converterDouble(str);
						}
					}
					else {
						preco = precoAtual;
						break;
					}
				}
				if (preco != precoAtual) {
					JOptionPane.showMessageDialog(null, "Valor aceito!");
				}
				
				controllerOS.pesquisaOS(input).renegociaServico(preco);
				JOptionPane.showMessageDialog(null, "Valor atual do serviço: " + preco);
				
			}
		}
			
	}
	
	private void actionBtnPrintOS() {
		ListagemOSView listagemOS = new ListagemOSView();
		listagemOS.setController (controllerOS);
	}
	
	private void actionBtnListarCatalogo() {
		new ListagemCatalogoView();
	}
	
	private int converterInt(String text) {
		try {
			int num = Integer.parseInt(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMÉRICO!",
					JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}
	
	private double converterDouble(String text) {
		try {
			double num = Double.parseDouble(text);
			return num;
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage(), "ERRO! O VALOR INSERIDO DEVE SER NUMÉRICO!",
					JOptionPane.ERROR_MESSAGE);
			return -1;
		}
	}
}
