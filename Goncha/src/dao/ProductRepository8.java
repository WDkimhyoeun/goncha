package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository8 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository8 instance = new ProductRepository8();

	public static ProductRepository8 getInstance(){
		return instance;
	} 

	public ProductRepository8() {
	
		Product A46=new Product("A46","딸기 쿠키 스무디",5300);
		A46.setDescription("얼그레이티로 만든 밀크 스무디에 쿠키를 더한 음료");
		A46.setCategory("스페셜");
		A46.setManufacturer("공차");
		A46.setUnitsInStock(1000);
		A46.setCondition("New");
		A46.setFilename("a46.png");
		
		Product A47=new Product("A47","딸기 품은 치즈폼 밀크티",5000);
		A47.setDescription("얼그레이를 넣은 치즈폼 딸기 밀크티에 리얼 딸기 슬라이스와 딸기 쥬얼리를 더한 음료입니다.");
		A47.setCategory("스페셜");
		A47.setManufacturer("공차");
		A47.setUnitsInStock(1000);
		A47.setCondition("New");
		A47.setFilename("a47.png");
		
		Product A48=new Product("A48","딸기 품은 밀크티",4500);
		A48.setDescription("얼그레이를 넣은 딸기 밀크티에 리얼 딸기 슬라이스를 더한 음료입니다.");
		A48.setCategory("스페셜");
		A48.setManufacturer("공차");
		A48.setUnitsInStock(1000);
		A48.setCondition("New");
		A48.setFilename("a48.png");
		
		Product A49=new Product("A49","딸기 쥬얼리 핑크 크러쉬",5500);
		A49.setDescription("얼그레이티로 만든 딸기, 피나콜라다 크러쉬에 리얼 과즙 딸기 쥬얼리를 더한 음료입니다.");
		A49.setCategory("스페셜");
		A49.setManufacturer("공차");
		A49.setUnitsInStock(1000);
		A49.setCondition("New");
		A49.setFilename("a49.png");

		Product A50=new Product("A50","딸기 품은 패션후르츠 티",4900);
		A50.setDescription("얼그레이, 히비스커스 패션후르츠 티에 리얼 딸기 슬라이스와 화이트펄, 로즈마리를 더한 음료입니다.");
		A50.setCategory("스페셜");
		A50.setManufacturer("공차");
		A50.setUnitsInStock(1000);
		A50.setCondition("New");
		A50.setFilename("a50.png");

		Product A51=new Product("A51","브라운슈가 밀크티",5300);
		A51.setDescription("부드럽고 달콤한 브라운 슈가 쥬얼리와 신선한 우유의 맛이 느껴지는 밀크티");
		A51.setCategory("스페셜");
		A51.setManufacturer("공차");
		A51.setUnitsInStock(1000);
		A51.setCondition("New");
		A51.setFilename("a51.jpg");
	
		Product A52=new Product("A52","부라운슈가 커피 밀크티",5700);
		A52.setDescription("달콤한 브라운슈가 쥬얼리에 커피와 블랙티가 어우러진 커피밀크티입니다.");
		A52.setCategory("스페셜");
		A52.setManufacturer("공차");
		A52.setUnitsInStock(1000);
		A52.setCondition("New");
		A52.setFilename("a52.png");
	
		Product A53=new Product("A53","브라운슈가 치즈폼 쿠키 밀크티",5700);
		A53.setDescription("\r\n" + 
				"브라운슈가 치즈폼 쿠키 밀크티\r\n" + 
				"\r\n" + 
				"달콤한 브라운슈가 쥬얼리와 달콤 짭조롬한 치즈폼에 쿠키분태가 곁들여진 블랙밀크티");
		A53.setCategory("스페셜");
		A53.setManufacturer("공차");
		A53.setUnitsInStock(1000);
		A53.setCondition("New");
		A53.setFilename("a53.png");
	
		Product A54=new Product("A54","브라운슈가 치즈폼 밀크티",5700);
		A54.setDescription("부드럽고 달콤한 브라운 슈가 쥬얼리에 밀크스무디와 치즈폼을 더한 스무디");
		A54.setCategory("스페셜");
		A54.setManufacturer("공차");
		A54.setUnitsInStock(1000);
		A54.setCondition("New");
		A54.setFilename("a54.jpg");
	
		Product A55=new Product("A55","초코바른 초코 스무디",5500);
		A55.setDescription("�달콤한 초코스무디에 달콤짭쪼름한 치즈폼, 컵에 둘러진 초콜렛으로 비쥬얼을 더한 시즌 한정 음료");
		A55.setCategory("스페셜");
		A55.setManufacturer("공차");
		A55.setUnitsInStock(1000);
		A55.setCondition("New");
		A55.setFilename("a55.png");
	
		Product A56=new Product("A56","초코바른 제주그린티 스무디",5700);
		A56.setDescription("제주 녹차로 만든 스무디에 쿠키분태, 달콤짭쪼름한 치즈폼, 컵에 둘러진 초콜렛으로 비쥬얼을 더한 시즌 한정 음료");
		A56.setCategory("스페셜");
		A56.setManufacturer("공차");
		A56.setUnitsInStock(1000);
		A56.setCondition("New");
		A56.setFilename("a56.png");
	
		Product A57=new Product("A57","제주 그린티 밀크티+펄",4900);
		A57.setDescription("제주 녹차를 사용하여 쌉싸름한 맛과 쫀득쫀득한 펄이 들어가 달콤한 맛이 어우러진 음료");
		A57.setCategory("스페셜");
		A57.setManufacturer("공차");
		A57.setUnitsInStock(1000);
		A57.setCondition("New");
		A57.setFilename("a57.png");
	
		
		
		listOfProducts.add(A46);
		listOfProducts.add(A47);
		listOfProducts.add(A48);
		listOfProducts.add(A49);
		listOfProducts.add(A50);
		
		listOfProducts.add(A51);
		listOfProducts.add(A52);
		listOfProducts.add(A53);
		listOfProducts.add(A54);
		
		listOfProducts.add(A55);
		listOfProducts.add(A56);
		listOfProducts.add(A57);
		
	
		
		
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
