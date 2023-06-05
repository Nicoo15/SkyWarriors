package JugadorState;

public abstract class EstadoJugador {

	protected JugadorState jugador;

	public EstadoJugador(JugadorState jugador) {
		this.jugador = jugador;
	}

	public abstract void infoJugador(JugadorState jugador);

	public abstract EstadoJugador estadoSiguiente();
}
