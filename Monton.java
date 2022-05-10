package proyecto;

public class Monton {

	//Atributos
	private ListaCartas listaCartas;
	private static Monton miMonton = new Monton();
	
	
	//Constructora
	private Monton() {
		this.listaCartas= new ListaCartas();
	}
	
	//Métodos

	public static Monton getMonton() {
		return miMonton;
	}
	
	private void añadirCarta(pCarta Carta) {
		this.listaCartas.add(pCarta);
	}
	
	private Carta ultimaCarta() {
		return this.listaCartas.get(this.listaCartas.tamano());
	}
	
	private boolean coincide(pNum integer, pCol String) {
		boolean coincide= false;
		if (this.ultimaCarta().getColor() == pCol) {
			if (this.ultimaCarta().getNum() == pNum) {
				coincide = true;
			}
		}
		try {
			if (coincide==false) {
				throw(new MiExcepcion());
			}
		}
		catch(MiException e)
		{System.out.println("La carta que se ha tirado no coincide con la ultima carta!!");}
	}

	public ListaCartas getListaCartas() {
		return listaCartas;
	}

	public void vaciarListaCartasMenosUltima() {
		Carta ult = this.ultimaCarta();
		this.listaCartas = new ListaCartas();
		this.añadirCarta(ult);
	}

}