package AtaquesTemplate;

import JuegoFacade.DesarrolloJuego;

public class AtaqueLaser extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		DesarrolloJuego.delay(1000);
		System.out.println(
			"¡El enemigo esta disparando un rayo laser. Esquivalo o preparate para recibir daño!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		DesarrolloJuego.delay(1000);
		return "Un ataque de rayo laser que inflige un gran daño.";
	}
}

