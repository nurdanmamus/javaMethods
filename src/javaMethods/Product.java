package javaMethods;

public class Product {
	
	//Constructor
	public Product() {
		
	}
	
	//overloading
    public Product(int id, String name, String description, double price,int stockAmount, String kod) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockAmount = stockAmount;
		this.kod = kod;
	}
	
	//attribute, field
	private int id;
	private String name;
	private String description;
	private double price;
	private int stockAmount;
	private String kod;

	//getter
	public int getId() {
		return id;
	}
	//setter
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	/**
	 * @return the _stockAmount
	 */
	public int getStockAmount() {
		return stockAmount;
	}
	/**
	 * @param _stockAmount the _stockAmount to set
	 */
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	/**
	 * @return the _kod
	 */
	public String getKod() {
		return this.name.substring(0,1) + id;
	}



}
