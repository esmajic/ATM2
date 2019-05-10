import java.util.ArrayList;

public class ListingRacuna {

	public ListingRacuna() {

	}

	public void izlistavanjeDetalja(ArrayList<Racun> lista, int brojRacuna) {

		OperacijeSaRacunom ops = new OperacijeSaRacunom();

		if (lista.size() < 1) {
			System.out.println("Nema kreiranih racuna. Kreirajte racun.");
			System.out.println();

		} else if (ops.brojRacunaNepostojeci(lista, brojRacuna)) {
			System.out.println("Broj racuna koji ste unijeli ne postoji. Probajte ponovo.");
			System.out.println();

		} else {

			System.out.println("Broj racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getBrojRacuna());
			System.out.println("Vlasnik racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getVlasnikRacuna());
			System.out.println("Stanje racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getStanjeRacuna());

			System.out.println();
		}

	}

	public void ispisPostojecihRacuna(ArrayList<Racun> lista) {
		System.out.println();
		System.out.println("Lista svih postojecih racuna: ");
		System.out.println();
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}System.out.println();
	}
}
