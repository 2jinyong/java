package sec02;

public class Duck implements Flyable, Swimmable{

	@Override
	public void swimm() {
		System.out.println("오리가 수영하다");
		
	}

	@Override
	public void fly() {
		System.out.println("오리가 날다.");
		
	}

}
