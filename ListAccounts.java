import java.util.ArrayList;
import java.util.InputMismatchException;

public class ListAccounts {

	public void izlistavanjeDetalja(ArrayList<Account> lista) throws InputMismatchException {

		System.out.println("\nIspis detalja o racunu:  ");
		System.out.println("Unesite postojeci broj racuna: ");
		int brojRacuna = MainATM.input.nextInt();

		AccountHandling ops = new AccountHandling();

		if (lista.size() < 1) {
			System.out.println("\nNema kreiranih racuna. Kreirajte racun.");
		} else if (ops.brojRacunaNepostojeci(lista, brojRacuna)) {
			System.out.println("\nBroj racuna koji ste unijeli ne postoji. Probajte ponovo.");
		} else {
			System.out.println("\nBroj racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getBrojRacuna());
			System.out.println("Vlasnik racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getVlasnikRacuna());
			System.out.println("Stanje racuna:  " + lista.get(ops.indexRacuna(lista, brojRacuna)).getStanjeRacuna());
		}

	}

	public void ispisPostojecihRacuna(ArrayList<Account> lista) {
		System.out.println("\nLista svih postojecih racuna: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		System.out.println();
	}
}
