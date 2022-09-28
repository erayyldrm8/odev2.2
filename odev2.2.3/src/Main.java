
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int t = topla(2, 3);
		writeInt(t);

		int m = topla2(2, 3, 5, 7, 8);// variable arguments
		writeInt(m);
	}

	public static int topla(int a, int b) {
		int toplam = a + b;
		return toplam;
	}

	public static int topla2(int... sayilar) { // ... (variable arguments) sayilar'ı array yapıyo ve istediğin kadar
												// gönderebiliyon
		int toplam2 = 0;
		for (int x : sayilar) {
			toplam2 += x;
		}

		return toplam2;
	}

	public static void writeInt(int messageToWriteInt) {
		System.out.println(messageToWriteInt);
	}

}
