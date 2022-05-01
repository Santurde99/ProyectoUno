package packUno;

import java.util.Iterator;

public class Jugador {

	//Atributos
	private int numeroDeJugador;
	private ListaCartas lista;
	
	//Metodos
	
	public Jugador(int pNum) {
		this.numeroDeJugador = pNum;
		lista = new ListaCartas();
	}
	
	public void ejecutarTurno() {
		
	}
	
	private void darOpcionDeRobar() {
		System.out.println("(0) Robar carta");
	}
	
	private Iterator<Carta> getIterador() { 	//Creo que falla porque aun no esta la lista de Cartas ni las cartas
		return this.lista.iterator();
	}
	
	public void robarCarta() {
		
	}
	
	public void robarCartasInicio() {
		
	}
	
	
	
}
