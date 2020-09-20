package entities;

public class Product implements Comparable<Product>{

	private String name;
	private Double price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + this.name + ", price=" + this.price + "]";
	}
	
	@Override
	public int compareTo(Product other) {
		return this.name.toUpperCase().compareTo(other.name.toUpperCase());
	}

}
