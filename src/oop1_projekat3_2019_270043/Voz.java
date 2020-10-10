package oop1_projekat3_2019_270043;

public class Voz extends PrevoznoSredstvo {
	private KlasaVoznogMesta klasa;

	public Voz() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Voz(boolean obrok, Adresa polaznaAdresa, Adresa odredisnaAdresa) {
		super(obrok, polaznaAdresa, odredisnaAdresa);
		// TODO Auto-generated constructor stub
	}

	public Voz(KlasaVoznogMesta klasa) {
		super();
		this.klasa = klasa;
	}

	public KlasaVoznogMesta getKlasa() {
		return klasa;
	}

	public void setKlasa(KlasaVoznogMesta klasa) {
		this.klasa = klasa;
	}

	@Override
	public String toString() {
		return "Voz [klasa=" + klasa + "]";
	}
	
	

}
