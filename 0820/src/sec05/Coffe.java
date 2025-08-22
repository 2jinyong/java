package sec05;

public class Coffe extends Beverage{
	//필드
	private boolean isHOt;
	
	//생성자
	public Coffe(int price, boolean isHot) {
		super("커피",price);
		this.isHOt = isHot;
	}
	
	//override
	@Override
	public void displayInfo() {
		super.displayInfo();
		String hotCool = this.isHOt? "핫커피":"아이스커피";
		System.out.println("("+hotCool+")");
	}
}
