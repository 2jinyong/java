package sec05;

public class Coke extends Beverage {
	//�ʵ�
	String sugarLevel;
	
	//������
	public Coke(int price, String sugarLevel) {
		super("�ݶ�",price);
		this.sugarLevel = sugarLevel;
	}

	@Override
	public void displayInfo() {
		super.displayInfo();
		System.out.println("�絵 :" +this.sugarLevel);
	}
	
}
