package oop1_projekat3_2019_270043;

public abstract class Smestaj implements Zakupljivo {
	private double povrsina;
	private double brojKreveta;
	private TipPansiona tipPansiona;
	private Adresa adresa;
	
	public Smestaj() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Smestaj(double povrsina, double brojKreveta, TipPansiona tipPansiona, Adresa adresa) {
		super();
		this.povrsina = povrsina;
		this.brojKreveta = brojKreveta;
		this.tipPansiona = tipPansiona;
		this.adresa = adresa;
	}

	public double getPovrsina() {
		return povrsina;
	}

	public void setPovrsina(double povrsina) {
		this.povrsina = povrsina;
	}

	public double getBrojKreveta() {
		return brojKreveta;
	}

	public void setBrojKreveta(double brojKreveta) {
		this.brojKreveta = brojKreveta;
	}

	public TipPansiona getTipPansiona() {
		return tipPansiona;
	}

	public void setTipPansiona(TipPansiona tipPansiona) {
		this.tipPansiona = tipPansiona;
	}

	public Adresa getAdresa() {
		return adresa;
	}

	public void setAdresa(Adresa adresa) {
		this.adresa = adresa;
	}

	@Override
	public String toString() {
		return "Smestaj [povrsina=" + povrsina + ", brojKreveta=" + brojKreveta + ", tipPansiona=" + tipPansiona
				+ ", adresa=" + adresa + "]";
	}
	
	
	
}
