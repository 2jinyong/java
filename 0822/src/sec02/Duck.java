package sec02;

public class Duck implements Flyable, Swimmable{

	@Override
	public void swimm() {
		System.out.println("������ �����ϴ�");
		
	}

	@Override
	public void fly() {
		System.out.println("������ ����.");
		
	}

}
