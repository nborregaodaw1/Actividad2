package ende;

/**
 * Simula el juego de Piedra, Papel o tijera
 */

public class Juego {
	public static void main(String args[]) {

		Jugador p1 = new Jugador();
		Jugador p2 = new Jugador();

		boolean finDeJuego = false;

		int rondasJugadas = 0;
		int exitosJugador1 = p1.getExitos();
		int exitosJugador2 = p2.getExitos();
		int empates = 0;

		String opcionJugador1;
		String opcionJugador2;

		do {
			System.out.println("***** Ronda: " + rondasJugadas + " *********************\n");
			System.out.println("Numero de empates: " + empates + "\n");
			opcionJugador1 = p1.opcionAlAzar();
			System.out.println("Jugador 1: " + opcionJugador1 + "\t Jugador 1 - Partidas ganadas: " + exitosJugador1);
			opcionJugador2 = p2.opcionAlAzar();
			System.out.println("Jugador 2: " + opcionJugador2 + "\t Jugador 2 - Partidas ganadas: " + exitosJugador2);

			if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("papel"))) {
				System.out.println("Jugador 2 GANA");
				p2.setExitos(p2.getExitos() + 1);
				exitosJugador2 = p2.getExitos();
			} 
			
			if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("piedra"))) {
				p1.setExitos(p1.getExitos() + 1);
				exitosJugador1 = p1.getExitos();
				System.out.println("Jugador 1 GANA");
			} 
			
			if ((opcionJugador1.equals("piedra")) && (opcionJugador2.equals("tijeras"))) {
				p1.setExitos(p1.getExitos() + 1);
				exitosJugador1 = p1.getExitos();
				System.out.println("Jugador 1 GANA");
			}
			
			if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("piedra"))) {
				p2.setExitos(p2.getExitos() + 1);
				exitosJugador2 = p2.getExitos();
				System.out.println("Jugador 2 GANA");
			}
			
			if ((opcionJugador1.equals("tijeras")) && (opcionJugador2.equals("papel"))) {
				p1.setExitos(p1.getExitos() + 1);
				exitosJugador1 = p1.getExitos();
				System.out.println("Jugador 1 GANA");
			}
			
			if ((opcionJugador1.equals("papel")) && (opcionJugador2.equals("tijeras"))) {
				p2.setExitos(p2.getExitos() + 1);
				exitosJugador2 = p2.getExitos();
				System.out.println("Jugador 2 GANA");
			}
			
			if (opcionJugador1 == opcionJugador2) {
				empates++;
				System.out.println("\n\t\t\t Empate \n");
			}
			
			rondasJugadas++;
			
			if ((p1.getExitos() >= 3) || (p2.getExitos() >= 3)) {
				finDeJuego = true;
				System.out.println("FIN DEL JUEGO!!");
			}
			
			System.out.println();
			
		} while (finDeJuego != true);
	}
}

/**
 *
 */
class Jugador {
	private int exitos;

	/**
	 * Escoge piedra, papel o tijera al azar
	 */
	public String opcionAlAzar() {
		String opcion = "";
		int c = (int) (Math.random() * 3);
		switch (c) {
			case 0:
				opcion = ("piedra");
				break;
			case 1:
				opcion = ("papel");
				break;
			case 2:
				opcion = ("tijeras");
		}
		return opcion;
	}

	public int getExitos() {
		return exitos;
	}

	public void setExitos(int exitos) {
		this.exitos = exitos;
	}
	
}
