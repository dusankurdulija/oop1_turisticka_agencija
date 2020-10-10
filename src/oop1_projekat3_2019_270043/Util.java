package oop1_projekat3_2019_270043;

import java.util.ArrayList;
import java.util.Scanner;

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
		}
		if(vrednost.equals("2")) {
			System.out.println("Kreiranje paketa");
		}
		if(vrednost.equals("3")) {
			System.out.println("Brisanje arandzmana");
		}
		
		
		
		
	}
	
	public static void klijentMeni() {
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
		}
		if(vrednost.equals("2")) {
			System.out.println("Kreiranje paketa");
		}
		
		if(vrednost.equals("3")) {
			System.out.println("Zakupljivanje paketa");
		}
		
		if(vrednost.equals("4")) {
			System.out.println("Otkazivanje paketa");
		}
	}
	
	public static void login(ArrayList<Klijent> klijenti, ArrayList<Agent> agenti) {
		Scanner sc = new Scanner(System.in);
		System.out.println("---Login---");
		System.out.print("username: ");
		String username = sc.next();
		System.out.print("password: ");
		String password = sc.next();
		
		for (Klijent klijent : klijenti) {
			if (klijent.getUsername().equals(username) && klijent.getPassword().equals(password)) {
				System.out.println("Uspesno ste se ulogovali !");
				Util.klijentMeni();
				break;
			}
		}
		
		for (Agent agent : agenti) {
			if (agent.getUsername().equals(username) && agent.getPassword().equals(password)) {
				System.out.println("Uspesno ste se ulogovali !");
				Util.agentMeni();
				break;
			}
		}

	}
	
	public void kreiranjeAranzmana() {
		
	}

}
