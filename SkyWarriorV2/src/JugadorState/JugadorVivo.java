package JugadorState;

public class JugadorVivo extends EstadoJugador {

	public JugadorVivo(JugadorState jugador) {
		super(jugador);
	}

	@Override
	public void infoJugador(JugadorState jugador) {
		System.out.println("¡Sigue volando alto, estás vivo y luchando con fuerza!\n");
	}

	@Override
	public JugadorMuerto estadoSiguiente() {// se pasa al siguiente estado que serï¿½a "muerto"
		return new JugadorMuerto(jugador);
	}

}
