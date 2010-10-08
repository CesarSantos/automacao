package controledeestoque.view;

import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelButtons extends JPanel {
	private static final long serialVersionUID = 1L;

	public static final int OK_CANCEL_CLEAN = 0;
	public static final int OK_CANCEL = 1;
	public static final int OK = 2;
	
	private JButton cancelButton;
	private JButton cleanButton;
	private JButton okButton;
	
	public PanelButtons(int typeOfButtons) {
		initialize(typeOfButtons);
	}

	private void initialize(int typeOfButtons) {
		if(typeOfButtons == OK_CANCEL_CLEAN){
			add(getOkButton());
			add(getCleanButton());
			add(getCancelButton());
		}
		
		else if(typeOfButtons == OK_CANCEL){
			add(getOkButton());
			add(getCancelButton());
		}
		
		else{
			add(getOkButton());
		}
		
	}

	private JButton getCancelButton() {
		if(cancelButton == null){
			cancelButton = new JButton("Cancelar");
		}
		return cancelButton;
	}

	private JButton getCleanButton() {
		if(cleanButton == null){
			cleanButton = new JButton("Limpar Dados");
		}
		return cleanButton;
	}

	private JButton getOkButton() {
		if(okButton == null){
			okButton = new JButton("OK");
		}
		return okButton;
	}
}
