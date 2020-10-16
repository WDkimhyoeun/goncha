package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository9 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository9 instance = new ProductRepository9();

	public static ProductRepository9 getInstance(){
		return instance;
	} 

	public ProductRepository9() {
	
		Product A58=new Product("A58","허니 레몬티",4300);
		A58.setDescription("달콤하고 상큼한 허니 레몬티안으로 향긋한 생레몬이 어우러진 허니 레몬티 (HOT / ICED)");
		A58.setCategory("후르츠티");
		A58.setManufacturer("공차");
		A58.setUnitsInStock(1000);
		A58.setCondition("New");
		A58.setFilename("a58.jpg");
		
		Product A59=new Product("A59","허니 자몽티",4300);
		A59.setDescription("쌉사름한 달콤함이 가득한 허니 자몽티안으로 향긋한 생자몽이 어우러진 허니 자몽티 (HOT / ICED)​​");
		A59.setCategory("후르츠티");
		A59.setManufacturer("공차");
		A59.setUnitsInStock(1000);
		A59.setCondition("New");
		A59.setFilename("a59.jpg");
		
		
	
		
		
		listOfProducts.add(A58);
		listOfProducts.add(A59);
		
	
		
		
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
