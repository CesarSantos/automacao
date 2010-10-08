package controledeestoque.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controledeestoque.controller.FramePrincipalController;

public class FramePrincipal extends JFrame {
	private static final long serialVersionUID = 1L;
	
	FramePrincipalController controller;
	
	private JMenuBar barraMenus;
	
	private JMenu opcoesMenu;
		private JMenuItem entradaItem;
		private JMenuItem saidaItem;
		
	private JDesktopPane desktopPane;	
	
	public FramePrincipal(FramePrincipalController controller) {
		super("Controle de Estoque");
		this.controller = controller;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initialize();
		setSize(900, 680);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	private void initialize() {
		setJMenuBar(getBarraMenus());
		add(getDesktopPane(), BorderLayout.CENTER);
	}

	private JMenuBar getBarraMenus() {
		if(barraMenus == null){
			barraMenus = new JMenuBar();
			barraMenus.add(getOpcoesMenu());
		}
		return barraMenus;
	}

	private JMenu getOpcoesMenu() {
		if(opcoesMenu == null){
			opcoesMenu = new JMenu("Opções");
			opcoesMenu.add(getEntradaItem());
			opcoesMenu.add(getSaidaItem());
		}
		return opcoesMenu;
	}

	private JMenuItem getEntradaItem() {
		if(entradaItem == null){
			entradaItem = new JMenuItem("Entrada de Produto");
			entradaItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getDesktopPane().add(controller.getFrameEntrada());
				}
			});
		}
		return entradaItem;
	}

	private JMenuItem getSaidaItem() {
		if(saidaItem == null){
			saidaItem = new JMenuItem("Baixa em Produto");
			saidaItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					getDesktopPane().add(controller.getFrameSaida());
				}
			});
		}
		return saidaItem;
	}

	private JDesktopPane getDesktopPane() {
		if(desktopPane == null){
			desktopPane = new JDesktopPane();
			desktopPane.setLayout(new GridLayout(3,1));
		}
		return desktopPane;
	}

}
