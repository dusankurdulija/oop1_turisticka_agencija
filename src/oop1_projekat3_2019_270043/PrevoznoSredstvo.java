package oop1_projekat3_2019_270043;

public abstract class PrevoznoSredstvo implements Zakupljivo {
	private boolean obrok;
	private Adresa polaznaAdresa;
	private Adresa odredisnaAdresa;
	
	public PrevoznoSredstvo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PrevoznoSredstvo(boolean obrok, Adresa polaznaAdresa, Adresa odredisnaAdresa) {
		super();
		this.obrok = obrok;
		this.polaznaAdresa = polaznaAdresa;
		this.odredisnaAdresa = odredisnaAdresa;
	}

	public boolean isObrok() {
		return obrok;
	}

	public void setObrok(boolean obrok) {
		this.obrok = obrok;
	}

	public Adresa getPolaznaAdresa() {
		return polaznaAdresa;
	}

	public void setPolaznaAdresa(Adresa polaznaAdresa) {
		this.polaznaAdresa = polaznaAdresa;
	}

	public Adresa getOdredisnaAdresa() {
		return odredisnaAdresa;
	}

	public void setOdredisnaAdresa(Adresa odredisnaAdresa) {
		this.odredisnaAdresa = odredisnaAdresa;
	}

	@Override
	public String toString() {
		return "PrevoznoSredstvo [obrok=" + obrok + ", polaznaAdresa=" + polaznaAdresa + ", odredisnaAdresa="
				+ odredisnaAdresa + "]";
	}
	
	
	

}
