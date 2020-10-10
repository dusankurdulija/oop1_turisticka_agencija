package oop1_projekat3_2019_270043;

public class Adresa {
	
	private String ulica;
	private double broj;
	private Mesto mesto;
	
	public Adresa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Adresa(String ulica, double broj, Mesto mesto) {
		super();
		this.ulica = ulica;
		this.broj = broj;
		this.mesto = mesto;
	}
	

	public String getUlica() {
		return ulica;
	}

	public void setUlica(String ulica) {
		this.ulica = ulica;
	}

	public double getBroj() {
		return broj;
	}

	public void setBroj(double broj) {
		this.broj = broj;
	}

	public Mesto getMesto() {
		return mesto;
	}

	public void setMesto(Mesto mesto) {
		this.mesto = mesto;
	}

	@Override
	public String toString() {
		return "Adresa [ulica=" + ulica + ", broj=" + broj + ", mesto=" + mesto + "]";
	}
	
	
	

}
