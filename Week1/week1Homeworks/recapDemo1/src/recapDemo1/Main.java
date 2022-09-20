package recapDemo1;

// Finding max number in the given three numbers.

public class Main {

	public static void main(String[] args) {

		int sayi1 = 320;
		int sayi2 = 256;
		int sayi3 = 28;
		int enBuyukSayi = sayi1;

		if (enBuyukSayi < sayi2) {
			enBuyukSayi = sayi2;
		}
		if (enBuyukSayi < sayi3) {
			enBuyukSayi = sayi3;
		}

		System.out.println("En Büyük Sayı: " + enBuyukSayi);

	}

}
