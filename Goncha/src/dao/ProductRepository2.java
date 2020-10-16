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
	
		
		Product A13=new Product("A13","�� ��ũƼ+��",4500);
		A13.setDescription("���� ��ǥ �޴� ����ũƼ�� �̱��̱��� ���� �޺���̼�");
		A13.setCategory("����");
		A13.setManufacturer("����");
		A13.setUnitsInStock(1000);
		A13.setCondition("New");
		A13.setFilename("a13.png");
		
		Product A14=new Product("A14","Ÿ�� ��ũƼ+��",4500);
		A14.setDescription("����� Ÿ�ι�ũƼ�� �˵��� ���� ���� ������ ����Ʈ ����");
		A14.setCategory("����");
		A14.setManufacturer("����");
		A14.setUnitsInStock(1000);
		A14.setCondition("New");
		A14.setFilename("a14.png");
		
		Product A15=new Product("A15","���ݷ� ��ũƼ+��ũ��",4500);
		A15.setDescription("�������� ��� ǳ���� ���ݷ� ��ũƼ�� �ε巯�� ��ũ���� ���� �ְ��� ����");
		A15.setCategory("����");
		A15.setManufacturer("����");
		A15.setUnitsInStock(1000);
		A15.setCondition("New");
		A15.setFilename("a15.jpg");
		
		Product A16=new Product("A16","���� �䱸��Ʈ+ȭ��Ʈ��",5500);
		A16.setDescription("������ ���� ������ �䱸��Ʈ�� ȭ��Ʈ���� ���鲿������ �������� �ֽ�");
		A16.setCategory("����");
		A16.setManufacturer("����");
		A16.setUnitsInStock(1000);
		A16.setCondition("New");
		A16.setFilename("a16.jpg");
		
		Product A17=new Product("A17","��� ��ũƼ+���ڳ�",4500);
		A17.setDescription("���� ���� ��չ�ũƼ�� �̱��̱��� �İ��� ���ڳ��� ���� ��ũƼ");
		A17.setCategory("����");
		A17.setManufacturer("����");
		A17.setUnitsInStock(1000);
		A17.setCondition("New");
		A17.setFilename("a17.jpg");
		
		Product A18=new Product("A18","û���� �׸�Ƽ ���̵�+�˷ο�",4800);
		A18.setDescription("��ŭ ������ û���� �׸�Ƽ���̵�� �簢�簢�� �˷ο� ������ ���� �׸�Ƽ���̵�");
		A18.setCategory("����");
		A18.setManufacturer("����");
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
