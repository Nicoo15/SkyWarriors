package Aviones;

public class FabricaAvionesEuropeos implements FabricaAviones {
	
	@Override
	public Aviones FabricaCaza(int n) {
		// TODO Auto-generated method stub
		
		switch(n) {
		case 1:
			return crearCazaF18();
		case 2:
			return crearCazaF22();
		case 3:
			return crearEurofighter();
		}
		return crearCazaF18();
		
	}

	
	public Jugador crearCazaF18() {
		// TODO Auto-generated method stub
		return new F18(160,80,7);
	}

	
	public Jugador crearCazaF22() {
		// TODO Auto-generated method stub
		return new F22(80,150,5);
		
	}

	
	public Jugador crearEurofighter() {
		// TODO Auto-generated method stub
		return new Eurofighter(160,40,10);
		
	}

	

}
