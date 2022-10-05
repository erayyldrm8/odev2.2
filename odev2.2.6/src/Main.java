
public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();

		System.out.println(dortislem.topla(2, 3));
		System.out.println(dortislem.topla(2, 3, 4));//overloading
		
		System.out.println("----------");
			
		//Inheritance
		
		Customer customer=new Customer();
		customer.name="Ali";
		customer.surName="Özdemir";
		customer.e_mail="asadasdsad@gmail.com";
		
		Employee employee=new Employee();
		employee.name="Veli";
		employee.surName="Öztürk";
		employee.salary=5999.95;
		
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		customerManager.add();
		customerManager.list();
		customerManager.bestCustomer();
		
		employeeManager.add();
		employeeManager.bestEmployee();
		
		
	}

}
