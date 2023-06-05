package JuegoFacade;

import java.util.Scanner;

import AtaquesTemplate.*;
import Aviones.*;
import CalculoCombateSingleton.CalculoCombate;
import JugadorStrategy.*;
import VueloDecorator.*;

public class DesarrolloJuego {
	String purple = "\033[0;35m";    
    String reset = "\033[0m"; 
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    
	  public static void delay(long delayInMillis) {
		  	try {
	            Thread.sleep(delayInMillis);
	        } catch (InterruptedException e) {
	        	e.printStackTrace();
	        }
	    }
	private Aviones jugador;
	private Aviones enemigo;

	Scanner sc = new Scanner(System.in);

	public DesarrolloJuego() {
		System.out.println("Elige el avion que quieres:\n1-F18 \n2-F22 \n3-Eurofighter");
		int av = sc.nextInt();
		
		FabricaAviones Fabrica = new FabricaAvionesEuropeos();
		
		this.jugador = Fabrica.FabricaCaza(av);
	
		int opcRandEnemy = (int) (Math.random() * (3 - 1 + 1) + 1);
		delay(1000);
		if(opcRandEnemy==1) {
			System.out.println("El enemigo lleva un avion ruso Tu2 preparate");
		}else if(opcRandEnemy==2) {
			System.out.println("El enemigo lleva un avion ruso Tb3 preparate");
		}else {
			System.out.println("El enemigo lleva un avion ruso Yak3 preparate");
		}
		Fabrica = new FabricaAvionesRusos();
		
		this.enemigo = Fabrica.FabricaCaza(opcRandEnemy);
		

		
	}

	public void todo() {
		System.out.println("Iniciando vuelo...");
		System.out.println("Despegando...");
		System.out.println("¡Que gane el mejor!");
		System.out.println();

		this.estrategiaJugador();
		this.combate();
	}

	public void estrategiaJugador() {
		System.out.println("Seleccione su modo de combate:");
		System.out.println("1. Modo ofensivo");
		System.out.println("2. Modo defensivo");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("\nEntrando en modo ofensivo");
			 delay(1000);
			ControladorEstrategia EsOfens = new ControladorEstrategia(new Ofensiva());
			 delay(1000);
			EsOfens.eleccionInicial(jugador);
			break;

		case 2:
			System.out.println("\nEntrando en modo defensivo");
			 delay(1000);
			ControladorEstrategia EsDefens = new ControladorEstrategia(new Defensiva());
			 delay(1000);
			EsDefens.eleccionInicial(jugador);
			break;

		default:
			System.err.println("**** ERROR ****");
			break;
		}
		delay(1000);
		System.out.println(purple+"####### QUE EMPIECE EL COMBATE ############"+reset+"\n\n");
		delay(1000);
		
	}

	public void combate() {
		do {
			
			System.out.println("Turno del jugador:");
			delay(1000);
			System.out.println("Seleccione su movimiento:");
			delay(1000);
			System.out.println("1. Disparo rapido");
			delay(1000);
			System.out.println("2. Disparo laser");
			delay(1000);
			System.out.println("3. Lanzar misil");

			int opcion = sc.nextInt();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();

			CalculoCombate dano = CalculoCombate.instance();

			Ataque ataque = new AtaquePrincipal();
			delay(1000);
			switch (opcion) {
			case 1:
				ataque = new Balas(ataque);
				
				System.out.println(ataque.infoAtaque());
				delay(1000);
				System.out.println("¡El jugador ha realizado un ataque de ametralladora!");
				delay(1000);
				dano.CalcAtaqueBalas(jugador, enemigo, false);
				
				break;

			case 2:
				ataque = new RafagaLaser(ataque);
				System.out.println(ataque.infoAtaque());
				delay(1000);
				System.out.println("¡El jugador ha realizado un ataque especial laser!");
				delay(1000);
				dano.calcAtqueLaser(jugador, enemigo, false);
				
				break;

			case 3:
				ataque = new Misil(ataque);
				System.out.println(ataque.infoAtaque());
				delay(1000);
				System.out.println("¡El jugador ha lanzado un misil!");
				delay(1000);
				dano.calcAtqueMisil(jugador, enemigo, false);
				
				break;

			default:
				System.err.println("Ataque no valido");
				break;
			}

			System.out.println();

			int opcRand = (int) (Math.random() * (3 - 1 + 1) + 1);
			
			delay(1000);
			switch (opcRand) {
			case 1:
				AtaqueEnemigo ataque1 = new AtaqueRafaga();
				ataque1.ejecutarAtaque();
				delay(1000);
				dano.CalcAtaqueBalas(jugador, enemigo, true);
				break;

			case 2:
				AtaqueEnemigo ataque2 = new AtaqueLaser();
				ataque2.ejecutarAtaque();
				delay(1000);
				dano.calcAtqueLaser(jugador, enemigo, true);
				break;

			case 3:
				AtaqueEnemigo ataque3 = new AtaqueMisil();
				ataque3.ejecutarAtaque();
				delay(1000);
				dano.calcAtqueMisil(jugador, enemigo, true);
				break;

			default:
				System.err.println("Ataque no válido");
				break;
			}

			System.out.println();

			int vidaEnemigo = enemigo.getVida();
			int vidaJugador = jugador.getVida();
			delay(1000);

			System.out.println(ANSI_RED+"Estado actual del enemigo:" + vidaEnemigo+reset);

			System.out.println();

			System.out.println(ANSI_GREEN+"Estado actual del jugador:" + vidaJugador+reset);
			System.out.println();
			
			
		
		} while (jugador.getVida() > 0 && enemigo.getVida() > 0);

		if (jugador.getVida() <= 0) {
			delay(1000);
			System.out.println("¡El jugador ha perdido!");
		} else {
			delay(1000);
			
			   	System.out.println("Y   Y  OOO  U   U       W   W  I  N   N");
		        System.out.println(" Y Y  O   O U   U       W   W  I  NN  N");
		        System.out.println("  Y   O   O U   U       W W W  I  N N N");
		        System.out.println("  Y   O   O U   U       W W W  I  N  NN");
		        System.out.println("  Y    OOO   UUU        W   W  I  N   N");
		}
	}
}
