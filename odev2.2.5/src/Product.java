
public class Product {
	
	public Product()////constructor classla aynı isimde , 9.satır ile overloading yapılabilir
	{
		System.out.println("yapıcı blok çalıştı");
	}
	
	public Product(int _id,String _name,String _description,double _price,int _stockAmount,String _renk)//overloading
	{
		System.out.println("yapıcı blok çalıştı");
		this._id=_id;		//sadece set yapıyo, getters oluşturmak lazım
		this._name=_name;
		this._description=_description;
		this._price=_price;
		this._stockAmount=_stockAmount;
		this._renk=_renk;
	}
	
	
	// class field/attribute
	private int _id;// private sadece içinde olduğu{} da çağırılabilir
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _renk;
	private String _kod;
	
	
	public int get_id() // read only için sadece get kullanılır
	{
		return _id;
	}

	public void set_id(int _id) {
		this._id = _id;	//this. bu classtaki demek
	}

	public String get_name() {
		return _name;
	}

	public void set_name(String _name) {
		this._name = _name;
	}

	public String get_description() {
		return _description;
	}

	public void set_description(String _description) {
		this._description = _description;
	}

	public double get_price() {
		return _price;
	}

	public void set_price(double _price) {
		this._price = _price;
	}

	public int get_stockAmount() {
		return _stockAmount;
	}

	public void set_stockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String get_renk() {
		return _renk;
	}

	public void set_renk(String _renk) {
		this._renk = _renk;
	}

	public String get_kod()// read only için sadece get kullanılır
	{
		return this._name.substring(0,1)+this._id;
	}

	/*public void set_kod(String _kod) {
		this._kod = _kod;
	}*/

	

}
