package edu.univas.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.univas.dao.AlunoDAO;
import edu.univas.entity.Aluno;

public class CadastroAlunoController {
	
	private CadastroAlunoListener listener = null;
	private AlunoDAO alunoDAO = null;
	
	public CadastroAlunoController(CadastroAlunoListener listener) {
		this.listener = listener;
		alunoDAO = new AlunoDAO();
	}

	public ActionListener getButtonInserirActionListener() {
		return new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Aluno novoAluno = listener.getAluno();
				
				if(validate(novoAluno)) {
					alunoDAO.inserir(novoAluno);
					listener.showMessage("Aluno inserido com sucesso");
				} else {
					listener.showMessage("Cadastro inválido");
				}
			}
		};
	}

	private boolean validate(Aluno novoAluno) {
		// TODO: Valida o aluno e retorna true ou false
		
		return false;
	}

}
