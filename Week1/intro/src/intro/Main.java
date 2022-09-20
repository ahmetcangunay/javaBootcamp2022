package intro;

public class Main {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		// Değişken isimlendirmeleri java'da camelCase ile yazılır.
		String ortaMetin = "İlginizi Çekebilir";
		String altMetin = "Vade Süresi";

		System.out.println(ortaMetin);

		// integer
		int vade = 12;

		// double
		double dolarDun = 18.15;
		double dolarBugun = 18.25;

		// boolean
		boolean dolarDustuMu = false;

		String okYonu = "";

		// if statements
		if (dolarBugun < dolarDun) { // true

			okYonu = "down.svg";
			System.out.println(okYonu);

		} else if (dolarBugun > dolarDun) {

			okYonu = "up.svg";
			System.out.println(okYonu);

		}

		else {

			okYonu = "equal.svg";
			System.out.println(okYonu);

		}

		// array
		String[] krediler = { "Hızlı Kredi", "Maaşını Halkbank'tan Alanlar", "Mutlu Emekli" };

		// for loop
		for (int i = 0; i < krediler.length; i++) {

			System.out.println(krediler[i]);

		}

	}

}
