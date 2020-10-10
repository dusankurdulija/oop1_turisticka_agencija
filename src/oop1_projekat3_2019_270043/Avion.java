package oop1_projekat3_2019_270043;

public class Avion extends PrevoznoSredstvo {
	private KlasaAvionskogMesta klasa;

	public Avion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Avion(KlasaAvionskogMesta klasa) {
		super();
		this.klasa = klasa;
	}

	public KlasaAvionskogMesta getKlasa() {
		return klasa;
	}

	public void setKlasa(KlasaAvionskogMesta klasa) {
		this.klasa = klasa;
	}

	@Override
	public String toString() {
		return "Avion [klasa=" + klasa + "]";
	}
	
}
