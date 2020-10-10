package oop1_projekat3_2019_270043;

import java.util.ArrayList;
import java.util.Scanner;
import oop1_projekat3_2019_270043.Util;

public class Aplikacija {

	public static void main(String[] args) {
		ArrayList<Agent> agenti = new ArrayList<Agent>();
		ArrayList<Klijent> klijenti = new ArrayList<Klijent>();
		
		Agent a1 = new Agent("Dragan", "Dragic", "dragan", "dragan");
		Agent a2 = new Agent("Mika", "Mitic", "mika", "mika");
		Agent a3 = new Agent("Jova", "Jovic", "jova", "jova");
		
		Klijent k1 = new Klijent("Djole", "Djolic", "djole", "djole", 0);
		Klijent k2 = new Klijent("Nikola", "Nikolic", "nikola", "nikola", 0);
		Klijent k3 = new Klijent("Pera", "Peric", "pera", "pera", 0);
		
		agenti.add(a1);
		agenti.add(a2);
		agenti.add(a3);
		
		klijenti.add(k1);
		klijenti.add(k2);
		klijenti.add(k3);
		
		Util.login(klijenti, agenti);

	}

}
