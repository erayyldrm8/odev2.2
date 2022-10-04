
public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		System.out.println(dortislem.topla(2, 5));

		//Product product1 = new Product();
		Product product1 = new Product(1,"Laptop","Asus Laptop",5999.90,50,"red");
		
		/*product1.name = "Laptop";
		product1.description = "Asus Laptop";
		product1.price = 5999.90;
		product1.stockAmount = 50;
		System.out.println(product1.name);*/
		
		/*product1.set_name("Laptop");			//ister böyle ister 9. satırdaki gibi yap
		product1.set_id(1);
		product1.set_description("Asus Laptop");
		product1.set_price(5999.90);
		product1.set_stockAmount(50);*/
		
		System.out.println(product1.get_name());
		System.out.println(product1.get_kod());	//sadece get
		
		ProductManager productManager=new ProductManager();
		productManager.ekle(product1);

		

	}

}
