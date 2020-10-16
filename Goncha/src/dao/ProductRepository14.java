package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository14 {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository14 instance = new ProductRepository14();

	public static ProductRepository14 getInstance(){
		return instance;
	} 

	public ProductRepository14() {
	
		Product C1=new Product("C1","요구르트 슈스틱",3600);
		C1.setDescription("기다란 슈안에 상큼한 요구르트슈크림를 듬뿍 넣어 만든 시원하게 즐기는 아이스 슈스틱 ​");
		C1.setCategory("踰좎씠而ㅻ━");
		C1.setManufacturer("怨듭감");
		C1.setUnitsInStock(1000);
		C1.setCondition("New");
		C1.setFilename("d1.jpg");
		
		Product C2=new Product("C2","초코  슈스틱",3900);
		C2.setDescription("기다란 슈안에 달콤한 초코슈크림을 듬뿍 넣어 만든시원하게 즐기는 아이스 슈스틱 ​");
		C2.setCategory("踰좎씠而ㅻ━");
		C2.setManufacturer("怨듭감");
		C2.setUnitsInStock(1000);
		C2.setCondition("New");
		C2.setFilename("d2.jpg");
		
		Product C3=new Product("C3","두브 과자",3900);
		C3.setDescription("�우리 발아통밀로 만들어 담백하고 고소한 스낵");
		C3.setCategory("踰좎씠而ㅻ━");
		C3.setManufacturer("怨듭감");
		C3.setUnitsInStock(1000);
		C3.setCondition("New");
		C3.setFilename("d3.jpg");
		
		Product C4=new Product("C4","베이글칩(갈릭)",5500);
		C4.setDescription("순수 베이글과 갈릭 달콤짭짤한 만남\r\n" + 
				"오븐으로 다시 구워낸 바삭한 수제 베이글칩");
		C4.setCategory("踰좎씠而ㅻ━");
		C4.setManufacturer("怨듭감");
		C4.setUnitsInStock(1000);
		C4.setCondition("New");
		C4.setFilename("d4.jpg");
		
		Product C5=new Product("C5","캐드베리 아몬드",5500);
		C5.setDescription("고소한 견과류와 건포도가 들어있어 식감이 좋은 초콜렛 바");
		C5.setCategory("踰좎씠而ㅻ━");
		C5.setManufacturer("怨듭감");
		C5.setUnitsInStock(1000);
		C5.setCondition("New");
		C5.setFilename("d5.jpg");
		
		Product C6=new Product("C6","로아커 바닐라",3300);
		C6.setDescription("웨하스의 바삭바삭한 식감과 진짜 바닐라콩으로 만든 바닐라 크림의 조화");
		C6.setCategory("踰좎씠而ㅻ━");
		C6.setManufacturer("怨듭감");
		C6.setUnitsInStock(1000);
		C6.setCondition("New");
		C6.setFilename("d6.jpg");
		
		
		Product C7=new Product("C7","로아커 카카오",3300);
		C7.setDescription("");
		C7.setCategory("고급 코코아를 사용한 깊은 맛의 크림카카오 샌드");
		C7.setManufacturer("怨듭감");
		C7.setUnitsInStock(1000);
		C7.setCondition("New");
		C7.setFilename("d7.jpg");
		
		
		Product C8=new Product("C8","초커 펑리수",3000);
		C8.setDescription("달콤한 초콜릿 속 부드러운 버터와 상큼한 파인애플의 식감까지 즐기는 달콤고소한 대만 대표 스낵 펑리수");
		C8.setCategory("踰좎씠而ㅻ━");
		C8.setManufacturer("怨듭감");
		C8.setUnitsInStock(1000);
		C8.setCondition("New");
		C8.setFilename("d8.jpg");
	
		
		Product C9=new Product("C9","[대만인기스낵]누가크래커",2800);
		C9.setDescription("단짠단짠 야채크래커에 누가크림이 듬뿍!\\r\\n\" + \r\n" + 
				"				\"대만인기스낵 누가크래커");
		C9.setCategory("踰좎씠而ㅻ━");
		C9.setManufacturer("怨듭감");
		C9.setUnitsInStock(1000);
		C9.setCondition("New");
		C9.setFilename("d9.jpg");
		
		Product C10=new Product("C10","[대만인기스낵]구미 초코볼",2800);
		C10.setDescription("단짠단짠 야채크래커에 누가크림이 듬뿍!\\r\\n\" + \r\n" + 
				"				\"대만인기스낵 누가크래커");
		C10.setCategory("踰좎씠而ㅻ━");
		C10.setManufacturer("怨듭감");
		C10.setUnitsInStock(1000);
		C10.setCondition("New");
		C10.setFilename("d10.jpg");
		
		
	
		
		
		listOfProducts.add(C1);
		listOfProducts.add(C2);
		listOfProducts.add(C3);
		listOfProducts.add(C4);
		listOfProducts.add(C5);
		listOfProducts.add(C6);
		listOfProducts.add(C7);
		listOfProducts.add(C8);
		listOfProducts.add(C9);
		listOfProducts.add(C10);

	

		
	
		
		
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


