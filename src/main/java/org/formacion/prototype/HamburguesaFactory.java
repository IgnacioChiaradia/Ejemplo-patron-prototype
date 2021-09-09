package org.formacion.prototype;

import org.formacion.prototype.Hamburguesa.*;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaFactory {

	private Carne carne;
	private Size size;
	private Pan pan;
	private List<Extra> extras = new ArrayList<>();
	
	public Hamburguesa crea() {
		return new Hamburguesa(carne, size, pan, extras.toArray(new Extra[extras.size()]));
	}
	
	public HamburguesaFactory setCarne(Carne carne) {
		this.carne = carne;
		return this;
	}

	public HamburguesaFactory setSize(Size size) {
		this.size = size;
		return this;
	}

	public HamburguesaFactory setPan(Pan pan) {
		this.pan = pan;
		return this;
	}

	public HamburguesaFactory addExtra(Extra extra) {
		this.extras.add(extra);
		return this;
	}

	public HamburguesaFactory removeExtra(Extra extra) {
		this.extras.remove(extra);
		return this;
	}

	public HamburguesaFactory clonarBurguer(Hamburguesa burger){

		this.setCarne(burger.getCarne());
		this.setPan(burger.getPan());
		this.setSize(burger.getSize());
		this.extras.clear();
		this.extras.addAll(burger.getExtras());

		return this;
	}

	// -- hamburguesas de la carta
	public static Hamburguesa royal() {
		return new Hamburguesa( Carne.VACUNO, Size.GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.QUESO);
	}

	public static Hamburguesa king() {
		return new Hamburguesa( Carne.VACUNO, Size.EXTRA_GRANDE, Pan.NORMAL, Extra.CEBOLLA, Extra.HUEVO);
	}


}
