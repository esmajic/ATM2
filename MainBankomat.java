import java.util.ArrayList;
import java.util.Scanner;

public class MainBankomat {

	public static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		ArrayList<Racun> lista = new ArrayList<>();

		int brojRacuna, uplatniRacun, isplatniRacun;
		int option;
		double iznos;

		do {

			System.out.println("===============================================");
			System.out.println("=          Dobro dosli na nas Bankomat         =");
			System.out.println("===============================================");
			System.out.println();

			System.out.println("Unesite 1 za kreiranje racuna");
			System.out.println("Unesite 2 za prijenos novca");
			System.out.println("Unesite 3 za provjeru statusa racuna");
			System.out.println("Unesite 4 za ispis svih racuna");
			System.out.println("Unesite 0 za izlaz iz aplikacije");
			System.out.println();
			System.out.println("Molimo unesite broj zeljene opcije: ");

			option = input.nextInt();

			if (option == 1) {
				KreiranjeRacuna racun = new KreiranjeRacuna();

				racun.kreiratiRacun(lista);

			} else if (option == 2) {
				System.out.println("Prijenos novacnih sredstava...");
				System.out.println("");
				System.out.println("Unesite racun sa kojeg placate:  ");
				isplatniRacun = input.nextInt();
				System.out.println("Unesite racun na koji placate:  ");
				uplatniRacun = input.nextInt();
				System.out.println("Unesite iznos za prijenos:  ");
				iznos = input.nextDouble();

				PrijenosNovca transfer = new PrijenosNovca();

				transfer.transferNovca(isplatniRacun, uplatniRacun, iznos, lista);

			} else if (option == 3) {
				System.out.println("Detalji o racunu:  ");
				System.out.println();
				System.out.println("Unesite postojeci broj racuna: ");
				brojRacuna = input.nextInt();

				ListingRacuna status = new ListingRacuna();

				status.izlistavanjeDetalja(lista, brojRacuna);
				System.out.println();

			} else if (option == 4) {
				ListingRacuna print = new ListingRacuna();

				print.ispisPostojecihRacuna(lista);
			}

		} while (option != 0);

		System.out.println();
		System.out.println("Izabrali ste izlaz iz aplikacije.");

		input.close();
	}

}
