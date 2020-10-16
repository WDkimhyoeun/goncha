package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository12 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository12 instance = new ProductRepository12();

	public static ProductRepository12 getInstance(){
		return instance;
	} 

	public ProductRepository12() {
	
		Product B1=new Product("B1","몬스터 팥빙수",5000);
		B1.setDescription("몬스터 형상을 연상시키는 눈 모양의 초콜릿과 부드러운 우유 얼음에 고소한 19곡물, 쫀득한 펄이 더해진 몬스터 팥 빙수");
		B1.setCategory("빙수");
		B1.setManufacturer("공차");
		B1.setUnitsInStock(1000);
		B1.setCondition("New");
		B1.setFilename("b1.jpg");
		
		Product B2=new Product("B2","몬스터 망고 빙수",5000);
		B2.setDescription("몬스터 형상을 연상시키는 눈 모양의 초콜릿과 리얼 망고, 상큼한 열대과일 베이스를 더하여 망고의 맛을 한층 더 업그레이드 한 몬스터 망고 빙수");
		B2.setCategory("빙수");
		B2.setManufacturer("공차");
		B2.setUnitsInStock(1000);
		B2.setCondition("New");
		B2.setFilename("b2.jpg");
		
		Product B3=new Product("B3","몬스터 슈거 크럼블 빙수",5000);
		B3.setDescription("몬스터 형상을 연상시키는 눈 모양의 초콜릿과 바삭한 식감의 달고나, 브라운슈가를 조화롭게 mix해 단맛을 UP 시킨 몬스터 슈거 크럼블 빙수");
		B3.setCategory("빙수");
		B3.setManufacturer("공차");
		B3.setUnitsInStock(1000);
		B3.setCondition("New");
		B3.setFilename("b3.jpg");

		
		
	
		
		
		listOfProducts.add(B1);
		listOfProducts.add(B2);
		listOfProducts.add(B3);
	

		
	
		
		
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
