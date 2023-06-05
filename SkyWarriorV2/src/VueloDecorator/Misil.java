package VueloDecorator;

import JuegoFacade.DesarrolloJuego;

public class Misil extends Decorator_method {

	public Misil(Ataque ataque) {
		super(ataque);
	}

	public String infoAtaque() {
		DesarrolloJuego.delay(1000);
		return getAtaques().infoAtaque() + "Fijando al objetivo enemigo con un misil, disparando en 3... 2... 1...\n";
	}

}
