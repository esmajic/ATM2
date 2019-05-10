import java.util.ArrayList;

public class OperacijeSaRacunom {

	public OperacijeSaRacunom() {

	}

	public boolean saldoNegativan(ArrayList<Racun> lista, int brojRacuna) {
		if (lista.get(indexRacuna(lista, brojRacuna)).getStanjeRacuna() < 0) {
			return true;
		}
		return false;

	}

	public boolean brojRacunaNepostojeci(ArrayList<Racun> lista, int brojRacuna) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i).getBrojRacuna() == brojRacuna) {
				return false;
			}
		}
		return true;

	}

	public int indexRacuna(ArrayList<Racun> lista, int brojRacuna) {
		int i = 0;
		for (i = 0; i < lista.size(); i++) {
			if (lista.get(i).getBrojRacuna() == brojRacuna) {
				return i;
			}
		}
		return i;
	}

	public boolean nedovoljnoSrestava(ArrayList<Racun> lista, int brojRacuna, double iznos) {
		if ((lista.get(indexRacuna(lista, brojRacuna)).getStanjeRacuna() - iznos) < 0) {
			return true;
		}
		return false;
	}
}
