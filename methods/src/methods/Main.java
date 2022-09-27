package methods;

public class Main {

	public static void main(String[] args) {

		sayiBulmaca();

	}

	public static void sayiBulmaca() {

		int numbers[] = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int aranacak = 6;
		boolean varMi = false;

		for (int number : numbers) {
			if (number == aranacak) {
				varMi = true;
				break;
			}
		}

		if (varMi) {
			mesajVer("Sayı mevcuttur " + aranacak);

		} else {
			mesajVer("Sayı mevcuttur " + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}

}
