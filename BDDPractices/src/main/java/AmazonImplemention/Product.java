package AmazonImplemention;

import java.util.ArrayList;
import java.util.List;

public class Product {

	private String product;
	private int price;
	
	public Product(String product, int price) {
		
		this.product = product;
		this.price = price;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public List<String> getProductList()
	{
		List<String> ProductList=new ArrayList<String>();
		ProductList.add("Apple Macbook Pro");
		ProductList.add("Apple Macbook Proplus");
		ProductList.add("Apple iphone 13");
		ProductList.add("Apple iphone 13 Pro");
		return ProductList;
	}
	
}
