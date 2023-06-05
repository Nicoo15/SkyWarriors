package AtaquesTemplate;

import JuegoFacade.DesarrolloJuego;

public class AtaqueRafaga extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		DesarrolloJuego.delay(1000);
		System.out.println(
			"¡El enemigo esta disparando una rafaga de disparos. Esquivala o preparate para recibir daño!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		DesarrolloJuego.delay(1000);
		return "Un ataque de rafaga que inflige daño moderado pero con gran precision.";
	}
}