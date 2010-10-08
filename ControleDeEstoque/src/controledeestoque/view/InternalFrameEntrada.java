package controledeestoque.view;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;

public class InternalFrameEntrada extends JInternalFrame {
	private static final long serialVersionUID = 1L;
	
	private PanelEntrada panelEntrada;
	private PanelButtons panelButtons;
	

	public InternalFrameEntrada() {
		super("Cadastro do Produto", false, true, false, false);
		setLayout(new BorderLayout());
		initilize();
		setVisible(true);
	}

	private void initilize() {
		add(getPanelEntrada(), BorderLayout.CENTER);
		add(getPanelButtons(), BorderLayout.SOUTH);
	}

	private PanelEntrada getPanelEntrada() {
		if(panelEntrada == null){
			panelEntrada = new PanelEntrada();
		}
		return panelEntrada;
	}
	
	private PanelButtons getPanelButtons() {
		if(panelButtons == null){
			panelButtons = new PanelButtons(PanelButtons.OK_CANCEL_CLEAN);
		}
		return panelButtons;
	}
	
}
