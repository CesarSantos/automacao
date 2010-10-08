package controledeestoque.view;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class PanelSaida extends JPanel {
	private static final long serialVersionUID = 1L;

	private JLabel nomeLabel;
	private JTextField nomeText;
	
	private JLabel codLabel;
	private JTextField codText;
	
	private JLabel precoLabel;
	private JTextField precoText;
	
	private JLabel quantidadeLabel;
	private JTextField quantidadeText;
	
	private GridLayout gridLayout;
	
	public PanelSaida() {
		setBorder(new EmptyBorder(10,10,10,10));
		setLayout(getGridLayout());
		initialize();
	}

	private void initialize() {
		add(getCodLabel());
		add(getCodText());
		
		add(getQuantidadeLabel());
		add(getQuantidadeText());
		
		add(getNomeLabel());
		add(getNomeText());
		
		add(getPrecoLabel());
		add(getPrecoText());
	}
	
	private JLabel getNomeLabel() {
		if(nomeLabel == null){
			nomeLabel = new JLabel("Nome do Produto: ");
		}
		return nomeLabel;
	}

	private JTextField getNomeText() {
		if(nomeText == null){
			nomeText = new JTextField();
			nomeText.setEditable(false);
		}
		return nomeText;
	}

	private JLabel getCodLabel() {
		if(codLabel == null){
			codLabel = new JLabel("Código do Produto: ");
		}
		return codLabel;
	}

	private JTextField getCodText() {
		if(codText == null){
			codText = new JTextField();
		}
		return codText;
	}

	private JLabel getPrecoLabel() {
		if(precoLabel == null){
			precoLabel = new JLabel("Preço do Produto: ");
		}
		return precoLabel;
	}

	private JTextField getPrecoText() {
		if(precoText == null){
			precoText = new JTextField();
			precoText.setEditable(false);
		}
		return precoText;
	}

	private JLabel getQuantidadeLabel() {
		if(quantidadeLabel == null){
			quantidadeLabel = new JLabel("Quantidade: ");
		}
		return quantidadeLabel;
	}

	private JTextField getQuantidadeText() {
		if(quantidadeText == null){
			quantidadeText = new JTextField();
		}
		return quantidadeText;
	}

	private GridLayout getGridLayout() {
		if(gridLayout == null){
			gridLayout = new GridLayout(4,2,5,5);
		}
		return gridLayout;
	}
}
