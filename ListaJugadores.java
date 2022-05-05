package packUno;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaJugadores {

	//Atributos	
	private ArrayList<Jugador> lista;
	private static ListaJugadores milistaJugadores=new ListaJugadores();
	private int jugadorConTurno;

	//Metodos
	private  ListaJugadores() {
		this.lista = new ArrayList<Jugador>();
	}
	
	public static ListaJugadores getListaJugadores() {
		return milistaJugadores;
	}
	
	private Iterator<Jugador> getIterador() {
		return this.lista.iterator();
	}
    
	public void anadirJugadores(int pNumJugadores) {  //Añade los jugadores con su numero, los añade en sentido inverso es decir si fueran cuatro el orden seria (4,3,2,1)
		int i = pNumJugadores;
		while (i > 0) {		
			this.lista.add(new Jugador(pNumJugadores));
			i = i -1;
		} 
	}
	
	public void pasarTurno(int pNumTurnos) {		
		Iterator<Jugador> itr=this.getIterador();
		Jugador unJugador = lista.get(jugadorConTurno);
		int cuantosTurnos = pNumTurnos;
		while (cuantosTurnos > 0) {
			if (itr.hasNext() == false) {
				unJugador = null;
				unJugador = itr.next();
				cuantosTurnos = cuantosTurnos - 1;
			}else {
			unJugador = itr.next();
			cuantosTurnos = cuantosTurnos - 1;
			}
		}
		
		unJugador.ejecutarTurno();
	}
	
	public void robarCartasInicio() {		//hace un loop en el que ejecuta el metodo de robar las cartas iniciales de todos los jugadores de la lista
		Iterator<Jugador> itr=this.getIterador();
		Jugador unJugador = null;
		while (itr.hasNext()) {
			unJugador = itr.next();
			unJugador.robarCartasInicio();
		}
	}
	
	
 
}
