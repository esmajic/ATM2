import java.util.ArrayList;

public class Account {
	private int brojRacuna;
	private String vlasnikRacuna;
	private double stanjeRacuna;
	ArrayList<Account> lista = new ArrayList<>();

	Account(int brojRacuna, String vlasnikRacuna, double stanjeRacuna) {
		this.vlasnikRacuna = vlasnikRacuna;
		this.stanjeRacuna = stanjeRacuna;
		this.brojRacuna = brojRacuna;
		lista.add(this);
	}

	public int getBrojRacuna() {
		return brojRacuna;
	}

	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}

	public String getVlasnikRacuna() {
		return vlasnikRacuna;
	}

	public void setVlasnikRacuna(String vlasnikRacuna) {
		this.vlasnikRacuna = vlasnikRacuna;
	}

	public double getStanjeRacuna() {
		return stanjeRacuna;
	}

	public void setStanjeRacuna(double stanjeRacuna) {
		this.stanjeRacuna = stanjeRacuna;
	}

	@Override
	public String toString() {
		return "Racun [Broj racuna = " + brojRacuna + ", Vlasnik racuna = " + vlasnikRacuna + ", Saldo racuna = "
				+ stanjeRacuna + "]";
	}

}
