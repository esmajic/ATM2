import java.util.ArrayList;

public class KreiranjeRacuna {

	ArrayList<Racun> lista = new ArrayList<>();

	public KreiranjeRacuna() {

	}

	public void kreiratiRacun(ArrayList<Racun> lista) {

		System.out.println("");
		System.out.println("Kreiranje bankovnog racuna...");
		System.out.println("");
		// System.out.println("Unesite neki petocifreni broj: ");
		int brojRacuna = (int) (Math.random() * 100000) + 1;
		MainBankomat.input.nextLine();
		System.out.println("Unesite ime vlasnika racuna:  ");
		String vlasnikRacuna = MainBankomat.input.nextLine();
		System.out.println("Unesite saldo racuna:  ");
		double stanjeRacuna = MainBankomat.input.nextDouble();

		Racun racuni = new Racun(brojRacuna, vlasnikRacuna, stanjeRacuna);

		lista.add(racuni);

		System.out.println("Racun broj " + brojRacuna + " je uspjesno kreiran.");
		System.out.println();

	}

}
