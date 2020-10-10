package oop1_projekat3_2019_270043;

import java.util.ArrayList;

public class Drzava {
	ArrayList<Mesto> mesta = new ArrayList();

	public Drzava() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Drzava(ArrayList<Mesto> mesta) {
		super();
		this.mesta = mesta;
	}

	public ArrayList<Mesto> getMesta() {
		return mesta;
	}

	public void setMesta(ArrayList<Mesto> mesta) {
		this.mesta = mesta;
	}

	@Override
	public String toString() {
		return "Drzava [mesta=" + mesta + "]";
	}
	
	

}
