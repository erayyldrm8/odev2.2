
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
		customerManager=customerManager2;
		
		customerManager.add();
		customerManager.remove();
		customerManager.update();
	}

}
