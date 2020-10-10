package oop1_projekat3_2019_270043;

public class Hotel extends Smestaj {
	private int brojZvezdica;

	public Hotel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Hotel(int brojZvezdica) {
		super();
		this.brojZvezdica = brojZvezdica;
	}

	public int getBrojZvezdica() {
		return brojZvezdica;
	}

	public void setBrojZvezdica(int brojZvezdica) {
		this.brojZvezdica = brojZvezdica;
	}

	@Override
	public String toString() {
		return "Hotel [brojZvezdica=" + brojZvezdica + "]";
	}
	
	

}
