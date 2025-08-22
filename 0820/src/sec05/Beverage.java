package sec05;

public class Beverage {
	//필드
	private String name;
	private int price;
	
	//생성자 this로 불러서 필드값 초기화
	public Beverage(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//메소드
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public void displayInfo() {
		System.out.println(this.name + " (가격 : " + this.price + "원)");
	}

}
