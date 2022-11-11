package homework2;

public class Main {

	public static void main(String[] args) {
		
		String mesaj = "bugün hava çok güzel";
		String yeniMesaj = sehiVer();
		System.out.println(yeniMesaj);
		int sayi = topla(5, 7);
		System.out.println(sayi);
		int toplam = topla2(2,3,4,5,6);
		System.out.println(toplam);
	}
	
	//metodları anlamak
    /*
	public static void sayıBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMı = true;
				break;
			}
		}
		if (varMı) {
			mesajVer("sayı mevcuttur: " + aranacak);
		} else {
			mesajVer("sayı mevcut değildir: " + aranacak);
		}
	}
	
	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
		
	}
	*/
	
	 //parametreli metodları anlamak
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	
	public static void sil() {
		System.out.println("Silindi");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int sayi1,int sayi2) {
		return sayi1+sayi2;
	}
	
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		
		return toplam;
	}
	
	public static String sehiVer() {
		return "Ankara";
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
