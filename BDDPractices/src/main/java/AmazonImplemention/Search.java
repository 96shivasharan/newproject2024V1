package AmazonImplemention;

public class Search {
	
	public String dispalyproduct(Product product)
	{
		if(product.getProductList().contains(product.getProduct()))
		{
			return product.getProduct();
		}
			return null;
	}

}
