package AtaquesTemplate;

import JuegoFacade.DesarrolloJuego;

public class AtaqueMisil extends AtaqueEnemigo {

	@Override
	protected void efectuarAtaque() {
		DesarrolloJuego.delay(1000);
		System.out.println(
			"El enemigo ha lanzado un misil. Prep�rate para esquivarlo!");
	}
	
	@Override
	public String getDescripcionAtaque() {
		DesarrolloJuego.delay(1000);
		return "Un ataque con un misil que inflige un gran da�o en una zona amplia.";
	}
}
