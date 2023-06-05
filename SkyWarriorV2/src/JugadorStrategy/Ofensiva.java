package JugadorStrategy;

import Aviones.*;
import JuegoFacade.DesarrolloJuego;
public class Ofensiva implements Strategy {

	@Override
	public void eleccionInicial(Aviones j) {
		int fuerzaExtra = 15;
		int fuerzaJugador = j.getFuerza();
		int fuerzaAumentada = fuerzaJugador + fuerzaExtra;
		DesarrolloJuego.delay(1000);
		System.out.println("Has adoptado una posición ofensiva, tu ataque ha aumentado en: " + fuerzaAumentada);
	}

}
