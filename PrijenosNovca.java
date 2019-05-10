import java.util.ArrayList;

public class PrijenosNovca {

	public PrijenosNovca() {

	}

	public void transferNovca(int isplatniRacun, int uplatniRacun, double iznos, ArrayList<Racun> lista) {

		OperacijeSaRacunom handling = new OperacijeSaRacunom();

		if (lista.size() < 1) {
			System.out.println("Nema kreiranih racuna!");
			System.out.println();
		} else if (handling.brojRacunaNepostojeci(lista, isplatniRacun)) {
			System.out.println("Isplatni broj racuna ne postoji ili je trenutno neaktivan!");
			System.out.println();
		} else if (handling.brojRacunaNepostojeci(lista, uplatniRacun)) {
			System.out.println("Uplatni broj racuna ne postoji ili je trenutno neaktivan!");
			System.out.println();
		} else if (handling.saldoNegativan(lista, isplatniRacun)) {
			System.out.println("Stanje na isplatnom racunu je negativno!");
			System.out.println();
		} else if (handling.nedovoljnoSrestava(lista, isplatniRacun, iznos)) {
			System.out.println("Nedovoljno sredstava na racunu za izvrsavanje transakcije!");
			System.out.println();
		} else {

			lista.get(handling.indexRacuna(lista, isplatniRacun))
					.setStanjeRacuna((lista.get(handling.indexRacuna(lista, isplatniRacun)).getStanjeRacuna()) - iznos);

			lista.get(handling.indexRacuna(lista, uplatniRacun))
					.setStanjeRacuna((lista.get(handling.indexRacuna(lista, uplatniRacun)).getStanjeRacuna()) + iznos);
			System.out.println();
			System.out.println("Prijenos novca je uspjesno izvrsen.");
			System.out.println();
		}
	}

}
