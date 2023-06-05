package JugadorState;

public class JugadorMuerto extends EstadoJugador {

	public JugadorMuerto(JugadorState jugador) {
		super(jugador);
	}

	@Override
	public void infoJugador(JugadorState jugador) {
		System.out.println("¡Tu avión ha sido derribado! Fin del combate.");
	}

	@Override
	public EstadoJugador estadoSiguiente() {
		return this;
	}

}
