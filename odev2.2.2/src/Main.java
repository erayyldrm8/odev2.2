
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mesaj = "Bugün hava çok güzel.";
		write0to2(mesaj);
		
		String cropped=sıfırdanIkiyeKes(mesaj);
		write(cropped);
		
		int t=topla(2, 30);
		writeInt(t);

	}

	public static void write0to2(String writeMessage) {
		String yeniMesaj = writeMessage.substring(0, 2);
		System.out.println(yeniMesaj);
	}

	public static String sıfırdanIkiyeKes(String messageToCrop) {
		String croppedMessage = messageToCrop.substring(0, 2);
		return croppedMessage;
	}
	
	public static int topla(int a, int b) {
		int toplam=a+b;
		return toplam;
	}
	
	public static void write(String messageToWrite) {
		System.out.println(messageToWrite);
	}
	public static void writeInt(int messageToWriteInt) {
		System.out.println(messageToWriteInt);
	}

}
