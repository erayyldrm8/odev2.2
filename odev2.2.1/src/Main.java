
public class Main {			//class PascalCase

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sayiBulmaca();
		
		
	}
	public static void sayiBulmaca() { 	//method(fonksiyon) camelCase
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 7;
		boolean varMı = false;

		for (int sayi : sayilar) {
			if (aranacak == sayi) {
				varMı = true;
				break;
			}
		}
		if(varMı)
			mesajVer(aranacak + " sayısı sayilar dizisinde var");
		else
			mesajVer(aranacak + " sayısı sayilar dizisinde yoktur");
		
	}
	public static void mesajVer(String mesaj) //parametreli fonksiyon
	{
		System.out.println(mesaj);
	}
}
