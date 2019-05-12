import java.util.ArrayList;
import java.util.Scanner;

public class MainATM {

	public static Scanner input = new Scanner(System.in);
	public static ArrayList<Account> lista = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		
		int option;

		do {
			System.out.println("\n===============================================");
			System.out.println("=          Dobro dosli na nas Bankomat         =");
			System.out.println("===============================================");

			System.out.println("\nUnesite 1 za kreiranje racuna");
			System.out.println("Unesite 2 za prijenos novca");
			System.out.println("Unesite 3 za provjeru statusa racuna");
			System.out.println("Unesite 4 za ispis svih racuna");
			System.out.println("Unesite 0 za izlaz iz aplikacije");
			System.out.println();
			System.out.println("Molimo unesite broj zeljene opcije: ");

			option = input.nextInt();

			if (option == 1) {

				CreateAccount racun = new CreateAccount();

				racun.kreiratiRacun(lista);

			} else if (option == 2) {

				MoneyTransfer transfer = new MoneyTransfer();

				transfer.transferNovca(lista);

			} else if (option == 3) {

				ListAccounts status = new ListAccounts();

				status.izlistavanjeDetalja(lista);

			} else if (option == 4) {
				ListAccounts print = new ListAccounts();

				print.ispisPostojecihRacuna(lista);
			}

		} while (option != 0);

		System.out.println("\nIzabrali ste izlaz iz aplikacije. Dovidjenja.");

		input.close();

	}

}
