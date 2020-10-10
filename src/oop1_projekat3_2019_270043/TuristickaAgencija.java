package oop1_projekat3_2019_270043;

import java.util.ArrayList;

public class TuristickaAgencija {
	private String naziv;
	ArrayList<Klijent> klijenti = new ArrayList();
	ArrayList<Agent> agenti = new ArrayList();
	
	public TuristickaAgencija() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TuristickaAgencija(String naziv, ArrayList<Klijent> klijenti, ArrayList<Agent> agenti) {
		super();
		this.naziv = naziv;
		this.klijenti = klijenti;
		this.agenti = agenti;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public ArrayList<Klijent> getKlijenti() {
		return klijenti;
	}

	public void setKlijenti(ArrayList<Klijent> klijenti) {
		this.klijenti = klijenti;
	}

	public ArrayList<Agent> getAgenti() {
		return agenti;
	}

	public void setAgenti(ArrayList<Agent> agenti) {
		this.agenti = agenti;
	}

	@Override
	public String toString() {
		return "TuristickaAgencija [naziv=" + naziv + ", klijenti=" + klijenti + ", agenti=" + agenti + "]";
	}
	
	
	
	
	
}
