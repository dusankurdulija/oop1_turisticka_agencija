package oop1_projekat3_2019_270043;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;


public class Util {
	
	public static void agentMeni() {
		System.out.println("---Agent Meni---");
		System.out.println("1) Kreiranje arandzmana");
		System.out.println("2) Kreiranje paketa");
		System.out.println("3) Brisanje arandzmana");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi vrednost:");
		String vrednost = sc.next();
		
		if(vrednost.equals("1")) {
			System.out.println("Kreiranje arandzmana");
			kreiranjeAranzmana();
			agentMeni();
		}
		if(vrednost.equals("2")) {
			System.out.println("Kreiranje paketa");
			agentMeni();
		}
		if(vrednost.equals("3")) {
			System.out.println("Brisanje arandzmana");
			agentMeni();
		}
		
		
		
		
	}
	
	public static void klijentMeni() {
//		try {
////			FileInputStream fis = new FileInputStream("ulogovani.txt");
////			Scanner sc = new Scanner(fis);
////			
////			while (sc.hasNext()) {
////				String value = sc.nextLine();
////				System.out.println(value);
////			}
////			fis.close();
////			sc.close();
//			System.out.println("Uspesan upis !");
//		} catch (IOException e) {
//			// TODO: handle exception
//			System.out.println(e);
//		}
		System.out.println("---Klijent Meni---");
		System.out.println("1) Uplata novca");
		System.out.println("2) Kreiranje paketa");
		System.out.println("3) Zakupljivanje paketa");
		System.out.println("4) Otkazivanje paketa");
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesi vrednost:");
		String vrednost = sc.next();
		
		if(vrednost.equals("1")) {
			System.out.println("Uplata novca");
			Klijent.uplataNovca();
			klijentMeni();
		}
		if(vrednost.equals("2")) {
			System.out.println("Kreiranje paketa");
			klijentMeni();
		}
		
		if(vrednost.equals("3")) {
			System.out.println("Zakupljivanje paketa");
			klijentMeni();
		}
		
		if(vrednost.equals("4")) {
			System.out.println("Otkazivanje paketa");
			klijentMeni();
		}
	}
	
	public static Korisnik login(ArrayList<Klijent> klijenti, ArrayList<Agent> agenti) throws FileNotFoundException {
		csvReader("klijenti.csv");
		Scanner sc = new Scanner(System.in);
		System.out.println("---Login---");
		System.out.print("username: ");
		String username = sc.next();
		System.out.print("password: ");
		String password = sc.next();
		
		for (Klijent klijent : klijenti) {
			if (klijent.getUsername().equals(username) && klijent.getPassword().equals(password)) {
				System.out.println("Uspesno ste se ulogovali !");
				Util.zapisiUlogovanog(klijent);
				Util.klijentMeni();
				return klijent;
			}
		}
		
		for (Agent agent : agenti) {
			if (agent.getUsername().equals(username) && agent.getPassword().equals(password)) {
				System.out.println("Uspesno ste se ulogovali !");
				Util.zapisiUlogovanog(agent);
				Util.agentMeni();
				return agent;
			}
		}
		return null;
	}
	
	public static void zapisiUlogovanog(Korisnik ulogovani) throws FileNotFoundException {
		PrintWriter printer = new PrintWriter("ulogovani.txt");
		printer.println(ulogovani.zaUpisUFajl());
		printer.flush();
		printer.close();
	}
	
	public static void csvReader(String filename) {
		try {
			Scanner sc = new Scanner(new File(filename));
			sc.useDelimiter(";");
			while (sc.hasNextLine()) {
				String[] row = sc.nextLine().split(";");
				StringBuilder sb = new StringBuilder();
				for (String string : row) {
//					System.out.println(string);
					sb.append(string);
					sb.append(";");
				}
				System.out.println(sb);
			}
			sc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static void kreiranjeAranzmana() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Da li zelite osiguranje ? (da/ne)");
		String vrednostOsiguranje = sc.next();
		boolean osiguranje;
		if (vrednostOsiguranje.equals("da")) {
			osiguranje = true;
		} else {
			osiguranje = false;
		}
		System.out.println("Da li zelite grupni ? (da/ne)");
		String vrednostGrupni = sc.next();
		boolean grupni;
		if (vrednostGrupni.equals("da")) {
			grupni = true;
		} else {
			grupni = false;
		}
		
		Date datumPolaska = new Date();
		Date datumPovratka = new Date();
		
		System.out.println("1) Avion");
		System.out.println("2) Voz");
		System.out.print("Unesi vrednost: ");
		String vrednostSredstvo = sc.next();
		PrevoznoSredstvo prevoznoSredstvo;
		if (vrednostSredstvo.equals("1")) {
			prevoznoSredstvo = new Avion();
		} else {
			prevoznoSredstvo = new Voz();
		}
		
		System.out.println("1) Hotel");
		System.out.println("2) Apartman");
		System.out.print("Unesi vrednost: ");
		String vrednostSmestaj = sc.next();
		Smestaj smestaj;
		if (vrednostSmestaj.equals("1")) {
			smestaj = new Hotel();
		} else {
			smestaj = new Apartman();
		}
		
		Aranzman noviAranzman = new Aranzman(osiguranje, grupni, datumPolaska, datumPovratka, prevoznoSredstvo, smestaj);
		ArrayList<StringBuilder> aranzmani = new ArrayList<StringBuilder>();
		try {
			Scanner scc = new Scanner(new File("aranzmani.csv"));
			scc.useDelimiter(";");
			while (scc.hasNextLine()) {
				String[] row = scc.nextLine().split(";");
				StringBuilder sb = new StringBuilder();
				for (String string : row) {
//					System.out.println(string);
					sb.append(string);
					sb.append(";");
				}
				aranzmani.add(sb);
			}
			scc.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try (PrintWriter writer = new PrintWriter("aranzmani.csv")) {
			StringBuilder sb = new StringBuilder();
			sb.append(osiguranje);
			sb.append(";");
			sb.append(grupni);
			sb.append(";");
			sb.append(datumPolaska);
			sb.append(";");
			sb.append(datumPovratka);
			sb.append(";");
			sb.append(prevoznoSredstvo);
			sb.append(";");
			sb.append(smestaj);
			sb.append(";");
			System.out.println(sb.toString());
			aranzmani.add(sb);
			for (StringBuilder stringBuilder : aranzmani) {
				writer.write(stringBuilder.toString() + System.getProperty("line.separator"));
			}
			System.out.println("Aranzman je uspesno upisan");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
		
	}

}
