import java.util.ArrayList;

public class MoneyTransfer {

	public void transferNovca(ArrayList<Account> lista) {

		AccountHandling handling = new AccountHandling();

		System.out.println("Opcija za prijenos novacnih sredstava...");
		System.out.println("\nUnesite racun sa kojeg placate:  ");
		int isplatniRacun = MainATM.input.nextInt();
		System.out.println("Unesite racun na koji placate:  ");
		int uplatniRacun = MainATM.input.nextInt();
		System.out.println("Unesite iznos za prijenos:  ");
		double iznos = MainATM.input.nextDouble();

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
