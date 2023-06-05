package AtaquesTemplate;

//La clase AtaqueEnemigo implementa el patr�n Template para gestionar los ataques de los enemigos.
public abstract class AtaqueEnemigo {
	
	public final void ejecutarAtaque() {
		iniciarAtaque();
		efectuarAtaque();
		finalizarAtaque();
	}
	
	private void iniciarAtaque() {
		System.out.println("El enemigo esta realizando un ataque.");
	}
	
	protected abstract void efectuarAtaque();
	
	private void finalizarAtaque() {
		System.out.println("El ataque ha finalizado.");
	}
	
	// M�todo com�n a todas las subclases para calcular el da�o del ataque
	protected int calcularDanio(int potenciaAtaque, int defensaObjetivo) {
		return potenciaAtaque - defensaObjetivo;
	}
	
	// M�todo com�n a todas las subclases para obtener una descripci�n del ataque
	public abstract String getDescripcionAtaque();
}

