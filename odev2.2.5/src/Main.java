
public class Main {

	public static void main(String[] args) {
		DortIslem dortislem = new DortIslem();
		System.out.println(dortislem.topla(2, 5));

		Product product1 = new Product();
		product1.name = "Laptop";
		product1.description = "Asus Laptop";
		product1.price = 5999.90;
		product1.stockAmount = 50;
		System.out.println(product1.name);
		
		ProductManager productManager=new ProductManager();
		productManager.ekle(product1);

		

	}

}
