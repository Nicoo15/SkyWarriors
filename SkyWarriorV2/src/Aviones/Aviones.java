package Aviones;

public abstract class Aviones {
	private int vida;
	private int fuerza;
	private int defensa;
	
	public Aviones(int vida, int fuerza, int defensa) {
		this.vida = vida;
		this.fuerza = fuerza;
		this.defensa = defensa;
	}
	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getDefensa() {
		return defensa;
	}

	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	
}
