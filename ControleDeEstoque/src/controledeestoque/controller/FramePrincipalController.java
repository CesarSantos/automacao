package controledeestoque.controller;

import controledeestoque.view.FramePrincipal;
import controledeestoque.view.InternalFrameEntrada;
import controledeestoque.view.InternalFrameSaida;

public class FramePrincipalController {
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		FramePrincipalController runner = new FramePrincipalController();
	}
	
	public FramePrincipal framePrincipal;
	
	public FramePrincipalController() {
		framePrincipal = new FramePrincipal(this);
	}

	public InternalFrameEntrada getFrameEntrada() {
		InternalFrameEntrada frameEntrada = new InternalFrameEntrada();
		
		return frameEntrada;
	}

	public InternalFrameSaida getFrameSaida() {
		InternalFrameSaida frameSaida = new InternalFrameSaida();
		
		return frameSaida;
	}

}
