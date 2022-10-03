
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager1;// = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager1 = customerManager2;

		customerManager1.add();
		customerManager1.remove();
		customerManager1.update();

		// value type
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		System.out.println(sayi2);
		
		System.out.println("---");
		
		int[] sayilar = new int[] { 1, 2, 3 };
		int[] sayilar2 = new int[] { 4, 5, 6 };
		sayilar2=sayilar;
		sayilar[0]=10;
		for(int a:sayilar) {
			System.out.println(a);
		}
		System.out.println("---");
		for(int b:sayilar2) {
			System.out.println(b);
		}
		
	}

}
