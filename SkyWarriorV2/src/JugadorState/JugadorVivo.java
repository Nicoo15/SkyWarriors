package JugadorState;

public class JugadorVivo extends EstadoJugador {

	public JugadorVivo(JugadorState jugador) {
		super(jugador);
	}

	@Override
	public void infoJugador(JugadorState jugador) {
		System.out.println("�Sigue volando alto, est�s vivo y luchando con fuerza!\n");
	}

	@Override
	public JugadorMuerto estadoSiguiente() {// se pasa al siguiente estado que ser�a "muerto"
		return new JugadorMuerto(jugador);
	}

}
