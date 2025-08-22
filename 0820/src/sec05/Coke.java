package sec05;

public class Coke extends Beverage {
	//필드
	String sugarLevel;
	
	//생성자
	public Coke(int price, String sugarLevel) {
		super("콜라",price);
		this.sugarLevel = sugarLevel;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("당도 :" +this.sugarLevel);
	}
	
}
