package oop1_projekat3_2019_270043;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Klijent extends Korisnik {
	private double novcanoStanje;

	public Klijent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Klijent(String ime, String prezime, String username, String password, double novcanoStanje) {
		super(ime, prezime, username, password);
		this.novcanoStanje = novcanoStanje;
	}

	public double getNovcanoStanje() {
		return novcanoStanje;
	}

	public void setNovcanoStanje(double novcanoStanje) {
		this.novcanoStanje = novcanoStanje;
	}

	@Override
	public String toString() {
		return "Klijent [novcanoStanje=" + novcanoStanje + "]";
	}
	
	public static void uplataNovca() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost novca za uplatu: ");
		double iznos = sc.nextDouble();
		System.out.println(iznos);
	}

}
