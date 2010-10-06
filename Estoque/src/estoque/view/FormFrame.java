package estoque.view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import estoque.utilitarios.Utilitarios;

public class FormFrame extends JFrame{
	private static final long serialVersionUID = 1L;

	private FormMenuBar formMenuBar;
	private JLabel labelImagem;
	
	public FormFrame() {
		super("Cadastro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.WHITE);
		setSize(900,600);
		setLocationRelativeTo(null);
		initialize();
	}

	public static void main(String[] args) {
		FormFrame frame = new FormFrame();
		frame.setVisible(true);
	}
	
	private void initialize() {
		setJMenuBar(getFormMenuBar());
		add(getLabelImagem(), BorderLayout.CENTER);
	}

	private FormMenuBar getFormMenuBar() {
		if(formMenuBar == null){
			formMenuBar = new FormMenuBar();
		}
		return formMenuBar;
	}

	private JLabel getLabelImagem() {
		if(labelImagem == null){
			labelImagem = new JLabel(Utilitarios.getIcon("principal.png"));
		}
		return labelImagem;
	}
	
}
