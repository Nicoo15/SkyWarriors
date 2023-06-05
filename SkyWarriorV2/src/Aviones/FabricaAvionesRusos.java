package Aviones;

public class FabricaAvionesRusos implements FabricaAviones {



	@Override
	public Aviones FabricaCaza(int n) {
	// TODO Auto-generated method stub
			
			switch(n) {
			case 1:
				return crearCazaYak3();
			case 2:
				return crearCazaTu2();
			case 3:
				return crearCazaTb3();
				}
			return crearCazaYak3();
			}
			
			public Enemigo crearCazaYak3() {

				return new Yak3(80, 120, 8);
			}

			public Enemigo crearCazaTu2() {
				return new Tu2(75, 105, 6);
			}

			
			public Enemigo crearCazaTb3() {
				return new Tb3(110, 75, 9);
			}
		
}

