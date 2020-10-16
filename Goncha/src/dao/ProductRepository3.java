package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository3 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository3 instance = new ProductRepository3();

	public static ProductRepository3 getInstance(){
		return instance;
	} 

	public ProductRepository3() {
	
		
		Product A28=new Product("A28","자스민 그린티",3500);
		A28.setDescription("향긋한 자스민 꽃잎을 함께 우려내는 그린티 (HOT / ICED)");
		A28.setCategory("오리지널 티");
		A28.setManufacturer("공차");
		A28.setUnitsInStock(1000);
		A28.setCondition("New");
		A28.setFilename("a28.jpg");
		
		Product A29=new Product("A29","우롱티",3500);
		A29.setDescription("묵직하고 깊은 향을 간직한 고소한 우롱차(HOT / ICED)");
		A29.setCategory("오리지널 티");
		A29.setManufacturer("공차");
		A29.setUnitsInStock(1000);
		A29.setCondition("New");
		A29.setFilename("a29.jpg");
		
		Product A30=new Product("A30","블랙티",3500);
		A30.setDescription("진한 향과 감미로운 맛을 느낄 수 있는 대표적인 홍차,블랙티(HOT / ICED)");
		A30.setCategory("오리지널 티");
		A30.setManufacturer("공차");
		A30.setUnitsInStock(1000);
		A30.setCondition("New");
		A30.setFilename("a30.jpg");
		
		Product A31=new Product("A31","얼그레이티",3500);
		A31.setDescription("향긋한 베르가못향이 가미된 얼그레이티 (HOT / ICED)");
		A31.setCategory("오리지널 티");
		A31.setManufacturer("공차");
		A31.setUnitsInStock(1000);
		A31.setCondition("New");
		A31.setFilename("a31.jpg");
		
		
		
		
	
		
		
		listOfProducts.add(A28);
		listOfProducts.add(A29);
		listOfProducts.add(A30);
		listOfProducts.add(A31);
	
		
		
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
