package estoque.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import estoque.listeners.MenusListener;
import estoque.utilitarios.Utilitarios;

public class FormMenuBar extends JMenuBar implements ActionListener{
	private static final long serialVersionUID = 1L;

	private JMenu cadastrosMenu;
		private JMenuItem clientesMenuItem;
		private JMenuItem funcionariosMenuItem;
		private JMenuItem cidadesMenuItem;
		private JMenuItem bairrosMenuItem;
		private JMenuItem cargosMenuItem;
		private JMenuItem fornecedoresMenuItem;
		private JMenu estoqueMenu;
			private JMenuItem implantacaoMenuItem;
			private JMenuItem entradaMenuItem;
			private JMenuItem saidaMenuItem;
		private JMenuItem sairMenuItem;
	
	private JMenu consultasMenu;
	
	private JMenu relatoriosMenu;
	
	private JMenu utilitariosMenu;
	
	private JMenu sairMenu;
	
	private MenusListener listener;
	
	public FormMenuBar() {
		super();
		initialize();
	}

	private void initialize() {
		add(getCadastrosMenu());
		add(getConsultasMenu());
		add(getRelatoriosMenu());
		add(getUtilitariosMenu());
		add(getSairMenu());
	}
	
	public void setListener(MenusListener listener){
		this.listener = listener;
	}

	private JMenu getCadastrosMenu() {
		if(cadastrosMenu == null){
			cadastrosMenu = new JMenu("Cadastros");
			cadastrosMenu.add(getClientesMenuItem());
			cadastrosMenu.add(getFornecedoresMenuItem());
			cadastrosMenu.add(getFuncionariosMenuItem());
			cadastrosMenu.add(getCargosMenuItem());
			cadastrosMenu.add(getCidadesMenuItem());
			cadastrosMenu.add(getBairrosMenuItem());
			cadastrosMenu.addSeparator();
			cadastrosMenu.add(getEstoqueMenu());
			cadastrosMenu.addSeparator();
			cadastrosMenu.add(getSairMenuItem());
		}
		return cadastrosMenu;
	}

	private JMenu getConsultasMenu() {
		if(consultasMenu == null){
			consultasMenu = new JMenu("Consultas");
		}
		return consultasMenu;
	}

	private JMenu getRelatoriosMenu() {
		if(relatoriosMenu == null){
			relatoriosMenu = new JMenu("Relatórios");
		}
		return relatoriosMenu;
	}

	private JMenu getUtilitariosMenu() {
		if(utilitariosMenu == null){
			utilitariosMenu = new JMenu("Utilitários");
		}
		return utilitariosMenu;
	}

	private JMenu getSairMenu() {
		if(sairMenu == null){
			sairMenu = new JMenu("Sair");
		}
		return sairMenu;
	}

	private JMenuItem getClientesMenuItem() {
		if(clientesMenuItem == null){
			clientesMenuItem = new JMenuItem("Clientes");
			clientesMenuItem.setIcon(Utilitarios.getIcon("cliente.png"));
			clientesMenuItem.addActionListener(this);
		}
		return clientesMenuItem;
	}

	private JMenuItem getFuncionariosMenuItem() {
		if(funcionariosMenuItem == null){
			funcionariosMenuItem = new JMenuItem("Funcionários");
			funcionariosMenuItem.setIcon(Utilitarios.getIcon("funcionario.png"));
			funcionariosMenuItem.addActionListener(this);
		}
		return funcionariosMenuItem;
	}

	private JMenuItem getCidadesMenuItem() {
		if(cidadesMenuItem == null){
			cidadesMenuItem = new JMenuItem("Cidades");
			cidadesMenuItem.setIcon(Utilitarios.getIcon("cidades.png"));
			cidadesMenuItem.addActionListener(this);
		}
		return cidadesMenuItem;
	}

	private JMenuItem getBairrosMenuItem() {
		if(bairrosMenuItem == null){
			bairrosMenuItem = new JMenuItem("Bairros");
			bairrosMenuItem.setIcon(Utilitarios.getIcon("bairros.png"));
			bairrosMenuItem.addActionListener(this);
		}
		return bairrosMenuItem;
	}

	private JMenuItem getCargosMenuItem() {
		if(cargosMenuItem == null){
			cargosMenuItem = new JMenuItem("Cargos");
			cargosMenuItem.setIcon(Utilitarios.getIcon("cargos.png"));
			cargosMenuItem.addActionListener(this);
		}
		return cargosMenuItem;
	}

	private JMenuItem getFornecedoresMenuItem() {
		if(fornecedoresMenuItem == null){
			fornecedoresMenuItem = new JMenuItem("Fornecedores");
			fornecedoresMenuItem.setIcon(Utilitarios.getIcon("fornecedores.png"));
			fornecedoresMenuItem.addActionListener(this);
		}
		return fornecedoresMenuItem;
	}

	private JMenuItem getSairMenuItem() {
		if(sairMenuItem == null){
			sairMenuItem = new JMenuItem("Sair");
			sairMenuItem.setIcon(Utilitarios.getIcon("sair.png"));
			sairMenuItem.addActionListener(this);
		}
		return sairMenuItem;
	}

	private JMenu getEstoqueMenu() {
		if(estoqueMenu == null){
			estoqueMenu = new JMenu("Estoque");
			estoqueMenu.setIcon(Utilitarios.getIcon("estoque.png"));
			estoqueMenu.add(getImplantacaoMenuItem());
			estoqueMenu.add(getEntradaMenuItem());
			estoqueMenu.add(getSaidaMenuItem());
		}
		return estoqueMenu;
	}

	private JMenuItem getImplantacaoMenuItem() {
		if(implantacaoMenuItem == null){
			implantacaoMenuItem = new JMenuItem("Implantação");
			implantacaoMenuItem.addActionListener(this);
		}
		return implantacaoMenuItem;
	}

	private JMenuItem getEntradaMenuItem() {
		if(entradaMenuItem == null){
			entradaMenuItem = new JMenuItem("Entrada");
			entradaMenuItem.addActionListener(this);
		}
		return entradaMenuItem;
	}

	private JMenuItem getSaidaMenuItem() {
		if(saidaMenuItem == null){
			saidaMenuItem = new JMenuItem("Saída");
			saidaMenuItem.addActionListener(this);
		}
		return saidaMenuItem;
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		
		if(event.getSource() == getClientesMenuItem()){
			listener.clientesAction();
		}
		
		else if(event.getSource() == getFornecedoresMenuItem()){
			listener.fornecedoresAction();
		}
		
		else if(event.getSource() == getFuncionariosMenuItem()){
			listener.funcionariosAction();
		}
		
		else if(event.getSource() == getSairMenu()){
			listener.sairAction();
		}
	}
}
