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
		Product A1 = new Product("A1", "��Ʈ ����Ĩ ��ũƼ+��", 4900);
		A1.setDescription("�ڽ��� �׸�Ƽ�� �ÿ��� ��Ʈ���� �����ϰ� ������ ���ݸ�Ĩ�� ��췯�� �������� ��Ÿ�Ϸ� ���� �������� ��ũƼ");
		A1.setCategory("���� �޴�");
		A1.setManufacturer("����");
		A1.setUnitsInStock(1000);
		A1.setCondition("New");
		A1.setFilename("a1.png");

		Product A2 = new Product("A2", "��Ʈ ��Ű ������", 5300);
		A2.setDescription("����� �ڽ��� �׸�Ƽ�� ���� ��Ʈ ������ ���� �ٻ��� ��Űũ������ ��췯�� �������� ������");
		A2.setCategory("���� �޴�");
		A2.setManufacturer("����");
		A2.setUnitsInStock(1000);
		A2.setCondition("Refurbished");
		A2.setFilename("a2.png");

		Product A3 = new Product("A3", "�ڸ� QQ ũ����", 5300);
		A3.setDescription("����� �ڽ��� �׸�Ƽ�� �Բ� ��ŭ�� ����� ������ ���� ������ �ڸ� ũ������ ���鲿���� ȭ��Ʈ�ް� ������ ��Ʈ���ڳ��� ��췯�� �������� ũ����");
		A3.setCategory("���� �޴�");
		A3.setManufacturer("����");
		A3.setUnitsInStock(1000);
		A3.setCondition("Old");
		A3.setFilename("a3.png");
		
		Product A4 =new Product("A4","�ڸ� �䱸��Ʈ ũ����",5300);
		A4.setDescription("���� ����� ������ ���� ������ �ڸ��� �����ϰ� �ε巯�� �䱸��Ʈ�� ��췯�� ���� ��ŭ�ϰ� ��� �� �ִ� �������� ũ����");
		A4.setCategory("���� �޴�");
		A4.setManufacturer("����");
		A4.setUnitsInStock(1000);
		A4.setCondition("New");
		A4.setFilename("a4.png");
		
		Product A5 =new Product("A5","�׸����� ���� ��ũƼ",4900);
		A5.setDescription("����� �ڽ��� �׸�Ƽ�� ���� �׸����� ��ũƼ�� �����ϰ� �̱��̱��� �׸����� ������ ������ ��ŭ, ������ �������� ��ũƼ");
		A5.setCategory("���� �޴�");
		A5.setManufacturer("����");
		A5.setUnitsInStock(1000);
		A5.setCondition("New");
		A5.setFilename("a5.png");

		Product A6 =new Product("A6","�׸����� QQ ũ����",5300);
		A6.setDescription("����� �ڽ��� �׸�Ƽ�� ���� ��ŭ�� ũ������ ������ ��Ʈ���ڳ�, �̱��̱��� �׸����� ������ ���� �ÿ��ϰ� ���� �������� ũ����");
		A6.setCategory("���� �޴�");
		A6.setManufacturer("����");
		A6.setUnitsInStock(1000);
		A6.setCondition("New");
		A6.setFilename("a6.png");

		Product A7 =new Product("A7","�׸����� �䱸��Ʈ ũ����",5500);
		A7.setDescription("����� �ڽ��� �׸�Ƽ�� ���� �׸����� ũ������ ��ŭ�� ����Ʈ ���, ������ �䱸��Ʈ���� ���� �������� ũ����");
		A7.setCategory("���� �޴�");
		A7.setManufacturer("����");
		A7.setUnitsInStock(1000);
		A7.setCondition("New");
		A7.setFilename("a7.png");
		
		Product A8 =new Product("A8","�׸����� ������� ũ����",5500);
		A8.setDescription("�׸����� ������� ũ����");
		A8.setCategory("���� �޴�");
		A8.setManufacturer("����");
		A8.setUnitsInStock(1000);
		A8.setCondition("New");
		A8.setFilename("a8.png");

		Product A9 =new Product("A9","�䱸��Ʈ ��&��� ��ũƼ",5300);
		A9.setDescription("�������� �䱸��Ʈ ���� ��󸮰� ��췯�� ��ŭ ������ ��ũƼ");
		A9.setCategory("���� �޴�");
		A9.setManufacturer("����");
		A9.setUnitsInStock(1000);
		A9.setCondition("New");
		A9.setFilename("a9.png");

		Product A10 =new Product("A10","���� QQ ��ũƼ",4900);
		A10.setDescription("���ڳӰ� ���� �ѹ��� ������ �ô� �ŷ��� �ִ� ���� ��ũƼ");
		A10.setCategory("���� �޴�");
		A10.setManufacturer("����");
		A10.setUnitsInStock(1000);
		A10.setCondition("New");
		A10.setFilename("a10.png");

		Product A11 =new Product("A11","�䱸��Ʈ ��� ���� ũ����",5500);
		A11.setDescription("�˵��˵� �䱸��Ʈ ��󸮿� ������ ���� ��췯�� �������� ũ����");
		A11.setCategory("���� �޴�");
		A11.setManufacturer("����");
		A11.setUnitsInStock(1000);
		A11.setCondition("New");
		A11.setFilename("a11.png");

		Product A12 =new Product("A12","���� Ʈ������ ��Ʈ ũ����",5500);
		A12.setDescription("������ ��Ʈ���ڳ��� ��췯�� ���� ��ŭ�� ������� ũ����");
		A12.setCategory("���� �޴�");
		A12.setManufacturer("����");
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
