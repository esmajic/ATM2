import java.util.ArrayList;

public class AccountHandling {

	public AccountHandling() {

	}

	public boolean saldoNegativan(ArrayList<Account> lista, int brojRacuna) {
		if (lista.get(indexRacuna(lista, brojRacuna)).getStanjeRacuna() < 0) {
			return true;
		}
		return false;

	}

	public boolean brojRacunaNepostojeci(ArrayList<Account> lista, int brojRacuna) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getBrojRacuna() == brojRacuna) {
				return false;
			}
		}
		return true;

	}

	public int indexRacuna(ArrayList<Account> lista, int brojRacuna) {
		int i = 0;
		for (i = 0; i < lista.size(); i++) {
			if (lista.get(i).getBrojRacuna() == brojRacuna) {
				return i;
			}
		}
		return i;
	}

	public boolean nedovoljnoSrestava(ArrayList<Account> lista, int brojRacuna, double iznos) {
		if ((lista.get(indexRacuna(lista, brojRacuna)).getStanjeRacuna() - iznos) < 0) {
			return true;
		}
		return false;
	}
}
