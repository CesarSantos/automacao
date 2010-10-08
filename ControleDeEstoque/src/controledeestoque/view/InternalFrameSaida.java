package controledeestoque.view;

import java.awt.BorderLayout;

import javax.swing.JInternalFrame;

public class InternalFrameSaida extends JInternalFrame {
	private static final long serialVersionUID = 1L;

	private PanelSaida panelSaida;
	private PanelButtons panelButtons;
	
	public InternalFrameSaida() {
		super("Saída de Produto", false, true, false, false);
		setLayout(new BorderLayout());
		initilize();
		setVisible(true);
	}

	private void initilize() {
		add(getPanelSaida(), BorderLayout.CENTER);
		add(getPanelButtons(), BorderLayout.SOUTH);
	}

	private PanelSaida getPanelSaida() {
		if(panelSaida == null){
			panelSaida = new PanelSaida();
		}
		return panelSaida;
	}

	private PanelButtons getPanelButtons() {
		if(panelButtons == null){
			panelButtons = new PanelButtons(PanelButtons.OK_CANCEL);
		}
		return panelButtons;
	}

	

}
