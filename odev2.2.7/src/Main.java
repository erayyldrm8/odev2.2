
public class Main {

	public static void main(String[] args) {
		
		KrediUI krediUI=new KrediUI() ;
		
		krediUI.krediHesapla(new OgretmenKrediManage());//BaseKrediManage hepsi tarafından içeriliyor ikisini de yollayabilirsin
		krediUI.krediHesapla(new TarımKrediManager());
		//krediUI.krediHesapla(new AskerKrediManager());
	}

}
