package edu.univas.view;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import edu.univas.entity.Aluno;

public class CadastroAlunoPanel extends JPanel implements CadastroAlunoListener {

	private CadastroAlunoController controller = null;
	
	private JTextField fieldNome = null;
	private JTextField fieldEmail = null;
	private JButton buttonInserir = null;
	
	public CadastroAlunoPanel() {
		controller = new CadastroAlunoController(this);
		
		addFieldNome();
		addFieldEmail();
		addButtonInserir();
	}

	private void addFieldNome() {
		fieldNome = new JTextField(15);
		
		//TODO: Adicionar no painel usando GridBagLayout
	}

	private void addFieldEmail() {
		fieldEmail = new JTextField(15);

		//TODO: Adicionar no painel usando GridBagLayout
	}

	private void addButtonInserir() {
		buttonInserir = new JButton();
		buttonInserir.addActionListener(controller.getButtonInserirActionListener());
		
		//TODO: Adicionar no painel usando GridBagLayout
	}

	@Override
	public Aluno getAluno() {
		Aluno aluno = new Aluno();
		aluno.setName(fieldNome.getText());
		aluno.setEmail(fieldEmail.getText());
		
		return aluno;
	}

	@Override
	public void showMessage(String message) {
		JOptionPane.showMessageDialog(this, message);
	}
}
