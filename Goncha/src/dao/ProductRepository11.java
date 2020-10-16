package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository11 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository11 instance = new ProductRepository11();

	public static ProductRepository11 getInstance(){
		return instance;
	} 

	public ProductRepository11() {
	
		Product A68=new Product("A68","아메리카노",3500);
		A68.setDescription("브라질, 콜롬비아 외 대표적인 원두 4가지를 블렌딩하여 찾은 최적의 맛 (HOT / ICED)​");
		A68.setCategory("커피");
		A68.setManufacturer("공차");
		A68.setUnitsInStock(1000);
		A68.setCondition("New");
		A68.setFilename("a68.jpg");
		
		Product A69=new Product("A69","얼그레이 아메리카노",3500);
		A69.setDescription("향긋한 베르가모트 향의 얼그레이티와 아메리카노의 색다른 조화(HOT/ ICED)");
		A69.setCategory("커피");
		A69.setManufacturer("공차");
		A69.setUnitsInStock(1000);
		A69.setCondition("New");
		A69.setFilename("a69.jpg");
		
		Product A70=new Product("A70","카페라떼",4000);
		A70.setDescription("진하고 부드러운 공차의 새로운 커피 (HOT / ICED)​");
		A70.setCategory("커피");
		A70.setManufacturer("공차");
		A70.setUnitsInStock(1000);
		A70.setCondition("New");
		A70.setFilename("a70.jpg");

		Product A71=new Product("A71","딥모카 카페라뗴",4500);
		A71.setDescription("카카오 함량이 높은 초콜렛 파우더를 사용하여 진한 풍미와 커피가 더해진 모카로 공차만의 밀크폼을 올려 달콤하게 즐기는 커피 음료");
		A71.setCategory("커피");
		A71.setManufacturer("공차");
		A71.setUnitsInStock(1000);
		A71.setCondition("New");
		A71.setFilename("a71.png");
		
		Product A72=new Product("A72","딥바닐라 카페라떼",4500);
		A72.setDescription("진한 커피에 마다가스카르산 바닐라빈이 더해져 달콤하고 깊은 풍미를 느낄 수 있는 공차만의 커피 음료");
		A72.setCategory("커피");
		A72.setManufacturer("공차");
		A72.setUnitsInStock(1000);
		A72.setCondition("New");
		A72.setFilename("a72.png");

		Product A73=new Product("A73","더블 그린 카페라떼",4300);
		A73.setDescription("제주산 녹차로 만든 말차 라떼에 커피와 밀크폼을 더한 더블 그린 카페 라떼 (HOT/ ICED)");
		A73.setCategory("커피");
		A73.setManufacturer("공차");
		A73.setUnitsInStock(1000);
		A73.setCondition("New");
		A73.setFilename("a73.jpg");
		
		
	
		
		
		listOfProducts.add(A68);
		listOfProducts.add(A69);
		listOfProducts.add(A70);
		listOfProducts.add(A71);
		listOfProducts.add(A72);
		listOfProducts.add(A73);

		
	
		
		
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
