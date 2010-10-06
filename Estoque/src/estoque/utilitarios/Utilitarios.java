package estoque.utilitarios;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public abstract class Utilitarios {

	public static Icon getIcon(String caminho) {
		ImageIcon icone= new ImageIcon("images/" + caminho);
		return icone;
	}

}
