import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Main {

	public static void main(String[] args) {

		// -----------------------------------------PART 1-----------------------------------------

		String mesaj = "Bugün hava çok güzel.";
		System.out.println(mesaj);

		// Karakter Sayısını Ekrana Yazdırma
		System.out.println("Karakter Sayısı: " + mesaj.length());

		// 5. Karakteri Ekrana Yazdırma
		System.out.println("5. Karakter: " + mesaj.charAt(4));

		// Metin Birleştirme
		System.out.println(mesaj.concat(" Yaşasın!"));

		// Metin Belirtilen String ile Başlıyor(Bitiyor) mu?
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));

		// Belirli Index Aralığındaki Karakterleri Alma
		char[] characters = new char[5];
		// getChars metodunda srcEnd parametresinde girilen index dahildir.
		mesaj.getChars(0, 5, characters, 0);
		System.out.println(characters);

		// Belirtilen Karakterin Kaçıncı Indexte Olduğunu Bulma
		System.out.println(mesaj.indexOf("av"));

		// lastIndexOf Metodu Aramaya Sağdan Başlar ama Index Numarasını Soldaki Gibi
		// Verir.
		System.out.println(mesaj.lastIndexOf('e'));

		// -----------------------------------------PART 2-----------------------------------------

		// Harfleri (veya Kelimeleri) Değiştirme
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);

		// Bir Metnin İçerisinden Parça Alma İşlemi
		System.out.println(mesaj.substring(2, 5));

		// Cümleyi Kelimelere Ayırma Işlemi
		for (String word : mesaj.split(" ")) {

			System.out.println(word);

		}

		// Kelimeleri Küçük Harfe Dönüştürme
		System.out.println(mesaj.toLowerCase());
		System.out.println(mesaj.toUpperCase());
		
		//Metnin Başındaki ve Sonundaki Boşlukları Kaldırma
		System.out.println(mesaj.trim());
	}

}
