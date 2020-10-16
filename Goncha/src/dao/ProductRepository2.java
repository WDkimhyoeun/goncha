package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository2 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository2 instance = new ProductRepository2();

	public static ProductRepository2 getInstance(){
		return instance;
	} 

	public ProductRepository2() {
	
		
		Product A13=new Product("A13","블랙 밀크티+펄",4500);
		A13.setDescription("공차 대표 메뉴 블랙밀크티와 쫄깃쫄깃한 펄의 콤비네이션");
		A13.setCategory("음료");
		A13.setManufacturer("공차");
		A13.setUnitsInStock(1000);
		A13.setCondition("New");
		A13.setFilename("a13.png");
		
		Product A14=new Product("A14","타로 밀크티+펄",4500);
		A14.setDescription("고소한 타로밀크티와 쫀득한 펄이 만난 공차의 베스트 셀러");
		A14.setCategory("음료");
		A14.setManufacturer("공차");
		A14.setUnitsInStock(1000);
		A14.setCondition("New");
		A14.setFilename("a14.png");
		
		Product A15=new Product("A15","초콜렛 밀크티+밀크폼",4500);
		A15.setDescription("공차만의 깊고 풍부한 초콜렛 밀크티에 부드러운 밀크폼을 더한 최고의 조합");
		A15.setCategory("음료");
		A15.setManufacturer("공차");
		A15.setUnitsInStock(1000);
		A15.setCondition("New");
		A15.setFilename("a15.jpg");
		
		Product A16=new Product("A16","망고 요구르트+화이트펄",5500);
		A16.setDescription("달콤한 망고 과육과 요구르트에 화이트펄의 꼬들꼬들함이 느껴지는 주스");
		A16.setCategory("음료");
		A16.setManufacturer("공차");
		A16.setUnitsInStock(1000);
		A16.setCondition("New");
		A16.setFilename("a16.jpg");
		
		Product A17=new Product("A17","우롱 밀크티+코코넛",4500);
		A17.setDescription("깊은 향의 우롱밀크티에 쫄깃쫄깃한 식감의 코코넛을 더한 밀크티");
		A17.setCategory("음료");
		A17.setManufacturer("공차");
		A17.setUnitsInStock(1000);
		A17.setCondition("New");
		A17.setFilename("a17.jpg");
		
		Product A18=new Product("A18","청포도 그린티 에이드+알로에",4800);
		A18.setDescription("상큼 달콤한 청포도 그린티에이드와 사각사각한 알로에 토핑을 더한 그린티에이드");
		A18.setCategory("음료");
		A18.setManufacturer("공차");
		A18.setUnitsInStock(1000);
		A18.setCondition("New");
		A18.setFilename("a18.jpg");
		
		
		
		listOfProducts.add(A13);
		listOfProducts.add(A14);
		listOfProducts.add(A15);
		listOfProducts.add(A16);
		listOfProducts.add(A17);
		listOfProducts.add(A18);
		
		
		
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
