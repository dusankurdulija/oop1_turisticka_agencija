package oop1_projekat3_2019_270043;

import java.util.ArrayList;

public class Paket implements Zakupljivo {
	private double povratNovca;
	ArrayList<Aranzman> aranzmani = new ArrayList();
	private Korisnik kreatorPaketa;
	private Klijent klijent;
	
	public Paket() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Paket(double povratNovca, ArrayList<Aranzman> aranzmani, Korisnik kreatorPaketa, Klijent klijent) {
		super();
		this.povratNovca = povratNovca;
		this.aranzmani = aranzmani;
		this.kreatorPaketa = kreatorPaketa;
		this.klijent = klijent;
	}

	public double getPovratNovca() {
		return povratNovca;
	}

	public void setPovratNovca(double povratNovca) {
		this.povratNovca = povratNovca;
	}

	public ArrayList<Aranzman> getAranzmani() {
		return aranzmani;
	}

	public void setAranzmani(ArrayList<Aranzman> aranzmani) {
		this.aranzmani = aranzmani;
	}

	public Korisnik getKreatorPaketa() {
		return kreatorPaketa;
	}

	public void setKreatorPaketa(Korisnik kreatorPaketa) {
		this.kreatorPaketa = kreatorPaketa;
	}

	public Klijent getKlijent() {
		return klijent;
	}

	public void setKlijent(Klijent klijent) {
		this.klijent = klijent;
	}

	@Override
	public String toString() {
		return "Paket [povratNovca=" + povratNovca + ", aranzmani=" + aranzmani + ", kreatorPaketa=" + kreatorPaketa
				+ ", klijent=" + klijent + "]";
	}
	
	
	

}
