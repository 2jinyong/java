package sec05;

public class Beverage {
	//�ʵ�
	private String name;
	private int price;
	
	//������ this�� �ҷ��� �ʵ尪 �ʱ�ȭ
	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//�޼ҵ�
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void displayInfo() {
		System.out.println(this.name + " (���� : " + this.price + "��)");
	}

}
