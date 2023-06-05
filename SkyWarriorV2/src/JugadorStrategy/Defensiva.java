package JugadorStrategy;

import Aviones.Aviones;
import JuegoFacade.DesarrolloJuego;


public class Defensiva implements Strategy {


	@Override
	public void eleccionInicial(Aviones j) {
		int defensaExtra = 15;
		int defensaJugador = j.getDefensa();
		int defensaAumentada = defensaJugador + defensaExtra;
		DesarrolloJuego.delay(1000);
		System.out.println("Has adoptado una posición defensiva, tu defensa ha aumentado en: " + defensaAumentada);
		
	}

}