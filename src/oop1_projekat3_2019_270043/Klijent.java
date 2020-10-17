package oop1_projekat3_2019_270043;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
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
	
	public static void uplataNovca() throws FileNotFoundException {
		Util.dohvatiUlogovanog();
		ArrayList<StringBuilder> klijenti = new ArrayList<StringBuilder>();
		ArrayList<Klijent> klijentiDeserijalizovani = new ArrayList<Klijent>();
		try {
			Scanner scc = new Scanner(new File("klijenti.csv"));
			scc.useDelimiter(";");
			while (scc.hasNextLine()) {
				String[] row = scc.nextLine().split(";");
				StringBuilder sb = new StringBuilder();
				for (String string : row) {
//					System.out.println(string);
					sb.append(string);
					sb.append(";");
				}
				Klijent kl = new Klijent(row[0], row[1], row[2], row[3], 0);
				klijentiDeserijalizovani.add(kl);
			}
			scc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		// Ovde smo stali ! Nece da se konvertuje row[4] -> Double from String
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Unesite vrednost novca za uplatu: ");
		double iznos = sc.nextDouble();
		System.out.println(iznos);
		for (Klijent klijent : klijentiDeserijalizovani) {
			klijent.setNovcanoStanje(iznos);
		}
	}

}
