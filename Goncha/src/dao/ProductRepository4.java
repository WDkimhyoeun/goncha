package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository4 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository4 instance = new ProductRepository4();

	public static ProductRepository4 getInstance(){
		return instance;
	} 

	public ProductRepository4() {
	
		
		Product A19=new Product("A19","그린 밀크티",4000);
		A19.setDescription("자스민 꽃잎을 함께 우려낸 그린티와 밀크의 조화 (HOT / ICED)��");
		A19.setCategory("밀크 티");
		A19.setManufacturer("공차");
		A19.setUnitsInStock(1000);
		A19.setCondition("New");
		A19.setFilename("a19.jpg");
		
		Product A20=new Product("A20","우롱 밀크티",4000);
		A20.setDescription("묵직하고 깊은 향의 우롱차에 밀크가 더해진 우롱밀크티 (HOT / ICED)​");
		A20.setCategory("밀크 티");
		A20.setManufacturer("공차");
		A20.setUnitsInStock(1000);
		A20.setCondition("New");
		A20.setFilename("A20.jpg");
		
		Product A21=new Product("A21","블랙 밀크티",4000);
		A21.setDescription("진한 향과 맛을 느낄 수 있는 블랙티(홍차)와 밀크의 만남 (HOT / ICED)​");
		A21.setCategory("밀크 티");
		A21.setManufacturer("공차");
		A21.setUnitsInStock(1000);
		A21.setCondition("New");
		A21.setFilename("a21.jpg");
		
		Product A22=new Product("A22","얼그레이 밀크티",4000);
		A22.setDescription("베르가못 향의 얼그레이티(홍차)와 밀크가 부드러운 조화를 이루는 밀크티 (HOT / ICED)​");
		A22.setCategory("밀크 티");
		A22.setManufacturer("공차");
		A22.setUnitsInStock(1000);
		A22.setCondition("New");
		A22.setFilename("a16.jpg");
		
		Product A23=new Product("A23","타로 밀크티",4000);
		A23.setDescription("타로의 고소함과 밀크의 조합 (HOT / ICED)​");
		A23.setCategory("밀크 티");
		A23.setManufacturer("공차");
		A23.setUnitsInStock(1000);
		A23.setCondition("New");
		A23.setFilename("a23.jpg");
		
		Product A24=new Product("A24","윈터멜론 밀크티",4000);
		A24.setDescription("달콤한 윈터멜론티와 부드러운 밀크가 더해진 윈터멜론 밀크티 (HOT / ICED)​");
		A24.setCategory("밀크 티");
		A24.setManufacturer("공차");
		A24.setUnitsInStock(1000);
		A24.setCondition("New");
		A24.setFilename("a24.jpg");
		
		Product A25=new Product("A24","초콜릿 밀크티",4000);
		A25.setDescription("부드러운 밀크에 녹아든 진한 초콜렛을 느낄 수 있는 초콜렛 밀크티 (HOT / ICED)");
		A25.setCategory("밀크 티");
		A25.setManufacturer("공차");
		A25.setUnitsInStock(1000);
		A25.setCondition("New");
		A25.setFilename("a25.jpg");
		
		Product A26=new Product("A26","딸기 쥬얼리 밀크티",5100);
		A26.setDescription("얼그레이티로 만든 밀크티에 리얼 딸기 과즙이 함유된 새콤달콤한 딸기 쥬얼리를 더한 시즌 음료 (딸기 함량 UP!) (ONLY ICED)");
		A26.setCategory("밀크 티");
		A26.setManufacturer("공차");
		A26.setUnitsInStock(1000);
		A26.setCondition("New");
		A26.setFilename("a26.jpg");
		
		Product A27=new Product("A27","망고 쥬얼리 밀크티",5100);
		A27.setDescription("자스민 그린티로 만든 망고 밀크티와 쫀득한 망고 쥬얼리가 어우러진 시즌 한정 밀크티 (ONLY ICED)");
		A27.setCategory("밀크 티");
		A27.setManufacturer("공차");
		A27.setUnitsInStock(1000);
		A27.setCondition("New");
		A27.setFilename("a27.jpg");
		
		
		listOfProducts.add(A19);
		listOfProducts.add(A20);
		listOfProducts.add(A21);
		listOfProducts.add(A22);
		listOfProducts.add(A23);
		listOfProducts.add(A24);
		listOfProducts.add(A25);
		listOfProducts.add(A26);
		listOfProducts.add(A27);
		
		
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
