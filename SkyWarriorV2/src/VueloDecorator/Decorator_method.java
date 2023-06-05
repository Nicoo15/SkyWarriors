package VueloDecorator;


public class Decorator_method implements Ataque {
	private Ataque ataque;

	public Decorator_method(Ataque ataque) {
		setAtaques(ataque);
	}

	protected Ataque getAtaques() {
		return ataque;
	}

	protected void setAtaques(Ataque ataque) {
		this.ataque = ataque;
	}

	public String infoAtaque() {
		
		return "";
	}
}
