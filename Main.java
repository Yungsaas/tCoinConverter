package tcoinstuffs;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner iScan = new Scanner(System.in);
		Scanner oScan = new Scanner(System.in);
		Scanner lScan = new Scanner(System.in);
		// 1G = 0.0199€
		// 100G = 200 * 0.0199€
		// 500G = 8.99/500€ | 0.01798
		// 1000G = 14.99/1000€ | 0.01499
		// 3000G = 33.99/3000€ | 0.01133

		String waehrung = "init";
		double goldWert = 0;
		double euroWert = 0;
		double tCoins = 0;
		while (!waehrung.equalsIgnoreCase("exit")) {
			System.out.println("Waehrung eingeben");
			waehrung = iScan.next();

			if (waehrung.equalsIgnoreCase("Gold")) {
				System.out.println("Gold eingeben:");
				goldWert = oScan.nextDouble();

				if (goldWert <= 100 && goldWert >= 0) {
					euroWert = goldWert * 0.0199;
					tCoins = euroWert * 100;
				}

				if (goldWert <= 500 && goldWert > 100) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.0199 - 0.01798;
					faktor = (goldWert - 100) / 400;
					euroWert = goldWert * (0.0199 - (faktor * wertDifferenz));
					tCoins = euroWert * 100;
				}

				if (goldWert <= 1000 && goldWert > 500) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01798 - 0.01499;
					faktor = (goldWert - 500) / 500;
					euroWert = goldWert * (0.01798 - (faktor * wertDifferenz));
					tCoins = euroWert * 100;
				}

				if (goldWert <= 3000 && goldWert > 1000) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01499 - 0.01133;
					faktor = (goldWert - 1000) / 2000;
					euroWert = goldWert * (0.01499 - (faktor * wertDifferenz));
					tCoins = euroWert * 100;
				}

				if (goldWert > 3000) {
					euroWert = goldWert * 0.01133;
					tCoins = euroWert * 100;
				}

			}

			if (waehrung.equalsIgnoreCase("Euro")) {
				System.out.println("Euro eingeben:");
				euroWert = iScan.nextDouble();

				if (euroWert <= 1.99 && euroWert >= 0) {
					System.out.println(euroWert);
					goldWert = euroWert / 0.0199;
					System.out.println(goldWert);
				}

				if (euroWert <= 8.99 && euroWert > 1.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.0199 - 0.01798;
					faktor = (euroWert - 1.99) / 7;
					goldWert = euroWert / (0.0199 - (faktor * wertDifferenz));
				}

				if (euroWert <= 14.99 && euroWert > 8.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01798 - 0.01499;
					faktor = (euroWert - 8.99) / 6;
					goldWert = euroWert / (0.01798 - (faktor * wertDifferenz));
				}

				if (euroWert <= 33.99 && euroWert > 14.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01499 - 0.01133;
					faktor = (euroWert - 14.99) / 19;
					goldWert = euroWert / (0.01499 - (faktor * wertDifferenz));
				}

				if (euroWert > 33.99) {
					goldWert = euroWert / 0.01133;
				}
				
				tCoins = euroWert * 100;
			}

			if (waehrung.equalsIgnoreCase("tCoins")) {
				System.out.println("tCoins eingeben:");
				tCoins = lScan.nextDouble();
					euroWert = tCoins/100;
				if (euroWert <= 1.99 && euroWert >= 0) {
					System.out.println(euroWert);
					goldWert = euroWert / 0.0199;
					System.out.println(goldWert);
				}

				if (euroWert <= 8.99 && euroWert > 1.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.0199 - 0.01798;
					faktor = (euroWert - 1.99) / 7;
					goldWert = euroWert / (0.0199 - (faktor * wertDifferenz));
				}

				if (euroWert <= 14.99 && euroWert > 8.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01798 - 0.01499;
					faktor = (euroWert - 8.99) / 6;
					goldWert = euroWert / (0.01798 - (faktor * wertDifferenz));
				}

				if (euroWert <= 33.99 && euroWert > 14.99) {
					double faktor;
					double wertDifferenz;
					wertDifferenz = 0.01499 - 0.01133;
					faktor = (euroWert - 14.99) / 19;
					goldWert = euroWert / (0.01499 - (faktor * wertDifferenz));
				}

				if (euroWert > 33.99) {
					goldWert = euroWert / 0.01133;
				}
				
			}

			System.out.println("Gold: " + goldWert + "\nEuro: " + euroWert + "\ntCoins: " + tCoins);
		}
		oScan.close();
		iScan.close();
		lScan.close();
	}

}
