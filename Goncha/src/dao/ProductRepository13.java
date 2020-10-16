 package dao;

import java.util.ArrayList;

import dto.Product;

public class ProductRepository13 {
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository13 instance = new ProductRepository13();

	public static ProductRepository13 getInstance(){
		return instance;
	} 

	public ProductRepository13() {
	
		Product C1=new Product("C1","오리지널 핫도그",3600);
		C1.setDescription("遺��뱶�윭�슫 踰� �궗�씠�뿉 �꺊湲��꺊湲��븳 �냼�떆吏��� 洹� �쐞�뿉 �뵾�겢怨� �냼�뒪, 移섏쫰 �넗�븨�씠 �뼱�슦�윭吏� �빂�룄洹멤��");
		C1.setCategory("踰좎씠而ㅻ━");
		C1.setManufacturer("怨듭감");
		C1.setUnitsInStock(1000);
		C1.setCondition("New");
		C1.setFilename("c1.png");
		
		Product C2=new Product("C2","핫치킨 브리또",3900);
		C2.setDescription("�삉�씈�븘 �븞�뿉 �빂移섑궓怨� 媛덈┃�씪�씠�뒪媛� �벉肉� �뱾�뼱媛� 留ㅼ숴�븿�씠 留ㅻ젰�쟻�씤 �떇�궗 ���슜 釉뚮━�삉");
		C2.setCategory("踰좎씠而ㅻ━");
		C2.setManufacturer("怨듭감");
		C2.setUnitsInStock(1000);
		C2.setCondition("New");
		C2.setFilename("c2.png");
		
		Product C3=new Product("C3","치킨 치즈 브리또",3900);
		C3.setDescription("�삉�뵒�븘 �븞�뿉 �벉肉� �뱾�뼱媛� 移섑궓怨� 移섏쫰媛� 媛덈┃�씪�씠�뒪�� �뼱�슦�윭�졇 怨좎냼�븯怨� �떞諛깊븿�씠 留ㅻ젰�쟻�씤 �떇�궗 ���슜 釉뚮━�삉��");
		C3.setCategory("踰좎씠而ㅻ━");
		C3.setManufacturer("怨듭감");
		C3.setUnitsInStock(1000);
		C3.setCondition("New");
		C3.setFilename("c3.png");
		
		Product C4=new Product("C4","말렌카 케이크(월넛)",5500);
		C4.setDescription("已��뱷�븳 �떆�듃 �궗�씠�뿉 怨좎냼�븳 �샇�몢�� �뿀�땲 �겕由쇱씠 寃밴껸�씠 �깒�뱶�맂 泥댁퐫 �쟾�넻 �뵒���듃");
		C4.setCategory("踰좎씠而ㅻ━");
		C4.setManufacturer("怨듭감");
		C4.setUnitsInStock(1000);
		C4.setCondition("New");
		C4.setFilename("c4.png");
		
		Product C5=new Product("C5","말렌카 케이크(코코아)",5500);
		C5.setDescription("已��뱷�븳 珥덉퐫 �떆�듃 �궗�씠�뿉 遺��뱶�윭�슫 �뿰�쑀 �겕由쇱씠 寃밴껸�씠 �깒�뱶�맂 �떖肄� �뙃�떥由꾪븳 泥댁퐫 �쟾�넻 �뵒���듃");
		C5.setCategory("踰좎씠而ㅻ━");
		C5.setManufacturer("怨듭감");
		C5.setUnitsInStock(1000);
		C5.setCondition("New");
		C5.setFilename("C5.png");
		
		Product C6=new Product("C6","소시지 패스츄리",3300);
		C6.setDescription("�떖肄ㅽ븯怨� 諛붿궘�븳 �뙣�뒪痢꾨━�븞�쓽 吏�吏ㅽ븳 �냼�떆吏��쓽 議고솕媛� 醫뗭� �빂 �냼�떆吏� �뙣�뒪痢꾨━");
		C6.setCategory("踰좎씠而ㅻ━");
		C6.setManufacturer("怨듭감");
		C6.setUnitsInStock(1000);
		C6.setCondition("New");
		C6.setFilename("c6.jpg");
		
		
		Product C7=new Product("C7","링브레드(치즈)",3300);
		C7.setDescription("�뒪�쐞�뒪 ���몴 �뿉硫섑깉移섏쫰媛� �뱾�뼱媛� 怨좎냼�븯怨� �떞諛깊븯硫�, �닔�젣濡� 留뚮뱺 遺��뱶�윭�슫 留곷툕�젅�뱶");
		C7.setCategory("踰좎씠而ㅻ━");
		C7.setManufacturer("怨듭감");
		C7.setUnitsInStock(1000);
		C7.setCondition("New");
		C7.setFilename("C7.jpg");
		
		
		Product C8=new Product("C8","미니 크로크무슈",3000);
		C8.setDescription("�뒳�씪�씠�뒪�뻹怨� 泥대떎移섏쫰媛� �뱾�뼱媛� 紐⑥쭨�젏�씪移섏쫰瑜� �벉肉띿삱由� �빂 �깒�뱶�쐞移�");
		C8.setCategory("踰좎씠而ㅻ━");
		C8.setManufacturer("怨듭감");
		C8.setUnitsInStock(1000);
		C8.setCondition("New");
		C8.setFilename("c8.jpg");
	
		
		Product C9=new Product("C9","스콘(치즈)",2800);
		C9.setDescription("紐⑥쭨�젏�씪移섏쫰媛� �뱾�뼱媛� 遺��뱶�읇怨� �떞諛깊븯硫�, �닔�젣濡� 留뚮뱺 珥됱큺�븳 �뒪肄�");
		C9.setCategory("踰좎씠而ㅻ━");
		C9.setManufacturer("怨듭감");
		C9.setUnitsInStock(1000);
		C9.setCondition("New");
		C9.setFilename("c9.jpg");
		
		Product C10=new Product("C10","크로칸 슈",2800);
		C10.setDescription("而ㅼ뒪���뱶 �겕由쇱씠 �뱾�뼱媛� �떖肄ㅽ븳 �븘�씠�뒪 �뒋");
		C10.setCategory("踰좎씠而ㅻ━");
		C10.setManufacturer("怨듭감");
		C10.setUnitsInStock(1000);
		C10.setCondition("New");
		C10.setFilename("c10.jpg");
		
		Product C11=new Product("C11","잉글리쉬 머핀 샌드위치",3000);
		C11.setDescription("留쏆엳�뒗 �뻹, �떖嫄�, 移섏쫰�쓽 議고솕媛� 醫뗭� �븳援��씤�씠 利먭꺼癒밸뒗 �엵湲�由ъ돩 癒명� �깒�뱶�쐞移�");
		C11.setCategory("踰좎씠而ㅻ━");
		C11.setManufacturer("怨듭감");
		C11.setUnitsInStock(1000);
		C11.setCondition("New");
		C11.setFilename("c11.jpg");
		
	
		
		
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
		listOfProducts.add(C11);
	

		
	
		
		
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
