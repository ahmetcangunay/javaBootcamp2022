package vowels;

public class Main {

	public static void main(String[] args) {

		char letter = 'ü';

		char[][] vowels = { { 'A', 'I', 'O', 'U' }, { 'E', 'İ', 'Ö', 'Ü' } };

		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < 4; j++) {

				if (i == 0 && Character.toUpperCase(letter) == vowels[i][j]) {
					System.out.println(letter + " is a back vowel.");
					break;
				} else if (i == 1 && Character.toUpperCase(letter) == vowels[i][j]) {
					System.out.println(letter + " is a front vowel.");
					break;
				}

			}

		}

		// Engin Hoca's Solution
		char harf = 'Ü';

		switch (harf) {
		case 'A':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("Kalın sesli ünlü.");
			break;

		default:
			System.out.println("İnce sesli ünlü.");
			break;
		}

	}

}
