package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		
		
		String ortaMetin  = "ilginizi çekebilir";
		String altMetin = "Vade Süresi"; 
		System.out.println(ortaMetin);	
		System.out.println(altMetin);
		
		
		int vade = 12;
		double dolar = 18.20;
		double dolarBugun = 18.20;
		double dolarDun= 18.20;
		boolean dolarDustuMu = true;
		
		String okYonu = "";
		
		// if else blokları (dolar karşılaştırması)
		if (dolarBugun < dolarDun) { 
			okYonu = "down.svg";
			System.out.println(okYonu);
			
		} 
		else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);

		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu);
		}
		
		String[] krediler = {"Hızlı Kredi","Maaşını Halkbanktan", "Mutlu emeklilik"};
		
		
		
		for (int i = 0; i < krediler.length; i++) {
			System.out.println(krediler[i]);
		}
			
	}

}
