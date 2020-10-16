package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository7 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository7 instance = new ProductRepository7();

	public static ProductRepository7 getInstance(){
		return instance;
	} 

	public ProductRepository7() {
	
		
		Product A43=new Product("A43","망고 주스",4600);
		A43.setDescription("농축된 달콤한 망고의 입자가 느껴지는 달콤한 망고 주스");
		A43.setCategory("주스&요구르트");
		A43.setManufacturer("공차");
		A43.setUnitsInStock(1000);
		A43.setCondition("New");
		A43.setFilename("a43.png");
		
		Product A44=new Product("A44","망고 요구르트",5000);
		A44.setDescription("농축된 달콤한 망고의 입자와 새콤한 요구르트의 조합, 망고 요구르트");
		A44.setCategory("주스&요구르트");
		A44.setManufacturer("공차");
		A44.setUnitsInStock(1000);
		A44.setCondition("New");
		A44.setFilename("a44.jpg");
		
		Product A45=new Product("A45","레몬 요구르트",4500);
		A45.setDescription("레몬 과육과 요구르트 농축액을 믹스한 새콤달콤한 레몬 요구르트");
		A45.setCategory("주스&요구르트");
		A45.setManufacturer("공차");
		A45.setUnitsInStock(1000);
		A45.setCondition("New");
		A45.setFilename("a45.jpg");
		
	

		
		
		listOfProducts.add(A43);
		listOfProducts.add(A44);
		listOfProducts.add(A45);
	
		
		
	}

	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	
	public Product getProductById(String productId) {
		Product productById = null;

		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if (product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		return productById;
	}
	
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
}
