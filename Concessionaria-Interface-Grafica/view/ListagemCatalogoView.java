package view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import controller.CatalogoController;

public class ListagemCatalogoView {

	private JFrame frame;
	
	public ListagemCatalogoView() {
		initialize();
		
		frame.setVisible(true);
	}
	
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 450, 600);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[] {60, 320, 60};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 1.0};
		gridBagLayout.rowWeights = new double[]{1.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JTextArea txtCatalogo = new JTextArea();
		txtCatalogo.setEditable(false);
		GridBagConstraints gbc_txtCatalogo = new GridBagConstraints();
		gbc_txtCatalogo.insets = new Insets(0, 0, 0, 5);
		gbc_txtCatalogo.fill = GridBagConstraints.BOTH;
		gbc_txtCatalogo.gridx = 1;
		gbc_txtCatalogo.gridy = 0;
		frame.getContentPane().add(txtCatalogo, gbc_txtCatalogo);
		
		txtCatalogo.setText(CatalogoController.listarCatalogo());
	}

}
