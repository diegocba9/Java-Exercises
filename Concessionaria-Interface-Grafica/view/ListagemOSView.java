package view;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.OrdemServicoController;

public class ListagemOSView {

	private JFrame frame;
	private OrdemServicoController controller;
	private JTextField txtSelecione;
	private JComboBox<String> comboBoxOS;
	private JButton btnListar;
	private JTextArea txtLista;
	
	public ListagemOSView() {
		initialize();
		
		frame.setVisible(true);
	}

	public void setController (OrdemServicoController controller) {
		this.controller = controller;
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Listagem das ordens de servi\u00E7o");
		frame.setBounds(500, 100, 450, 900);
		
		txtSelecione = new JTextField();
		txtSelecione.setEditable(false);
		txtSelecione.setHorizontalAlignment(SwingConstants.CENTER);
		txtSelecione.setText("Selecione a ordem de servi\u00E7o que quer listar");
		frame.getContentPane().add(txtSelecione, BorderLayout.NORTH);
		txtSelecione.setColumns(10);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] {220, 340, 220, 30};
		gbl_panel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_panel.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0};
		gbl_panel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		comboBoxOS = new JComboBox<String>();
		GridBagConstraints gbc_comboBoxOS = new GridBagConstraints();
		gbc_comboBoxOS.insets = new Insets(0, 0, 5, 5);
		gbc_comboBoxOS.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBoxOS.gridx = 1;
		gbc_comboBoxOS.gridy = 0;
		panel.add(comboBoxOS, gbc_comboBoxOS);
		
		preencherComboBoxOS();
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				actionBtnListar(frame);
			}
		});
		
		GridBagConstraints gbc_btnListar = new GridBagConstraints();
		gbc_btnListar.ipady = 10;
		gbc_btnListar.ipadx = 30;
		gbc_btnListar.insets = new Insets(0, 0, 5, 5);
		gbc_btnListar.gridx = 1;
		gbc_btnListar.gridy = 2;
		panel.add(btnListar, gbc_btnListar);
		
		txtLista = new JTextArea();
		GridBagConstraints gbc_txtLista = new GridBagConstraints();
		gbc_txtLista.gridwidth = 3;
		gbc_txtLista.insets = new Insets(0, 0, 0, 5);
		gbc_txtLista.gridx = 0;
		gbc_txtLista.gridy = 3;
		panel.add(txtLista, gbc_txtLista);
		txtLista.setEditable(false);
		
				
	}
	
	private void preencherComboBoxOS() {
		comboBoxOS.addItem("Selecione a ordem de serviço");
		int size = OrdemServicoController.sizeOS();
		String options[] = OrdemServicoController.returnIdOS();
		for (int i = 0; i < size; i++) {
			comboBoxOS.addItem(options[i]);
		}
	}

	private void actionBtnListar (JFrame frame) {		
		if (comboBoxOS.getSelectedItem().toString().equals("Selecione a ordem de serviço")) {
			JOptionPane.showMessageDialog(null, "Não foi selecionada nenhuma ordem de serviço!");
		}
		else {
			String str = comboBoxOS.getSelectedItem().toString();
			int input = converterInt(str);	
			
			txtLista.setText(controller.pesquisaOS(input).listarOS());
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
 }
