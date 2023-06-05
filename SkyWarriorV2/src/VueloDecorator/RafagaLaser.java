package VueloDecorator;

import JuegoFacade.DesarrolloJuego;

public class RafagaLaser extends Decorator_method{

	public RafagaLaser(Ataque ataque) {
		super(ataque);
	}
	
	public String infoAtaque() {
		DesarrolloJuego.delay(1000);
		return getAtaques().infoAtaque() + "Realizando una descarga laser sobre el objetivo.";
	}


}
