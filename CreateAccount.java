import java.util.ArrayList;

public class CreateAccount {

	ArrayList<Account> lista = new ArrayList<>();

	public CreateAccount() {

	}

	public void kreiratiRacun(ArrayList<Account> lista) {

		System.out.println("");
		System.out.println("Kreiranje bankovnog racuna...");
		System.out.println("");
		// System.out.println("Unesite neki petocifreni broj: ");
		int brojRacuna = (int) (Math.random() * 100000) + 1;
		MainATM.input.nextLine();
		System.out.println("Unesite ime vlasnika racuna:  ");
		String vlasnikRacuna = MainATM.input.nextLine();
		System.out.println("Unesite saldo racuna:  ");
		double stanjeRacuna = MainATM.input.nextDouble();

		Account racuni = new Account(brojRacuna, vlasnikRacuna, stanjeRacuna);

		lista.add(racuni);

		System.out.println("Racun broj " + brojRacuna + " je uspjesno kreiran.");
		System.out.println();

	}

}
