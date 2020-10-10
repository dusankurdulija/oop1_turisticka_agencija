package oop1_projekat3_2019_270043;

public class Mesto {
	private Drzava drzava;

	public Mesto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Mesto(Drzava drzava) {
		super();
		this.drzava = drzava;
	}

	public Drzava getDrzava() {
		return drzava;
	}

	public void setDrzava(Drzava drzava) {
		this.drzava = drzava;
	}

	@Override
	public String toString() {
		return "Mesto [drzava=" + drzava + "]";
	}
	
	

}
