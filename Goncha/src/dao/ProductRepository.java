package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();

	public static ProductRepository getInstance(){
		return instance;
	} 

	public ProductRepository() {
		Product A1 = new Product("A1", "민트 초코칩 밀크티+펄", 4900);
		A1.setDescription("자스민 그린티와 시원한 민트향이 달콤하게 씹히는 초콜릿칩과 어우러져 공차만의 스타일로 즐기는 시즌한정 밀크티");
		A1.setCategory("시즌 메뉴");
		A1.setManufacturer("공차");
		A1.setUnitsInStock(1000);
		A1.setCondition("New");
		A1.setFilename("a1.png");

		Product A2 = new Product("A2", "민트 쿠키 스무디", 5300);
		A2.setDescription("향긋한 자스민 그린티로 만든 민트 스무디에 달콤 바삭한 쿠키크럼블이 어우러진 시즌한정 스무디");
		A2.setCategory("시즌 메뉴");
		A2.setManufacturer("공차");
		A2.setUnitsInStock(1000);
		A2.setCondition("Refurbished");
		A2.setFilename("a2.png");

		Product A3 = new Product("A3", "자몽 QQ 크러쉬", 5300);
		A3.setDescription("향긋한 자스민 그린티와 함께 상큼한 포멜로 과즙이 톡톡 터지는 자몽 크러쉬에 꼬들꼬들한 화이트펄과 러블리한 하트코코넛이 어우러진 시즌한정 크러쉬");
		A3.setCategory("시즌 메뉴");
		A3.setManufacturer("공차");
		A3.setUnitsInStock(1000);
		A3.setCondition("Old");
		A3.setFilename("a3.png");
		
		Product A4 =new Product("A4","자몽 요구르트 크러쉬",5300);
		A4.setDescription("리얼 포멜로 과즙이 톡톡 터지는 자몽과 달콤하게 부드러운 요구르트가 어우러져 더욱 상큼하게 즐길 수 있는 시즌한정 크러쉬");
		A4.setCategory("시즌 메뉴");
		A4.setManufacturer("공차");
		A4.setUnitsInStock(1000);
		A4.setCondition("New");
		A4.setFilename("a4.png");
		
		Product A5 =new Product("A5","그린애플 젤리 밀크티",4900);
		A5.setDescription("향긋한 자스민 그린티를 넣은 그린애플 밀크티에 달콤하고 쫄깃쫄깃한 그린애플 젤리가 씹히는 상큼, 달콤한 시즌한정 밀크티");
		A5.setCategory("시즌 메뉴");
		A5.setManufacturer("공차");
		A5.setUnitsInStock(1000);
		A5.setCondition("New");
		A5.setFilename("a5.png");

		Product A6 =new Product("A6","그린애플 QQ 크러쉬",5300);
		A6.setDescription("향긋한 자스민 그린티로 만든 상큼한 크러쉬에 러블리한 하트코코넛, 쫄깃쫄깃한 그린애플 젤리를 더해 시원하게 즐기는 시즌한정 크러쉬");
		A6.setCategory("시즌 메뉴");
		A6.setManufacturer("공차");
		A6.setUnitsInStock(1000);
		A6.setCondition("New");
		A6.setFilename("a6.png");

		Product A7 =new Product("A7","그린애플 요구르트 크러쉬",5500);
		A7.setDescription("향긋한 자스민 그린티로 만든 그린애플 크러쉬에 상큼한 요쿠르트 쥬얼리, 달콤한 요구르트폼을 더한 시즌한정 크러쉬");
		A7.setCategory("시즌 메뉴");
		A7.setManufacturer("공차");
		A7.setUnitsInStock(1000);
		A7.setCondition("New");
		A7.setFilename("a7.png");
		
		Product A8 =new Product("A8","그린애플 포도쥬얼리 크러쉬",5500);
		A8.setDescription("그린애플 포도쥬얼리 크러쉬");
		A8.setCategory("시즌 메뉴");
		A8.setManufacturer("공차");
		A8.setUnitsInStock(1000);
		A8.setCondition("New");
		A8.setFilename("a8.png");

		Product A9 =new Product("A9","요구르트 폼&쥬얼리 밀크티",5300);
		A9.setDescription("공차만의 요구르트 폼과 쥬얼리가 어우러진 상큼 달콤한 밀크티");
		A9.setCategory("시즌 메뉴");
		A9.setManufacturer("공차");
		A9.setUnitsInStock(1000);
		A9.setCondition("New");
		A9.setFilename("a9.png");

		Product A10 =new Product("A10","망고 QQ 밀크티",4900);
		A10.setDescription("코코넛과 펄을 한번에 맛보는 씹는 매력이 있는 망고 밀크티");
		A10.setCategory("시즌 메뉴");
		A10.setManufacturer("공차");
		A10.setUnitsInStock(1000);
		A10.setCondition("New");
		A10.setFilename("a10.png");

		Product A11 =new Product("A11","요구르트 쥬얼리 망고 크러쉬",5500);
		A11.setDescription("쫀득쫀득 요구르트 쥬얼리와 달콤한 망고가 어우러진 시즌한정 크러쉬");
		A11.setCategory("시즌 메뉴");
		A11.setManufacturer("공차");
		A11.setUnitsInStock(1000);
		A11.setCondition("New");
		A11.setFilename("a11.png");

		Product A12 =new Product("A12","망고 트로피컬 하트 크러쉬",5500);
		A12.setDescription("러블리한 하트코코넛이 어우러진 달콤 상큼한 열대과일 크러쉬");
		A12.setCategory("시즌 메뉴");
		A12.setManufacturer("공차");
		A12.setUnitsInStock(1000);
		A12.setCondition("New");
		A12.setFilename("a12.png");

		
		
		
		listOfProducts.add(A1);
		listOfProducts.add(A2);
		listOfProducts.add(A3);
		listOfProducts.add(A4);
		listOfProducts.add(A5);
		listOfProducts.add(A6);
		listOfProducts.add(A7);
		listOfProducts.add(A8);
		listOfProducts.add(A9);
		listOfProducts.add(A10);
		listOfProducts.add(A11);
		listOfProducts.add(A12);

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
