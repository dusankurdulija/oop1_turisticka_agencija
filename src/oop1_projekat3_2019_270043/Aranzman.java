package oop1_projekat3_2019_270043;

import java.util.Date;

public class Aranzman {
	private boolean osiguranje;
	private boolean grupni;
	private Date datumPolaska;
	private Date datumPovratka;
	private PrevoznoSredstvo prevoznoSredstvo;
	private Smestaj smestaj;
	
	public Aranzman() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Aranzman(boolean osiguranje, boolean grupni, Date datumPolaska, Date datumPovratka,
			PrevoznoSredstvo prevoznoSredstvo, Smestaj smestaj) {
		super();
		this.osiguranje = osiguranje;
		this.grupni = grupni;
		this.datumPolaska = datumPolaska;
		this.datumPovratka = datumPovratka;
		this.prevoznoSredstvo = prevoznoSredstvo;
		this.smestaj = smestaj;
	}

	public boolean isOsiguranje() {
		return osiguranje;
	}

	public void setOsiguranje(boolean osiguranje) {
		this.osiguranje = osiguranje;
	}

	public boolean isGrupni() {
		return grupni;
	}

	public void setGrupni(boolean grupni) {
		this.grupni = grupni;
	}

	public Date getDatumPolaska() {
		return datumPolaska;
	}

	public void setDatumPolaska(Date datumPolaska) {
		this.datumPolaska = datumPolaska;
	}

	public Date getDatumPovratka() {
		return datumPovratka;
	}

	public void setDatumPovratka(Date datumPovratka) {
		this.datumPovratka = datumPovratka;
	}

	public PrevoznoSredstvo getPrevoznoSredstvo() {
		return prevoznoSredstvo;
	}

	public void setPrevoznoSredstvo(PrevoznoSredstvo prevoznoSredstvo) {
		this.prevoznoSredstvo = prevoznoSredstvo;
	}

	public Smestaj getSmestaj() {
		return smestaj;
	}

	public void setSmestaj(Smestaj smestaj) {
		this.smestaj = smestaj;
	}

	@Override
	public String toString() {
		return "Aranzman [osiguranje=" + osiguranje + ", grupni=" + grupni + ", datumPolaska=" + datumPolaska
				+ ", datumPovratka=" + datumPovratka + ", prevoznoSredstvo=" + prevoznoSredstvo + ", smestaj=" + smestaj
				+ "]";
	}
	
	
	
	
	

}
