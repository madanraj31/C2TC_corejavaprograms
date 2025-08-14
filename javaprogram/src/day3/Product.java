package day3;

public class Product {
	
	private int pid;
	private float price;
	private String product_name;
	
	 public Product() {  // default constructor
		 this.pid = 101;
	     this.product_name = "keyboard";
	     this.price = 245.6f;
	 }

	 public Product(int pid, String product_name, float price) {  // parameterized constructor
		 this.pid = pid;
	     this.product_name = product_name;
	     this.price = price;
	 }
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	@Override
	public String toString() {
		return "Product [pid=" + pid + ", price=" + price + ", product_name=" + product_name + "]";
	}
}
