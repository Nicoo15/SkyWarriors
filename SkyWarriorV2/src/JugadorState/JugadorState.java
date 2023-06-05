package JugadorState;

public class JugadorState {
	protected EstadoJugador estadoJugador;

	public JugadorState() {// constructor del contexto del jugador, que invoca a la clase Vivo, que será el
							// primer estado del jugador
		estadoJugador = new JugadorVivo(this);
	}

	public void infoJugador(JugadorState jugador) {// metodo que imprimirá la info del jugador
		estadoJugador.infoJugador(jugador);
	}

	public void estadoSiguiente() {// metodo que sirve para cambiar de estado del patrón State
		estadoJugador = estadoJugador.estadoSiguiente();
	}
}
