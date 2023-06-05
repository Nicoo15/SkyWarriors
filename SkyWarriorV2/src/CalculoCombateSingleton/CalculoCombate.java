package CalculoCombateSingleton;

import java.util.Random;

import Aviones.Aviones;
import JuegoFacade.DesarrolloJuego;


public class CalculoCombate {
	public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_RESET = "\u001B[0m";
	private static CalculoCombate instancia = null;

	public static CalculoCombate instance() {
		if (instancia == null) {
			instancia = new CalculoCombate();
		}
		return instancia;
	}

	public void CalcAtaqueBalas(Aviones jugador, Aviones enemigo2, boolean enemigo) {
		int danoPersonaje = jugador.getVida() - (enemigo2.getFuerza() / jugador.getDefensa());
		int danoEnemigo = enemigo2.getVida() - (jugador.getFuerza() / enemigo2.getDefensa());
		int vidaActualPersonaje = danoPersonaje;
		int vidaActualEnemigo = danoEnemigo;
		

		if (enemigo) {
			jugador.setVida(vidaActualPersonaje);
		} else {
			enemigo2.setVida(vidaActualEnemigo);
		}

		System.out.println("La vida de: ");

		if (enemigo) {
			System.out.println(ANSI_GREEN+"Pesonaje: " + jugador.getVida()+ANSI_RESET);
		} else {
			System.out.println(ANSI_RED +"Enemigo: " + enemigo2.getVida()+ANSI_RESET);
		}

	}

	public void calcAtqueMisil(Aviones jugador, Aviones enemigo2, boolean enemigo) {
		
		 Random rand = new Random();

	    if (rand.nextFloat() < 0.3) {
			int danoJugador = jugador.getVida() - ((enemigo2.getFuerza() * 3) / jugador.getDefensa());
			int danoEnemigo = enemigo2.getVida() - ((jugador.getFuerza() * 3) / enemigo2.getDefensa());
			int vidaActualJugador = danoJugador;
			int vidaActualEnemigo = danoEnemigo;
	
			if (enemigo) {
				jugador.setVida(vidaActualJugador);
			} else {
				enemigo2.setVida(vidaActualEnemigo);
			}
			DesarrolloJuego.delay(1000);
			System.out.println("La vida de: ");
	
			if (enemigo) {
				System.out.println(ANSI_GREEN+"Pesonaje: " + jugador.getVida()+ANSI_RESET);
			} else {
				System.out.println(ANSI_RED +"Enemigo: " + enemigo2.getVida()+ANSI_RESET);
			}
	    }else {
	    	DesarrolloJuego.delay(1000);
	    	if(enemigo) {
	    		System.out.println("El enemigo ha fallado el misil");
	    		System.out.println(ANSI_GREEN+"Jugador: " + jugador.getVida()+ANSI_RESET);
	    	}else {
	    		System.out.println("Has fallado , el enemigo ha esquivado el misil");
	    		System.out.println(ANSI_RED+"Enemigo: " + enemigo2.getVida()+ANSI_RESET);
	    	}
	    }

	}
	public void calcAtqueLaser(Aviones jugador, Aviones enemigo2, boolean enemigo) {
		int danoJugador = jugador.getVida() - ((enemigo2.getFuerza() * 2) / jugador.getDefensa());
		int danoEnemigo = enemigo2.getVida() - ((jugador.getFuerza() * 2) / enemigo2.getDefensa());
		int vidaActualJugador = danoJugador;
		int vidaActualEnemigo = danoEnemigo;
		Random rand = new Random();
		if (rand.nextFloat() < 0.5) {
			if (enemigo) {
				jugador.setVida(vidaActualJugador);
			} else {
				enemigo2.setVida(vidaActualEnemigo);
			}
			DesarrolloJuego.delay(1000);
			System.out.println("La vida de: ");
	
			if (enemigo) {
				System.out.println(ANSI_GREEN+"Pesonaje: " + jugador.getVida()+ANSI_RESET);
			} else {
				System.out.println(ANSI_RED +"Enemigo: " + enemigo2.getVida()+ANSI_RESET);
			}
		}else {
			DesarrolloJuego.delay(1000);
			if(enemigo) {
	    		System.out.println("Se ha encasquillado el ataque laser, el enmigo ha fallado");
	    		System.out.println(ANSI_GREEN+"Jugador: " + jugador.getVida()+ANSI_RESET);
	    	}else {
	    		System.out.println("Se ha encasquillado el laser , no has podido darle");
	    		System.out.println(ANSI_RED+"Enemigo: " + enemigo2.getVida()+ANSI_RESET);
	    	}
		}
	}
}
