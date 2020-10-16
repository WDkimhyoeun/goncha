package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository5 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository5 instance = new ProductRepository5();

	public static ProductRepository5 getInstance(){
		return instance;
	} 

	public ProductRepository5() {
	
		
		Product A32=new Product("A32","밀크폼 그린티",4000);
		A32.setDescription("자스민 꽃잎을 함께 우려낸 그린티와 부드러운 밀크폼의 만남 (HOT / ICED)​");
		A32.setCategory("밀크폼&치즈폼");
		A32.setManufacturer("공차");
		A32.setUnitsInStock(1000);
		A32.setCondition("New");
		A32.setFilename("a32.jpg");
		
		Product A33=new Product("A33","밀크티 우롱티",4000);
		A33.setDescription("묵직하고 깊은 향의 우롱차와 부드러운 밀크폼의 만남 (HOT / ICED)​");
		A33.setCategory("밀크폼&치즈폼");
		A33.setManufacturer("공차");
		A33.setUnitsInStock(1000);
		A33.setCondition("New");
		A33.setFilename("a33.png");
		
		Product A34=new Product("A34","밀크폼 블랙티",4000);
		A34.setDescription("진한 향과 맛을 느낄 수 있는 맛의 블랙티(홍차)와 부드러운 밀크폼의 만남 (HOT / ICED)");
		A34.setCategory("밀크폼&치즈폼");
		A34.setManufacturer("공차");
		A34.setUnitsInStock(1000);
		A34.setCondition("New");
		A34.setFilename("a34.jpg");
		
		Product A35=new Product("A35","밀크폼 얼그레이티",4000);
		A35.setDescription("베르가못향의 얼그레이티와 부드러운 밀크폼의 만남 (HOT / ICED)​");
		A35.setCategory("밀크폼&치즈폼");
		A35.setManufacturer("공차");
		A35.setUnitsInStock(1000);
		A35.setCondition("New");
		A35.setFilename("a35.jpg");
		
		Product A36=new Product("A36","밀크폼 윈터멜론티",4000);
		A36.setDescription("달콤한 윈터멜론과 부드러운 밀크폼의 만남 (HOT / ICE)");
		A36.setCategory("밀크폼&치즈폼");
		A36.setManufacturer("공차");
		A36.setUnitsInStock(1000);
		A36.setCondition("New");
		A36.setFilename("a36.jpg");
		
		Product A37=new Product("A37","치즈폼 딥초코 밀크티",4900);
		A37.setDescription("블랙티와 초콜렛, 스카치 풍미의 베이스 위에 부드럽고 달콤 짭조름한 치즈폼을 올린 밀크티");
		A37.setCategory("밀크폼&치즈폼");
		A37.setManufacturer("공차");
		A37.setUnitsInStock(1000);
		A37.setCondition("New");
		A37.setFilename("a37.jpg");
		
		Product A38=new Product("A38","치즈폼 딥바닐라 밀크티",4900);
		A38.setDescription("블랙티와 마다가스카르산 바닐라빈이 들어간 베이스 위에 부드럽고 달콤 짭쪼름한 치즈폼을 올린 음료");
		A38.setCategory("밀크폼&치즈폼");
		A38.setManufacturer("공차");
		A38.setUnitsInStock(1000);
		A38.setCondition("New");
		A38.setFilename("a38.jpg");

		Product A39=new Product("A39","치즈폼 딥초코 스무디",5300);
		A39.setDescription("블랙티를 넣은 초콜렛 스무디에 스카치 풍미를 더해 진한 초콜렛 맛을 강조한 스무디로, 부드럽고 달콤 짭쪼름한 치즈폼과 조화를 이루는 음료 (ONLY ICED)");
		A39.setCategory("밀크폼&치즈폼");
		A39.setManufacturer("공차");
		A39.setUnitsInStock(1000);
		A39.setCondition("New");
		A39.setFilename("a39.jpg");
	

		
		
		listOfProducts.add(A32);
		listOfProducts.add(A33);
		listOfProducts.add(A34);
		listOfProducts.add(A35);
		listOfProducts.add(A36);
		listOfProducts.add(A37);
		listOfProducts.add(A38);
		listOfProducts.add(A39);
		
		
		
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
