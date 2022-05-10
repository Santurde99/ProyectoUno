package proyecto;

public class Baraja {

	//Atributos
	private ListaCartas listaCartas;
	private static Baraja miBaraja = new Baraja();
	
	//Constructora
	private Baraja() {
		this.listaCartas = new ListaCartas();
	}
	
	//Métodos
	
	public static Baraja getBaraja() {
		return miBaraja;
	}
	
	public void estaVacia() {
		if (this.listaCartas.estaVacia()) {
			this.rellenarBarajaConMonton();
		}
	}
	
	public Carta robarCarta() {
		return this.listaCartas.get(this.listaCartas.tamano());
		
	}
	
	public void barajar() {
		this.listaCartas.mezclarCartas();
	}
	
	private void añadirCarta(pCarta Carta) {
		this.listaCartas.add(pCarta);
	}
	
	private void setListaCartas(pListaCartas listaCartas) {
		this.listaCartas = listaCartas;
	}
	
	private void rellenarBarajaConMonton() {
		this.setListaCartas(Monton.getMonton().getListaCartas());
		this.barajar();
		Monton.getMonton().vaciarListaCartasMenosUltima();
	}

}
