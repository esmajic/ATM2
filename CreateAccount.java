import java.util.ArrayList;
import java.util.InputMismatchException;

public class CreateAccount {

	public void kreiratiRacun(ArrayList<Account> lista) throws InputMismatchException {
		try {
			System.out.println("\nKreiranje bankovnog racuna...");
			int brojRacuna = (int) (Math.random() * 100000) + 1;
			MainATM.input.nextLine();
			System.out.println("Unesite ime vlasnika racuna:  ");
			String vlasnikRacuna = MainATM.input.nextLine();
			System.out.println("Unesite saldo racuna:  ");
			double stanjeRacuna = MainATM.input.nextDouble();

			Account racuni = new Account(brojRacuna, vlasnikRacuna, stanjeRacuna);
			lista.add(racuni);

			System.out.println("\nRacun broj " + brojRacuna + " je uspjesno kreiran.");
		} catch (InputMismatchException e) {
			System.out.println("Nastala je greska! Unesen je pogresan tip podataka. Pokusajte ponovo.");
		}
	}

}
