package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository6 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository6 instance = new ProductRepository6();

	public static ProductRepository6 getInstance(){
		return instance;
	} 

	public ProductRepository6() {
	
		
		Product A40=new Product("A40","자몽 그린티 에이드",4300);
		A40.setDescription("달콤하고 쌉싸름한 자몽과 로즈마리가 만드는 새로운 하모니의 그린티에이드 (ONLY ICED)");
		A40.setCategory("�쓬猷�");
		A40.setManufacturer("怨듭감");
		A40.setUnitsInStock(1000);
		A40.setCondition("New");
		A40.setFilename("a40.jpg");
		
		Product A41=new Product("A41","망고 그린티 에이드",4300);
		A41.setDescription("시원하고 청량한 그린티 에이드와 달콤한 망고가 조화로운 망고 그린티 에이드 (ONLY ICED)");
		A41.setCategory("�쓬猷�");
		A41.setManufacturer("怨듭감");
		A41.setUnitsInStock(1000);
		A41.setCondition("New");
		A41.setFilename("a41.jpg");
		
		Product A42=new Product("A42","청포도 그린티 에이드",4300);
		A42.setDescription("쌉싸름한 그린티에 상큼한 청포도 넣어 청량하고 달콤한 그린티 에이드(ONLY ICED)");
		A42.setCategory("�쓬猷�");
		A42.setManufacturer("怨듭감");
		A42.setUnitsInStock(1000);
		A42.setCondition("New");
		A42.setFilename("a42.jpg");
		
	

		
		
		listOfProducts.add(A40);
		listOfProducts.add(A41);
		listOfProducts.add(A42);
	
		
		
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
