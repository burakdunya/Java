 package intro;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hello World..!");
	
		//değişken isimlendirmeleri java'da camelCase yazılır	
		String metin="burak";
		String ortaMetin="İlginizi Çekebilir";
		
		System.out.println(metin);
		System.out.println(ortaMetin);
		
		// integer=tamsayı
		int vade=12;
		 
		double dolarDun = 18.20;
		double dolarBugun = 18.10;
		
		boolean dolarDustuMu = false; //true ya da false 
		
		String okYonu ="";
		
		if (dolarBugun<dolarDun) { //true
			okYonu = "down.svg";
			System.out.println(okYonu);			
			
		} else if(dolarBugun>dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {
			okYonu = "equal.svg";
			System.out.println(okYonu); 
		}
		
		//array
		
		String[] krediler = {"Hızlı Kredi","X kredi","Y kredi"};
		
		/*
		System.out.println(krediler[0]);
		System.out.println(krediler[1]);
		System.out.println(krediler[2]);
		*/
		for(int i = 0; i<krediler.length; i++) {
			System.out.println(krediler[i]);
		}
		
		
		
		
		
		
		
	}

}
