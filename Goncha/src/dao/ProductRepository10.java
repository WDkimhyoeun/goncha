package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository10 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository10 instance = new ProductRepository10();

	public static ProductRepository10 getInstance(){
		return instance;
	} 

	public ProductRepository10() {
	
		Product A60=new Product("A60","망고 스무디",5300);
		A60.setDescription("농축된 달콤한 망고와 밀크를 함께 갈아만든 망고 스무디(ONLY ICED)");
		A60.setCategory("스무디&크러쉬");
		A60.setManufacturer("공차");
		A60.setUnitsInStock(1000);
		A60.setCondition("New");
		A60.setFilename("a60.jpg");
		
		Product A61=new Product("A61","초코 쿠앤크 스무디",4500);
		A61.setDescription("진한 초콜렛과 달콤한쿠키앤크림을 밀크와 함께 갈아만든 오레오 초콜렛 스무디(ONLY ICED)​");
		A61.setCategory("스무디&크러쉬");
		A61.setManufacturer("공차");
		A61.setUnitsInStock(1000);
		A61.setCondition("New");
		A61.setFilename("a61.jpg");
		
		Product A62=new Product("A62","청포도 스무디",4800);
		A62.setDescription("시원달콤한 청포도과즙과 알로에 알갱이가 쏙쏙 들어오는 재미가 일품인 청포도 스무디 (ONLY ICED)");
		A62.setCategory("스무디&크러쉬");
		A62.setManufacturer("공차");
		A62.setUnitsInStock(1000);
		A62.setCondition("New");
		A62.setFilename("a62.jpg");

		Product A63=new Product("A63","블랙 밀크티 크러쉬",4800);
		A63.setDescription("공차 NO.1 메뉴인 블랙밀크티와 얼음을 함께 갈아 만든 크러쉬의 청량함과 쫀득쫀득한 펄의 식감을 즐길 수 있는 시그니처 음료(ONLY ICED)​");
		A63.setCategory("스무디&크러쉬");
		A63.setManufacturer("공차");
		A63.setUnitsInStock(1000);
		A63.setCondition("New");
		A63.setFilename("a63.jpg");
		
		Product A64=new Product("A64","커피 밀크티 크러쉬 +펄",4800);
		A64.setDescription("향긋한 블랙 밀크 티에 진한 커피를 더해 한여름 얼음과 함께 갈아 더욱 시원하게 즐기는 음료 (ONLY ICED)");
		A64.setCategory("스무디&크러쉬");
		A64.setManufacturer("공차");
		A64.setUnitsInStock(1000);
		A64.setCondition("New");
		A64.setFilename("a64.jpg");

		Product A65=new Product("A65","딸기&요구르트 크러쉬",5300);
		A65.setDescription("얼그레이티를 넣어 만든 요구르트 크러쉬에 리얼 딸기 과즙이 함유된 새콤달콤한 딸기 쥬얼리를 더한 시즌 음료 (ONLY ICED)");
		A65.setCategory("스무디&크러쉬");
		A65.setManufacturer("공차");
		A65.setUnitsInStock(1000);
		A65.setCondition("New");
		A65.setFilename("a65.jpg");
		
		Product A66=new Product("A66","커피 밀크티 크러쉬 + 밀크폼",4800);
		A66.setDescription("향긋한 블랙 밀크 티에 진한 커피를 더해 한여름 얼음과 함께 갈아 더욱 시원하게 즐기는 시즌 한정 음료 (ONLY ICED)");
		A66.setCategory("스무디&크러쉬");
		A66.setManufacturer("공차");
		A66.setUnitsInStock(1000);
		A66.setCondition("New");
		A66.setFilename("a66.jpg");
		
		Product A67=new Product("A67","제주 그린티 스무디",5300);
		A67.setDescription("녹차가루와 부드러운 밀크폼을 함께 즐길 수 있는 제주 그린티 스무디");
		A67.setCategory("스무디&크러쉬");
		A67.setManufacturer("공차");
		A67.setUnitsInStock(1000);
		A67.setCondition("New");
		A67.setFilename("a67.jpg");
		
	
		
		
		listOfProducts.add(A60);
		listOfProducts.add(A61);
		listOfProducts.add(A62);
		listOfProducts.add(A63);
		listOfProducts.add(A64);
		listOfProducts.add(A65);
		listOfProducts.add(A66);
		listOfProducts.add(A67);
		
	
		
		
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
