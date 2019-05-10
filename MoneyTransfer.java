import java.util.ArrayList;

public class MoneyTransfer {

	public MoneyTransfer() {

	}

	public void transferNovca(int isplatniRacun, int uplatniRacun, double iznos, ArrayList<Account> lista) {

		AccountHandling handling = new AccountHandling();

		if (lista.size() < 1) {
			System.out.println("\nNema kreiranih racuna!");

		} else if (handling.brojRacunaNepostojeci(lista, isplatniRacun)) {
			System.out.println("\nIsplatni broj racuna ne postoji ili je trenutno neaktivan!");

		} else if (handling.brojRacunaNepostojeci(lista, uplatniRacun)) {
			System.out.println("\nUplatni broj racuna ne postoji ili je trenutno neaktivan!");

		} else if (handling.saldoNegativan(lista, isplatniRacun)) {
			System.out.println("\nStanje na isplatnom racunu je negativno!");

		} else if (handling.nedovoljnoSrestava(lista, isplatniRacun, iznos)) {
			System.out.println("\nNedovoljno sredstava na racunu za izvrsavanje transakcije!");

		} else {

			lista.get(handling.indexRacuna(lista, isplatniRacun))
					.setStanjeRacuna((lista.get(handling.indexRacuna(lista, isplatniRacun)).getStanjeRacuna()) - iznos);

			lista.get(handling.indexRacuna(lista, uplatniRacun))
					.setStanjeRacuna((lista.get(handling.indexRacuna(lista, uplatniRacun)).getStanjeRacuna()) + iznos);
			System.out.println("\nPrijenos novca je uspjesno izvrsen.");

		}
	}

}
